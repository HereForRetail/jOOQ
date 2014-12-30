/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.TBook;
import org.jooq.test.h2.generatedclasses.tables.interfaces.ITBook;


/**
 * An entity holding books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> implements Record11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], Integer, Timestamp>, ITBook {

	private static final long serialVersionUID = 1781665681;

	/**
	 * Setter for <code>PUBLIC.T_BOOK.ID</code>. The book ID
	 */
	@Override
	public TBookRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.ID</code>. The book ID
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	@Override
	public TBookRecord setAuthorId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	@Override
	public Integer getAuthorId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Override
	public TBookRecord setCoAuthorId(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Override
	public Integer getCoAuthorId() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.DETAILS_ID</code>.
	 */
	@Override
	public TBookRecord setDetailsId(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.DETAILS_ID</code>.
	 */
	@Override
	public Integer getDetailsId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.TITLE</code>. The book's title
	 */
	@Override
	public TBookRecord setTitle(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.TITLE</code>. The book's title
	 */
	@Override
	public String getTitle() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	@Override
	public TBookRecord setPublishedIn(Integer value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	@Override
	public Integer getPublishedIn() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	@Override
	public TBookRecord setLanguageId(Integer value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	@Override
	public Integer getLanguageId() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	@Override
	public TBookRecord setContentText(String value) {
		setValue(7, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	@Override
	public String getContentText() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	@Override
	public TBookRecord setContentPdf(byte[] value) {
		setValue(8, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	@Override
	public byte[] getContentPdf() {
		return (byte[]) getValue(8);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.REC_VERSION</code>.
	 */
	@Override
	public TBookRecord setRecVersion(Integer value) {
		setValue(9, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.REC_VERSION</code>.
	 */
	@Override
	public Integer getRecVersion() {
		return (Integer) getValue(9);
	}

	/**
	 * Setter for <code>PUBLIC.T_BOOK.REC_TIMESTAMP</code>.
	 */
	@Override
	public TBookRecord setRecTimestamp(Timestamp value) {
		setValue(10, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_BOOK.REC_TIMESTAMP</code>.
	 */
	@Override
	public Timestamp getRecTimestamp() {
		return (Timestamp) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], Integer, Timestamp> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, Integer, Integer, String, Integer, Integer, String, byte[], Integer, Timestamp> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TBook.T_BOOK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TBook.T_BOOK.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TBook.T_BOOK.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return TBook.T_BOOK.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TBook.T_BOOK.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return TBook.T_BOOK.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return TBook.T_BOOK.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return TBook.T_BOOK.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field9() {
		return TBook.T_BOOK.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field10() {
		return TBook.T_BOOK.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field11() {
		return TBook.T_BOOK.REC_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCoAuthorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getDetailsId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getPublishedIn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getLanguageId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getContentText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value9() {
		return getContentPdf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value10() {
		return getRecVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value11() {
		return getRecTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value2(Integer value) {
		setAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value3(Integer value) {
		setCoAuthorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value4(Integer value) {
		setDetailsId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value5(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value6(Integer value) {
		setPublishedIn(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value7(Integer value) {
		setLanguageId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value8(String value) {
		setContentText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value9(byte[] value) {
		setContentPdf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value10(Integer value) {
		setRecVersion(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord value11(Timestamp value) {
		setRecTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookRecord values(Integer value1, Integer value2, Integer value3, Integer value4, String value5, Integer value6, Integer value7, String value8, byte[] value9, Integer value10, Timestamp value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITBook from) {
		setId(from.getId());
		setAuthorId(from.getAuthorId());
		setCoAuthorId(from.getCoAuthorId());
		setDetailsId(from.getDetailsId());
		setTitle(from.getTitle());
		setPublishedIn(from.getPublishedIn());
		setLanguageId(from.getLanguageId());
		setContentText(from.getContentText());
		setContentPdf(from.getContentPdf());
		setRecVersion(from.getRecVersion());
		setRecTimestamp(from.getRecTimestamp());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITBook> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(TBook.T_BOOK);
	}

	/**
	 * Create a detached, initialised TBookRecord
	 */
	public TBookRecord(Integer id, Integer authorId, Integer coAuthorId, Integer detailsId, String title, Integer publishedIn, Integer languageId, String contentText, byte[] contentPdf, Integer recVersion, Timestamp recTimestamp) {
		super(TBook.T_BOOK);

		setValue(0, id);
		setValue(1, authorId);
		setValue(2, coAuthorId);
		setValue(3, detailsId);
		setValue(4, title);
		setValue(5, publishedIn);
		setValue(6, languageId);
		setValue(7, contentText);
		setValue(8, contentPdf);
		setValue(9, recVersion);
		setValue(10, recTimestamp);
	}
}
