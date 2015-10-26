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
package org.jooq.test;

import static org.jooq.conf.ParamType.INDEXED;
import static org.jooq.conf.ParamType.INLINED;
import static org.jooq.conf.ParamType.NAMED;

import org.jooq.Context;
import org.jooq.RenderContext;
import org.jooq.impl.CustomCondition;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Some common tests related to {@link RenderContext}
 *
 * @author Lukas Eder
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RenderContextTest extends AbstractTest {

    @Test
    public void testParamType() {
        assertEquals(INDEXED, create.renderContext().paramType());
        assertEquals(INDEXED, r_ref().paramType());
        assertEquals(INLINED, r_refI().paramType());
        assertEquals(NAMED, r_refP().paramType());
    }

    @Test
    public void testData() {
        RenderContext ctx = create.renderContext();
        ctx.data("key", "value");

        TestDataQueryPart part = new TestDataQueryPart();
        ctx.render(part);
        assertEquals("value", part.value);
    }

    private static class TestDataQueryPart extends CustomCondition {

        /**
         * Generated UID
         */
        private static final long serialVersionUID = 2310925428858496140L;

        Object value;

        @Override
        public void accept(Context<?> context) {
            value = context.data("key");
        }
    }
}
