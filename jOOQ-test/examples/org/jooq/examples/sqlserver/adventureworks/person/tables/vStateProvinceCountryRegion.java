/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
public class vStateProvinceCountryRegion extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion> {

	private static final long serialVersionUID = 59881553;

	/**
	 * The singleton instance of Person.vStateProvinceCountryRegion
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion vStateProvinceCountryRegion = new org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion.class;
	}

	/**
	 * The table column <code>Person.vStateProvinceCountryRegion.StateProvinceID</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.Integer> StateProvinceID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Person.vStateProvinceCountryRegion.StateProvinceCode</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> StateProvinceCode = createField("StateProvinceCode", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The table column <code>Person.vStateProvinceCountryRegion.IsOnlyStateProvinceFlag</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.Boolean> IsOnlyStateProvinceFlag = createField("IsOnlyStateProvinceFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The table column <code>Person.vStateProvinceCountryRegion.StateProvinceName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> StateProvinceName = createField("StateProvinceName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Person.vStateProvinceCountryRegion.TerritoryID</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.Integer> TerritoryID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Person.vStateProvinceCountryRegion.CountryRegionCode</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Person.vStateProvinceCountryRegion.CountryRegionName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> CountryRegionName = createField("CountryRegionName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	public vStateProvinceCountryRegion() {
		super("vStateProvinceCountryRegion", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	public vStateProvinceCountryRegion(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion.vStateProvinceCountryRegion);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion(alias);
	}
}
