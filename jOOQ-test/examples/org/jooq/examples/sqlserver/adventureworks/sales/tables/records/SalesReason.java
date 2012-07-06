/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesReason", schema = "Sales")
public class SalesReason extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason> {

	private static final long serialVersionUID = 1567955828;

	/**
	 * The table column <code>Sales.SalesReason.SalesReasonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setSalesReasonID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.SalesReasonID, value);
	}

	/**
	 * The table column <code>Sales.SalesReason.SalesReasonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "SalesReasonID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getSalesReasonID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.SalesReasonID);
	}

	/**
	 * The table column <code>Sales.SalesReason.Name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.Name, value);
	}

	/**
	 * The table column <code>Sales.SalesReason.Name</code>
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.Name);
	}

	/**
	 * The table column <code>Sales.SalesReason.ReasonType</code>
	 */
	public void setReasonType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.ReasonType, value);
	}

	/**
	 * The table column <code>Sales.SalesReason.ReasonType</code>
	 */
	@javax.persistence.Column(name = "ReasonType", nullable = false, length = 50)
	public java.lang.String getReasonType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.ReasonType);
	}

	/**
	 * The table column <code>Sales.SalesReason.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.SalesReason.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.ModifiedDate);
	}

	/**
	 * Create a detached SalesReason
	 */
	public SalesReason() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason);
	}
}
