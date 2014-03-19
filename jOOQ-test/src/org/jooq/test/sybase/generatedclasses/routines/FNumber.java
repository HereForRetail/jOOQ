/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FNumber extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = -279381076;

	/**
	 * The parameter <code>DBA.f_number.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>DBA.f_number.n</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> N = createParameter("n", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FNumber() {
		super("f_number", org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(N);
	}

	/**
	 * Set the <code>n</code> parameter IN value to the routine
	 */
	public void setN(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.routines.FNumber.N, value);
	}

	/**
	 * Set the <code>n</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setN(org.jooq.Field<java.lang.Integer> field) {
		setField(N, field);
	}
}
