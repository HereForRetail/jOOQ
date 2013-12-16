/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */

package org.jooq.impl;

import static java.util.Arrays.asList;
import static org.jooq.SQLDialect.CUBRID;
import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.HSQLDB;
import static org.jooq.SQLDialect.MARIADB;
import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.SYBASE;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.Term.LIST_AGG;
import static org.jooq.impl.Term.ROW_NUMBER;
import static org.jooq.impl.Utils.DATA_LOCALLY_SCOPED_DATA_MAP;
import static org.jooq.impl.Utils.DATA_WINDOW_DEFINITIONS;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import org.jooq.AggregateFunction;
import org.jooq.BindContext;
import org.jooq.Context;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.OrderedAggregateFunction;
import org.jooq.QueryPart;
import org.jooq.RenderContext;
import org.jooq.SQLDialect;
import org.jooq.SortField;
import org.jooq.WindowBeforeOverStep;
import org.jooq.WindowDefinition;
import org.jooq.WindowFinalStep;
import org.jooq.WindowIgnoreNullsStep;
import org.jooq.WindowOrderByStep;
import org.jooq.WindowOverStep;
import org.jooq.WindowPartitionByStep;
import org.jooq.WindowRowsAndStep;
import org.jooq.WindowRowsStep;
import org.jooq.WindowSpecification;
import org.jooq.util.db2.DB2DataType;

/**
 * A field that handles built-in functions, aggregate functions, and window
 * functions.
 *
 * @author Lukas Eder
 */
class Function<T> extends AbstractField<T> implements

    // Cascading interface implementations for aggregate function behaviour
    OrderedAggregateFunction<T>,
    AggregateFunction<T>,
    WindowBeforeOverStep<T>,

    // and for window function behaviour
    WindowIgnoreNullsStep<T>,
    WindowPartitionByStep<T>,
    WindowRowsStep<T>,
    WindowRowsAndStep<T>
    {

    private static final long              serialVersionUID = 347252741712134044L;

    // Mutually exclusive attributes: super.getName(), this.name, this.term
    private final Name                     name;
    private final Term                     term;

    // Other attributes
    private final QueryPartList<QueryPart> arguments;
    private final boolean                  distinct;
    private final SortFieldList            withinGroupOrderBy;
    private final SortFieldList            keepDenseRankOrderBy;
    private WindowSpecificationImpl        windowSpecification;
    private WindowDefinitionImpl           windowDefinition;
    private Name                           windowName;

    private boolean                        first;
    private boolean                        ignoreNulls;
    private boolean                        respectNulls;

    // -------------------------------------------------------------------------
    // XXX Constructors
    // -------------------------------------------------------------------------

    Function(String name, DataType<T> type, QueryPart... arguments) {
        this(name, false, type, arguments);
    }

    Function(Term term, DataType<T> type, QueryPart... arguments) {
        this(term, false, type, arguments);
    }

    Function(Name name, DataType<T> type, QueryPart... arguments) {
        this(name, false, type, arguments);
    }

    Function(String name, boolean distinct, DataType<T> type, QueryPart... arguments) {
        super(name, type);

        this.term = null;
        this.name = null;
        this.distinct = distinct;
        this.arguments = new QueryPartList<QueryPart>(arguments);
        this.keepDenseRankOrderBy = new SortFieldList();
        this.withinGroupOrderBy = new SortFieldList();
    }

    Function(Term term, boolean distinct, DataType<T> type, QueryPart... arguments) {
        super(term.name().toLowerCase(), type);

        this.term = term;
        this.name = null;
        this.distinct = distinct;
        this.arguments = new QueryPartList<QueryPart>(arguments);
        this.keepDenseRankOrderBy = new SortFieldList();
        this.withinGroupOrderBy = new SortFieldList();
    }

    Function(Name name, boolean distinct, DataType<T> type, QueryPart... arguments) {
        super(last(name.getName()), type);

        this.term = null;
        this.name = name;
        this.distinct = distinct;
        this.arguments = new QueryPartList<QueryPart>(arguments);
        this.keepDenseRankOrderBy = new SortFieldList();
        this.withinGroupOrderBy = new SortFieldList();
    }

    private static String last(String... strings) {
        if (strings != null && strings.length > 0) {
            return strings[strings.length - 1];
        }

        return null;
    }

    // -------------------------------------------------------------------------
    // XXX QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void bind(BindContext ctx) {
        if (term == LIST_AGG && asList(CUBRID, H2, HSQLDB, MARIADB, MYSQL).contains(ctx.configuration().dialect())) {
            ctx.visit(arguments.get(0));
            ctx.visit(withinGroupOrderBy);

            if (arguments.size() > 1) {
                ctx.visit(arguments.get(1));
            }
        }
        else {
            ctx.visit(arguments)
               .visit(keepDenseRankOrderBy)
               .visit(withinGroupOrderBy);

            QueryPart window = window(ctx);
            if (window != null)
                ctx.visit(window);
        }
    }

    @Override
    public final void toSQL(RenderContext ctx) {
        if (term == LIST_AGG && asList(CUBRID, H2, HSQLDB, MARIADB, MYSQL).contains(ctx.configuration().dialect())) {
            toSQLGroupConcat(ctx);
        }
        else if (term == LIST_AGG && asList(POSTGRES, SYBASE).contains(ctx.configuration().dialect())) {
            toSQLStringAgg(ctx);
            toSQLOverClause(ctx);
        }
        /* [pro] */
        else if (term == LIST_AGG && asList(DB2).contains(ctx.configuration().dialect().family())) {
            toSQLXMLAGG(ctx);
        }
        /* [/pro] */
        else {
            toSQLArguments(ctx);
            toSQLKeepDenseRankOrderByClause(ctx);
            toSQLWithinGroupClause(ctx);
            toSQLOverClause(ctx);
        }
    }

    /* [pro] */
    /**
     * [#1276] <code>LIST_AGG</code> simulation for DB2
     */
    private void toSQLXMLAGG(RenderContext ctx) {

        // This is a complete view of what the below SQL will render
        // substr(xmlserialize(xmlagg(xmltext(concat(', ', title)) order by id) as varchar(1024)), 3)
        if (arguments.size() > 1) {
            ctx.keyword("substr(");
        }

        ctx.keyword("xmlserialize(xmlagg(xmltext(");

        if (arguments.size() > 1) {
            ctx.keyword("concat(")
                   .visit(arguments.get(1))
                   .sql(", ");
        }

        ctx.visit(arguments.get(0));

        if (arguments.size() > 1) {
            ctx.sql(")"); // CONCAT
        }

        ctx.sql(")"); // XMLTEXT

        if (!withinGroupOrderBy.isEmpty()) {
            ctx.sql(" ").keyword("order by").sql(" ")
                   .visit(withinGroupOrderBy);
        }

        ctx.sql(")"); // XMLAGG
        ctx.sql(" ").keyword("as").sql(" ");
        ctx.sql(DB2DataType.VARCHAR.getCastTypeName());
        ctx.sql(")"); // XMLSERIALIZE

        if (arguments.size() > 1) {
            ctx.sql(", ");

            // The separator is of this form: [', '].
            // The example has length 4
            ctx.sql(arguments.get(1).toString().length() - 1);
            ctx.sql(")"); // SUBSTR
        }
    }

    /* [/pro] */
    /**
     * [#1275] <code>LIST_AGG</code> simulation for Postgres, Sybase
     */
    private void toSQLStringAgg(RenderContext ctx) {
        toSQLFunctionName(ctx);
        ctx.sql("(");

        if (distinct) {
            ctx.keyword("distinct").sql(" ");
        }

        // The explicit cast is needed in Postgres
        ctx.visit(((Field<?>) arguments.get(0)).cast(String.class));

        if (arguments.size() > 1) {
            ctx.sql(", ");
            ctx.visit(arguments.get(1));
        }
        else {
            ctx.sql(", ''");
        }

        if (!withinGroupOrderBy.isEmpty()) {
            ctx.sql(" ").keyword("order by").sql(" ")
                   .visit(withinGroupOrderBy);
        }

        ctx.sql(")");
    }

    /**
     * [#1273] <code>LIST_AGG</code> simulation for MySQL and CUBRID
     */
    private final void toSQLGroupConcat(RenderContext ctx) {
        toSQLFunctionName(ctx);
        ctx.sql("(");

        if (distinct) {
            ctx.keyword("distinct").sql(" ");
        }

        ctx.visit(arguments.get(0));

        if (!withinGroupOrderBy.isEmpty()) {
            ctx.sql(" ").keyword("order by").sql(" ")
                   .visit(withinGroupOrderBy);
        }

        if (arguments.size() > 1) {
            ctx.sql(" ").keyword("separator").sql(" ")
                   .visit(arguments.get(1));
        }

        ctx.sql(")");
    }

    private final void toSQLOverClause(RenderContext ctx) {
        QueryPart window = window(ctx);

        // Render this clause only if needed
        if (window == null)
            return;

        // [#1524] Don't render this clause where it is not supported
        if (term == ROW_NUMBER && ctx.configuration().dialect() == HSQLDB)
            return;


        ctx.sql(" ")
           .keyword("over")
           .sql(" (")
           .visit(window)
           .sql(")");
    }

    @SuppressWarnings("unchecked")
    private final QueryPart window(Context<?> ctx) {
        if (windowSpecification != null)
            return windowSpecification;

        if (windowDefinition != null)
            return windowDefinition;

        // [#531] Inline window specifications if the WINDOW clause is not supported
        if (windowName != null) {
            if (asList(POSTGRES, SYBASE).contains(ctx.configuration().dialect().family())) {
                return windowName;
            }

            Map<Object, Object> map = (Map<Object, Object>) ctx.data(DATA_LOCALLY_SCOPED_DATA_MAP);
            QueryPartList<WindowDefinition> windows = (QueryPartList<WindowDefinition>) map.get(DATA_WINDOW_DEFINITIONS);

            for (WindowDefinition window : windows) {
                if (((WindowDefinitionImpl) window).getName().equals(windowName)) {
                    return window;
                }
            }
        }

        return null;
    }

    /**
     * Render <code>KEEP (DENSE_RANK [FIRST | LAST] ORDER BY {...})</code> clause
     */
    private void toSQLKeepDenseRankOrderByClause(RenderContext ctx) {
        if (!keepDenseRankOrderBy.isEmpty()) {
            ctx.sql(" ").keyword("keep")
               .sql(" (").keyword("dense_rank")
               .sql(" ").keyword(first ? "first" : "last")
               .sql(" ").keyword("order by")
               .sql(" ").visit(keepDenseRankOrderBy)
               .sql(")");
        }
    }

    /**
     * Render <code>WITHIN GROUP (ORDER BY ..)</code> clause
     */
    private final void toSQLWithinGroupClause(RenderContext ctx) {
        if (!withinGroupOrderBy.isEmpty()) {
            ctx.sql(" ").keyword("within group")
               .sql(" (").keyword("order by")
               .sql(" ").visit(withinGroupOrderBy)
               .sql(")");
        }
    }

    /**
     * Render function arguments and argument modifiers
     */
    private final void toSQLArguments(RenderContext ctx) {
        toSQLFunctionName(ctx);
        ctx.sql("(");

        if (distinct) {
            ctx.keyword("distinct");

            // [#2883] PostgreSQL can use the DISTINCT keyword with formal row value expressions.
            if (ctx.configuration().dialect().family() == POSTGRES && arguments.size() > 1) {
                ctx.sql("(");
            }
            else {
                ctx.sql(" ");
            }
        }

        if (!arguments.isEmpty()) {
            ctx.visit(arguments);
        }

        if (distinct) {
            if (ctx.configuration().dialect().family() == POSTGRES && arguments.size() > 1) {
                ctx.sql(")");
            }
        }

        if (ignoreNulls) {
            /* [pro] */
            if (ctx.configuration().dialect().family() == SQLDialect.DB2) {
                ctx.sql(", 'IGNORE NULLS'");
            }
            else
            /* [/pro] */
            {
                ctx.sql(" ").keyword("ignore nulls");
            }
        }
        else if (respectNulls) {
            /* [pro] */
            if (ctx.configuration().dialect().family() == SQLDialect.DB2) {
                ctx.sql(", 'RESPECT NULLS'");
            }
            else
            /* [/pro] */
            {
                ctx.sql(" ").keyword("respect nulls");
            }
        }

        ctx.sql(")");
    }

    private final void toSQLFunctionName(RenderContext ctx) {
        if (name != null) {
            ctx.visit(name);
        }
        else if (term != null) {
            ctx.sql(term.translate(ctx.configuration().dialect()));
        }
        else {
            ctx.sql(getName());
        }
    }

    // -------------------------------------------------------------------------
    // XXX aggregate and window function fluent API methods
    // -------------------------------------------------------------------------

    final QueryPartList<QueryPart> getArguments() {
        return arguments;
    }

    @Override
    public final AggregateFunction<T> withinGroupOrderBy(Field<?>... fields) {
        withinGroupOrderBy.addAll(fields);
        return this;
    }

    @Override
    public final AggregateFunction<T> withinGroupOrderBy(SortField<?>... fields) {
        withinGroupOrderBy.addAll(Arrays.asList(fields));
        return this;
    }

    @Override
    public final AggregateFunction<T> withinGroupOrderBy(Collection<? extends SortField<?>> fields) {
        withinGroupOrderBy.addAll(fields);
        return this;
    }

    /* [pro] */
    @Override
    public final WindowBeforeOverStep<T> keepDenseRankFirstOrderBy(Field<?>... fields) {
        first = true;
        keepDenseRankOrderBy.addAll(fields);
        return this;
    }

    @Override
    public final WindowBeforeOverStep<T> keepDenseRankFirstOrderBy(SortField<?>... fields) {
        return keepDenseRankFirstOrderBy(Arrays.asList(fields));
    }

    @Override
    public final WindowBeforeOverStep<T> keepDenseRankFirstOrderBy(Collection<? extends SortField<?>> fields) {
        first = true;
        keepDenseRankOrderBy.addAll(fields);
        return this;
    }

    @Override
    public final WindowBeforeOverStep<T> keepDenseRankLastOrderBy(Field<?>... fields) {
        keepDenseRankOrderBy.addAll(fields);
        return this;
    }

    @Override
    public final WindowBeforeOverStep<T> keepDenseRankLastOrderBy(SortField<?>... fields) {
        return keepDenseRankLastOrderBy(Arrays.asList(fields));
    }

    @Override
    public final WindowBeforeOverStep<T> keepDenseRankLastOrderBy(Collection<? extends SortField<?>> fields) {
        keepDenseRankOrderBy.addAll(fields);
        return this;
    }

    @Override
    public final WindowOverStep<T> ignoreNulls() {
        ignoreNulls = true;
        respectNulls = false;
        return this;
    }

    @Override
    public final WindowOverStep<T> respectNulls() {
        ignoreNulls = false;
        respectNulls = true;
        return this;
    }

    /* [/pro] */
    @Override
    public final WindowPartitionByStep<T> over() {
        windowSpecification = new WindowSpecificationImpl();
        return this;
    }

    @Override
    public final WindowFinalStep<T> over(WindowSpecification specification) {
        this.windowSpecification = (WindowSpecificationImpl) specification;
        return this;
    }

    @Override
    public final WindowFinalStep<T> over(WindowDefinition definition) {
        this.windowDefinition = (WindowDefinitionImpl) definition;
        return this;
    }

    @Override
    public final WindowFinalStep<T> over(String n) {
        return over(name(n));
    }

    @Override
    public final WindowFinalStep<T> over(Name n) {
        this.windowName = n;
        return this;
    }

    @Override
    public final WindowOrderByStep<T> partitionBy(Field<?>... fields) {
        windowSpecification.partitionBy(fields);
        return this;
    }

    @Override
    public final WindowOrderByStep<T> partitionByOne() {
        windowSpecification.partitionByOne();
        return this;
    }

    @Override
    public final WindowRowsStep<T> orderBy(Field<?>... fields) {
        windowSpecification.orderBy(fields);
        return this;
    }

    @Override
    public final WindowRowsStep<T> orderBy(SortField<?>... fields) {
        windowSpecification.orderBy(fields);
        return this;
    }

    @Override
    public final WindowRowsStep<T> orderBy(Collection<? extends SortField<?>> fields) {
        windowSpecification.orderBy(fields);
        return this;
    }

    @Override
    public final WindowFinalStep<T> rowsUnboundedPreceding() {
        windowSpecification.rowsUnboundedPreceding();
        return this;
    }

    @Override
    public final WindowFinalStep<T> rowsPreceding(int number) {
        windowSpecification.rowsPreceding(number);
        return this;
    }

    @Override
    public final WindowFinalStep<T> rowsCurrentRow() {
        windowSpecification.rowsCurrentRow();
        return this;
    }

    @Override
    public final WindowFinalStep<T> rowsUnboundedFollowing() {
        windowSpecification.rowsUnboundedFollowing();
        return this;
    }

    @Override
    public final WindowFinalStep<T> rowsFollowing(int number) {
        windowSpecification.rowsFollowing(number);
        return this;
    }

    @Override
    public final WindowRowsAndStep<T> rowsBetweenUnboundedPreceding() {
        windowSpecification.rowsBetweenUnboundedPreceding();
        return this;
    }

    @Override
    public final WindowRowsAndStep<T> rowsBetweenPreceding(int number) {
        windowSpecification.rowsBetweenPreceding(number);
        return this;
    }

    @Override
    public final WindowRowsAndStep<T> rowsBetweenCurrentRow() {
        windowSpecification.rowsBetweenCurrentRow();
        return this;
    }

    @Override
    public final WindowRowsAndStep<T> rowsBetweenUnboundedFollowing() {
        windowSpecification.rowsBetweenUnboundedFollowing();
        return this;
    }

    @Override
    public final WindowRowsAndStep<T> rowsBetweenFollowing(int number) {
        windowSpecification.rowsBetweenFollowing(number);
        return this;
    }

    @Override
    public final WindowFinalStep<T> andUnboundedPreceding() {
        windowSpecification.andUnboundedPreceding();
        return this;
    }

    @Override
    public final WindowFinalStep<T> andPreceding(int number) {
        windowSpecification.andPreceding(number);
        return this;
    }

    @Override
    public final WindowFinalStep<T> andCurrentRow() {
        windowSpecification.andCurrentRow();
        return this;
    }

    @Override
    public final WindowFinalStep<T> andUnboundedFollowing() {
        windowSpecification.andUnboundedFollowing();
        return this;
    }

    @Override
    public final WindowFinalStep<T> andFollowing(int number) {
        windowSpecification.andFollowing(number);
        return this;
    }
}
