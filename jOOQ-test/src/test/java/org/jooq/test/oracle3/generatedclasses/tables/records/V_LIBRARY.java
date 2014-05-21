/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_LIBRARY", schema = "TEST")
public class V_LIBRARY extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_LIBRARY> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record2<java.lang.String, java.lang.String>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_LIBRARY_INTERFACE {

	private static final long serialVersionUID = 1458935002;

	/**
	 * Setter for <code>TEST.V_LIBRARY.AUTHOR</code>.
	 */
	@Override
	public void setAUTHOR(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.V_LIBRARY.AUTHOR</code>.
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	@Override
	public java.lang.String getAUTHOR() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>TEST.V_LIBRARY.TITLE</code>.
	 */
	@Override
	public void setTITLE(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.V_LIBRARY.TITLE</code>.
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAUTHOR();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTITLE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_LIBRARY value1(java.lang.String value) {
		setAUTHOR(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_LIBRARY value2(java.lang.String value) {
		setTITLE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_LIBRARY values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_LIBRARY_INTERFACE from) {
		setAUTHOR(from.getAUTHOR());
		setTITLE(from.getTITLE());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_LIBRARY_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V_LIBRARY
	 */
	public V_LIBRARY() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY);
	}

	/**
	 * Create a detached, initialised V_LIBRARY
	 */
	public V_LIBRARY(java.lang.String AUTHOR, java.lang.String TITLE) {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY);

		setValue(0, AUTHOR);
		setValue(1, TITLE);
	}
}
