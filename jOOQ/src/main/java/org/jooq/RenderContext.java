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
package org.jooq;

import org.jooq.conf.ParamType;
import org.jooq.conf.RenderKeywordStyle;
import org.jooq.conf.Settings;

/**
 * The render context is used for rendering {@link QueryPart}'s to SQL.
 * <p>
 * A new render context is instantiated every time a {@link Query} is rendered.
 * <code>QueryPart</code>'s will then pass the same context to their components
 *
 * @author Lukas Eder
 * @see BindContext
 */
public interface RenderContext extends Context<RenderContext> {

    /**
     * Peek the next alias that will be generated by {@link #nextAlias()}.
     */
    @Override
    String peekAlias();

    /**
     * Return a new alias that is unique for the scope of one query. These
     * aliases are sometimes needed when unaliased projections are defined in
     * subqueries, which can lead to syntax errors.
     */
    @Override
    String nextAlias();

    /**
     * Render the context's underlying SQL statement.
     */
    @Override
    String render();

    /**
     * Render a query part in a new context derived from this one. The rendered
     * SQL will not be appended to this context.
     */
    @Override
    String render(QueryPart part);

    /**
     * Append a SQL keyword to the context's contained {@link StringBuilder}.
     * <p>
     * Use this to have your SQL keyword rendered in {@link RenderKeywordStyle}.
     */
    @Override
    RenderContext keyword(String keyword);

    /**
     * Append some SQL to the context's contained {@link StringBuilder}.
     */
    @Override
    RenderContext sql(String sql);

    /**
     * Append some SQL to the context's contained {@link StringBuilder}.
     * <p>
     * Set <code>literal = true</code> to indicate that the
     * <code>RenderContext</code> shall not format the argument SQL.
     */
    @Override
    RenderContext sql(String sql, boolean literal);

    /**
     * Append some SQL to the context's contained {@link StringBuilder}.
     */
    @Override
    RenderContext sql(char sql);

    /**
     * Append some SQL to the context's contained {@link StringBuilder}.
     */
    @Override
    RenderContext sql(int sql);

    /**
     * Recurse rendering.
     *
     * @deprecated - 3.2.0 - [#2666] - Use {@link #visit(QueryPart)} instead
     */
    @Deprecated
    RenderContext sql(QueryPart part);

    /**
     * Override the value of {@link Settings#isRenderFormatted()}.
     */
    @Override
    RenderContext format(boolean format);

    /**
     * The value of {@link Settings#isRenderFormatted()}.
     */
    @Override
    boolean format();

    /**
     * Render a new line character (only if {@link Settings#isRenderFormatted()}
     * is set to <code>true</code>).
     */
    @Override
    RenderContext formatNewLine();

    /**
     * Render a new line character (only if {@link Settings#isRenderFormatted()}
     * is set to <code>true</code>, and the {@link #formatPrintMargin(int)} has
     * been exceeded).
     */
    @Override
    RenderContext formatNewLineAfterPrintMargin();

    /**
     * Render a new line character (only if {@link Settings#isRenderFormatted()}
     * is set to <code>true</code>), or a whitespace separator character
     * otherwise.
     */
    @Override
    RenderContext formatSeparator();

    /**
     * Start indenting subsequent SQL by one level (two characters), if
     * {@link Settings#isRenderFormatted()} is set to <code>true</code>.
     * <p>
     * This is the same as calling {@link #formatIndentStart(int)} with a
     * parameter of <code>2</code>
     */
    @Override
    RenderContext formatIndentStart();

    /**
     * Start indenting subsequent SQL by a number of characters, if
     * {@link Settings#isRenderFormatted()} is set to <code>true</code>.
     */
    @Override
    RenderContext formatIndentStart(int indent);

    /**
     * Start indenting subsequent SQL at the same level as the current line, if
     * {@link Settings#isRenderFormatted()} is set to <code>true</code>.
     */
    @Override
    RenderContext formatIndentLockStart();

    /**
     * Stop indenting subsequent SQL by one level (two characters), if
     * {@link Settings#isRenderFormatted()} is set to <code>true</code>.
     * <p>
     * This is the same as calling {@link #formatIndentEnd(int)} with a
     * parameter of <code>2</code>
     */
    @Override
    RenderContext formatIndentEnd();

    /**
     * Stop indenting subsequent SQL by a number of characters, if
     * {@link Settings#isRenderFormatted()} is set to <code>true</code>.
     */
    @Override
    RenderContext formatIndentEnd(int indent);

    /**
     * Stop indenting subsequent SQL at the same level as the current line, if
     * {@link Settings#isRenderFormatted()} is set to <code>true</code>.
     */
    @Override
    RenderContext formatIndentLockEnd();

    /**
     * Set a print margin that will be applied to formatted SQL, if
     * {@link Settings#isRenderFormatted()} is set to <code>true</code>.
     * <p>
     * The default print margin is <code>80</code>. Setting this to zero or a
     * negative value means that no print margin will be applied.
     * <p>
     * The print margin is applied to any of these <code>QueryParts</code>:
     * <ul>
     * <li> {@link Field#in(Field...)} and related expressions</li>
     */
    @Override
    RenderContext formatPrintMargin(int margin);

    /**
     * Append some (quoted) literal to the context's contained
     * {@link StringBuilder}.
     */
    @Override
    RenderContext literal(String literal);

    /**
     * Whether bind variables should be inlined, rather than rendered as
     * <code>'?'</code>.
     *
     * @deprecated - 3.1.0 - [#2414] - This method should no longer be used. Use
     *             {@link #paramType()} instead.
     */
    @Deprecated
    boolean inline();

    /**
     * Set the new context value for {@link #inline()}.
     *
     * @deprecated - 3.1.0 - [#2414] - This method should no longer be used. Use
     *             {@link #paramType(ParamType)} instead.
     */
    @Deprecated
    RenderContext inline(boolean inline);

    /**
     * Whether query parts should render qualified names or not.
     */
    @Override
    boolean qualify();

    /**
     * Sett the new context value for {@link #qualify()}.
     */
    @Override
    RenderContext qualify(boolean qualify);

    /**
     * Whether bind variables should be rendered as named parameters:<br/>
     * <code>&#160; :1, :2, :custom_name</code>
     * <p>
     * or as JDBC bind variables <br/>
     * <code>&#160; ?</code>
     *
     * @deprecated - 3.1.0 - [#2414] - This method should no longer be used. Use
     *             {@link #paramType()} instead.
     */
    @Deprecated
    boolean namedParams();

    /**
     * Set the new context value for {@link #namedParams()}.
     *
     * @deprecated - 3.1.0 - [#2414] - This method should no longer be used. Use
     *             {@link #paramType(ParamType)} instead.
     */
    @Deprecated
    RenderContext namedParams(boolean renderNamedParams);

    /**
     * Specify, how bind values should be rendered.
     * <p>
     * <ul>
     * <li>As {@link ParamType#INDEXED} parameters: <br/>
     * <code>&#160; ?, ?, ?</code></li>
     * <li>As {@link ParamType#NAMED} parameters: <br/>
     * <code>&#160; :1, :2, :custom_name</code></li>
     * <li>As {@link ParamType#INLINED} parameters: <br/>
     * <code>&#160; 1, 'A', null</code></li>
     * </ul>
     */
    @Override
    ParamType paramType();

    /**
     * Set the new context value for {@link #paramType()}.
     */
    @Override
    RenderContext paramType(ParamType paramType);

    /**
     * The currently applied cast mode for bind values.
     */
    @Override
    CastMode castMode();

    /**
     * Set the new cast mode for {@link #castMode()}.
     */
    @Override
    RenderContext castMode(CastMode mode);

    /**
     * Whether casting must be applied. The result follows this logic:
     * <table border="1">
     * <tr>
     * <th>CastMode</th>
     * <th>result</th>
     * </tr>
     * <tr>
     * <td><code>ALWAYS</code></td>
     * <td><code>true</code></td>
     * </tr>
     * <tr>
     * <td><code>NEVER</code></td>
     * <td><code>false</code></td>
     * </tr>
     * <tr>
     * <td><code>SOME</code></td>
     * <td><code>true</code> or <code>false</code> depending on the dialect</td>
     * </tr>
     * <tr>
     * <td><code>DEFAULT</code></td>
     * <td><code>null</code></td>
     * </tr>
     * </table>
     *
     * @deprecated - [#3703] - 3.5.0 - Do not use this any longer
     */
    @Deprecated
    @Override
    Boolean cast();

    /**
     * Set the new cast mode to {@link CastMode#SOME} for a list of dialects.
     *
     * @deprecated - [#3703] - 3.5.0 - Do not use this any longer
     */
    @Deprecated
    @Override
    RenderContext castModeSome(SQLDialect... dialects);

    /**
     * The cast mode for bind values.
     *
     * @see RenderContext#castMode()
     */
    enum CastMode {

        /**
         * Cast all bind values to their respective type.
         */
        ALWAYS,

        /**
         * Cast no bind values to their respective type.
         */
        NEVER,

        /**
         * Cast bind values only in some dialects. The specified dialects assume
         * {@link #ALWAYS} behaviour, all the other dialects assume
         * {@link #NEVER}.
         *
         * @deprecated - [#3703] - 3.5.0 - Do not use this any longer
         */
        @Deprecated
        SOME,

        /**
         * Cast when needed. This is the default mode if not specified
         * otherwise.
         */
        DEFAULT
    }
}
