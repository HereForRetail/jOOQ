/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle5.generatedclasses.udt.u_second_max;

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
public class Odciaggregateiterate extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = 1762641639;

	/**
	 * The parameter <code>TEST.U_SECOND_MAX.ODCIAGGREGATEITERATE.RETURN_VALUE</code>.
	 */
		public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>TEST.U_SECOND_MAX.ODCIAGGREGATEITERATE.SELF</code>.
	 */
		public static final org.jooq.Parameter<org.jooq.test.oracle5.generatedclasses.udt.records.USecondMaxRecord> SELF = createParameter("SELF", org.jooq.test.oracle5.generatedclasses.udt.USecondMax.U_SECOND_MAX.getDataType(), false);

	/**
	 * The parameter <code>TEST.U_SECOND_MAX.ODCIAGGREGATEITERATE.VALUE</code>.
	 */
		public static final org.jooq.Parameter<java.math.BigDecimal> VALUE = createParameter("VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public Odciaggregateiterate() {
		super("ODCIAGGREGATEITERATE", org.jooq.test.oracle5.generatedclasses.Test.TEST, org.jooq.test.oracle5.generatedclasses.udt.USecondMax.U_SECOND_MAX, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInOutParameter(SELF);
		addInParameter(VALUE);
	}

	/**
	 * Set the <code>SELF</code> parameter IN value to the routine
	 */
	public void setSelf(org.jooq.test.oracle5.generatedclasses.udt.records.USecondMaxRecord value) {
		setValue(org.jooq.test.oracle5.generatedclasses.udt.u_second_max.Odciaggregateiterate.SELF, value);
	}

	/**
	 * Set the <code>VALUE</code> parameter IN value to the routine
	 */
	public void setValue(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle5.generatedclasses.udt.u_second_max.Odciaggregateiterate.VALUE, value);
	}

	/**
	 * Get the <code>SELF</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle5.generatedclasses.udt.records.USecondMaxRecord getSelf() {
		return getValue(SELF);
	}
}
