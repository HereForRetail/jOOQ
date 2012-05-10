/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.3.1-SNAPSHOT"},
                            comments = "This class is generated by jOOQ")
public class FormatType extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = -1785499997;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Long> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public FormatType() {
		super("format_type", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		addInParameter(_2);
	}

	/**
	 * Set the <code>_1</code> parameter to the routine
	 */
	public void set__1(java.lang.Long value) {
		setValue(_1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__1(org.jooq.Field<java.lang.Long> field) {
		setField(_1, field);
	}

	/**
	 * Set the <code>_2</code> parameter to the routine
	 */
	public void set__2(java.lang.Integer value) {
		setValue(_2, value);
	}

	/**
	 * Set the <code>_2</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void set__2(org.jooq.Field<java.lang.Integer> field) {
		setField(_2, field);
	}
}
