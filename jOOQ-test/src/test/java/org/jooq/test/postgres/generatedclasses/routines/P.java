/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1522411883;

	/**
	 * The parameter <code>public.p.p</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P = createParameter("p", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.p.p_</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_ = createParameter("p_", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public P() {
		super("p", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addInParameter(P);
		addInParameter(P_);
	}

	/**
	 * Set the <code>p</code> parameter IN value to the routine
	 */
	public void setP(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.P.P, value);
	}

	/**
	 * Set the <code>p_</code> parameter IN value to the routine
	 */
	public void setP_(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.P.P_, value);
	}
}
