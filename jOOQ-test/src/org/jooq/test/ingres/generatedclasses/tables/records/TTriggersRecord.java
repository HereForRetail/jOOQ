/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -281635050;

	/**
	 * The table column <code>test.t_triggers.id_generated</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setIdGenerated(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TTriggers.ID_GENERATED, value);
	}

	/**
	 * The table column <code>test.t_triggers.id_generated</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getIdGenerated() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TTriggers.ID_GENERATED);
	}

	/**
	 * The table column <code>test.t_triggers.id</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TTriggers.ID, value);
	}

	/**
	 * The table column <code>test.t_triggers.id</code>
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TTriggers.ID);
	}

	/**
	 * The table column <code>test.t_triggers.counter</code>
	 */
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TTriggers.COUNTER, value);
	}

	/**
	 * The table column <code>test.t_triggers.counter</code>
	 */
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TTriggers.COUNTER);
	}

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.ingres.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}
}
