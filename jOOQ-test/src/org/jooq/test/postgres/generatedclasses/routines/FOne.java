/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FOne extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -425629189;

	/**
	 * The parameter <code>public.f_one.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FOne() {
		super("f_one", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
	}
}
