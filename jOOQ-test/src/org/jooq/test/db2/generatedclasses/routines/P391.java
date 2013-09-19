/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P391 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1220412547;

	/**
	 * The parameter <code>LIBRARY.P391.I1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I1 = createParameter("I1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>LIBRARY.P391.IO1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO1 = createParameter("IO1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>LIBRARY.P391.O1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O1 = createParameter("O1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>LIBRARY.P391.O2</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> O2 = createParameter("O2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>LIBRARY.P391.IO2</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IO2 = createParameter("IO2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>LIBRARY.P391.I2</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> I2 = createParameter("I2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public P391() {
		super("P391", org.jooq.test.db2.generatedclasses.Library.LIBRARY);

		addInParameter(I1);
		addInOutParameter(IO1);
		addOutParameter(O1);
		addOutParameter(O2);
		addInOutParameter(IO2);
		addInParameter(I2);
	}

	/**
	 * Set the <code>I1</code> parameter IN value to the routine
	 */
	public void setI1(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.P391.I1, value);
	}

	/**
	 * Set the <code>IO1</code> parameter IN value to the routine
	 */
	public void setIo1(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.P391.IO1, value);
	}

	/**
	 * Set the <code>IO2</code> parameter IN value to the routine
	 */
	public void setIo2(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.P391.IO2, value);
	}

	/**
	 * Set the <code>I2</code> parameter IN value to the routine
	 */
	public void setI2(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.P391.I2, value);
	}

	/**
	 * Get the <code>IO1</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getIo1() {
		return getValue(IO1);
	}

	/**
	 * Get the <code>O1</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getO1() {
		return getValue(O1);
	}

	/**
	 * Get the <code>O2</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getO2() {
		return getValue(O2);
	}

	/**
	 * Get the <code>IO2</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getIo2() {
		return getValue(IO2);
	}
}
