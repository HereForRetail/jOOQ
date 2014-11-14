/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_2845_CASE_sensitivity", schema = "TEST")
public class T_2845CaseSensitivityRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.T_2845CaseSensitivityRecord> implements org.jooq.Record5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> {

	private static final long serialVersionUID = 1342449678;

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.ID</code>.
	 */
	public void setId(java.math.BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.ID</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	@javax.validation.constraints.NotNull
	public java.math.BigDecimal getId() {
		return (java.math.BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	public void setInsensitive(java.math.BigDecimal value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	@javax.persistence.Column(name = "INSENSITIVE")
	public java.math.BigDecimal getInsensitive() {
		return (java.math.BigDecimal) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	public void setUpper(java.math.BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	@javax.persistence.Column(name = "UPPER")
	public java.math.BigDecimal getUpper() {
		return (java.math.BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.lower</code>.
	 */
	public void setLower(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.lower</code>.
	 */
	@javax.persistence.Column(name = "lower")
	public java.math.BigDecimal getLower() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	public void setMixed(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	@javax.persistence.Column(name = "Mixed")
	public java.math.BigDecimal getMixed() {
		return (java.math.BigDecimal) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.math.BigDecimal> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY.INSENSITIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY.UPPER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY.LOWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY.MIXED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value2() {
		return getInsensitive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getUpper();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getLower();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getMixed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value1(java.math.BigDecimal value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value2(java.math.BigDecimal value) {
		setInsensitive(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value3(java.math.BigDecimal value) {
		setUpper(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value4(java.math.BigDecimal value) {
		setLower(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord value5(java.math.BigDecimal value) {
		setMixed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivityRecord values(java.math.BigDecimal value1, java.math.BigDecimal value2, java.math.BigDecimal value3, java.math.BigDecimal value4, java.math.BigDecimal value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2845CaseSensitivityRecord
	 */
	public T_2845CaseSensitivityRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY);
	}

	/**
	 * Create a detached, initialised T_2845CaseSensitivityRecord
	 */
	public T_2845CaseSensitivityRecord(java.math.BigDecimal id, java.math.BigDecimal insensitive, java.math.BigDecimal upper, java.math.BigDecimal lower, java.math.BigDecimal mixed) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY);

		setValue(0, id);
		setValue(1, insensitive);
		setValue(2, upper);
		setValue(3, lower);
		setValue(4, mixed);
	}
}
