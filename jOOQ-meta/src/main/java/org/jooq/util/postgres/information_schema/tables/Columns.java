/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Columns extends org.jooq.impl.TableImpl<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord> {

	private static final long serialVersionUID = -888880582;

	/**
	 * The singleton instance of columns
	 */
	public static final org.jooq.util.postgres.information_schema.tables.Columns COLUMNS = new org.jooq.util.postgres.information_schema.tables.Columns();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord> __RECORD_TYPE = org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_CATALOG = createField("table_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_NAME = createField("column_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> ORDINAL_POSITION = createField("ordinal_position", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> COLUMN_DEFAULT = createField("column_default", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_NULLABLE = createField("is_nullable", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> DATA_TYPE = createField("data_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> CHARACTER_MAXIMUM_LENGTH = createField("character_maximum_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> CHARACTER_OCTET_LENGTH = createField("character_octet_length", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> NUMERIC_PRECISION = createField("numeric_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> NUMERIC_PRECISION_RADIX = createField("numeric_precision_radix", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> NUMERIC_SCALE = createField("numeric_scale", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> DATETIME_PRECISION = createField("datetime_precision", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> INTERVAL_TYPE = createField("interval_type", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> INTERVAL_PRECISION = createField("interval_precision", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_CATALOG = createField("character_set_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_SCHEMA = createField("character_set_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> CHARACTER_SET_NAME = createField("character_set_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_CATALOG = createField("collation_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_SCHEMA = createField("collation_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> COLLATION_NAME = createField("collation_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> DOMAIN_CATALOG = createField("domain_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> DOMAIN_SCHEMA = createField("domain_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> UDT_CATALOG = createField("udt_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> UDT_SCHEMA = createField("udt_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> UDT_NAME = createField("udt_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> SCOPE_CATALOG = createField("scope_catalog", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> SCOPE_SCHEMA = createField("scope_schema", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> SCOPE_NAME = createField("scope_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.Integer> MAXIMUM_CARDINALITY = createField("maximum_cardinality", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> DTD_IDENTIFIER = createField("dtd_identifier", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_SELF_REFERENCING = createField("is_self_referencing", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_IDENTITY = createField("is_identity", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_GENERATION = createField("identity_generation", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_START = createField("identity_start", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_INCREMENT = createField("identity_increment", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_MAXIMUM = createField("identity_maximum", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_MINIMUM = createField("identity_minimum", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IDENTITY_CYCLE = createField("identity_cycle", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_GENERATED = createField("is_generated", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> GENERATION_EXPRESSION = createField("generation_expression", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.postgres.information_schema.tables.records.ColumnsRecord, java.lang.String> IS_UPDATABLE = createField("is_updatable", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private Columns() {
		super("columns", org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private Columns(java.lang.String alias) {
		super(alias, org.jooq.util.postgres.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.postgres.information_schema.tables.Columns.COLUMNS);
	}

	@Override
	public org.jooq.util.postgres.information_schema.tables.Columns as(java.lang.String alias) {
		return new org.jooq.util.postgres.information_schema.tables.Columns(alias);
	}
}
