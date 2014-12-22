/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.mdsys.udt.sdo_geometry;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SdoGeometry1 extends org.jooq.impl.AbstractRoutine<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> {

	private static final long serialVersionUID = -69859837;

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.SDO_GEOMETRY.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.SDO_GEOMETRY.SELF</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> SELF = createParameter("SELF", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.SDO_GEOMETRY.WKT</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> WKT = createParameter("WKT", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.SDO_GEOMETRY.SRID</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigInteger> SRID = createParameter("SRID", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).defaulted(true), true);

	/**
	 * Create a new routine call instance
	 */
	public SdoGeometry1() {
		super("SDO_GEOMETRY", org.jooq.example.db.oracle.mdsys.Mdsys.MDSYS, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInOutParameter(SELF);
		addInParameter(WKT);
		addInParameter(SRID);
		setOverloaded(true);
	}

	/**
	 * Set the <code>SELF</code> parameter IN value to the routine
	 */
	public void setSelf(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord value) {
		setValue(org.jooq.example.db.oracle.mdsys.udt.sdo_geometry.SdoGeometry1.SELF, value);
	}

	/**
	 * Set the <code>WKT</code> parameter IN value to the routine
	 */
	public void setWkt(java.lang.String value) {
		setValue(org.jooq.example.db.oracle.mdsys.udt.sdo_geometry.SdoGeometry1.WKT, value);
	}

	/**
	 * Set the <code>SRID</code> parameter IN value to the routine
	 */
	public void setSrid(java.math.BigInteger value) {
		setValue(org.jooq.example.db.oracle.mdsys.udt.sdo_geometry.SdoGeometry1.SRID, value);
	}

	/**
	 * Get the <code>SELF</code> parameter OUT value from the routine
	 */
	public org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord getSelf() {
		return getValue(SELF);
	}
}
