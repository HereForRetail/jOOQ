/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_ARRAYS", schema = "TEST")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> implements org.jooq.Record5<java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> {

	private static final long serialVersionUID = 47588570;

	/**
	 * Setter for <code>TEST.T_ARRAYS.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_ARRAYS.ID</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_ARRAYS.STRING_ARRAY</code>.
	 */
	public void setStringArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_ARRAYS.STRING_ARRAY</code>.
	 */
	@javax.persistence.Column(name = "STRING_ARRAY")
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord getStringArray() {
		return (org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	public void setNumberArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>.
	 */
	@javax.persistence.Column(name = "NUMBER_ARRAY")
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord getNumberArray() {
		return (org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>.
	 */
	public void setNumberLongArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>.
	 */
	@javax.persistence.Column(name = "NUMBER_LONG_ARRAY")
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord getNumberLongArray() {
		return (org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_ARRAYS.DATE_ARRAY</code>.
	 */
	public void setDateArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_ARRAYS.DATE_ARRAY</code>.
	 */
	@javax.persistence.Column(name = "DATE_ARRAY")
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord getDateArray() {
		return (org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.NUMBER_LONG_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.DATE_ARRAY;
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
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord value2() {
		return getStringArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value3() {
		return getNumberArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value4() {
		return getNumberLongArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord value5() {
		return getDateArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value2(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord value) {
		setStringArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value3(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setNumberArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value4(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value) {
		setNumberLongArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value5(org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord value) {
		setDateArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord values(java.lang.Integer value1, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord value2, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value3, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value4, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS);
	}

	/**
	 * Create a detached, initialised TArraysRecord
	 */
	public TArraysRecord(java.lang.Integer id, org.jooq.test.oracle.generatedclasses.test.udt.records.UStringArrayRecord stringArray, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord numberArray, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord numberLongArray, org.jooq.test.oracle.generatedclasses.test.udt.records.UDateArrayRecord dateArray) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS);

		setValue(0, id);
		setValue(1, stringArray);
		setValue(2, numberArray);
		setValue(3, numberLongArray);
		setValue(4, dateArray);
	}
}
