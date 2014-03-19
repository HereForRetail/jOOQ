/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 1462428914;

	/**
	 * Setter for <code>x_test_case_64_69.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>x_test_case_64_69.ID</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>x_test_case_64_69.UNUSED_ID</code>.
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>x_test_case_64_69.UNUSED_ID</code>.
	 */
	public java.lang.Integer getUnusedId() {
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
		return org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUnusedId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_64_69Record value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_64_69Record value2(java.lang.Integer value) {
		setUnusedId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_64_69Record values(java.lang.Integer value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * Create a detached, initialised XTestCase_64_69Record
	 */
	public XTestCase_64_69Record(java.lang.Integer id, java.lang.Integer unusedId) {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);

		setValue(0, id);
		setValue(1, unusedId);
	}
}
