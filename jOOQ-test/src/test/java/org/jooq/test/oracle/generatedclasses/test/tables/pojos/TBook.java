/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK", schema = "TEST")
public class TBook implements java.io.Serializable {

	private static final long serialVersionUID = -234932650;

	private java.lang.Integer    id;
	private java.lang.Integer    authorId;
	private java.lang.Integer    coAuthorId;
	private java.lang.Integer    detailsId;
	private java.lang.String     title;
	private java.lang.Integer    publishedIn;
	private java.lang.Integer    languageId;
	private java.lang.String     contentText;
	private byte[]               contentPdf;
	private java.math.BigDecimal recVersion;
	private java.sql.Timestamp   recTimestamp;

	public TBook() {}

	public TBook(
		java.lang.Integer    id,
		java.lang.Integer    authorId,
		java.lang.Integer    coAuthorId,
		java.lang.Integer    detailsId,
		java.lang.String     title,
		java.lang.Integer    publishedIn,
		java.lang.Integer    languageId,
		java.lang.String     contentText,
		byte[]               contentPdf,
		java.math.BigDecimal recVersion,
		java.sql.Timestamp   recTimestamp
	) {
		this.id = id;
		this.authorId = authorId;
		this.coAuthorId = coAuthorId;
		this.detailsId = detailsId;
		this.title = title;
		this.publishedIn = publishedIn;
		this.languageId = languageId;
		this.contentText = contentText;
		this.contentPdf = contentPdf;
		this.recVersion = recVersion;
		this.recTimestamp = recTimestamp;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
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
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}

	@javax.persistence.Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(java.lang.Integer publishedIn) {
		this.publishedIn = publishedIn;
	}

	@javax.persistence.Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(java.lang.Integer languageId) {
		this.languageId = languageId;
	}

	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.String getContentText() {
		return this.contentText;
	}

	public void setContentText(java.lang.String contentText) {
		this.contentText = contentText;
	}

	@javax.persistence.Column(name = "CONTENT_PDF")
	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
	}

	@javax.persistence.Column(name = "REC_VERSION")
	public java.math.BigDecimal getRecVersion() {
		return this.recVersion;
	}

	public void setRecVersion(java.math.BigDecimal recVersion) {
		this.recVersion = recVersion;
	}

	@javax.persistence.Column(name = "REC_TIMESTAMP")
	public java.sql.Timestamp getRecTimestamp() {
		return this.recTimestamp;
	}

	public void setRecTimestamp(java.sql.Timestamp recTimestamp) {
		this.recTimestamp = recTimestamp;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TBook other = (TBook) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		if (authorId == null) {
			if (other.authorId != null)
				return false;
		}
		else if (!authorId.equals(other.authorId))
			return false;
		if (coAuthorId == null) {
			if (other.coAuthorId != null)
				return false;
		}
		else if (!coAuthorId.equals(other.coAuthorId))
			return false;
		if (detailsId == null) {
			if (other.detailsId != null)
				return false;
		}
		else if (!detailsId.equals(other.detailsId))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		}
		else if (!title.equals(other.title))
			return false;
		if (publishedIn == null) {
			if (other.publishedIn != null)
				return false;
		}
		else if (!publishedIn.equals(other.publishedIn))
			return false;
		if (languageId == null) {
			if (other.languageId != null)
				return false;
		}
		else if (!languageId.equals(other.languageId))
			return false;
		if (contentText == null) {
			if (other.contentText != null)
				return false;
		}
		else if (!contentText.equals(other.contentText))
			return false;
		if (contentPdf == null) {
			if (other.contentPdf != null)
				return false;
		}
		else if (!java.util.Arrays.equals(contentPdf, other.contentPdf))
			return false;
		if (recVersion == null) {
			if (other.recVersion != null)
				return false;
		}
		else if (!recVersion.equals(other.recVersion))
			return false;
		if (recTimestamp == null) {
			if (other.recTimestamp != null)
				return false;
		}
		else if (!recTimestamp.equals(other.recTimestamp))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((authorId == null) ? 0 : authorId.hashCode());
		result = prime * result + ((coAuthorId == null) ? 0 : coAuthorId.hashCode());
		result = prime * result + ((detailsId == null) ? 0 : detailsId.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((publishedIn == null) ? 0 : publishedIn.hashCode());
		result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());
		result = prime * result + ((contentText == null) ? 0 : contentText.hashCode());
		result = prime * result + ((contentPdf == null) ? 0 : java.util.Arrays.hashCode(contentPdf));
		result = prime * result + ((recVersion == null) ? 0 : recVersion.hashCode());
		result = prime * result + ((recTimestamp == null) ? 0 : recTimestamp.hashCode());
		return result;
	}
}
