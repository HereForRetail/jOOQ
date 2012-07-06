/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class uspGetManagerEmployees extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1985965715;


	/**
	 * The procedure parameter <code>dbo.uspGetManagerEmployees.ManagerID</code>
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ManagerID = createParameter("ManagerID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public uspGetManagerEmployees() {
		super("uspGetManagerEmployees", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);

		addInParameter(ManagerID);
	}

	/**
	 * Set the <code>ManagerID</code> parameter IN value to the routine
	 */
	public void setManagerID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.uspGetManagerEmployees.ManagerID, value);
	}
}
