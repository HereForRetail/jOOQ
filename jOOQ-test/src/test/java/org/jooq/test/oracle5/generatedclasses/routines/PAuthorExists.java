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
public class PAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -358137947;

	/**
	 * The parameter <code>TEST.P_AUTHOR_EXISTS.AUTHOR_NAME</code>.
	 */
		public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>TEST.P_AUTHOR_EXISTS.RESULT</code>.
	 */
		public static final org.jooq.Parameter<java.math.BigDecimal> RESULT = createParameter("RESULT", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public PAuthorExists() {
		super("P_AUTHOR_EXISTS", org.jooq.test.oracle5.generatedclasses.Test.TEST);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter IN value to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(org.jooq.test.oracle5.generatedclasses.routines.PAuthorExists.AUTHOR_NAME, value);
	}

	/**
	 * Get the <code>RESULT</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getResult() {
		return getValue(RESULT);
	}
}
