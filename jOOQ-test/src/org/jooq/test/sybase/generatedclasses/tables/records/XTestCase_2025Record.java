/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_2025Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_2025Record> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 900265314;

	/**
	 * Setter for <code>DBA.x_test_case_2025.ref_id</code>. 
	 */
	public void setRefId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID, value);
	}

	/**
	 * Getter for <code>DBA.x_test_case_2025.ref_id</code>. 
	 */
	public java.lang.Integer getRefId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
	}

	/**
	 * Setter for <code>DBA.x_test_case_2025.ref_name</code>. 
	 */
	public void setRefName(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME, value);
	}

	/**
	 * Getter for <code>DBA.x_test_case_2025.ref_name</code>. 
	 */
	public java.lang.String getRefName() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRefId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getRefName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_2025Record
	 */
	public XTestCase_2025Record() {
		super(org.jooq.test.sybase.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025);
	}
}
