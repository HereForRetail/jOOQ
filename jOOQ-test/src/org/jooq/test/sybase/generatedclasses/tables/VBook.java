/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -929624653;

	/**
	 * The singleton instance of <code>DBA.v_book</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.sybase.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord.class;
	}

	/**
	 * The column <code>DBA.v_book.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.v_book.AUTHOR_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.v_book.CO_AUTHOR_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>DBA.v_book.DETAILS_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>DBA.v_book.TITLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * The column <code>DBA.v_book.PUBLISHED_IN</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.v_book.LANGUAGE_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DBA.v_book.CONTENT_TEXT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.LONGVARCHAR.length(32767), this, "");

	/**
	 * The column <code>DBA.v_book.CONTENT_PDF</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.LONGVARBINARY, this, "");

	/**
	 * Create a <code>DBA.v_book</code> table reference
	 */
	public VBook() {
		this("v_book", null);
	}

	/**
	 * Create an aliased <code>DBA.v_book</code> table reference
	 */
	public VBook(java.lang.String alias) {
		this(alias, org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK);
	}

	private VBook(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private VBook(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.VBook as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.VBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sybase.generatedclasses.tables.VBook rename(java.lang.String name) {
		return new org.jooq.test.sybase.generatedclasses.tables.VBook(name, null);
	}
}
