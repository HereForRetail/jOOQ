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
package org.jooq;

// ...
import static org.jooq.SQLDialect.CUBRID;
// ...
// ...
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
// ...
import static org.jooq.SQLDialect.HSQLDB;
// ...
// ...
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.BIGQUERY;
// ...
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.YUGABYTEDB;

import java.util.Collection;

import org.jetbrains.annotations.NotNull;

/**
 * This type is used for the H2-specific variant of the {@link Merge}'s DSL API.
 * <p>
 * Example: <pre><code>
 * DSLContext create = DSL.using(configuration);
 *
 * create.mergeInto(table, field1, field2)
 *       .key(id)
 *       .values(value1, value2)
 *       .execute();
 * </code></pre>
 *
 * @author Lukas Eder
 */
public interface MergeKeyStepN<R extends Record> extends MergeValuesStepN<R> {

    /**
     * Specify an optional <code>KEY</code> clause.
     * <p>
     * Use this optional clause in order to override using the underlying
     * <code>PRIMARY KEY</code>.
     */
    @NotNull @CheckReturnValue
    @Support({ CUBRID, FIREBIRD, H2, HSQLDB, POSTGRES, BIGQUERY, YUGABYTEDB })
    MergeValuesStepN<R> key(Field<?>... keys);

    /**
     * Specify an optional <code>KEY</code> clause.
     * <p>
     * Use this optional clause in order to override using the underlying
     * <code>PRIMARY KEY</code>.
     */
    @NotNull @CheckReturnValue
    @Support({ CUBRID, FIREBIRD, H2, HSQLDB, POSTGRES, BIGQUERY, YUGABYTEDB })
    MergeValuesStepN<R> key(Collection<? extends Field<?>> keys);
}
