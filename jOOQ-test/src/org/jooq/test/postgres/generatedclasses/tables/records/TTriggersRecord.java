/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_triggers", schema = "public")
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -2014900986;

	/**
	 * Setter for <code>public.t_triggers.id_generated</code>. 
	 */
	public void setIdGenerated(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED, value);
	}

	/**
	 * Getter for <code>public.t_triggers.id_generated</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id_generated", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getIdGenerated() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	}

	/**
	 * Setter for <code>public.t_triggers.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.ID, value);
	}

	/**
	 * Getter for <code>public.t_triggers.id</code>. 
	 */
	@javax.persistence.Column(name = "id", precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.ID);
	}

	/**
	 * Setter for <code>public.t_triggers.counter</code>. 
	 */
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER, value);
	}

	/**
	 * Getter for <code>public.t_triggers.counter</code>. 
	 */
	@javax.persistence.Column(name = "counter", precision = 32)
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCounter();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}
}
