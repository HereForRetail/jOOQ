/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PAuthorExists extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1792413373;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("author_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RESULT = createParameter("result", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public PAuthorExists() {
		super("p_author_exists", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(AUTHOR_NAME);
		addInOutParameter(RESULT);
	}

	/**
	 * Set the <code>author_name</code> parameter to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>result</code> parameter to the routine
	 */
	public void setResult(java.lang.Integer value) {
		setValue(RESULT, value);
	}

	public java.lang.Integer getResult() {
		return getValue(RESULT);
	}
}
