/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_BOOK_TYPE extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_TYPE> implements java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, java.lang.String>, org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_BOOK_TYPE_INTERFACE {

	private static final long serialVersionUID = 1891781553;

	/**
	 * Setter for <code>TEST.U_BOOK_TYPE.ID</code>.
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.U_BOOK_TYPE.ID</code>.
	 */
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.U_BOOK_TYPE.TITLE</code>.
	 */
	@Override
	public void setTITLE(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.U_BOOK_TYPE.TITLE</code>.
	 */
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
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID();
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
	public U_BOOK_TYPE value1(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_BOOK_TYPE value2(java.lang.String value) {
		setTITLE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_BOOK_TYPE values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_BOOK_TYPE_INTERFACE from) {
		setID(from.getID());
		setTITLE(from.getTITLE());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_BOOK_TYPE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_BOOK_TYPE
	 */
	public U_BOOK_TYPE() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE);
	}

	/**
	 * Create a detached, initialised U_BOOK_TYPE
	 */
	public U_BOOK_TYPE(java.lang.Integer ID, java.lang.String TITLE) {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE);

		setValue(0, ID);
		setValue(1, TITLE);
	}
}
