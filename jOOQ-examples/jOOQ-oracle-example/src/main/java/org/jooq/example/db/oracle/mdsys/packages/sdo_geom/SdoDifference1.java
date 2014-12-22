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
public class SdoDifference1 extends org.jooq.impl.AbstractRoutine<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> {

	private static final long serialVersionUID = 1906620216;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_DIFFERENCE.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_DIFFERENCE.GEOM1</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> GEOM1 = createParameter("GEOM1", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_DIFFERENCE.DIM1</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> DIM1 = createParameter("DIM1", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_DIFFERENCE.GEOM2</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> GEOM2 = createParameter("GEOM2", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_DIFFERENCE.DIM2</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> DIM2 = createParameter("DIM2", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * Create a new routine call instance
	 */
	public SdoDifference1() {
		super("SDO_DIFFERENCE", org.jooq.example.db.oracle.mdsys.Mdsys.MDSYS, org.jooq.example.db.oracle.mdsys.packages.SdoGeom.SDO_GEOM, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM1);
		addInParameter(DIM1);
		addInParameter(GEOM2);
		addInParameter(DIM2);
		setOverloaded(true);
	}

	/**
	 * Set the <code>GEOM1</code> parameter IN value to the routine
	 */
	public void setGeom1(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoDifference1.GEOM1, value);
	}

	/**
	 * Set the <code>GEOM1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom1(org.jooq.Field<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> field) {
		setField(GEOM1, field);
	}

	/**
	 * Set the <code>DIM1</code> parameter IN value to the routine
	 */
	public void setDim1(java.lang.Object value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoDifference1.DIM1, value);
	}

	/**
	 * Set the <code>DIM1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDim1(org.jooq.Field<java.lang.Object> field) {
		setField(DIM1, field);
	}

	/**
	 * Set the <code>GEOM2</code> parameter IN value to the routine
	 */
	public void setGeom2(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoDifference1.GEOM2, value);
	}

	/**
	 * Set the <code>GEOM2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom2(org.jooq.Field<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> field) {
		setField(GEOM2, field);
	}

	/**
	 * Set the <code>DIM2</code> parameter IN value to the routine
	 */
	public void setDim2(java.lang.Object value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoDifference1.DIM2, value);
	}

	/**
	 * Set the <code>DIM2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDim2(org.jooq.Field<java.lang.Object> field) {
		setField(DIM2, field);
	}
}
