/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductModelIllustration", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductModelID", "IllustrationID"})
})
public class ProductModelIllustration extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductModelIllustration> {

	private static final long serialVersionUID = 1222808413;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelIllustration_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	public void setProductModelID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration.ProductModelID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelIllustration_ProductModel_ProductModelID
	 * FOREIGN KEY (ProductModelID)
	 * REFERENCES Production.ProductModel (ProductModelID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductModelID", nullable = false, precision = 10)
	public java.lang.Integer getProductModelID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration.ProductModelID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelIllustration_Illustration_IllustrationID
	 * FOREIGN KEY (IllustrationID)
	 * REFERENCES Production.Illustration (IllustrationID)
	 * </pre></code>
	 */
	public void setIllustrationID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration.IllustrationID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductModelIllustration_Illustration_IllustrationID
	 * FOREIGN KEY (IllustrationID)
	 * REFERENCES Production.Illustration (IllustrationID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "IllustrationID", nullable = false, precision = 10)
	public java.lang.Integer getIllustrationID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration.IllustrationID);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration.ModifiedDate);
	}

	/**
	 * Create a detached ProductModelIllustration
	 */
	public ProductModelIllustration() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductModelIllustration.ProductModelIllustration);
	}
}
