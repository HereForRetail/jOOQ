/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Sysidx extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1990385871;

	/**
	 * The singleton instance of SYS.SYSIDX
	 */
	public static final org.jooq.util.sybase.sys.tables.Sysidx SYSIDX = new org.jooq.util.sybase.sys.tables.Sysidx();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYS.SYSIDX.table_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_ID = createField("table_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSIDX.index_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> INDEX_ID = createField("index_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSIDX.object_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>SYS.SYSIDX.phys_index_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PHYS_INDEX_ID = createField("phys_index_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSIDX.dbspace_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> DBSPACE_ID = createField("dbspace_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSIDX.index_category</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> INDEX_CATEGORY = createField("index_category", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>SYS.SYSIDX.unique</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> UNIQUE = createField("unique", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>SYS.SYSIDX.index_name</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSIDX.not_enforced</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NOT_ENFORCED = createField("not_enforced", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSIDX.file_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> FILE_ID = createField("file_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	public Sysidx() {
		super("SYSIDX", org.jooq.util.sybase.sys.Sys.SYS);
	}

	public Sysidx(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Sysidx.SYSIDX);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Sysidx as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Sysidx(alias);
	}
}
