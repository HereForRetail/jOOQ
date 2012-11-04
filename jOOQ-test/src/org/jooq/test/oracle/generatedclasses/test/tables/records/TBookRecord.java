/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "TEST")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> {

	private static final long serialVersionUID = -810340627;

	/**
	 * Setter for <code>TEST.T_BOOK.ID</code>. The book ID
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.ID</code>. The book ID
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord}
	 */
	public void setAuthorId(org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID, value.getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * Getter for <code>TEST.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord}
	 */
	public void setCoAuthorId(org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID, value.getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * Getter for <code>TEST.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.DETAILS_ID</code>. 
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.DETAILS_ID</code>. 
	 */
	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.TITLE</code>. The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.TITLE</code>. The book's title
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord}
	 */
	public void setLanguageId(org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord value) {
		if (value == null) {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID, value.getValue(org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE.ID));
		}
	}

	/**
	 * Getter for <code>TEST.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * Setter for <code>TEST.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>TEST.T_BOOK_TO_BOOK_STORE</code> referencing this <code>TEST.T_BOOK</code>
	 */
	public org.jooq.Result<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>TEST.T_AUTHOR</code> referenced by this <code>TEST.T_BOOK</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>TEST.T_AUTHOR</code> referenced by this <code>TEST.T_BOOK</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>TEST.T_LANGUAGE</code> referenced by this <code>TEST.T_BOOK</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord fetchTLanguage() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK);
	}
}
