/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
public class ShipMethod extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod> {

	private static final long serialVersionUID = -1371364039;

	/**
	 * The singleton instance of Purchasing.ShipMethod
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod ShipMethod = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod.class;
	}

	/**
	 * The table column <code>Purchasing.ShipMethod.ShipMethodID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod, java.lang.Integer> ShipMethodID = createField("ShipMethodID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Purchasing.ShipMethod.Name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Purchasing.ShipMethod.ShipBase</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod, java.math.BigDecimal> ShipBase = createField("ShipBase", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>Purchasing.ShipMethod.ShipRate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod, java.math.BigDecimal> ShipRate = createField("ShipRate", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The table column <code>Purchasing.ShipMethod.rowguid</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>Purchasing.ShipMethod.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public ShipMethod() {
		super("ShipMethod", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing);
	}

	public ShipMethod(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.IDENTITY_ShipMethod;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_ShipMethod_ShipMethodID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_ShipMethod_ShipMethodID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod(alias);
	}
}
