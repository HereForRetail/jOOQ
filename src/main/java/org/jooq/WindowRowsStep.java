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
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
// ...
import static org.jooq.SQLDialect.MARIADB;
// ...
import static org.jooq.SQLDialect.MYSQL;
// ...
// ...
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.BIGQUERY;
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.SQLITE;
// ...
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.YUGABYTEDB;

import org.jetbrains.annotations.NotNull;

/**
 * This type is used for the window function DSL API.
 * <p>
 * Example: <pre><code>
 * field.firstValue()
 *      .ignoreNulls()
 *      .over()
 *      .partitionBy(AUTHOR_ID)
 *      .orderBy(PUBLISHED_IN.asc())
 *      .rowsBetweenUnboundedPreceding()
 *      .andUnboundedFollowing()
 * </code></pre>
 *
 * @param <T> The function return type
 * @author Lukas Eder
 */
public interface WindowRowsStep<T> extends WindowFinalStep<T> {

    /**
     * Add a <code>ROWS UNBOUNDED PRECEDING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rowsUnboundedPreceding();

    /**
     * Add a <code>ROWS [number] PRECEDING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rowsPreceding(int number);

    /**
     * Add a <code>ROWS CURRENT ROW</code> frame clause to the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rowsCurrentRow();

    /**
     * Add a <code>ROWS UNBOUNDED FOLLOWING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rowsUnboundedFollowing();

    /**
     * Add a <code>ROWS [number] FOLLOWING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rowsFollowing(int number);

    /**
     * Add a <code>ROWS BETWEEN UNBOUNDED PRECEDING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rowsBetweenUnboundedPreceding();

    /**
     * Add a <code>ROWS BETWEEN [number] PRECEDING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rowsBetweenPreceding(int number);

    /**
     * Add a <code>ROWS BETWEEN CURRENT ROW …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rowsBetweenCurrentRow();

    /**
     * Add a <code>ROWS BETWEEN UNBOUNDED FOLLOWING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rowsBetweenUnboundedFollowing();

    /**
     * Add a <code>ROWS BETWEEN [number] FOLLOWING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rowsBetweenFollowing(int number);

    /**
     * Add a <code>RANGE UNBOUNDED PRECEDING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rangeUnboundedPreceding();

    /**
     * Add a <code>RANGE [number] PRECEDING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rangePreceding(int number);

    /**
     * Add a <code>RANGE CURRENT ROW</code> frame clause to the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rangeCurrentRow();

    /**
     * Add a <code>RANGE UNBOUNDED FOLLOWING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rangeUnboundedFollowing();

    /**
     * Add a <code>RANGE [number] FOLLOWING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> rangeFollowing(int number);

    /**
     * Add a <code>RANGE BETWEEN UNBOUNDED PRECEDING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rangeBetweenUnboundedPreceding();

    /**
     * Add a <code>RANGE BETWEEN [number] PRECEDING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rangeBetweenPreceding(int number);

    /**
     * Add a <code>RANGE BETWEEN CURRENT ROW …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rangeBetweenCurrentRow();

    /**
     * Add a <code>RANGE BETWEEN UNBOUNDED FOLLOWING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rangeBetweenUnboundedFollowing();

    /**
     * Add a <code>RANGE BETWEEN [number] FOLLOWING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> rangeBetweenFollowing(int number);

    /**
     * Add a <code>GROUPS UNBOUNDED PRECEDING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> groupsUnboundedPreceding();

    /**
     * Add a <code>GROUPS [number] PRECEDING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> groupsPreceding(int number);

    /**
     * Add a <code>GROUPS CURRENT ROW</code> frame clause to the window function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> groupsCurrentRow();

    /**
     * Add a <code>GROUPS UNBOUNDED FOLLOWING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> groupsUnboundedFollowing();

    /**
     * Add a <code>GROUPS [number] FOLLOWING</code> frame clause to the window
     * function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowExcludeStep<T> groupsFollowing(int number);

    /**
     * Add a <code>GROUPS BETWEEN UNBOUNDED PRECEDING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> groupsBetweenUnboundedPreceding();

    /**
     * Add a <code>GROUPS BETWEEN [number] PRECEDING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> groupsBetweenPreceding(int number);

    /**
     * Add a <code>GROUPS BETWEEN CURRENT ROW …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> groupsBetweenCurrentRow();

    /**
     * Add a <code>GROUPS BETWEEN UNBOUNDED FOLLOWING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> groupsBetweenUnboundedFollowing();

    /**
     * Add a <code>GROUPS BETWEEN [number] FOLLOWING …</code> frame clause to
     * the window function.
     */
    @NotNull
    @Support({ H2, POSTGRES, BIGQUERY, SQLITE, YUGABYTEDB })
    WindowRowsAndStep<T> groupsBetweenFollowing(int number);
}
