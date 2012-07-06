/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_85Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 954693336;

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.ID);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setXUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.Integer getXUnusedId() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public org.jooq.test.derby.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.derby.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.derby.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_ID)))
			.and(org.jooq.test.derby.generatedclasses.tables.XUnused.NAME.equal(getValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setXUnusedName(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.String getXUnusedName() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
	}

	/**
	 * Create a detached XTestCase_85Record
	 */
	public XTestCase_85Record() {
		super(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85);
	}
}
