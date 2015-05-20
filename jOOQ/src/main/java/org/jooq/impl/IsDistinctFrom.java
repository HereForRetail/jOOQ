/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
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
import static org.jooq.Comparator.IS_DISTINCT_FROM;
import static org.jooq.Comparator.IS_NOT_DISTINCT_FROM;
import static org.jooq.SQLDialect.ACCESS;
import static org.jooq.SQLDialect.ASE;
import static org.jooq.SQLDialect.CUBRID;
import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.HANA;
import static org.jooq.SQLDialect.INFORMIX;
import static org.jooq.SQLDialect.INGRES;
import static org.jooq.SQLDialect.MARIADB;
import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.SQLDialect.ORACLE;
import static org.jooq.SQLDialect.REDSHIFT;
import static org.jooq.SQLDialect.SQLITE;
import static org.jooq.SQLDialect.SQLSERVER;
import static org.jooq.SQLDialect.SYBASE;
import static org.jooq.SQLDialect.VERTICA;
import static org.jooq.impl.DSL.condition;
import static org.jooq.impl.DSL.decode;
import static org.jooq.impl.DSL.exists;
import static org.jooq.impl.DSL.notExists;
import static org.jooq.impl.DSL.one;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.zero;

import org.jooq.Clause;
import org.jooq.Comparator;
import org.jooq.Configuration;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.QueryPartInternal;
import org.jooq.SQLDialect;

/**
 * @author Lukas Eder
 */
class IsDistinctFrom<T> extends AbstractCondition {

    /**
     * Generated UID
     */
    private static final long           serialVersionUID = 4568269684824736461L;

    private final Field<T>              lhs;
    private final Field<T>              rhs;
    private final Comparator            comparator;

    private transient QueryPartInternal mySQLCondition;
    private transient QueryPartInternal sqliteCondition;
    private transient QueryPartInternal compareCondition;
    private transient QueryPartInternal caseExpression;

    IsDistinctFrom(Field<T> lhs, Field<T> rhs, Comparator comparator) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.comparator = comparator;
    }

    @Override
    public final void accept(Context<?> ctx) {
        delegate(ctx.configuration()).accept(ctx);
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return delegate(ctx.configuration()).clauses(ctx);
    }

    /**
     * Get a delegate <code>CompareCondition</code>, in case the context
     * {@link SQLDialect} natively supports the <code>IS DISTINCT FROM</code>
     * clause.
     */
    private final QueryPartInternal delegate(Configuration configuration) {

        // [#3511] These dialects need to emulate the IS DISTINCT FROM predicate, optimally using INTERSECT...
        if (asList(ACCESS, ASE, CUBRID, DB2, DERBY, HANA, INFORMIX, INGRES, ORACLE, SQLSERVER, SYBASE, VERTICA).contains(configuration.family())) {
            return (comparator == IS_DISTINCT_FROM)
                ? (QueryPartInternal) notExists(select(lhs).intersect(select(rhs)))
                : (QueryPartInternal) exists(select(lhs).intersect(select(rhs)));
        }

        // ... or using a more verbose CASE expression
        else if (asList().contains(configuration.family())) {
            if (caseExpression == null) {
                if (comparator == Comparator.IS_DISTINCT_FROM) {
                    caseExpression = (QueryPartInternal) decode()
                        .when(lhs.isNull().and(rhs.isNull()), zero())
                        .when(lhs.isNull().and(rhs.isNotNull()), one())
                        .when(lhs.isNotNull().and(rhs.isNull()), one())
                        .when(lhs.equal(rhs), zero())
                        .otherwise(one())
                        .equal(one());
                }
                else {
                    caseExpression = (QueryPartInternal) decode()
                        .when(lhs.isNull().and(rhs.isNull()), one())
                        .when(lhs.isNull().and(rhs.isNotNull()), zero())
                        .when(lhs.isNotNull().and(rhs.isNull()), zero())
                        .when(lhs.equal(rhs), one())
                        .otherwise(zero())
                        .equal(one());
                }
            }

            return caseExpression;
        }

        // MySQL knows the <=> operator
        else if (asList(MARIADB, MYSQL).contains(configuration.family())) {
            if (mySQLCondition == null)
                mySQLCondition = (QueryPartInternal) ((comparator == IS_DISTINCT_FROM)
                    ? condition("{not}({0} <=> {1})", lhs, rhs)
                    : condition("{0} <=> {1}", lhs, rhs));

            return mySQLCondition;
        }

        // SQLite knows the IS / IS NOT predicate
        else if (SQLITE == configuration.family()) {
            if (sqliteCondition == null)
                sqliteCondition = (QueryPartInternal) ((comparator == IS_DISTINCT_FROM)
                    ? condition("{0} {is not} {1}", lhs, rhs)
                    : condition("{0} {is} {1}", lhs, rhs));

            return sqliteCondition;
        }

        /* [pro] */
        // Redshift knows IS DISTINCT FROM but doesn't know IS NOT DISTINCT FROM
        else if (REDSHIFT == configuration.family()) {
            if (compareCondition == null)
                compareCondition = (QueryPartInternal) ((comparator == IS_NOT_DISTINCT_FROM)
                    ? new CompareCondition(lhs, rhs, IS_DISTINCT_FROM).not()
                    : new CompareCondition(lhs, rhs, comparator));


            return compareCondition;
        }

        /* [/pro] */

        // These dialects natively support the IS DISTINCT FROM predicate:
        // H2, Postgres
        else {
            if (compareCondition == null)
                compareCondition = new CompareCondition(lhs, rhs, comparator);

            return compareCondition;
        }
    }
}
