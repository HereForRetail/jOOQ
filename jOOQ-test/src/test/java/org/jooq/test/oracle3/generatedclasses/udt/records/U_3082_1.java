/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;


import java.math.BigDecimal;
import java.util.List;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_1_INTERFACE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_3082_1 extends UDTRecordImpl<U_3082_1> implements Cloneable, Record2<BigDecimal, U_NUMBER_TABLE>, U_3082_1_INTERFACE {

	private static final long serialVersionUID = 1857665768;

	/**
	 * Setter for <code>U_3082_1.N</code>.
	 */
	@Override
	public void setN(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>U_3082_1.N</code>.
	 */
	@Override
	public BigDecimal getN() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>U_3082_1.NUMBERS</code>.
	 */
	@Override
	public void setNUMBERS(List<Integer> value) {
		if (value == null)
			setValue(1, null);
		else {
			U_NUMBER_TABLE a = new U_NUMBER_TABLE();

			for (Integer i : value)
				a.add(i);

			setValue(1, a);
		}
	}

	/**
	 * Getter for <code>U_3082_1.NUMBERS</code>.
	 */
	@Override
	public U_NUMBER_TABLE getNUMBERS() {
		return (U_NUMBER_TABLE) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigDecimal, U_NUMBER_TABLE> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigDecimal, U_NUMBER_TABLE> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_3082_1.N;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<U_NUMBER_TABLE> field2() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_3082_1.NUMBERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value1() {
		return getN();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_NUMBER_TABLE value2() {
		return getNUMBERS();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_1 value1(BigDecimal value) {
		setN(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_1 value2(U_NUMBER_TABLE value) {
		setNUMBERS(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_1 values(BigDecimal value1, U_NUMBER_TABLE value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(U_3082_1_INTERFACE from) {
		setN(from.getN());
		setNUMBERS(from.getNUMBERS());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends U_3082_1_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_3082_1
	 */
	public U_3082_1() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_3082_1.U_3082_1);
	}

	/**
	 * Create a detached, initialised U_3082_1
	 */
	public U_3082_1(BigDecimal N, U_NUMBER_TABLE NUMBERS) {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_3082_1.U_3082_1);

		setValue(0, N);
		setValue(1, NUMBERS);
	}
}
