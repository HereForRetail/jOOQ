/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore;
import org.jooq.test.postgres.generatedclasses.tables.interfaces.ITBookToBookStore;


/**
 * An m:n relation between books and book stores
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStoreRecord extends UpdatableRecordImpl<TBookToBookStoreRecord> implements Record3<String, Integer, Integer>, ITBookToBookStore {

	private static final long serialVersionUID = -1250471838;

	/**
	 * Setter for <code>public.t_book_to_book_store.book_store_name</code>. The book store name
	 */
	public TBookToBookStoreRecord setBookStoreName(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book_to_book_store.book_store_name</code>. The book store name
	 */
	@Override
	public String getBookStoreName() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_book_to_book_store.book_id</code>. The book ID
	 */
	public TBookToBookStoreRecord setBookId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book_to_book_store.book_id</code>. The book ID
	 */
	@Override
	public Integer getBookId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.t_book_to_book_store.stock</code>. The number of books on stock
	 */
	public TBookToBookStoreRecord setStock(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_book_to_book_store.stock</code>. The number of books on stock
	 */
	@Override
	public Integer getStock() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<String, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<String, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getStock();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord value1(String value) {
		setBookStoreName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord value2(Integer value) {
		setBookId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord value3(Integer value) {
		setStock(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookToBookStoreRecord values(String value1, Integer value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * Create a detached, initialised TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord(String bookStoreName, Integer bookId, Integer stock) {
		super(TBookToBookStore.T_BOOK_TO_BOOK_STORE);

		setValue(0, bookStoreName);
		setValue(1, bookId);
		setValue(2, stock);
	}
}
