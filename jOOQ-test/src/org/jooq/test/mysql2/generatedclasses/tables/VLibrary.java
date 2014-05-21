/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 50490045;

	/**
	 * The singleton instance of <code>test2.v_library</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.mysql2.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The column <code>test2.v_library.AUTHOR</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(101), this, "");

	/**
	 * The column <code>test2.v_library.TITLE</code>. The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "The book's title");

	/**
	 * Create a <code>test2.v_library</code> table reference
	 */
	public VLibrary() {
		this("v_library", null);
	}

	/**
	 * Create an aliased <code>test2.v_library</code> table reference
	 */
	public VLibrary(java.lang.String alias) {
		this(alias, org.jooq.test.mysql2.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	private VLibrary(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord> aliased) {
		this(alias, aliased, null);
	}

	private VLibrary(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.VLibraryRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.VLibrary(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.VLibrary rename(java.lang.String name) {
		return new org.jooq.test.mysql2.generatedclasses.tables.VLibrary(name, null);
	}
}
