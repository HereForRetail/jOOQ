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

import static java.util.Arrays.asList;
// ...
// ...
// ...
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.BIGQUERY;
import static org.jooq.SQLDialect.YUGABYTEDB;
import static org.jooq.impl.Keywords.K_ARRAY;
import static org.jooq.impl.Keywords.K_INT;
import static org.jooq.impl.Names.N_ARRAY;

import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

import org.jooq.Context;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Function1;
import org.jooq.QueryPart;
import org.jooq.Record;
// ...
import org.jooq.SQLDialect;
// ...
import org.jooq.impl.QOM.UnmodifiableList;

/**
 * @author Lukas Eder
 */
final class Array<T> extends AbstractField<T[]> implements QOM.Array<T> {

    private static final Set<SQLDialect> REQUIRES_CAST = SQLDialect.supportedBy(POSTGRES, BIGQUERY, YUGABYTEDB);

    private final FieldsImpl<Record>     fields;

    Array(Collection<? extends Field<T>> fields) {
        super(N_ARRAY, type(fields));

        this.fields = new FieldsImpl<>(fields);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static <T> DataType<T[]> type(Collection<? extends Field<T>> fields) {
        if (fields == null || fields.isEmpty())
            return (DataType) SQLDataType.OTHER.getArrayDataType();
        else
            return fields.iterator().next().getDataType().getArrayDataType();
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {






            default:
                boolean squareBrackets = true;

                ctx.visit(K_ARRAY)
                   .sql(squareBrackets ? '[' : '(')
                   .visit(fields)
                   .sql(squareBrackets ? ']' : ')');

                if (fields.fields.length == 0 && REQUIRES_CAST.contains(ctx.dialect()))
                    ctx.sql("::").visit(K_INT).sql("[]");

                break;
        }
    }

    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final UnmodifiableList<? extends Field<?>> $elements() {
        return QOM.unmodifiable(fields.fields);
    }














}
