/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_BOOK_TO_BOOK_STORE extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> implements java.lang.Cloneable {

	private static final long serialVersionUID = 2137253787;

	/**
	 * The singleton instance of <code>TEST.T_BOOK_TO_BOOK_STORE</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE T_BOOK_TO_BOOK_STORE = new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE.class;
	}

	/**
	 * The column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. The book store name
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "The book store name");

	/**
	 * The column <code>TEST.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. The book ID
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The book ID");

	/**
	 * The column <code>TEST.T_BOOK_TO_BOOK_STORE.STOCK</code>. The number of books on stock
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this, "The number of books on stock");

	/**
	 * Create a <code>TEST.T_BOOK_TO_BOOK_STORE</code> table reference
	 */
	public T_BOOK_TO_BOOK_STORE() {
		this("T_BOOK_TO_BOOK_STORE", null);
	}

	/**
	 * Create an aliased <code>TEST.T_BOOK_TO_BOOK_STORE</code> table reference
	 */
	public T_BOOK_TO_BOOK_STORE(java.lang.String alias) {
		this(alias, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE);
	}

	private T_BOOK_TO_BOOK_STORE(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> aliased) {
		this(alias, aliased, null);
	}

	private T_BOOK_TO_BOOK_STORE(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, aliased, parameters, "An m:n relation between books and book stores");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_B2BS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_B2BS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_B2BS_BS_NAME, org.jooq.test.oracle3.generatedclasses.Keys.FK_B2BS_B_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE rename(java.lang.String name) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE(name, null);
	}
}
