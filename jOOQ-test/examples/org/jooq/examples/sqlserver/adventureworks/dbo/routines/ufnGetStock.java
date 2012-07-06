/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class ufnGetStock extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1549957653;


	/**
	 * The procedure parameter <code>dbo.ufnGetStock.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The procedure parameter <code>dbo.ufnGetStock.ProductID</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ProductID = createParameter("ProductID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public ufnGetStock() {
		super("ufnGetStock", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(ProductID);
	}

	/**
	 * Set the <code>ProductID</code> parameter IN value to the routine
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.ufnGetStock.ProductID, value);
	}

	/**
	 * Set the <code>ProductID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setProductID(org.jooq.Field<java.lang.Integer> field) {
		setField(ProductID, field);
	}
}
