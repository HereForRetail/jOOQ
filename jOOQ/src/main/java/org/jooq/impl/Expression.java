/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
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
package org.jooq.impl;

import static java.util.Arrays.asList;
import static org.jooq.SQLDialect.ASE;
import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.HSQLDB;
import static org.jooq.SQLDialect.INGRES;
import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.SQLDialect.ORACLE;
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.SQLITE;
import static org.jooq.SQLDialect.SQLSERVER;
import static org.jooq.SQLDialect.SYBASE;
import static org.jooq.impl.ExpressionOperator.ADD;
import static org.jooq.impl.ExpressionOperator.BIT_AND;
import static org.jooq.impl.ExpressionOperator.BIT_NAND;
import static org.jooq.impl.ExpressionOperator.BIT_NOR;
import static org.jooq.impl.ExpressionOperator.BIT_OR;
import static org.jooq.impl.ExpressionOperator.BIT_XNOR;
import static org.jooq.impl.ExpressionOperator.BIT_XOR;
import static org.jooq.impl.ExpressionOperator.SHL;
import static org.jooq.impl.ExpressionOperator.SHR;
import static org.jooq.impl.ExpressionOperator.SUBTRACT;
import static org.jooq.impl.Factory.bitAnd;
import static org.jooq.impl.Factory.bitNot;
import static org.jooq.impl.Factory.bitOr;
import static org.jooq.impl.Factory.bitXor;
import static org.jooq.impl.Factory.field;
import static org.jooq.impl.Factory.function;
import static org.jooq.impl.Factory.literal;
import static org.jooq.impl.Factory.val;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.jooq.Attachable;
import org.jooq.BindContext;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Param;
import org.jooq.QueryPart;
import org.jooq.RenderContext;
import org.jooq.SQLDialect;
import org.jooq.types.DayToSecond;
import org.jooq.types.YearToMonth;

class Expression<T> extends AbstractFunction<T> {

    /**
     * Generated UID
     */
    private static final long        serialVersionUID = -5522799070693019771L;

    private final Field<T>           lhs;
    private final FieldList          rhs;
    private final ExpressionOperator operator;

    Expression(ExpressionOperator operator, Field<T> lhs, Field<?>... rhs) {
        super(operator.toSQL(), lhs.getDataType(), Util.combine(lhs, rhs));

        this.operator = operator;
        this.lhs = lhs;
        this.rhs = new FieldList();
        this.rhs.addAll(Arrays.asList(rhs));
    }

    @Override
    public final Field<T> add(Field<?> value) {
        if (operator == ExpressionOperator.ADD) {
            rhs.add(value);
            return this;
        }

        return super.add(value);
    }

    @Override
    public final Field<T> mul(Field<? extends Number> value) {
        if (operator == ExpressionOperator.MULTIPLY) {
            rhs.add(value);
            return this;
        }

        return super.mul(value);
    }

    @SuppressWarnings("unchecked")
    @Override
    final Field<T> getFunction0(Configuration configuration) {
        SQLDialect dialect = configuration.getDialect();

        // DB2, H2 and HSQLDB know functions, instead of operators
        if (BIT_AND == operator && asList(DB2, H2, HSQLDB, ORACLE).contains(dialect)) {
            return function("bitand", getDataType(), getArguments());
        }
        else if (BIT_XOR == operator && asList(DB2, H2, HSQLDB).contains(dialect)) {
            return function("bitxor", getDataType(), getArguments());
        }
        else if (BIT_OR == operator && asList(DB2, H2, HSQLDB).contains(dialect)) {
            return function("bitor", getDataType(), getArguments());
        }

        // Oracle has to simulate or/xor
        else if (BIT_OR == operator && ORACLE == dialect) {
            return lhs.sub(bitAnd(lhsAsNumber(), rhsAsNumber())).add(rhsAsNumber());
        }

        // ~(a & b) & (a | b)
        else if (BIT_XOR == operator && asList(ORACLE, SQLITE).contains(dialect)) {
            return (Field<T>) bitAnd(
                bitNot(bitAnd(lhsAsNumber(), rhsAsNumber())),
                bitOr(lhsAsNumber(), rhsAsNumber()));
        }

        // Many dialects don't support shifts. Use multiplication/division instead
        else if (SHL == operator && asList(ASE, DB2, H2, HSQLDB, INGRES, ORACLE, SQLSERVER, SYBASE).contains(dialect)) {
            return lhs.mul(Factory.power(literal(2), rhsAsNumber()));
        }
        else if (SHR == operator && asList(ASE, DB2, H2, HSQLDB, INGRES, ORACLE, SQLSERVER, SYBASE).contains(dialect)) {
            return lhs.div(Factory.power(literal(2), rhsAsNumber()));
        }

        // These operators are not supported in any dialect
        else if (BIT_NAND == operator) {
            return (Field<T>) bitNot(bitAnd(lhsAsNumber(), rhsAsNumber()));
        }
        else if (BIT_NOR == operator) {
            return (Field<T>) bitNot(bitOr(lhsAsNumber(), rhsAsNumber()));
        }
        else if (BIT_XNOR == operator) {
            return (Field<T>) bitNot(bitXor(lhsAsNumber(), rhsAsNumber()));
        }

        // [#585] Date time arithmetic for numeric or interval RHS
        else if (asList(ADD, SUBTRACT).contains(operator) &&
             lhs.getDataType().isDateTime() &&
            (rhs.get(0).getDataType().isNumeric() ||
             rhs.get(0).getDataType().isInterval())) {

            return new DateExpression();
        }

        // Use the default operator expression for all other cases
        else {
            return new DefaultExpression();
        }
    }

    /**
     * In some expressions, the lhs can be safely assumed to be a single number
     */
    @SuppressWarnings("unchecked")
    private final Field<Number> lhsAsNumber() {
        return (Field<Number>) lhs;
    }

    /**
     * In some expressions, the rhs can be safely assumed to be a single number
     */
    @SuppressWarnings("unchecked")
    private final Field<Number> rhsAsNumber() {
        return (Field<Number>) rhs.get(0);
    }

    private class DateExpression extends AbstractFunction<T> {

        /**
         * Generated UID
         */
        private static final long serialVersionUID = 3160679741902222262L;

        DateExpression() {
            super(operator.toSQL(), lhs.getDataType());
        }

        @Override
        final Field<T> getFunction0(Configuration configuration) {
            if (rhs.get(0).getDataType().isInterval()) {
                return getIntervalExpression(configuration);
            }
            else {
                return getNumberExpression(configuration);
            }
        }

        /**
         * Return the expression to be rendered when the RHS is an interval type
         */
        private final Field<T> getIntervalExpression(Configuration configuration) {
            SQLDialect dialect = configuration.getDialect();

            switch (dialect) {
                case ASE:
                case SYBASE:
                case SQLSERVER: {
                    if (rhs.get(0).getType() == YearToMonth.class) {
                        YearToMonth interval = ((Param<YearToMonth>) rhs.get(0)).getValue();

                        if (operator == ADD) {
                            return function("dateadd", getDataType(), literal("mm"), val(interval.intValue()), lhs);
                        }
                        else {
                            return function("dateadd", getDataType(), literal("mm"), val(-interval.intValue()), lhs);
                        }
                    }
                    else {
                        // SQL Server needs this cast.
                        Field<?> result = lhs.cast(Timestamp.class);
                        DayToSecond interval = ((Param<DayToSecond>) rhs.get(0)).getValue();

                        if (operator == ADD) {
                            if (interval.getNano() != 0) {
                                int micro = interval.getNano() / 1000;

                                result = function("dateadd", getDataType(), literal("us"), val(micro), result);
                                result = function("dateadd", getDataType(), literal("ss"), val((long) interval.getTotalSeconds()), result);
                            }
                            else {
                                result = function("dateadd", getDataType(), literal("ss"), val((long) interval.getTotalSeconds()), result);
                            }
                        }
                        else {
                            if (interval.getNano() != 0) {
                                int micro = interval.getNano() / 1000;

                                result = function("dateadd", getDataType(), literal("us"), val(-micro), result);
                                result = function("dateadd", getDataType(), literal("ss"), val(-(long) interval.getTotalSeconds()), result);
                            }
                            else {
                                result = function("dateadd", getDataType(), literal("ss"), val(-(long) interval.getTotalSeconds()), result);
                            }
                        }

                        return (Field) result;
                    }
                }

                case DB2: {
                    if (rhs.get(0).getType() == YearToMonth.class) {
                        YearToMonth interval = ((Param<YearToMonth>) rhs.get(0)).getValue();

                        if (operator == ADD) {
                            return lhs.add(field("{0} month", val(interval.intValue())));
                        }
                        else {
                            return lhs.sub(field("{0} month", val(interval.intValue())));
                        }
                    }
                    else {
                        DayToSecond interval = ((Param<DayToSecond>) rhs.get(0)).getValue();
                        if (operator == ADD) {
                            return (Field) lhs.cast(Timestamp.class).add(field("{0} microseconds", val(interval.getTotalMicro())));
                        }
                        else {
                            return (Field) lhs.cast(Timestamp.class).sub(field("{0} microseconds", val(interval.getTotalMicro())));
                        }
                    }
                }

                case DERBY:
                case HSQLDB: {
                    if (rhs.get(0).getType() == YearToMonth.class) {
                        YearToMonth interval = ((Param<YearToMonth>) rhs.get(0)).getValue();

                        if (operator == ADD) {
                            return field("{fn {timestampadd}({sql_tsi_month}, {0}, {1}) }", getDataType(), val(interval.intValue()), lhs);
                        }
                        else {
                            return field("{fn {timestampadd}({sql_tsi_month}, {0}, {1}) }", getDataType(), val(-interval.intValue()), lhs);
                        }
                    }
                    else {
                        DayToSecond interval = ((Param<DayToSecond>) rhs.get(0)).getValue();

                        if (operator == ADD) {
                            return field("{fn {timestampadd}({sql_tsi_second}, {0}, {1}) }", getDataType(), val((long) interval.getTotalSeconds()), lhs);
                        }
                        else {
                            return field("{fn {timestampadd}({sql_tsi_second}, {0}, {1}) }", getDataType(), val((long) -interval.getTotalSeconds()), lhs);
                        }
                    }
                }

                case CUBRID:
                case MYSQL: {
                    org.jooq.types.Interval<?> interval = ((Param<org.jooq.types.Interval<?>>) rhs.get(0)).getValue();

                    if (operator == SUBTRACT) {
                        interval = interval.neg();
                    }

                    if (rhs.get(0).getType() == YearToMonth.class) {
                        return field("{date_add}({0}, {interval} {1} {year_month})", getDataType(), lhs, val(interval));
                    }
                    else {
                        if (dialect == MYSQL) {
                            return field("{date_add}({0}, {interval} {1} {day_microsecond})", getDataType(), lhs, val(interval));
                        }
                        else {
                            return field("{date_add}({0}, {interval} {1} {day_millisecond})", getDataType(), lhs, val(interval));
                        }
                    }
                }

                case H2: {
                    org.jooq.types.Interval<?> interval = ((Param<org.jooq.types.Interval<?>>) rhs.get(0)).getValue();

                    if (operator == SUBTRACT) {
                        interval = interval.neg();
                    }

                    if (rhs.get(0).getType() == YearToMonth.class) {
                        return function("dateadd", getDataType(), literal("'month'"), val(interval.intValue()), lhs);
                    }
                    else {
                        return function("dateadd", getDataType(), literal("'ms'"), val((long) ((DayToSecond) interval).getTotalMilli()), lhs);
                    }
                }

                case ORACLE:
                default:
                    return new DefaultExpression();
            }
        }

        /**
         * Return the expression to be rendered when the RHS is a number type
         */
        private final Field<T> getNumberExpression(Configuration configuration) {
            switch (configuration.getDialect()) {
                case ASE:
                case SQLSERVER:
                case SYBASE: {
                    if (operator == ADD) {
                        return function("dateadd", getDataType(), literal("day"), rhsAsNumber(), lhs);
                    }
                    else {
                        return function("dateadd", getDataType(), literal("day"), rhsAsNumber().neg(), lhs);
                    }
                }

                case DB2:
                case HSQLDB: {
                    if (operator == ADD) {
                        return lhs.add(field("{0} day", rhsAsNumber()));
                    }
                    else {
                        return lhs.sub(field("{0} day", rhsAsNumber()));
                    }
                }

                case DERBY: {
                    if (operator == ADD) {
                        return field("{fn {timestampadd}({sql_tsi_day}, {0}, {1}) }", getDataType(), rhsAsNumber(), lhs);
                    }
                    else {
                        return field("{fn {timestampadd}({sql_tsi_day}, {0}, {1}) }", getDataType(), rhsAsNumber().neg(), lhs);
                    }
                }

                case CUBRID:
                case MYSQL: {
                    if (operator == ADD) {
                        return field("{date_add}({0}, {interval} {1} {day})", getDataType(), lhs, rhsAsNumber());
                    }
                    else {
                        return field("{date_add}({0}, {interval} {1} {day})", getDataType(), lhs, rhsAsNumber().neg());
                    }
                }

                // Ingres is not working yet
                case INGRES: {
                    if (operator == ADD) {
                        return lhs.add(field("date('" + rhsAsNumber() + " days')", Object.class));
                    }
                    else {
                        return lhs.sub(field("date('" + rhsAsNumber() + " days')", Object.class));
                    }
                }

                // Postgres can add / subtract days using +/- operators only to DATE
                case POSTGRES: {
                    if (getType() == Date.class) {
                        return new DefaultExpression();
                    }
                    else {
                        return new Expression(operator, lhs.cast(Date.class), rhsAsNumber());
                    }
                }

                case SQLITE:
                    if (operator == ADD) {
                        return function("datetime", getDataType(), lhs, literal("+" + rhsAsNumber() + " day"));
                    }
                    else {
                        return function("datetime", getDataType(), lhs, literal("-" + rhsAsNumber() + " day"));
                    }

                // These dialects can add / subtract days using +/- operators
                case H2:
                case ORACLE:
                default:
                    return new DefaultExpression();
            }
        }
    }

    private class DefaultExpression extends AbstractField<T> {

        /**
         * Generated UID
         */
        private static final long serialVersionUID = -5105004317793995419L;

        private DefaultExpression() {
            super(operator.toSQL(), lhs.getDataType());
        }

        @Override
        public final List<Attachable> getAttachables() {
            return Expression.this.getAttachables();
        }

        @Override
        public final void toSQL(RenderContext context) {
            String op = operator.toSQL();

            if (operator == BIT_XOR && context.getDialect() == POSTGRES) {
                op = "#";
            }

            context.sql("(");
            context.sql(lhs);

            for (Field<?> field : rhs) {
                context.sql(" ")
                       .sql(op)
                       .sql(" ")
                       .sql(field);
            }

            context.sql(")");
        }

        @Override
        public final void bind(BindContext context) {
            context.bind(lhs).bind((QueryPart) rhs);
        }

        @Override
        public final boolean isNullLiteral() {
            return false;
        }
    }
}
