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
public class P1490 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1230867942;

	/**
	 * The parameter <code>TEST.P1490.value</code>.
	 */
		public static final org.jooq.Parameter<java.math.BigDecimal> VALUE = createParameter("value", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public P1490() {
		super("P1490", org.jooq.test.oracle5.generatedclasses.Test.TEST);

		addInParameter(VALUE);
	}

	/**
	 * Set the <code>value</code> parameter IN value to the routine
	 */
	public void setValue(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle5.generatedclasses.routines.P1490.VALUE, value);
	}
}
