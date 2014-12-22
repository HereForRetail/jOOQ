/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.mdsys.udt.records;

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
public class SdoGeometryArrayRecord extends org.jooq.impl.ArrayRecordImpl<org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> {

	private static final long serialVersionUID = -1790643948;

	/**
	 * Create a new <code>MDSYS.SDO_GEOMETRY_ARRAY</code> record
	 */
	public SdoGeometryArrayRecord() {
		super(org.jooq.example.db.oracle.mdsys.Mdsys.MDSYS, "SDO_GEOMETRY_ARRAY", org.jooq.example.db.oracle.mdsys.udt.SdoGeometry.SDO_GEOMETRY.getDataType());
	}

	/**
	 * Create a new <code>MDSYS.SDO_GEOMETRY_ARRAY</code> record
	 */
	public SdoGeometryArrayRecord(org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>MDSYS.SDO_GEOMETRY_ARRAY</code> record
	 */
	public SdoGeometryArrayRecord(java.util.Collection<? extends org.jooq.example.db.oracle.mdsys.udt.records.SdoGeometryRecord> collection) {
		this();
		set(collection);
	}
}
