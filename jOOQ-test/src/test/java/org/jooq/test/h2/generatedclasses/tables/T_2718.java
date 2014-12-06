/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2718 extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record> {

	private static final long serialVersionUID = 1580176027;

	/**
	 * The reference instance of <code>PUBLIC.T_2718</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.T_2718 T_2718 = new org.jooq.test.h2.generatedclasses.tables.T_2718();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.T_2718Record.class;
	}

	/**
	 * The column <code>PUBLIC.T_2718.EXCLUDE_ME</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record, java.lang.Integer> EXCLUDE_ME = createField("EXCLUDE_ME", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_2718.XX</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record, java.lang.Integer> XX = createField("XX", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.T_2718</code> table reference
	 */
	public T_2718() {
		this("T_2718", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_2718</code> table reference
	 */
	public T_2718(java.lang.String alias) {
		this(alias, org.jooq.test.h2.generatedclasses.tables.T_2718.T_2718);
	}

	private T_2718(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record> aliased) {
		this(alias, aliased, null);
	}

	private T_2718(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.h2.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record> getPrimaryKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_2718;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.T_2718Record>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_2718);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.h2.generatedclasses.tables.T_2718 as(java.lang.String alias) {
		return new org.jooq.test.h2.generatedclasses.tables.T_2718(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.h2.generatedclasses.tables.T_2718 rename(java.lang.String name) {
		return new org.jooq.test.h2.generatedclasses.tables.T_2718(name, null);
	}
}
