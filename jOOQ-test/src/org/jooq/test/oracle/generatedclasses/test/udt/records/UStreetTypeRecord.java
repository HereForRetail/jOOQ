/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class UStreetTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord> {

	private static final long serialVersionUID = 965246399;


	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.STREET</code>
	 */
	public void setStreet(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.STREET, value);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.STREET</code>
	 */
	public java.lang.String getStreet() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.STREET);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.NO</code>
	 */
	public void setNo(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.NO, value);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.NO</code>
	 */
	public java.lang.String getNo() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.NO);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.FLOORS</code>
	 */
	public void setFloors(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.FLOORS, value);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.FLOORS</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord getFloors() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.FLOORS);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.F_1323</code>
	 */
	public void setF_1323(byte[] value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1323, value);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.F_1323</code>
	 */
	public byte[] getF_1323() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1323);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.F_1326</code>
	 */
	public void setF_1326(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1326, value);
	}

	/**
	 * The UDT column <code>TEST.U_STREET_TYPE.F_1326</code>
	 */
	public java.lang.String getF_1326() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.F_1326);
	}

	public UStreetTypeRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.udt.UStreetType.U_STREET_TYPE);
	}
}
