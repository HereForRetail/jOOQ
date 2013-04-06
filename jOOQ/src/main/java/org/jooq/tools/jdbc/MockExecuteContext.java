/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.tools.jdbc;

import java.sql.Statement;

import org.jooq.ContextDSL;
import org.jooq.Query;

/**
 * A mock execution context.
 * <p>
 * This context is passed to
 * {@link MockDataProvider#execute(MockExecuteContext)}, as a context object
 * containing all relevant information about a given query execution.
 *
 * @author Lukas Eder
 * @see MockDataProvider
 */
public class MockExecuteContext {

    private final String[]   sql;
    private final Object[][] bindings;

    private final int        autoGeneratedKeys;
    private final int[]      columnIndexes;
    private final String[]   columnNames;

    /**
     * Create a new mock execution context.
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     */
    public MockExecuteContext(String[] sql, Object[][] bindings) {
        this(sql, bindings, Statement.NO_GENERATED_KEYS, null, null);
    }

    /**
     * Create a new mock execution context.
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     * @param autoGeneratedKeys The corresponding value from
     *            <code>MockStatement</code>
     */
    public MockExecuteContext(String[] sql, Object[][] bindings, int autoGeneratedKeys) {
        this(sql, bindings, autoGeneratedKeys, null, null);
    }

    /**
     * Create a new mock execution context.
     * <p>
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     * @param columnIndexes The corresponding value from
     *            <code>MockStatement</code>
     */
    public MockExecuteContext(String[] sql, Object[][] bindings, int[] columnIndexes) {
        this(sql, bindings, Statement.RETURN_GENERATED_KEYS, columnIndexes, null);
    }

    /**
     * Create a new mock execution context.
     * <p>
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     * @param columnNames The corresponding value from
     *            <code>MockStatement</code>
     */
    public MockExecuteContext(String[] sql, Object[][] bindings, String[] columnNames) {
        this(sql, bindings, Statement.RETURN_GENERATED_KEYS, null, columnNames);
    }

    MockExecuteContext(String[] sql, Object[][] bindings, int autoGeneratedKeys, int[] columnIndexes,
        String[] columnNames) {
        this.sql = sql;
        this.bindings = bindings;
        this.autoGeneratedKeys = autoGeneratedKeys;
        this.columnIndexes = columnIndexes;
        this.columnNames = columnNames;
    }

    /**
     * Whether this execution context is a from a batch statement.
     *
     * @return Whether this execution context is a from a batch statement.
     */
    public boolean batch() {
        return batchSingle() || batchMultiple();
    }

    /**
     * Whether this execution context is from a "single batch" statement.
     *
     * @return Whether this execution context is from a "single batch"
     *         statement.
     * @see ContextDSL#batch(Query)
     */
    public boolean batchSingle() {
        return bindings.length > 1;
    }

    /**
     * Whether this execution context is from a "multi batch" statement.
     *
     * @return Whether this execution context is from a "multi batch" statement.
     * @see ContextDSL#batch(Query...)
     */
    public boolean batchMultiple() {
        return sql.length > 1;
    }

    /**
     * Get all batch SQL statements of a "multi batch" statement.
     *
     * @return All batch SQL statements of a "multi batch" statement, or an
     *         array of length <code>1</code> with the single statement.
     */
    public String[] batchSQL() {
        return sql;
    }

    /**
     * Get all bind variables of a "single batch" statement.
     *
     * @return All bind variables of a "single batch" statment, or an array of
     *         length <code>1</code> with the bind variables of a single
     *         statement.
     */
    public Object[][] batchBindings() {
        return bindings;
    }

    /**
     * Get the single (or first "multi batch") SQL statement.
     *
     * @return The single (or first "multi batch") SQL statement.
     */
    public String sql() {
        return sql[0];
    }

    /**
     * Get the single (or first "single batch") set of bind variables.
     *
     * @return The single (or first "single batch") set of bind variables.
     */
    public Object[] bindings() {
        return (bindings != null && bindings.length > 0) ? bindings[0] : new Object[0];
    }

    /**
     * The corresponding value from <code>MockStatement</code>.
     *
     * @return The corresponding value from <code>MockStatement</code>.
     */
    public int autoGeneratedKeys() {
        return autoGeneratedKeys;
    }

    /**
     * The corresponding value from <code>MockStatement</code>.
     *
     * @return The corresponding value from <code>MockStatement</code>.
     */
    public int[] columnIndexes() {
        return columnIndexes;
    }

    /**
     * The corresponding value from <code>MockStatement</code>.
     *
     * @return The corresponding value from <code>MockStatement</code>.
     */
    public String[] columnNames() {
        return columnNames;
    }
}
