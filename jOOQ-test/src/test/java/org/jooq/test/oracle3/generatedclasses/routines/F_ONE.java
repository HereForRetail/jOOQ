/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F_ONE extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = -330966370;

	/**
	 * The parameter <code>TEST.F_ONE.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public F_ONE() {
		super("F_ONE", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
