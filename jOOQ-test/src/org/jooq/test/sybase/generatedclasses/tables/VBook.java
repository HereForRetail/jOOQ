/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -1971059191;

	/**
	 * The singleton instance of DBA.v_book
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
	 * The table column <code>DBA.v_book.ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_book.AUTHOR_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_book.CO_AUTHOR_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_book.DETAILS_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_book.TITLE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>DBA.v_book.PUBLISHED_IN</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_book.LANGUAGE_ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_book.CONTENT_TEXT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.LONGVARCHAR, this);

	/**
	 * The table column <code>DBA.v_book.CONTENT_PDF</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.LONGVARBINARY, this);

	public VBook() {
		super("v_book", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	public VBook(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.VBook as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.VBook(alias);
	}
}
