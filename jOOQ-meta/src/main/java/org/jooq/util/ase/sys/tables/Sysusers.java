/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Sysusers extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 418904234;

	/**
	 * The singleton instance of dbo.sysusers
	 */
	public static final org.jooq.util.ase.sys.tables.Sysusers SYSUSERS = new org.jooq.util.ase.sys.tables.Sysusers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>dbo.sysusers.suid</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SUID = createField("suid", org.jooq.impl.SQLDataType.INTEGER, SYSUSERS);

	/**
	 * The table column <code>dbo.sysusers.uid</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> UID = createField("uid", org.jooq.impl.SQLDataType.INTEGER, SYSUSERS);

	/**
	 * The table column <code>dbo.sysusers.gid</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Integer> GID = createField("gid", org.jooq.impl.SQLDataType.INTEGER, SYSUSERS);

	/**
	 * The table column <code>dbo.sysusers.name</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, SYSUSERS);

	/**
	 * The table column <code>dbo.sysusers.environ</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> ENVIRON = createField("environ", org.jooq.impl.SQLDataType.VARCHAR, SYSUSERS);

	/**
	 * No further instances allowed
	 */
	private Sysusers() {
		super("sysusers", org.jooq.util.ase.sys.Dbo.DBO);
	}
}
