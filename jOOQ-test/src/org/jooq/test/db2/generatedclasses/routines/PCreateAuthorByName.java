/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PCreateAuthorByName extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1351947455;

	/**
	 * The parameter <code>LIBRARY.P_CREATE_AUTHOR_BY_NAME.FIRST_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> FIRST_NAME = createParameter("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50));

	/**
	 * The parameter <code>LIBRARY.P_CREATE_AUTHOR_BY_NAME.LAST_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> LAST_NAME = createParameter("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50));

	/**
	 * Create a new routine call instance
	 */
	public PCreateAuthorByName() {
		super("P_CREATE_AUTHOR_BY_NAME", org.jooq.test.db2.generatedclasses.Library.LIBRARY);

		addInParameter(FIRST_NAME);
		addInParameter(LAST_NAME);
	}

	/**
	 * Set the <code>FIRST_NAME</code> parameter IN value to the routine
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.PCreateAuthorByName.FIRST_NAME, value);
	}

	/**
	 * Set the <code>LAST_NAME</code> parameter IN value to the routine
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.db2.generatedclasses.routines.PCreateAuthorByName.LAST_NAME, value);
	}
}
