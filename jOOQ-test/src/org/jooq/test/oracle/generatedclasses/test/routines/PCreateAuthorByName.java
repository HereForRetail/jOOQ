/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PCreateAuthorByName extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1646952424;

	/**
	 * The parameter <code>TEST.P_CREATE_AUTHOR_BY_NAME.FIRST_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> FIRST_NAME = createParameter("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>TEST.P_CREATE_AUTHOR_BY_NAME.LAST_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> LAST_NAME = createParameter("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public PCreateAuthorByName() {
		super("P_CREATE_AUTHOR_BY_NAME", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(FIRST_NAME);
		addInParameter(LAST_NAME);
	}

	/**
	 * Set the <code>FIRST_NAME</code> parameter IN value to the routine
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.PCreateAuthorByName.FIRST_NAME, value);
	}

	/**
	 * Set the <code>LAST_NAME</code> parameter IN value to the routine
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.PCreateAuthorByName.LAST_NAME, value);
	}
}
