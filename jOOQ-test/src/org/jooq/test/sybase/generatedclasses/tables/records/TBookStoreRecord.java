/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings("all")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> implements org.jooq.Record1<java.lang.String> {

	private static final long serialVersionUID = 1102610979;

	/**
	 * Setter for <code>DBA.t_book_store.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME, value);
	}

	/**
	 * Getter for <code>DBA.t_book_store.name</code>. 
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}
