/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.oracle.sys.Sys;


/**
 * Database links accessible to the user
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AllDbLinks extends TableImpl<Record> {

	private static final long serialVersionUID = -1762136705;

	/**
	 * The reference instance of <code>SYS.ALL_DB_LINKS</code>
	 */
	public static final AllDbLinks ALL_DB_LINKS = new AllDbLinks();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>SYS.ALL_DB_LINKS.OWNER</code>.
	 */
	public final TableField<Record, String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>SYS.ALL_DB_LINKS.DB_LINK</code>. Name of the database link
	 */
	public final TableField<Record, String> DB_LINK = createField("DB_LINK", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "Name of the database link");

	/**
	 * The column <code>SYS.ALL_DB_LINKS.USERNAME</code>. Name of user to log on as
	 */
	public final TableField<Record, String> USERNAME = createField("USERNAME", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "Name of user to log on as");

	/**
	 * The column <code>SYS.ALL_DB_LINKS.HOST</code>. SQL*Net string for connect
	 */
	public final TableField<Record, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.VARCHAR.length(2000), this, "SQL*Net string for connect");

	/**
	 * The column <code>SYS.ALL_DB_LINKS.CREATED</code>. Creation time of the database link
	 */
	public final TableField<Record, Date> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "Creation time of the database link");

	/**
	 * Create a <code>SYS.ALL_DB_LINKS</code> table reference
	 */
	public AllDbLinks() {
		this("ALL_DB_LINKS", null);
	}

	/**
	 * Create an aliased <code>SYS.ALL_DB_LINKS</code> table reference
	 */
	public AllDbLinks(String alias) {
		this(alias, ALL_DB_LINKS);
	}

	private AllDbLinks(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private AllDbLinks(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "Database links accessible to the user");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AllDbLinks as(String alias) {
		return new AllDbLinks(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AllDbLinks rename(String name) {
		return new AllDbLinks(name, null);
	}
}
