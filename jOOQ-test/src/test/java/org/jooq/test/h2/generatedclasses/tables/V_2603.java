/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class V_2603 extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.V_2603Record> {

	private static final long serialVersionUID = -2056353847;

	/**
	 * The reference instance of <code>PUBLIC.V_2603</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.V_2603 V_2603 = new org.jooq.test.h2.generatedclasses.tables.V_2603();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.V_2603Record> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.V_2603Record.class;
	}

	/**
	 * The column <code>PUBLIC.V_2603.COL1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.V_2603Record, java.lang.Integer> COL1 = createField("COL1", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.V_2603.COL4</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.V_2603Record, java.lang.Integer> COL4 = createField("COL4", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.V_2603</code> table reference
	 */
	public V_2603() {
		this("V_2603", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.V_2603</code> table reference
	 */
	public V_2603(java.lang.String alias) {
		this(alias, org.jooq.test.h2.generatedclasses.tables.V_2603.V_2603);
	}

	private V_2603(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.V_2603Record> aliased) {
		this(alias, aliased, null);
	}

	private V_2603(java.lang.String alias, org.jooq.Table<org.jooq.test.h2.generatedclasses.tables.records.V_2603Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.h2.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.h2.generatedclasses.tables.V_2603 as(java.lang.String alias) {
		return new org.jooq.test.h2.generatedclasses.tables.V_2603(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.h2.generatedclasses.tables.V_2603 rename(java.lang.String name) {
		return new org.jooq.test.h2.generatedclasses.tables.V_2603(name, null);
	}
}
