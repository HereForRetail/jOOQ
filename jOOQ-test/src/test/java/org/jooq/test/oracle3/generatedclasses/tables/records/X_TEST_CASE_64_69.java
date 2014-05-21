/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_64_69", schema = "TEST")
public class X_TEST_CASE_64_69 extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> implements java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, java.lang.Integer>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE {

	private static final long serialVersionUID = -1770804354;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_64_69.ID</code>.
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_64_69.ID</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>.
	 */
	@Override
	public void setUNUSED_ID(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>.
	 */
	@javax.persistence.Column(name = "UNUSED_ID", precision = 7)
	@Override
	public java.lang.Integer getUNUSED_ID() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID;
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
	public java.lang.Integer value2() {
		return getUNUSED_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_64_69 value1(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_64_69 value2(java.lang.Integer value) {
		setUNUSED_ID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_64_69 values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE from) {
		setID(from.getID());
		setUNUSED_ID(from.getUNUSED_ID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X_TEST_CASE_64_69
	 */
	public X_TEST_CASE_64_69() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * Create a detached, initialised X_TEST_CASE_64_69
	 */
	public X_TEST_CASE_64_69(java.lang.Integer ID, java.lang.Integer UNUSED_ID) {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69);

		setValue(0, ID);
		setValue(1, UNUSED_ID);
	}
}
