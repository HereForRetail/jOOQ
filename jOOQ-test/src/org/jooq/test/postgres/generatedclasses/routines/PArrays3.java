/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PArrays3 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -2138686222;


	/**
	 * The procedure parameter <code>public.p_arrays.in_array</code>
	 */
	public static final org.jooq.Parameter<java.lang.String[]> IN_ARRAY = createParameter("in_array", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * The procedure parameter <code>public.p_arrays.out_array</code>
	 */
	public static final org.jooq.Parameter<java.lang.String[]> OUT_ARRAY = createParameter("out_array", org.jooq.impl.SQLDataType.CLOB.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PArrays3() {
		super("p_arrays", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
		setOverloaded(true);
	}

	/**
	 * Set the <code>in_array</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.String[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.PArrays3.IN_ARRAY, value);
	}

	/**
	 * Get the <code>out_array</code> parameter OUT value from the routine
	 */
	public java.lang.String[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
