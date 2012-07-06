/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = -1038382558;

	/**
	 * The table column <code>test.x_test_case_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.ID, value);
	}

	/**
	 * The table column <code>test.x_test_case_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.ID);
	}

	/**
	 * The table column <code>test.x_test_case_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES test.x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	public void setTestCase_64_69Id(java.lang.Integer value) {
		setValue(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * The table column <code>test.x_test_case_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES test.x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getTestCase_64_69Id() {
		return getValue(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	}

	/**
	 * The table column <code>test.x_test_case_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_x_test_case_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES test.x_test_case_64_69 (ID)
	 * </pre></code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record fetchXTestCase_64_69() {
		return create()
			.selectFrom(org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69.ID.equal(getValue(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.mysql.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}
}
