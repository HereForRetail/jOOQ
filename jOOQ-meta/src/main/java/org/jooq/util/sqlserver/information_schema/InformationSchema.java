/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class InformationSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1585392313;

	/**
	 * The singleton instance of INFORMATION_SCHEMA
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("INFORMATION_SCHEMA");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.sqlserver.information_schema.tables.Columns.COLUMNS,
			org.jooq.util.sqlserver.information_schema.tables.ConstraintColumnUsage.CONSTRAINT_COLUMN_USAGE,
			org.jooq.util.sqlserver.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE,
			org.jooq.util.sqlserver.information_schema.tables.Parameters.PARAMETERS,
			org.jooq.util.sqlserver.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
			org.jooq.util.sqlserver.information_schema.tables.Routines.ROUTINES,
			org.jooq.util.sqlserver.information_schema.tables.Sequences.SEQUENCES,
			org.jooq.util.sqlserver.information_schema.tables.Tables.TABLES,
			org.jooq.util.sqlserver.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS);
	}
}
