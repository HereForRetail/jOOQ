/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.sp.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Books extends org.jooq.impl.TableImpl<org.jooq.example.db.oracle.sp.tables.records.BooksRecord> {

	private static final long serialVersionUID = -1442479764;

	/**
	 * The reference instance of <code>SP.BOOKS</code>
	 */
	public static final org.jooq.example.db.oracle.sp.tables.Books BOOKS = new org.jooq.example.db.oracle.sp.tables.Books();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.db.oracle.sp.tables.records.BooksRecord> getRecordType() {
		return org.jooq.example.db.oracle.sp.tables.records.BooksRecord.class;
	}

	/**
	 * The column <code>SP.BOOKS.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.db.oracle.sp.tables.records.BooksRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>SP.BOOKS.TITLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.db.oracle.sp.tables.records.BooksRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>SP.BOOKS.LANGUAGE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.db.oracle.sp.tables.records.BooksRecord, java.lang.String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR.length(2).nullable(false), this, "");

	/**
	 * The column <code>SP.BOOKS.AUTHOR_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.db.oracle.sp.tables.records.BooksRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>SP.BOOKS</code> table reference
	 */
	public Books() {
		this("BOOKS", null);
	}

	/**
	 * Create an aliased <code>SP.BOOKS</code> table reference
	 */
	public Books(java.lang.String alias) {
		this(alias, org.jooq.example.db.oracle.sp.tables.Books.BOOKS);
	}

	private Books(java.lang.String alias, org.jooq.Table<org.jooq.example.db.oracle.sp.tables.records.BooksRecord> aliased) {
		this(alias, aliased, null);
	}

	private Books(java.lang.String alias, org.jooq.Table<org.jooq.example.db.oracle.sp.tables.records.BooksRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.db.oracle.sp.Sp.SP, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.example.db.oracle.sp.tables.records.BooksRecord> getPrimaryKey() {
		return org.jooq.example.db.oracle.sp.Keys.SYS_C0013047;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.example.db.oracle.sp.tables.records.BooksRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.example.db.oracle.sp.tables.records.BooksRecord>>asList(org.jooq.example.db.oracle.sp.Keys.SYS_C0013047);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.example.db.oracle.sp.tables.records.BooksRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.example.db.oracle.sp.tables.records.BooksRecord, ?>>asList(org.jooq.example.db.oracle.sp.Keys.FK_AUTHOR_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.db.oracle.sp.tables.Books as(java.lang.String alias) {
		return new org.jooq.example.db.oracle.sp.tables.Books(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.db.oracle.sp.tables.Books rename(java.lang.String name) {
		return new org.jooq.example.db.oracle.sp.tables.Books(name, null);
	}
}
