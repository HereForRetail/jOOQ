/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesOrderDetail", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesOrderID", "SalesOrderDetailID"})
})
public class SalesOrderDetail extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderDetail> {

	private static final long serialVersionUID = -1195424006;

	/**
	 * The table column <code>Sales.SalesOrderDetail.SalesOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderDetail_SalesOrderHeader_SalesOrderID
	 * FOREIGN KEY (SalesOrderID)
	 * REFERENCES Sales.SalesOrderHeader (SalesOrderID)
	 * </pre></code>
	 */
	public void setSalesOrderID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderID, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.SalesOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderDetail_SalesOrderHeader_SalesOrderID
	 * FOREIGN KEY (SalesOrderID)
	 * REFERENCES Sales.SalesOrderHeader (SalesOrderID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SalesOrderID", nullable = false, precision = 10)
	public java.lang.Integer getSalesOrderID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderID);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.SalesOrderDetailID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setSalesOrderDetailID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderDetailID, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.SalesOrderDetailID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Column(name = "SalesOrderDetailID", nullable = false, precision = 10)
	public java.lang.Integer getSalesOrderDetailID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SalesOrderDetailID);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.CarrierTrackingNumber</code>
	 */
	public void setCarrierTrackingNumber(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.CarrierTrackingNumber, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.CarrierTrackingNumber</code>
	 */
	@javax.persistence.Column(name = "CarrierTrackingNumber", length = 25)
	public java.lang.String getCarrierTrackingNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.CarrierTrackingNumber);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.OrderQty</code>
	 */
	public void setOrderQty(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.OrderQty, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.OrderQty</code>
	 */
	@javax.persistence.Column(name = "OrderQty", nullable = false, precision = 5)
	public java.lang.Short getOrderQty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.OrderQty);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.ProductID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderDetail_SpecialOfferProduct_SpecialOfferIDProductID
	 * FOREIGN KEY (SpecialOfferID, ProductID)
	 * REFERENCES Sales.SpecialOfferProduct (SpecialOfferID, ProductID)
	 * </pre></code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.ProductID, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.ProductID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderDetail_SpecialOfferProduct_SpecialOfferIDProductID
	 * FOREIGN KEY (SpecialOfferID, ProductID)
	 * REFERENCES Sales.SpecialOfferProduct (SpecialOfferID, ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.ProductID);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.SpecialOfferID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderDetail_SpecialOfferProduct_SpecialOfferIDProductID
	 * FOREIGN KEY (SpecialOfferID, ProductID)
	 * REFERENCES Sales.SpecialOfferProduct (SpecialOfferID, ProductID)
	 * </pre></code>
	 */
	public void setSpecialOfferID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SpecialOfferID, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.SpecialOfferID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesOrderDetail_SpecialOfferProduct_SpecialOfferIDProductID
	 * FOREIGN KEY (SpecialOfferID, ProductID)
	 * REFERENCES Sales.SpecialOfferProduct (SpecialOfferID, ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SpecialOfferID", nullable = false, precision = 10)
	public java.lang.Integer getSpecialOfferID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.SpecialOfferID);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.UnitPrice</code>
	 */
	public void setUnitPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.UnitPrice, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.UnitPrice</code>
	 */
	@javax.persistence.Column(name = "UnitPrice", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getUnitPrice() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.UnitPrice);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.UnitPriceDiscount</code>
	 */
	public void setUnitPriceDiscount(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.UnitPriceDiscount, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.UnitPriceDiscount</code>
	 */
	@javax.persistence.Column(name = "UnitPriceDiscount", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getUnitPriceDiscount() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.UnitPriceDiscount);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.LineTotal</code>
	 */
	public void setLineTotal(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.LineTotal, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.LineTotal</code>
	 */
	@javax.persistence.Column(name = "LineTotal", nullable = false, precision = 38, scale = 6)
	public java.math.BigDecimal getLineTotal() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.LineTotal);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.rowguid</code>
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.rowguid, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.rowguid</code>
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.rowguid);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.SalesOrderDetail.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail.ModifiedDate);
	}

	/**
	 * Create a detached SalesOrderDetail
	 */
	public SalesOrderDetail() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderDetail.SalesOrderDetail);
	}
}
