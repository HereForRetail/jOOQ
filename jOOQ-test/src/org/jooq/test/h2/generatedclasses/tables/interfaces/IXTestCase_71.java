/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public interface IXTestCase_71 extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.ID</code>. 
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public void setTestCase_64_69Id(java.lang.Short value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public java.lang.Short getTestCase_64_69Id();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_71
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_71
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71> E into(E into);
}
