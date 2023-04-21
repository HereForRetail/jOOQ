package org.jooq.util.bigquery;

import org.jooq.DataType;
import org.jooq.SQLDialect;
import org.jooq.impl.BuiltInDataType;
import org.jooq.impl.SQLDataType;

public class BigQueryDataType {

	private static final SQLDialect FAMILY = SQLDialect.BIGQUERY;

	public static final DataType<String> STRING = new BuiltInDataType<>(FAMILY, SQLDataType.CLOB, "string");
	public static final DataType<Double> FLOAT64 = new BuiltInDataType<>(FAMILY, SQLDataType.DOUBLE, "float64");
	public static final DataType<Long> INT64 = new BuiltInDataType<>(FAMILY, SQLDataType.BIGINT, "int64");

}
