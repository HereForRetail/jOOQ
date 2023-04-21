/*
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
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;



// ...
// ...
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.BIGQUERY;
import static org.jooq.SQLDialect.YUGABYTEDB;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.resultQuery;
import static org.jooq.impl.Keywords.K_FINAL;
import static org.jooq.impl.Keywords.K_NEW;
import static org.jooq.impl.Keywords.K_OLD;
import static org.jooq.impl.Keywords.K_RETURNING;
import static org.jooq.impl.Keywords.K_TABLE;
import static org.jooq.impl.Tools.abstractDMLQuery;
import static org.jooq.impl.Tools.DataKey.DATA_TOP_LEVEL_CTE;

import java.util.Set;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import org.jooq.Context;
import org.jooq.DMLQuery;
import org.jooq.Delete;
import org.jooq.Function1;
import org.jooq.Insert;
import org.jooq.Merge;
import org.jooq.Name;
import org.jooq.QueryPart;
import org.jooq.Record;
// ...
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.TableOptions;
// ...
import org.jooq.Update;
import org.jooq.impl.QOM.ResultOption;


/**
 * @author Lukas Eder
 */
final class DataChangeDeltaTable<R extends Record>
extends
    AbstractTable<R>
implements
    AutoAliasTable<R>,
    QOM.DataChangeDeltaTable<R>
{

    private final Set<SQLDialect> EMULATE_USING_CTE = SQLDialect.supportedBy(POSTGRES, BIGQUERY, YUGABYTEDB);

    private final ResultOption    resultOption;
    private final DMLQuery<R>     query;
    private final Table<R>        table;
    private final Name            alias;

    DataChangeDeltaTable(ResultOption resultOption, DMLQuery<R> query) {
        this(resultOption, query, table(query));
    }

    private DataChangeDeltaTable(ResultOption resultOption, DMLQuery<R> query, Table<R> table) {
        this(resultOption, query, table, table.getUnqualifiedName());
    }

    private DataChangeDeltaTable(ResultOption resultOption, DMLQuery<R> query, Table<R> table, Name alias) {
        super(TableOptions.expression(), alias);

        this.resultOption = resultOption;
        this.query = query;
        this.table = table;
        this.alias = alias;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static final <R extends Record> Table<R> table(DMLQuery<R> query) {
        if (query instanceof Insert || query instanceof Update || query instanceof Delete)
            return (Table<R>) abstractDMLQuery(query).table();
        else if (query instanceof MergeImpl)
            return ((MergeImpl) query).table();
        else
            throw new IllegalStateException("Unsupported query type: " + query);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void accept(Context<?> ctx) {
        if (EMULATE_USING_CTE.contains(ctx.dialect()))
            acceptCte(ctx);
        else
            acceptNative(ctx);
    }

    private final void acceptCte(Context<?> ctx) {
        TopLevelCte cte = (TopLevelCte) ctx.data(DATA_TOP_LEVEL_CTE);
        cte.add(name(alias).as(
            resultQuery("{0}",

                // TODO: Immutable QueryParts would be really useful here, to add a RETURNING clause to a query without mutating it
                CustomQueryPart.of(c2 -> {
                    c2.visit(query).formatSeparator()
                        .visit(K_RETURNING).sql(' ').visit(new SelectFieldList<>(table.fields()));
                })
            )
        ));

        ctx.visit(DSL.table(alias));
    }

    private final void acceptNative(Context<?> ctx) {
        switch (resultOption) {
            case FINAL: ctx.visit(K_FINAL); break;
            case OLD: ctx.visit(K_OLD); break;
            case NEW: ctx.visit(K_NEW); break;
            default: throw new IllegalStateException("Unsupported result option: " + resultOption);
        }

        ctx.sql(' ').visit(K_TABLE)
           .sqlIndentStart(" (");

        // [#12925] Workaround for https://github.com/h2database/h2database/issues/3398
        if (requiresWorkaroundFor12925(ctx))
            ctx.sql("/* [#12925] ").sql(UUID.randomUUID().toString()).sql(" */ ");

        ctx.visit(query)
           .sqlIndentEnd(')');
    }

    private final boolean requiresWorkaroundFor12925(Context<?> ctx) {
        if (ctx.family() == H2) {
            if (query instanceof MergeImpl)
                return true;

            InsertQueryImpl<?> i = Tools.insertQueryImpl(query);
            return i != null && (i.onDuplicateKeyIgnore || i.onDuplicateKeyUpdate);
        }

        return false;
    }

    // -------------------------------------------------------------------------
    // XXX: Table API
    // -------------------------------------------------------------------------

    @Override
    public Table<R> as(Name as) {
        return new TableAlias<>(new DataChangeDeltaTable<>(resultOption, query, table, as), as);
    }

    @Override
    public Table<R> as(Name as, Name... fieldAliases) {
        return new TableAlias<>(new DataChangeDeltaTable<>(resultOption, query, table, as), as, fieldAliases);
    }

    @Override
    public final Table<R> autoAlias(Context<?> ctx) {
        return as(alias);
    }

    @Override
    public final Class<? extends R> getRecordType() {
        return table.getRecordType();
    }

    @SuppressWarnings("unchecked")
    @Override
    final FieldsImpl<R> fields0() {
        return ((AbstractRow<R>) table.as(alias).fieldsRow()).fields;
    }

    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final ResultOption $resultOption() {
        return resultOption;
    }

    @Override
    public final DMLQuery<R> $query() {
        return query;
    }














}
