/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_SALE", schema = "MULTI_SCHEMA")
public class TBookSale implements java.io.Serializable {

	private static final long serialVersionUID = 1340611541;

	private java.lang.Integer    id;
	private java.lang.Integer    bookId;
	private java.lang.String     bookStoreName;
	private java.sql.Date        soldAt;
	private java.math.BigDecimal soldFor;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "BOOK_ID", nullable = false)
	public java.lang.Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(java.lang.Integer bookId) {
		this.bookId = bookId;
	}

	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false)
	public java.lang.String getBookStoreName() {
		return this.bookStoreName;
	}

	public void setBookStoreName(java.lang.String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	@javax.persistence.Column(name = "SOLD_AT", nullable = false)
	public java.sql.Date getSoldAt() {
		return this.soldAt;
	}

	public void setSoldAt(java.sql.Date soldAt) {
		this.soldAt = soldAt;
	}

	@javax.persistence.Column(name = "SOLD_FOR", nullable = false)
	public java.math.BigDecimal getSoldFor() {
		return this.soldFor;
	}

	public void setSoldFor(java.math.BigDecimal soldFor) {
		this.soldFor = soldFor;
	}
}
