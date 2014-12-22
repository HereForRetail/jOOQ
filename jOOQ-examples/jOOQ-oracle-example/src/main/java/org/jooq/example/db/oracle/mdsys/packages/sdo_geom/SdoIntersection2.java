/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.mdsys.packages.sdo_geom;

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
public class SdoIntersection2 extends org.jooq.impl.AbstractRoutine<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> {

	private static final long serialVersionUID = -2097144521;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_INTERSECTION.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_INTERSECTION.GEOM1</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> GEOM1 = createParameter("GEOM1", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_INTERSECTION.GEOM2</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> GEOM2 = createParameter("GEOM2", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_INTERSECTION.TOL</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> TOL = createParameter("TOL", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SdoIntersection2() {
		super("SDO_INTERSECTION", org.jooq.example.db.oracle.mdsys.Mdsys.MDSYS, org.jooq.example.db.oracle.mdsys.packages.SdoGeom.SDO_GEOM, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM1);
		addInParameter(GEOM2);
		addInParameter(TOL);
		setOverloaded(true);
	}

	/**
	 * Set the <code>GEOM1</code> parameter IN value to the routine
	 */
	public void setGeom1(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoIntersection2.GEOM1, value);
	}

	/**
	 * Set the <code>GEOM1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom1(org.jooq.Field<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> field) {
		setField(GEOM1, field);
	}

	/**
	 * Set the <code>GEOM2</code> parameter IN value to the routine
	 */
	public void setGeom2(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoIntersection2.GEOM2, value);
	}

	/**
	 * Set the <code>GEOM2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom2(org.jooq.Field<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> field) {
		setField(GEOM2, field);
	}

	/**
	 * Set the <code>TOL</code> parameter IN value to the routine
	 */
	public void setTol(java.lang.Number value) {
		setNumber(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoIntersection2.TOL, value);
	}

	/**
	 * Set the <code>TOL</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setTol(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(TOL, field);
	}
}
