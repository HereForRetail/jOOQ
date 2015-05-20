/**
 * This class is generated by jOOQ
 */
package org.jooq.test.vertica.generatedclasses.tables.records;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.vertica.generatedclasses.tables.TDates;
import org.jooq.test.vertica.generatedclasses.tables.interfaces.ITDates;
import org.jooq.types.YearToMonth;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDatesRecord extends UpdatableRecordImpl<TDatesRecord> implements Record8<Integer, Date, Time, Timestamp, Integer, Integer, YearToMonth, Object>, ITDates {

	private static final long serialVersionUID = -1020866049;

	/**
	 * Setter for <code>public.t_dates.id</code>.
	 */
	@Override
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.t_dates.id</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_dates.d</code>.
	 */
	@Override
	public void setD(Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.t_dates.d</code>.
	 */
	@Override
	public Date getD() {
		return (Date) getValue(1);
	}

	/**
	 * Setter for <code>public.t_dates.t</code>.
	 */
	@Override
	public void setT(Time value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.t_dates.t</code>.
	 */
	@Override
	public Time getT() {
		return (Time) getValue(2);
	}

	/**
	 * Setter for <code>public.t_dates.ts</code>.
	 */
	@Override
	public void setTs(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.t_dates.ts</code>.
	 */
	@Override
	public Timestamp getTs() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.t_dates.d_int</code>.
	 */
	@Override
	public void setDInt(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.t_dates.d_int</code>.
	 */
	@Override
	public Integer getDInt() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.t_dates.ts_bigint</code>.
	 */
	@Override
	public void setTsBigint(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.t_dates.ts_bigint</code>.
	 */
	@Override
	public Integer getTsBigint() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.t_dates.i_y</code>.
	 */
	@Override
	public void setIY(YearToMonth value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.t_dates.i_y</code>.
	 */
	@Override
	public YearToMonth getIY() {
		return (YearToMonth) getValue(6);
	}

	/**
	 * Setter for <code>public.t_dates.i_d</code>.
	 */
	@Override
	public void setID(Object value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.t_dates.i_d</code>.
	 */
	@Override
	public Object getID() {
		return (Object) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Date, Time, Timestamp, Integer, Integer, YearToMonth, Object> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, Date, Time, Timestamp, Integer, Integer, YearToMonth, Object> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TDates.T_DATES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field2() {
		return TDates.T_DATES.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Time> field3() {
		return TDates.T_DATES.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return TDates.T_DATES.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return TDates.T_DATES.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return TDates.T_DATES.TS_BIGINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<YearToMonth> field7() {
		return TDates.T_DATES.I_Y;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Object> field8() {
		return TDates.T_DATES.I_D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Time value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getTsBigint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public YearToMonth value7() {
		return getIY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object value8() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value2(Date value) {
		setD(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value3(Time value) {
		setT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value4(Timestamp value) {
		setTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value5(Integer value) {
		setDInt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value6(Integer value) {
		setTsBigint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value7(YearToMonth value) {
		setIY(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value8(Object value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord values(Integer value1, Date value2, Time value3, Timestamp value4, Integer value5, Integer value6, YearToMonth value7, Object value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITDates from) {
		setId(from.getId());
		setD(from.getD());
		setT(from.getT());
		setTs(from.getTs());
		setDInt(from.getDInt());
		setTsBigint(from.getTsBigint());
		setIY(from.getIY());
		setID(from.getID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITDates> E into(E into) {
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
		super(TDates.T_DATES);
	}

	/**
	 * Create a detached, initialised TDatesRecord
	 */
	public TDatesRecord(Integer id, Date d, Time t, Timestamp ts, Integer dInt, Integer tsBigint, YearToMonth iY, Object iD) {
		super(TDates.T_DATES);

		setValue(0, id);
		setValue(1, d);
		setValue(2, t);
		setValue(3, ts);
		setValue(4, dInt);
		setValue(5, tsBigint);
		setValue(6, iY);
		setValue(7, iD);
	}
}
