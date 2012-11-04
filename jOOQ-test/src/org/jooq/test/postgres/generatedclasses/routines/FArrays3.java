/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FArrays3 extends org.jooq.impl.AbstractRoutine<java.lang.String[]> {

	private static final long serialVersionUID = -600699578;

	/**
	 * The parameter <code>public.f_arrays.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * The parameter <code>public.f_arrays.in_array</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = createParameter("in_array", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays3() {
		super("f_arrays", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
		setOverloaded(true);
	}

	/**
	 * Set the <code>in_array</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.String[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.FArrays3.IN_ARRAY, value);
	}

	/**
	 * Set the <code>in_array</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInArray(org.jooq.Field<java.lang.String[]> field) {
		setField(IN_ARRAY, field);
	}
}
