/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1635782688;

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES LUKAS.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, value);
	}

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES LUKAS.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	}

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES LUKAS.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.db2.generatedclasses.tables.TBookStore.NAME.equal(getValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES LUKAS.T_BOOK (ID)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.BOOK_ID, value);
	}

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES LUKAS.T_BOOK (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	}

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES LUKAS.T_BOOK (ID)
	 * </pre></code>
	 */
	public org.jooq.test.db2.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.db2.generatedclasses.tables.TBook.ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.STOCK</code>
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.STOCK, value);
	}

	/**
	 * The table column <code>LUKAS.T_BOOK_TO_BOOK_STORE.STOCK</code>
	 */
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.db2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
