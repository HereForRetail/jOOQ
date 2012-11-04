/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings("all")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord> implements org.jooq.Record1<java.lang.String>, org.jooq.test.h2.generatedclasses.tables.interfaces.ITBookStore {

	private static final long serialVersionUID = 96904439;

	/**
	 * Setter for <code>PUBLIC.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBookStore.NAME, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@Override
	public java.lang.String getName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBookStore.NAME);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>PUBLIC.T_BOOK_TO_BOOK_STORE</code> referencing this <code>PUBLIC.T_BOOK_STORE</code>
	 */
	public org.jooq.Result<org.jooq.test.h2.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME.equal(getValue(org.jooq.test.h2.generatedclasses.tables.TBookStore.NAME)))
			.fetch();
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
		return org.jooq.test.h2.generatedclasses.tables.TBookStore.NAME;
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
		super(org.jooq.test.h2.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}
