/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle5.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P_976 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -959040984;

	/**
	 * The parameter <code>TEST.P_976.I</code>.
	 */
		public static final org.jooq.Parameter<java.time.LocalDateTime> I = createParameter("I", org.jooq.impl.SQLDataType.DATE, false, new org.jooq.test.all.converters.LocalDateTimeConverter());

	/**
	 * The parameter <code>TEST.P_976.O</code>.
	 */
		public static final org.jooq.Parameter<java.time.LocalDateTime> O = createParameter("O", org.jooq.impl.SQLDataType.DATE, false, new org.jooq.test.all.converters.LocalDateTimeConverter());

	/**
	 * Create a new routine call instance
	 */
	public P_976() {
		super("P_976", org.jooq.test.oracle5.generatedclasses.Test.TEST);

		addInParameter(I);
		addOutParameter(O);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(java.time.LocalDateTime value) {
		setValue(org.jooq.test.oracle5.generatedclasses.routines.P_976.I, value);
	}

	/**
	 * Get the <code>O</code> parameter OUT value from the routine
	 */
	public java.time.LocalDateTime getO() {
		return getValue(O);
	}
}
