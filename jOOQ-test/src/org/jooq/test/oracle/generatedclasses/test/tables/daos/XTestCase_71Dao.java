/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_71Dao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record, org.jooq.test.oracle.generatedclasses.test.tables.pojos.XTestCase_71, java.lang.Integer> {

	/**
	 * Create a new XTestCase_71Dao without any factory
	 */
	public XTestCase_71Dao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.oracle.generatedclasses.test.tables.pojos.XTestCase_71.class);
	}

	/**
	 * Create a new XTestCase_71Dao with an attached factory
	 */
	public XTestCase_71Dao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.oracle.generatedclasses.test.tables.pojos.XTestCase_71.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.XTestCase_71 object) {
		return object.getId();
	}
}
