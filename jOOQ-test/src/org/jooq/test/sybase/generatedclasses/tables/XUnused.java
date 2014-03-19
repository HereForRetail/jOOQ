/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = 572061533;

	/**
	 * The singleton instance of <code>DBA.x_unused</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.sybase.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord.class;
	}

	/**
	 * The column <code>DBA.x_unused.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.BIG_INTEGER</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(25).nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.ID_REF</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.NAME_REF</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = createField("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.CLASS</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.FIELDS</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.CONFIGURATION</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.U_D_T</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.META_DATA</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.TYPE0</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.PRIMARY_KEY</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.PRIMARYKEY</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.x_unused.FIELD 737</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 2).nullable(false), this, "");

	/**
	 * Create a <code>DBA.x_unused</code> table reference
	 */
	public XUnused() {
		this("x_unused", null);
	}

	/**
	 * Create an aliased <code>DBA.x_unused</code> table reference
	 */
	public XUnused(java.lang.String alias) {
		this(alias, org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED);
	}

	private XUnused(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> aliased) {
		this(alias, aliased, null);
	}

	private XUnused(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> getPrimaryKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__PK_X_UNUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__PK_X_UNUSED, org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__UK_X_UNUSED_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_UNUSED__FK_X_UNUSED_SELF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.XUnused as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.XUnused(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sybase.generatedclasses.tables.XUnused rename(java.lang.String name) {
		return new org.jooq.test.sybase.generatedclasses.tables.XUnused(name, null);
	}
}
