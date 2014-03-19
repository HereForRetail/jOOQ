/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1626389454;

	/**
	 * The singleton instance of <code>DBA.v_author</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.sybase.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>DBA.v_author.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.v_author.FIRST_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

	/**
	 * The column <code>DBA.v_author.LAST_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>DBA.v_author.DATE_OF_BIRTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this, "");

	/**
	 * The column <code>DBA.v_author.YEAR_OF_BIRTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>DBA.v_author.ADDRESS</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

	/**
	 * Create a <code>DBA.v_author</code> table reference
	 */
	public VAuthor() {
		this("v_author", null);
	}

	/**
	 * Create an aliased <code>DBA.v_author</code> table reference
	 */
	public VAuthor(java.lang.String alias) {
		this(alias, org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR);
	}

	private VAuthor(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord> aliased) {
		this(alias, aliased, null);
	}

	private VAuthor(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.VAuthor as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.VAuthor(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sybase.generatedclasses.tables.VAuthor rename(java.lang.String name) {
		return new org.jooq.test.sybase.generatedclasses.tables.VAuthor(name, null);
	}
}
