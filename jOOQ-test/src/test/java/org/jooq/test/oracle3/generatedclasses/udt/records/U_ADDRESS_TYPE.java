/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_ADDRESS_TYPE extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> implements java.lang.Cloneable, org.jooq.Record8<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, byte[], java.lang.String>, org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_ADDRESS_TYPE_INTERFACE {

	private static final long serialVersionUID = -1934579019;

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.STREET</code>.
	 */
	@Override
	public void setSTREET(org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.STREET</code>.
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE getSTREET() {
		return (org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE) getValue(0);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.ZIP</code>.
	 */
	@Override
	public void setZIP(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.ZIP</code>.
	 */
	@Override
	public java.lang.String getZIP() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.CITY</code>.
	 */
	@Override
	public void setCITY(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.CITY</code>.
	 */
	@Override
	public java.lang.String getCITY() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.COUNTRY</code>.
	 */
	@Override
	public void setCOUNTRY(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.COUNTRY</code>.
	 */
	@Override
	public java.lang.String getCOUNTRY() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.SINCE</code>.
	 */
	@Override
	public void setSINCE(java.sql.Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.SINCE</code>.
	 */
	@Override
	public java.sql.Date getSINCE() {
		return (java.sql.Date) getValue(4);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.CODE</code>.
	 */
	@Override
	public void setCODE(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.CODE</code>.
	 */
	@Override
	public java.lang.Integer getCODE() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.F_1323</code>.
	 */
	@Override
	public void setF_1323(byte[] value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.F_1323</code>.
	 */
	@Override
	public byte[] getF_1323() {
		return (byte[]) getValue(6);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.F_1326</code>.
	 */
	@Override
	public void setF_1326(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.F_1326</code>.
	 */
	@Override
	public java.lang.String getF_1326() {
		return (java.lang.String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, byte[], java.lang.String> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, byte[], java.lang.String> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> field1() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.STREET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.ZIP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field5() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.SINCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field7() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.F_1323;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.F_1326;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE value1() {
		return getSTREET();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getZIP();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getCITY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCOUNTRY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value5() {
		return getSINCE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getCODE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value7() {
		return getF_1323();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getF_1326();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value1(org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE value) {
		setSTREET(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value2(java.lang.String value) {
		setZIP(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value3(java.lang.String value) {
		setCITY(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value4(java.lang.String value) {
		setCOUNTRY(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value5(java.sql.Date value) {
		setSINCE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value6(java.lang.Integer value) {
		setCODE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value7(byte[] value) {
		setF_1323(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value8(java.lang.String value) {
		setF_1326(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE values(org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.sql.Date value5, java.lang.Integer value6, byte[] value7, java.lang.String value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_ADDRESS_TYPE_INTERFACE from) {
		setSTREET(from.getSTREET());
		setZIP(from.getZIP());
		setCITY(from.getCITY());
		setCOUNTRY(from.getCOUNTRY());
		setSINCE(from.getSINCE());
		setCODE(from.getCODE());
		setF_1323(from.getF_1323());
		setF_1326(from.getF_1326());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_ADDRESS_TYPE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_ADDRESS_TYPE
	 */
	public U_ADDRESS_TYPE() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE);
	}

	/**
	 * Create a detached, initialised U_ADDRESS_TYPE
	 */
	public U_ADDRESS_TYPE(org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE STREET, java.lang.String ZIP, java.lang.String CITY, java.lang.String COUNTRY, java.sql.Date SINCE, java.lang.Integer CODE, byte[] F_1323, java.lang.String F_1326) {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE);

		setValue(0, STREET);
		setValue(1, ZIP);
		setValue(2, CITY);
		setValue(3, COUNTRY);
		setValue(4, SINCE);
		setValue(5, CODE);
		setValue(6, F_1323);
		setValue(7, F_1326);
	}
}
