/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Sysidx extends org.jooq.impl.TableImpl<org.jooq.util.sybase.sys.tables.records.SysidxRecord> {

	private static final long serialVersionUID = -792673455;

	/**
	 * The singleton instance of SYSIDX
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysidx SYSIDX = new org.jooq.util.sybase.sys.tables.Sysidx();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysidxRecord> __RECORD_TYPE = org.jooq.util.sybase.sys.tables.records.SysidxRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.sybase.sys.tables.records.SysidxRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer> TABLE_ID = createField("table_id", org.jooq.impl.SQLDataType.INTEGER, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer> INDEX_ID = createField("index_id", org.jooq.impl.SQLDataType.INTEGER, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Integer> PHYS_INDEX_ID = createField("phys_index_id", org.jooq.impl.SQLDataType.INTEGER, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Short> DBSPACE_ID = createField("dbspace_id", org.jooq.impl.SQLDataType.SMALLINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Byte> INDEX_CATEGORY = createField("index_category", org.jooq.impl.SQLDataType.TINYINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Byte> UNIQUE = createField("unique", org.jooq.impl.SQLDataType.TINYINT, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.CHAR, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.String> NOT_ENFORCED = createField("not_enforced", org.jooq.impl.SQLDataType.CHAR, SYSIDX);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.util.sybase.sys.tables.records.SysidxRecord, java.lang.Short> FILE_ID = createField("file_id", org.jooq.impl.SQLDataType.SMALLINT, SYSIDX);

	/**
	 * No further instances allowed
	 */
	private Sysidx() {
		super("SYSIDX", org.jooq.util.sybase.sys.Sys.SYS);
	}
}
