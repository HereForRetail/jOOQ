/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle5.generatedclasses.packages.library_767_package_test;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Library_767PackageTest extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = 1315859454;

	/**
	 * The parameter <code>TEST.LIBRARY_767_PACKAGE_TEST.LIBRARY_767_PACKAGE_TEST.RETURN_VALUE</code>.
	 */
		public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public Library_767PackageTest() {
		super("LIBRARY_767_PACKAGE_TEST", org.jooq.test.oracle5.generatedclasses.Test.TEST, org.jooq.test.oracle5.generatedclasses.packages.Library_767PackageTest.LIBRARY_767_PACKAGE_TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
