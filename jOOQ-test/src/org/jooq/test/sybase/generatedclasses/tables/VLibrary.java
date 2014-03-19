/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 1045990597;

	/**
	 * The singleton instance of <code>DBA.V_LIBRARY</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.sybase.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The column <code>DBA.V_LIBRARY.AUTHOR</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR.length(101), this, "");

	/**
	 * The column <code>DBA.V_LIBRARY.TITLE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * Create a <code>DBA.V_LIBRARY</code> table reference
	 */
	public VLibrary() {
		this("V_LIBRARY", null);
	}

	/**
	 * Create an aliased <code>DBA.V_LIBRARY</code> table reference
	 */
	public VLibrary(java.lang.String alias) {
		this(alias, org.jooq.test.sybase.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	private VLibrary(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord> aliased) {
		this(alias, aliased, null);
	}

	private VLibrary(java.lang.String alias, org.jooq.Table<org.jooq.test.sybase.generatedclasses.tables.records.VLibraryRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.VLibrary(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sybase.generatedclasses.tables.VLibrary rename(java.lang.String name) {
		return new org.jooq.test.sybase.generatedclasses.tables.VLibrary(name, null);
	}
}
