/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductListPriceHistory", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "StartDate"})
})
public class ProductListPriceHistory implements java.io.Serializable {

	private static final long serialVersionUID = -1785389324;

	private java.lang.Integer    ProductID;
	private java.sql.Timestamp   StartDate;
	private java.sql.Timestamp   EndDate;
	private java.math.BigDecimal ListPrice;
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return this.StartDate;
	}

	public void setStartDate(java.sql.Timestamp StartDate) {
		this.StartDate = StartDate;
	}

	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return this.EndDate;
	}

	public void setEndDate(java.sql.Timestamp EndDate) {
		this.EndDate = EndDate;
	}

	@javax.persistence.Column(name = "ListPrice", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getListPrice() {
		return this.ListPrice;
	}

	public void setListPrice(java.math.BigDecimal ListPrice) {
		this.ListPrice = ListPrice;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
