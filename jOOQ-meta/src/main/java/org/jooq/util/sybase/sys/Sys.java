/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class Sys extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -2075868503;

	/**
	 * The singleton instance of sys
	 */
	public static final Sys SYS = new Sys();

	/**
	 * No further instances allowed
	 */
	private Sys() {
		super("sys");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.sybase.sys.tables.Sysidxcol.SYSIDXCOL,
			org.jooq.util.sybase.sys.tables.Sysfkey.SYSFKEY,
			org.jooq.util.sybase.sys.tables.Sysdomain.SYSDOMAIN,
			org.jooq.util.sybase.sys.tables.Sysview.SYSVIEW,
			org.jooq.util.sybase.sys.tables.Syssequence.SYSSEQUENCE,
			org.jooq.util.sybase.sys.tables.Systab.SYSTAB,
			org.jooq.util.sybase.sys.tables.Systabcol.SYSTABCOL,
			org.jooq.util.sybase.sys.tables.Sysidx.SYSIDX,
			org.jooq.util.sybase.sys.tables.Systable.SYSTABLE,
			org.jooq.util.sybase.sys.tables.Sysprocedure.SYSPROCEDURE,
			org.jooq.util.sybase.sys.tables.Sysprocparm.SYSPROCPARM);
	}
}
