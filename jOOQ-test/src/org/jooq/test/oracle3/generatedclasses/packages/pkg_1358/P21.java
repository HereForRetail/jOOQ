/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.pkg_1358;

/**
 * This class is generated by jOOQ.
 */
public class P21 extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = 742233193;


	/**
	 * The procedure parameter <code>TEST.PKG_1358.P21.I</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> I = createParameter("I", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public P21() {
		super("P21", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.packages.PKG_1358.PKG_1358);

		addInParameter(I);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P21.I, value);
	}
}
