/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class UAddressTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = 612508219;


	/**
	 * The UDT column <code>public.u_address_type.street</code>
	 */
	public void setStreet(org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.STREET, value);
	}

	/**
	 * The UDT column <code>public.u_address_type.street</code>
	 */
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord getStreet() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.STREET);
	}

	/**
	 * The UDT column <code>public.u_address_type.zip</code>
	 */
	public void setZip(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.ZIP, value);
	}

	/**
	 * The UDT column <code>public.u_address_type.zip</code>
	 */
	public java.lang.String getZip() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.ZIP);
	}

	/**
	 * The UDT column <code>public.u_address_type.city</code>
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CITY, value);
	}

	/**
	 * The UDT column <code>public.u_address_type.city</code>
	 */
	public java.lang.String getCity() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CITY);
	}

	/**
	 * The UDT column <code>public.u_address_type.country</code>
	 */
	public void setCountry(org.jooq.test.postgres.generatedclasses.enums.UCountry value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.COUNTRY, value);
	}

	/**
	 * The UDT column <code>public.u_address_type.country</code>
	 */
	public org.jooq.test.postgres.generatedclasses.enums.UCountry getCountry() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.COUNTRY);
	}

	/**
	 * The UDT column <code>public.u_address_type.since</code>
	 */
	public void setSince(java.sql.Date value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.SINCE, value);
	}

	/**
	 * The UDT column <code>public.u_address_type.since</code>
	 */
	public java.sql.Date getSince() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.SINCE);
	}

	/**
	 * The UDT column <code>public.u_address_type.code</code>
	 */
	public void setCode(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CODE, value);
	}

	/**
	 * The UDT column <code>public.u_address_type.code</code>
	 */
	public java.lang.Integer getCode() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.CODE);
	}

	/**
	 * The UDT column <code>public.u_address_type.f_1323</code>
	 */
	public void setF_1323(byte[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.F_1323, value);
	}

	/**
	 * The UDT column <code>public.u_address_type.f_1323</code>
	 */
	public byte[] getF_1323() {
		return getValue(org.jooq.test.postgres.generatedclasses.udt.UAddressType.F_1323);
	}

	public UAddressTypeRecord() {
		super(org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE);
	}
}
