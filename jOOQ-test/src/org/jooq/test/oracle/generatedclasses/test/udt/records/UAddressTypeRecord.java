/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class UAddressTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = 1495474547;


	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.STREET</code>. 
	 */
	public void setStreet(org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.STREET, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.STREET</code>. 
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord getStreet() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.STREET);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.ZIP</code>. 
	 */
	public void setZip(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.ZIP, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.ZIP</code>. 
	 */
	public java.lang.String getZip() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.ZIP);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.CITY</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.CITY, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.CITY</code>. 
	 */
	public java.lang.String getCity() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.CITY);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.COUNTRY</code>. 
	 */
	public void setCountry(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.COUNTRY, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.COUNTRY</code>. 
	 */
	public java.lang.String getCountry() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.COUNTRY);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.SINCE</code>. 
	 */
	public void setSince(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.SINCE, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.SINCE</code>. 
	 */
	public java.sql.Date getSince() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.SINCE);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.CODE</code>. 
	 */
	public void setCode(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.CODE, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.CODE</code>. 
	 */
	public java.lang.Integer getCode() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.CODE);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.F_1323</code>. 
	 */
	public void setF_1323(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.F_1323, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.F_1323</code>. 
	 */
	public byte[] getF_1323() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.F_1323);
	}

	/**
	 * Setter for <code>TEST.U_ADDRESS_TYPE.F_1326</code>. 
	 */
	public void setF_1326(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.F_1326, value);
	}

	/**
	 * Getter for <code>TEST.U_ADDRESS_TYPE.F_1326</code>. 
	 */
	public java.lang.String getF_1326() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.F_1326);
	}

	/**
	 * Create a new <code>TEST.U_ADDRESS_TYPE</code> record
	 */
	public UAddressTypeRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE);
	}
}
