/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class XTestCase_64_69Dao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_64_69, java.lang.Integer> {

	/**
	 * Create a new XTestCase_64_69Dao without any configuration
	 */
	public XTestCase_64_69Dao() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_64_69.class);
	}

	/**
	 * Create a new XTestCase_64_69Dao with an attached configuration
	 */
	public XTestCase_64_69Dao(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_64_69.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_64_69 object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_64_69> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_64_69 fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * Fetch records that have <code>UNUSED_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XTestCase_64_69> fetchByUnusedId(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, values);
	}
}
