/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PUnused extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 632988391;

	/**
	 * The parameter <code>TEST.P_UNUSED.IN1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> IN1 = createParameter("IN1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>TEST.P_UNUSED.OUT1</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> OUT1 = createParameter("OUT1", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.P_UNUSED.OUT2</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> OUT2 = createParameter("OUT2", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super("P_UNUSED", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>IN1</code> parameter IN value to the routine
	 */
	public void setIn1(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.PUnused.IN1, value);
	}

	/**
	 * Set the <code>OUT2</code> parameter IN value to the routine
	 */
	public void setOut2(java.lang.Number value) {
		setNumber(org.jooq.test.oracle.generatedclasses.test.routines.PUnused.OUT2, value);
	}

	/**
	 * Get the <code>OUT1</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getOut1() {
		return getValue(OUT1);
	}

	/**
	 * Get the <code>OUT2</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getOut2() {
		return getValue(OUT2);
	}
}
