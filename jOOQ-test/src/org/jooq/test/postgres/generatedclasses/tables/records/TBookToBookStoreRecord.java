/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book_to_book_store", schema = "public", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"book_store_name", "book_id"})
})
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1138257565;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES public.t_book_store (name)
	 * </pre></code>
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES public.t_book_store (name)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "book_store_name", nullable = false)
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES public.t_book_store (name)
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord fetchTBookStore() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES public.t_book (id)
	 * </pre></code>
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES public.t_book (id)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "book_id", nullable = false)
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES public.t_book (id)
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord fetchTBook() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "stock")
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK);
	}

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
