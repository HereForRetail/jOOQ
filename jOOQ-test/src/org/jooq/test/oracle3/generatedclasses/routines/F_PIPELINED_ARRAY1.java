/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class F_PIPELINED_ARRAY1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY> implements java.lang.Cloneable {

	private static final long serialVersionUID = 22232302;


	/**
	 * The procedure parameter <code>TEST.F_PIPELINED_ARRAY1.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY.class));

	/**
	 * Create a new routine call instance
	 */
	public F_PIPELINED_ARRAY1() {
		super("F_PIPELINED_ARRAY1", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY.class));

		setReturnParameter(RETURN_VALUE);
	}
}
