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
public class GetWkb extends org.jooq.impl.AbstractRoutine<byte[]> {

	private static final long serialVersionUID = 994679805;

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.GET_WKB.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<byte[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BLOB, false);

	/**
	 * The parameter <code>MDSYS.SDO_GEOMETRY.GET_WKB.SELF</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> SELF = createParameter("SELF", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType(), false);

	/**
	 * Create a new routine call instance
	 */
	public GetWkb() {
		super("GET_WKB", org.jooq.example.db.oracle.mdsys.Mdsys.MDSYS, org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY, org.jooq.impl.SQLDataType.BLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(SELF);
	}

	/**
	 * Set the <code>SELF</code> parameter IN value to the routine
	 */
	public void setSelf(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord value) {
		setValue(org.jooq.example.db.oracle.mdsys.udt.sdo_geometry.GetWkb.SELF, value);
	}

	/**
	 * Set the <code>SELF</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSelf(org.jooq.Field<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> field) {
		setField(SELF, field);
	}
}
