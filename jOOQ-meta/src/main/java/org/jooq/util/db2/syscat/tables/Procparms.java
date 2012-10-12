/**
 * This class is generated by jOOQ
 */
package org.jooq.util.db2.syscat.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Procparms extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 747498101;

	/**
	 * The singleton instance of SYSCAT.PROCPARMS
	 */
	public static final org.jooq.util.db2.syscat.tables.Procparms PROCPARMS = new org.jooq.util.db2.syscat.tables.Procparms();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYSCAT.PROCPARMS.PROCSCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PROCSCHEMA = createField("PROCSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.PROCNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PROCNAME = createField("PROCNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.SPECIFICNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFICNAME = createField("SPECIFICNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.SERVERNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SERVERNAME = createField("SERVERNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.ORDINAL</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> ORDINAL = createField("ORDINAL", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.PARMNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PARMNAME = createField("PARMNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.TYPESCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPESCHEMA = createField("TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.TYPENAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TYPENAME = createField("TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.TYPEID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> TYPEID = createField("TYPEID", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.SOURCETYPEID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SOURCETYPEID = createField("SOURCETYPEID", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.NULLS</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> NULLS = createField("NULLS", org.jooq.impl.SQLDataType.CHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.LENGTH</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> LENGTH = createField("LENGTH", org.jooq.impl.SQLDataType.INTEGER, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.SCALE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.PARM_MODE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> PARM_MODE = createField("PARM_MODE", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.CODEPAGE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> CODEPAGE = createField("CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.DBCS_CODEPAGE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Short> DBCS_CODEPAGE = createField("DBCS_CODEPAGE", org.jooq.impl.SQLDataType.SMALLINT, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.AS_LOCATOR</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> AS_LOCATOR = createField("AS_LOCATOR", org.jooq.impl.SQLDataType.CHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.TARGET_TYPESCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPESCHEMA = createField("TARGET_TYPESCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.TARGET_TYPENAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> TARGET_TYPENAME = createField("TARGET_TYPENAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.SCOPE_TABSCHEMA</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_TABSCHEMA = createField("SCOPE_TABSCHEMA", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * The table column <code>SYSCAT.PROCPARMS.SCOPE_TABNAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_TABNAME = createField("SCOPE_TABNAME", org.jooq.impl.SQLDataType.VARCHAR, PROCPARMS);

	/**
	 * No further instances allowed
	 */
	private Procparms() {
		super("PROCPARMS", org.jooq.util.db2.syscat.Syscat.SYSCAT);
	}
}
