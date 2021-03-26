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

import static org.jooq.impl.Keywords.K_CASCADE;
import static org.jooq.impl.Keywords.K_RESTRICT;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.jooq.Configuration;
import org.jooq.Context;
import org.jooq.DDLQuery;
import org.jooq.Field;
import org.jooq.Record;

/**
 * @author Lukas Eder
 */
abstract class AbstractDDLQuery extends AbstractRowCountQuery implements DDLQuery {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -5166285519537392193L;

    AbstractDDLQuery(Configuration configuration) {
        super(configuration);
    }

    static final void acceptCascade(Context<?> ctx, Cascade cascade) {
        if (cascade == Cascade.CASCADE)
            ctx.sql(' ').visit(K_CASCADE);
        else if (cascade == Cascade.RESTRICT)
            ctx.sql(' ').visit(K_RESTRICT);
    }
}
