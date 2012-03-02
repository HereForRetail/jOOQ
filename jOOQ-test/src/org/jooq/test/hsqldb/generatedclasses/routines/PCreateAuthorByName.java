/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class PCreateAuthorByName extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1311801443;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FIRST_NAME = createParameter("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> LAST_NAME = createParameter("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public PCreateAuthorByName() {
		super("P_CREATE_AUTHOR_BY_NAME", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);

		addInParameter(FIRST_NAME);
		addInParameter(LAST_NAME);
	}

	/**
	 * Set the <code>FIRST_NAME</code> parameter to the routine
	 */
	public void setFirstName(java.lang.String value) {
		setValue(FIRST_NAME, value);
	}

	/**
	 * Set the <code>LAST_NAME</code> parameter to the routine
	 */
	public void setLastName(java.lang.String value) {
		setValue(LAST_NAME, value);
	}
}
