/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PTriggers extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = -1955351553;

	/**
	 * The parameter <code>public.p_triggers.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("trigger"));

	/**
	 * Create a new routine call instance
	 */
	public PTriggers() {
		super("p_triggers", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.util.postgres.PostgresDataType.getDefaultDataType("trigger"));

		setReturnParameter(RETURN_VALUE);
	}
}
