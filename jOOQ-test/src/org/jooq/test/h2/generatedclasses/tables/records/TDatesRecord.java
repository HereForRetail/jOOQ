/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TDatesRecord> implements org.jooq.Record6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long>, org.jooq.test.h2.generatedclasses.tables.interfaces.ITDates {

	private static final long serialVersionUID = 2024706677;

	/**
	 * Setter for <code>PUBLIC.T_DATES.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(org.jooq.test.h2.generatedclasses.tables.TDates.ID);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.D</code>. 
	 */
	@Override
	public void setD(java.sql.Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.D</code>. 
	 */
	@Override
	public java.sql.Date getD() {
		return (java.sql.Date) getValue(org.jooq.test.h2.generatedclasses.tables.TDates.D);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.T</code>. 
	 */
	@Override
	public void setT(java.sql.Time value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.T</code>. 
	 */
	@Override
	public java.sql.Time getT() {
		return (java.sql.Time) getValue(org.jooq.test.h2.generatedclasses.tables.TDates.T);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.TS</code>. 
	 */
	@Override
	public void setTs(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.TS</code>. 
	 */
	@Override
	public java.sql.Timestamp getTs() {
		return (java.sql.Timestamp) getValue(org.jooq.test.h2.generatedclasses.tables.TDates.TS);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.D_INT</code>. 
	 */
	@Override
	public void setDInt(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.D_INT</code>. 
	 */
	@Override
	public java.lang.Integer getDInt() {
		return (java.lang.Integer) getValue(org.jooq.test.h2.generatedclasses.tables.TDates.D_INT);
	}

	/**
	 * Setter for <code>PUBLIC.T_DATES.TS_BIGINT</code>. 
	 */
	@Override
	public void setTsBigint(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_DATES.TS_BIGINT</code>. 
	 */
	@Override
	public java.lang.Long getTsBigint() {
		return (java.lang.Long) getValue(org.jooq.test.h2.generatedclasses.tables.TDates.TS_BIGINT);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.TDates.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.h2.generatedclasses.tables.TDates.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field3() {
		return org.jooq.test.h2.generatedclasses.tables.TDates.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.h2.generatedclasses.tables.TDates.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.h2.generatedclasses.tables.TDates.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.h2.generatedclasses.tables.TDates.TS_BIGINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getTsBigint();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITDates from) {
		setId(from.getId());
		setD(from.getD());
		setT(from.getT());
		setTs(from.getTs());
		setDInt(from.getDInt());
		setTsBigint(from.getTsBigint());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITDates> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TDates.T_DATES);
	}
}
