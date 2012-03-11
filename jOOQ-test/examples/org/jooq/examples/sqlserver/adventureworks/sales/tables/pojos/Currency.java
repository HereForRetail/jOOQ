/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Currency", schema = "Sales")
public class Currency implements java.io.Serializable {

	private static final long serialVersionUID = -1428602621;

	private java.lang.String   CurrencyCode;
	private java.lang.String   Name;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "CurrencyCode", unique = true, nullable = false, length = 3)
	public java.lang.String getCurrencyCode() {
		return this.CurrencyCode;
	}

	public void setCurrencyCode(java.lang.String CurrencyCode) {
		this.CurrencyCode = CurrencyCode;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
