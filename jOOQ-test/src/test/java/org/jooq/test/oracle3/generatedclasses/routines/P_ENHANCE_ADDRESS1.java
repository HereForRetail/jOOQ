/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P_ENHANCE_ADDRESS1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1258447142;

	/**
	 * The parameter <code>TEST.P_ENHANCE_ADDRESS1.ADDRESS</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> ADDRESS = createParameter("ADDRESS", org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE.getDataType());

	/**
	 * The parameter <code>TEST.P_ENHANCE_ADDRESS1.NO</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> NO = createParameter("NO", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public P_ENHANCE_ADDRESS1() {
		super("P_ENHANCE_ADDRESS1", org.jooq.test.oracle3.generatedclasses.TEST.TEST);

		addInParameter(ADDRESS);
		addOutParameter(NO);
	}

	/**
	 * Set the <code>ADDRESS</code> parameter IN value to the routine
	 */
	public void setADDRESS(org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.P_ENHANCE_ADDRESS1.ADDRESS, value);
	}

	/**
	 * Get the <code>NO</code> parameter OUT value from the routine
	 */
	public java.lang.String getNO() {
		return getValue(NO);
	}
}
