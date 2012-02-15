/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Sequences extends org.jooq.impl.TableImpl<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord> {

	private static final long serialVersionUID = 317738181;

	/**
	 * The singleton instance of SEQUENCES
	 */
	public static final org.jooq.util.sqlserver.information_schema.tables.Sequences SEQUENCES = new org.jooq.util.sqlserver.information_schema.tables.Sequences();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord> __RECORD_TYPE = org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_CATALOG = createField("SEQUENCE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_SCHEMA = createField("SEQUENCE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> SEQUENCE_NAME = createField("SEQUENCE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.Long> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.Long> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.Long> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> MAXIMUM_VALUE = createField("MAXIMUM_VALUE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> MINIMUM_VALUE = createField("MINIMUM_VALUE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> INCREMENT = createField("INCREMENT", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> CYCLE_OPTION = createField("CYCLE_OPTION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> DECLARED_DATA_TYPE = createField("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.Long> DECLARED_NUMERIC_PRECISION = createField("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.Long> DECLARED_NUMERIC_SCALE = createField("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> START_WITH = createField("START_WITH", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.util.sqlserver.information_schema.tables.records.SequencesRecord, java.lang.String> NEXT_VALUE = createField("NEXT_VALUE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private Sequences() {
		super("SEQUENCES", org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * No further instances allowed
	 */
	private Sequences(java.lang.String alias) {
		super(alias, org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.sqlserver.information_schema.tables.Sequences.SEQUENCES);
	}

	@Override
	public org.jooq.util.sqlserver.information_schema.tables.Sequences as(java.lang.String alias) {
		return new org.jooq.util.sqlserver.information_schema.tables.Sequences(alias);
	}
}
