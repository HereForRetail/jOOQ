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
public class SdoBuffer1 extends org.jooq.impl.AbstractRoutine<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> {

	private static final long serialVersionUID = -425539439;

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.GEOM</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> GEOM = createParameter("GEOM", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.DIM</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> DIM = createParameter("DIM", org.jooq.impl.DefaultDataType.getDefaultDataType("VARRAY"), false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOM.SDO_BUFFER.DIST</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> DIST = createParameter("DIST", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public SdoBuffer1() {
		super("SDO_BUFFER", org.jooq.example.db.oracle.mdsys.Mdsys.MDSYS, org.jooq.example.db.oracle.mdsys.packages.SdoGeom.SDO_GEOM, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(GEOM);
		addInParameter(DIM);
		addInParameter(DIST);
		setOverloaded(true);
	}

	/**
	 * Set the <code>GEOM</code> parameter IN value to the routine
	 */
	public void setGeom(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoBuffer1.GEOM, value);
	}

	/**
	 * Set the <code>GEOM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setGeom(org.jooq.Field<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> field) {
		setField(GEOM, field);
	}

	/**
	 * Set the <code>DIM</code> parameter IN value to the routine
	 */
	public void setDim(java.lang.Object value) {
		setValue(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoBuffer1.DIM, value);
	}

	/**
	 * Set the <code>DIM</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDim(org.jooq.Field<java.lang.Object> field) {
		setField(DIM, field);
	}

	/**
	 * Set the <code>DIST</code> parameter IN value to the routine
	 */
	public void setDist(java.lang.Number value) {
		setNumber(org.jooq.example.db.oracle.mdsys.packages.sdo_geom.SdoBuffer1.DIST, value);
	}

	/**
	 * Set the <code>DIST</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDist(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(DIST, field);
	}
}
