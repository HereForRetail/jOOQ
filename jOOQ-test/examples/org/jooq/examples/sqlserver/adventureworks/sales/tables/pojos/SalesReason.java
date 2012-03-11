/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesReason", schema = "Sales")
public class SalesReason implements java.io.Serializable {

	private static final long serialVersionUID = -378272363;

	private java.lang.Integer  SalesReasonID;
	private java.lang.String   Name;
	private java.lang.String   ReasonType;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "SalesReasonID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getSalesReasonID() {
		return this.SalesReasonID;
	}

	public void setSalesReasonID(java.lang.Integer SalesReasonID) {
		this.SalesReasonID = SalesReasonID;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "ReasonType", nullable = false, length = 50)
	public java.lang.String getReasonType() {
		return this.ReasonType;
	}

	public void setReasonType(java.lang.String ReasonType) {
		this.ReasonType = ReasonType;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
