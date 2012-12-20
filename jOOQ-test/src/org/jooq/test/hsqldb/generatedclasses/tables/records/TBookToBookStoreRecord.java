/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TBookToBookStoreRecord> implements org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBookToBookStore {

	private static final long serialVersionUID = -586630399;

	/**
	 * Setter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. 
	 */
	@Override
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord}
	 */
	public void setBookStoreName(org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord value) {
		if (value == null) {
			setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, null);
		}
		else {
			setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value.getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME));
		}
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>. 
	 */
	@Override
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. 
	 */
	@Override
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord}
	 */
	public void setBookId(org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord value) {
		if (value == null) {
			setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, null);
		}
		else {
			setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, value.getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK.ID));
		}
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>. 
	 */
	@Override
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.STOCK</code>. 
	 */
	@Override
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK_TO_BOOK_STORE.STOCK</code>. 
	 */
	@Override
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a <code>PUBLIC.T_BOOK_STORE</code> referenced by this <code>PUBLIC.T_BOOK_TO_BOOK_STORE</code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>PUBLIC.T_BOOK</code> referenced by this <code>PUBLIC.T_BOOK_TO_BOOK_STORE</code>
	 */
	public org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.hsqldb.generatedclasses.tables.TBook.T_BOOK.ID.equal(getValue(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.String, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getStock();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBookToBookStore from) {
		setBookStoreName(from.getBookStoreName());
		setBookId(from.getBookId());
		setStock(from.getStock());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITBookToBookStore> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
