/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritance_1_1 extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_1Record> {

	private static final long serialVersionUID = 1560897984;

	/**
	 * The singleton instance of <code>public.t_inheritance_1_1</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1 T_INHERITANCE_1_1 = new org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_1Record> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_1Record.class;
	}

	/**
	 * The column <code>public.t_inheritance_1_1.text_1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_1Record, java.lang.String> TEXT_1 = createField("text_1", org.jooq.impl.SQLDataType.CLOB.defaulted(true), this, "");

	/**
	 * The column <code>public.t_inheritance_1_1.text_1_1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_1Record, java.lang.String> TEXT_1_1 = createField("text_1_1", org.jooq.impl.SQLDataType.CLOB.defaulted(true), this, "");

	/**
	 * Create a <code>public.t_inheritance_1_1</code> table reference
	 */
	public TInheritance_1_1() {
		this("t_inheritance_1_1", null);
	}

	/**
	 * Create an aliased <code>public.t_inheritance_1_1</code> table reference
	 */
	public TInheritance_1_1(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1.T_INHERITANCE_1_1);
	}

	private TInheritance_1_1(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_1Record> aliased) {
		this(alias, aliased, null);
	}

	private TInheritance_1_1(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TInheritance_1_1Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1 as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1 rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1(name, null);
	}
}
