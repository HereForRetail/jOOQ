/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.VLibraryRecord> implements org.jooq.Record2<java.lang.String, java.lang.String>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IVLibrary {

	private static final long serialVersionUID = -959071627;

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>. 
	 */
	@Override
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>. 
	 */
	@Override
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR);
	}

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.TITLE</code>. 
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.TITLE</code>. 
	 */
	@Override
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IVLibrary from) {
		setAuthor(from.getAuthor());
		setTitle(from.getTitle());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IVLibrary> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
