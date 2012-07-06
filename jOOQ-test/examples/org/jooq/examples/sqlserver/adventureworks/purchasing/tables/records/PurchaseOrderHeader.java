/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PurchaseOrderHeader", schema = "Purchasing")
public class PurchaseOrderHeader extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderHeader> {

	private static final long serialVersionUID = -1256515507;

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.PurchaseOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setPurchaseOrderID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.PurchaseOrderID, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.PurchaseOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "PurchaseOrderID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getPurchaseOrderID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.PurchaseOrderID);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.RevisionNumber</code>
	 */
	public void setRevisionNumber(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.RevisionNumber, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.RevisionNumber</code>
	 */
	@javax.persistence.Column(name = "RevisionNumber", nullable = false, precision = 3)
	public java.lang.Byte getRevisionNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.RevisionNumber);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.Status</code>
	 */
	public void setStatus(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.Status, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.Status</code>
	 */
	@javax.persistence.Column(name = "Status", nullable = false, precision = 3)
	public java.lang.Byte getStatus() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.Status);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.EmployeeID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public void setEmployeeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.EmployeeID, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.EmployeeID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.EmployeeID);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.VendorID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_Vendor_VendorID
	 * FOREIGN KEY (VendorID)
	 * REFERENCES Purchasing.Vendor (VendorID)
	 * </pre></code>
	 */
	public void setVendorID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.VendorID, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.VendorID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_Vendor_VendorID
	 * FOREIGN KEY (VendorID)
	 * REFERENCES Purchasing.Vendor (VendorID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "VendorID", nullable = false, precision = 10)
	public java.lang.Integer getVendorID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.VendorID);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.ShipMethodID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_ShipMethod_ShipMethodID
	 * FOREIGN KEY (ShipMethodID)
	 * REFERENCES Purchasing.ShipMethod (ShipMethodID)
	 * </pre></code>
	 */
	public void setShipMethodID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.ShipMethodID, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.ShipMethodID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_PurchaseOrderHeader_ShipMethod_ShipMethodID
	 * FOREIGN KEY (ShipMethodID)
	 * REFERENCES Purchasing.ShipMethod (ShipMethodID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ShipMethodID", nullable = false, precision = 10)
	public java.lang.Integer getShipMethodID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.ShipMethodID);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.OrderDate</code>
	 */
	public void setOrderDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.OrderDate, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.OrderDate</code>
	 */
	@javax.persistence.Column(name = "OrderDate", nullable = false)
	public java.sql.Timestamp getOrderDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.OrderDate);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.ShipDate</code>
	 */
	public void setShipDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.ShipDate, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.ShipDate</code>
	 */
	@javax.persistence.Column(name = "ShipDate")
	public java.sql.Timestamp getShipDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.ShipDate);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.SubTotal</code>
	 */
	public void setSubTotal(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.SubTotal, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.SubTotal</code>
	 */
	@javax.persistence.Column(name = "SubTotal", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSubTotal() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.SubTotal);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.TaxAmt</code>
	 */
	public void setTaxAmt(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.TaxAmt, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.TaxAmt</code>
	 */
	@javax.persistence.Column(name = "TaxAmt", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getTaxAmt() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.TaxAmt);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.Freight</code>
	 */
	public void setFreight(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.Freight, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.Freight</code>
	 */
	@javax.persistence.Column(name = "Freight", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getFreight() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.Freight);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.TotalDue</code>
	 */
	public void setTotalDue(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.TotalDue, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.TotalDue</code>
	 */
	@javax.persistence.Column(name = "TotalDue", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getTotalDue() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.TotalDue);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.ModifiedDate, value);
	}

	/**
	 * The table column <code>Purchasing.PurchaseOrderHeader.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader.ModifiedDate);
	}

	/**
	 * Create a detached PurchaseOrderHeader
	 */
	public PurchaseOrderHeader() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderHeader.PurchaseOrderHeader);
	}
}
