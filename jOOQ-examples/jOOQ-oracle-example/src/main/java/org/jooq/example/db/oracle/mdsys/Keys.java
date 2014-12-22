/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.mdsys;

/**
 * A class modelling foreign key relationships between tables of the <code>MDSYS</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.example.db.oracle.mdsys.tables.records.SdoGeomMetadataTableRecord> UNIQUE_LAYERS = UniqueKeys0.UNIQUE_LAYERS;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.example.db.oracle.mdsys.tables.records.SdoGeomMetadataTableRecord> UNIQUE_LAYERS = createUniqueKey(org.jooq.example.db.oracle.mdsys.tables.SdoGeomMetadataTable.SDO_GEOM_METADATA_TABLE, org.jooq.example.db.oracle.mdsys.tables.SdoGeomMetadataTable.SDO_GEOM_METADATA_TABLE.SDO_OWNER, org.jooq.example.db.oracle.mdsys.tables.SdoGeomMetadataTable.SDO_GEOM_METADATA_TABLE.SDO_TABLE_NAME, org.jooq.example.db.oracle.mdsys.tables.SdoGeomMetadataTable.SDO_GEOM_METADATA_TABLE.SDO_COLUMN_NAME);
	}
}
