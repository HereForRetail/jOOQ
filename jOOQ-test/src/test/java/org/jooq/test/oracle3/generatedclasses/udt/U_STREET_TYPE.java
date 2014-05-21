/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_STREET_TYPE extends org.jooq.impl.UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -33687523;

	/**
	 * The singleton instance of <code>TEST.U_STREET_TYPE</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE U_STREET_TYPE = new org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE.class;
	}

	/**
	 * The attribute <code>TEST.U_STREET_TYPE.STREET</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String> STREET = createField("STREET", org.jooq.impl.SQLDataType.VARCHAR.length(100), U_STREET_TYPE);

	/**
	 * The attribute <code>TEST.U_STREET_TYPE.NO</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String> NO = createField("NO", org.jooq.impl.SQLDataType.VARCHAR.length(30), U_STREET_TYPE);

	/**
	 * The attribute <code>TEST.U_STREET_TYPE.FLOORS</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY> FLOORS = createField("FLOORS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY.class), U_STREET_TYPE);

	/**
	 * The attribute <code>TEST.U_STREET_TYPE.F_1323</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, byte[]> F_1323 = createField("F_1323", org.jooq.impl.SQLDataType.BLOB, U_STREET_TYPE);

	/**
	 * The attribute <code>TEST.U_STREET_TYPE.F_1326</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE, java.lang.String> F_1326 = createField("F_1326", org.jooq.impl.SQLDataType.CLOB, U_STREET_TYPE);

	/**
	 * No further instances allowed
	 */
	private U_STREET_TYPE() {
		super("U_STREET_TYPE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		// Initialise data type
		getDataType();
	}
}
