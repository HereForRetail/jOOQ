/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IT_785 {

	private static final long serialVersionUID = -1554890130;

	/**
	 * The table column <code>PUBLIC.T_785.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.T_785.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785.ID);
	}

	/**
	 * The table column <code>PUBLIC.T_785.NAME</code>
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785.NAME, value);
	}

	/**
	 * The table column <code>PUBLIC.T_785.NAME</code>
	 */
	@Override
	public java.lang.String getName() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785.NAME);
	}

	/**
	 * The table column <code>PUBLIC.T_785.VALUE</code>
	 */
	@Override
	public void setValue(java.lang.String value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785.VALUE, value);
	}

	/**
	 * The table column <code>PUBLIC.T_785.VALUE</code>
	 */
	@Override
	public java.lang.String getValue() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785.VALUE);
	}

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.T_785.T_785);
	}
}
