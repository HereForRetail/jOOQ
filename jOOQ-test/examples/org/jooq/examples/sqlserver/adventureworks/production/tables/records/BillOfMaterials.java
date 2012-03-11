/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "BillOfMaterials", schema = "Production")
public class BillOfMaterials extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.BillOfMaterials> {

	private static final long serialVersionUID = 88704232;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setBillOfMaterialsID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BillOfMaterialsID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "BillOfMaterialsID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getBillOfMaterialsID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BillOfMaterialsID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ProductAssemblyID
	 * FOREIGN KEY (ProductAssemblyID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductAssemblyID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ProductAssemblyID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ProductAssemblyID
	 * FOREIGN KEY (ProductAssemblyID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductAssemblyID", precision = 10)
	public java.lang.Integer getProductAssemblyID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ProductAssemblyID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ComponentID
	 * FOREIGN KEY (ComponentID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setComponentID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ComponentID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_Product_ComponentID
	 * FOREIGN KEY (ComponentID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ComponentID", nullable = false, precision = 10)
	public java.lang.Integer getComponentID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ComponentID);
	}

	/**
	 * An uncommented item
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.StartDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.StartDate);
	}

	/**
	 * An uncommented item
	 */
	public void setEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.EndDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.EndDate);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_UnitMeasure_UnitMeasureCode
	 * FOREIGN KEY (UnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	public void setUnitMeasureCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.UnitMeasureCode, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_BillOfMaterials_UnitMeasure_UnitMeasureCode
	 * FOREIGN KEY (UnitMeasureCode)
	 * REFERENCES Production.UnitMeasure (UnitMeasureCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "UnitMeasureCode", nullable = false, length = 3)
	public java.lang.String getUnitMeasureCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.UnitMeasureCode);
	}

	/**
	 * An uncommented item
	 */
	public void setBOMLevel(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BOMLevel, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "BOMLevel", nullable = false, precision = 5)
	public java.lang.Short getBOMLevel() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.BOMLevel);
	}

	/**
	 * An uncommented item
	 */
	public void setPerAssemblyQty(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.PerAssemblyQty, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "PerAssemblyQty", nullable = false, precision = 8, scale = 2)
	public java.math.BigDecimal getPerAssemblyQty() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.PerAssemblyQty);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials.ModifiedDate);
	}

	/**
	 * Create a detached BillOfMaterials
	 */
	public BillOfMaterials() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.BillOfMaterials.BillOfMaterials);
	}
}
