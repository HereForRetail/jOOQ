/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;


import java.util.List;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_1_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_3_INTERFACE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_3082_3 extends UDTRecordImpl<U_3082_3> implements Cloneable, Record3<U_3082_1, U_3082_2, U_NUMBER_TABLE>, U_3082_3_INTERFACE {

	private static final long serialVersionUID = 287181273;

	/**
	 * Setter for <code>U_3082_3.O</code>.
	 */
	public void setO(U_3082_1 value) {
		setValue(0, value);
	}

	/**
	 * Setter for <code>U_3082_3.O</code>.
	 */
	@Override
	public void setO(U_3082_1_INTERFACE value) {
		if (value == null)
			setValue(0, null);
		else
			setValue(0, value.into(new U_3082_1()));
	}

	/**
	 * Getter for <code>U_3082_3.O</code>.
	 */
	@Override
	public U_3082_1 getO() {
		return (U_3082_1) getValue(0);
	}

	/**
	 * Setter for <code>U_3082_3.T</code>.
	 */
	@Override
	public void setT(List<? extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_1_INTERFACE> value) {
		if (value == null)
			setValue(1, null);
		else {
			U_3082_2 a = new U_3082_2();

			for (U_3082_1_INTERFACE i : value)
				a.add(i.into(new U_3082_1()));

			setValue(1, a);
		}
	}

	/**
	 * Getter for <code>U_3082_3.T</code>.
	 */
	@Override
	public U_3082_2 getT() {
		return (U_3082_2) getValue(1);
	}

	/**
	 * Setter for <code>U_3082_3.NUMBERS</code>.
	 */
	@Override
	public void setNUMBERS(List<Integer> value) {
		if (value == null)
			setValue(2, null);
		else {
			U_NUMBER_TABLE a = new U_NUMBER_TABLE();

			for (Integer i : value)
				a.add(i);

			setValue(1, a);
		}
	}

	/**
	 * Getter for <code>U_3082_3.NUMBERS</code>.
	 */
	@Override
	public U_NUMBER_TABLE getNUMBERS() {
		return (U_NUMBER_TABLE) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<U_3082_1, U_3082_2, U_NUMBER_TABLE> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<U_3082_1, U_3082_2, U_NUMBER_TABLE> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<U_3082_1> field1() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_3082_3.O;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<U_3082_2> field2() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_3082_3.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<U_NUMBER_TABLE> field3() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_3082_3.NUMBERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_1 value1() {
		return getO();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_2 value2() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_NUMBER_TABLE value3() {
		return getNUMBERS();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_3 value1(U_3082_1 value) {
		setO(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_3 value2(U_3082_2 value) {
		setT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_3 value3(U_NUMBER_TABLE value) {
		setNUMBERS(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_3 values(U_3082_1 value1, U_3082_2 value2, U_NUMBER_TABLE value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(U_3082_3_INTERFACE from) {
		setO(from.getO());
		setT(from.getT());
		setNUMBERS(from.getNUMBERS());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends U_3082_3_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_3082_3
	 */
	public U_3082_3() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_3082_3.U_3082_3);
	}

	/**
	 * Create a detached, initialised U_3082_3
	 */
	public U_3082_3(U_3082_1 O, U_3082_2 T, U_NUMBER_TABLE NUMBERS) {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_3082_3.U_3082_3);

		setValue(0, O);
		setValue(1, T);
		setValue(2, NUMBERS);
	}
}
