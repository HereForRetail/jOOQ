/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle5.generatedclasses.packages.test_synonym_package;

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
public class ActualObject extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 2067527688;

	/**
	 * The parameter <code>TEST.TEST_SYNONYM_PACKAGE.ACTUAL_OBJECT.RETURN_VALUE</code>.
	 */
		public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"), false);

	/**
	 * Create a new routine call instance
	 */
	public ActualObject() {
		super("ACTUAL_OBJECT", org.jooq.test.oracle5.generatedclasses.Test.TEST, org.jooq.test.oracle5.generatedclasses.packages.TestSynonymPackage.TEST_SYNONYM_PACKAGE, org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"));

		setReturnParameter(RETURN_VALUE);
	}
}
