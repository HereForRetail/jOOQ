/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "MULTI_SCHEMA")
public class TBook implements java.io.Serializable {

	private static final long serialVersionUID = -564243036;

	private java.lang.Integer                                          id;
	private java.lang.Integer                                          authorId;
	private java.lang.Integer                                          coAuthorId;
	private java.lang.Integer                                          detailsId;
	private java.lang.String                                           title;
	private java.lang.Integer                                          publishedIn;
	private org.jooq.test.oracle.generatedclasses.test.enums.TLanguage languageId;
	private java.lang.String                                           contentText;
	private byte[]                                                     contentPdf;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(java.lang.Integer authorId) {
		this.authorId = authorId;
	}

	@javax.persistence.Column(name = "CO_AUTHOR_ID", precision = 7)
	public java.lang.Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	public void setCoAuthorId(java.lang.Integer coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@javax.persistence.Column(name = "DETAILS_ID", precision = 7)
	public java.lang.Integer getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(java.lang.Integer detailsId) {
		this.detailsId = detailsId;
	}

	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(java.lang.Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	public org.jooq.test.oracle.generatedclasses.test.enums.TLanguage getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(org.jooq.test.oracle.generatedclasses.test.enums.TLanguage languageId) {
		this.languageId = languageId;
	}

	@javax.persistence.Column(name = "CONTENT_TEXT", length = 4000)
	public java.lang.String getContentText() {
		return this.contentText;
	}

	public void setContentText(java.lang.String contentText) {
		this.contentText = contentText;
	}

	@javax.persistence.Column(name = "CONTENT_PDF", length = 4000)
	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}
}
