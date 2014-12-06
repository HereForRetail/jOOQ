/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3488AbcXyzEee extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord> {

	private static final long serialVersionUID = 639950735;

	/**
	 * The reference instance of <code>PUBLIC.T_3488_ABC_XYZ_EEE</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee T_3488_ABC_XYZ_EEE = new org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_3488_ABC_XYZ_EEE.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.T_3488_ABC_XYZ_EEE</code> table reference
	 */
	public T_3488AbcXyzEee() {
		this("T_3488_ABC_XYZ_EEE", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_3488_ABC_XYZ_EEE</code> table reference
	 */
	public T_3488AbcXyzEee(java.lang.String alias) {
		this(alias, org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee.T_3488_ABC_XYZ_EEE);
	}

	private T_3488AbcXyzEee(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_3488AbcXyzEee(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.h2.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord> getPrimaryKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_3488_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_3488AbcXyzEeeRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_3488_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee as(java.lang.String alias) {
		return new org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee rename(java.lang.String name) {
		return new org.jooq.test.h2.generatedclasses.tables.T_3488AbcXyzEee(name, null);
	}
}
