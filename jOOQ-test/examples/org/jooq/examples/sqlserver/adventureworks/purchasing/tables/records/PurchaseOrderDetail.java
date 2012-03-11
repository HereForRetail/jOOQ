/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PurchaseOrderDetail", schema = "Purchasing", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"PurchaseOrderID", "PurchaseOrderDetailID"})
})
public class PurchaseOrderDetail extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.PurchaseOrderDetail> {

	private static final long serialVersionUID = 1939784655;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_PurchaseOrderHeader_PurchaseOrderID
	 * FOREIGN KEY (PurchaseOrderID)
	 * REFERENCES Purchasing.PurchaseOrderHeader (PurchaseOrderID)
	 * </pre></code>
	 */
	public void setPurchaseOrderID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.PurchaseOrderID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_PurchaseOrderHeader_PurchaseOrderID
	 * FOREIGN KEY (PurchaseOrderID)
	 * REFERENCES Purchasing.PurchaseOrderHeader (PurchaseOrderID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "PurchaseOrderID", nullable = false, precision = 10)
	public java.lang.Integer getPurchaseOrderID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.PurchaseOrderID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setPurchaseOrderDetailID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.PurchaseOrderDetailID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "PurchaseOrderDetailID", nullable = false, precision = 10)
	public java.lang.Integer getPurchaseOrderDetailID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.PurchaseOrderDetailID);
	}

	/**
	 * An uncommented item
	 */
	public void setDueDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.DueDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "DueDate", nullable = false)
	public java.sql.Timestamp getDueDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.DueDate);
	}

	/**
	 * An uncommented item
	 */
	public void setOrderQty(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.OrderQty, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "OrderQty", nullable = false, precision = 5)
	public java.lang.Short getOrderQty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.OrderQty);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.ProductID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_PurchaseOrderDetail_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.ProductID);
	}

	/**
	 * An uncommented item
	 */
	public void setUnitPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.UnitPrice, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "UnitPrice", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getUnitPrice() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.UnitPrice);
	}

	/**
	 * An uncommented item
	 */
	public void setLineTotal(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.LineTotal, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "LineTotal", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getLineTotal() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.LineTotal);
	}

	/**
	 * An uncommented item
	 */
	public void setReceivedQty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.ReceivedQty, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ReceivedQty", nullable = false, precision = 8, scale = 2)
	public java.math.BigDecimal getReceivedQty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.ReceivedQty);
	}

	/**
	 * An uncommented item
	 */
	public void setRejectedQty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.RejectedQty, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "RejectedQty", nullable = false, precision = 8, scale = 2)
	public java.math.BigDecimal getRejectedQty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.RejectedQty);
	}

	/**
	 * An uncommented item
	 */
	public void setStockedQty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.StockedQty, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StockedQty", nullable = false, precision = 9, scale = 2)
	public java.math.BigDecimal getStockedQty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.StockedQty);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail.ModifiedDate);
	}

	/**
	 * Create a detached PurchaseOrderDetail
	 */
	public PurchaseOrderDetail() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.PurchaseOrderDetail.PurchaseOrderDetail);
	}
}
