/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_SALE", schema = "MULTI_SCHEMA")
public class TBookSale implements java.io.Serializable {

	private static final long serialVersionUID = -2054668554;

	private java.lang.Integer    id;
	private java.lang.Integer    bookId;
	private java.lang.String     bookStoreName;
	private java.sql.Date        soldAt;
	private java.math.BigDecimal soldFor;

	public TBookSale() {}

	public TBookSale(
		java.lang.Integer    id,
		java.lang.Integer    bookId,
		java.lang.String     bookStoreName,
		java.sql.Date        soldAt,
		java.math.BigDecimal soldFor
	) {
		this.id = id;
		this.bookId = bookId;
		this.bookStoreName = bookStoreName;
		this.soldAt = soldAt;
		this.soldFor = soldFor;
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

	@javax.persistence.Column(name = "BOOK_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(java.lang.Integer bookId) {
		this.bookId = bookId;
	}

	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getBookStoreName() {
		return this.bookStoreName;
	}

	public void setBookStoreName(java.lang.String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	@javax.persistence.Column(name = "SOLD_AT", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Date getSoldAt() {
		return this.soldAt;
	}

	public void setSoldAt(java.sql.Date soldAt) {
		this.soldAt = soldAt;
	}

	@javax.persistence.Column(name = "SOLD_FOR", nullable = false, precision = 10, scale = 2)
	@javax.validation.constraints.NotNull
	public java.math.BigDecimal getSoldFor() {
		return this.soldFor;
	}

	public void setSoldFor(java.math.BigDecimal soldFor) {
		this.soldFor = soldFor;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final TBookSale other = (TBookSale) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		if (bookId == null) {
			if (other.bookId != null)
				return false;
		}
		else if (!bookId.equals(other.bookId))
			return false;
		if (bookStoreName == null) {
			if (other.bookStoreName != null)
				return false;
		}
		else if (!bookStoreName.equals(other.bookStoreName))
			return false;
		if (soldAt == null) {
			if (other.soldAt != null)
				return false;
		}
		else if (!soldAt.equals(other.soldAt))
			return false;
		if (soldFor == null) {
			if (other.soldFor != null)
				return false;
		}
		else if (!soldFor.equals(other.soldFor))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
		result = prime * result + ((bookStoreName == null) ? 0 : bookStoreName.hashCode());
		result = prime * result + ((soldAt == null) ? 0 : soldAt.hashCode());
		result = prime * result + ((soldFor == null) ? 0 : soldFor.hashCode());
		return result;
	}
}
