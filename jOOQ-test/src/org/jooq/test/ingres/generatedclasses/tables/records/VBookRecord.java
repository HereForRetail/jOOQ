/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = 924270670;

	/**
	 * The table column <code>test.v_book.id</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.ID, value);
	}

	/**
	 * The table column <code>test.v_book.id</code>
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.ID);
	}

	/**
	 * The table column <code>test.v_book.author_id</code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.AUTHOR_ID, value);
	}

	/**
	 * The table column <code>test.v_book.author_id</code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.AUTHOR_ID);
	}

	/**
	 * The table column <code>test.v_book.co_author_id</code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>test.v_book.co_author_id</code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.CO_AUTHOR_ID);
	}

	/**
	 * The table column <code>test.v_book.details_id</code>
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.DETAILS_ID, value);
	}

	/**
	 * The table column <code>test.v_book.details_id</code>
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.DETAILS_ID);
	}

	/**
	 * The table column <code>test.v_book.title</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.TITLE, value);
	}

	/**
	 * The table column <code>test.v_book.title</code>
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.TITLE);
	}

	/**
	 * The table column <code>test.v_book.published_in</code>
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.PUBLISHED_IN, value);
	}

	/**
	 * The table column <code>test.v_book.published_in</code>
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.PUBLISHED_IN);
	}

	/**
	 * The table column <code>test.v_book.language_id</code>
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.LANGUAGE_ID, value);
	}

	/**
	 * The table column <code>test.v_book.language_id</code>
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.LANGUAGE_ID);
	}

	/**
	 * The table column <code>test.v_book.content_text</code>
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.CONTENT_TEXT, value);
	}

	/**
	 * The table column <code>test.v_book.content_text</code>
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.CONTENT_TEXT);
	}

	/**
	 * The table column <code>test.v_book.content_pdf</code>
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.VBook.CONTENT_PDF, value);
	}

	/**
	 * The table column <code>test.v_book.content_pdf</code>
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.VBook.CONTENT_PDF);
	}

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.ingres.generatedclasses.tables.VBook.V_BOOK);
	}
}
