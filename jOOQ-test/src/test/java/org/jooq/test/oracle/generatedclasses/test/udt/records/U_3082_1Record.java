/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.udt.U_3082_1;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_3082_1Record extends UDTRecordImpl<U_3082_1Record> implements Record2<BigDecimal, UNumberTableRecord> {

	private static final long serialVersionUID = -86196636;

	/**
	 * Setter for <code>TEST.U_3082_1.N</code>.
	 */
	public void setN(BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.U_3082_1.N</code>.
	 */
	public BigDecimal getN() {
		return (BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>TEST.U_3082_1.NUMBERS</code>.
	 */
	public void setNumbers(UNumberTableRecord value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.U_3082_1.NUMBERS</code>.
	 */
	public UNumberTableRecord getNumbers() {
		return (UNumberTableRecord) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigDecimal, UNumberTableRecord> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<BigDecimal, UNumberTableRecord> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field1() {
		return U_3082_1.N;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UNumberTableRecord> field2() {
		return U_3082_1.NUMBERS;
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
	public UNumberTableRecord value2() {
		return getNumbers();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_1Record value1(BigDecimal value) {
		setN(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_1Record value2(UNumberTableRecord value) {
		setNumbers(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_3082_1Record values(BigDecimal value1, UNumberTableRecord value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_3082_1Record
	 */
	public U_3082_1Record() {
		super(U_3082_1.U_3082_1);
	}

	/**
	 * Create a detached, initialised U_3082_1Record
	 */
	public U_3082_1Record(BigDecimal n, UNumberTableRecord numbers) {
		super(U_3082_1.U_3082_1);

		setValue(0, n);
		setValue(1, numbers);
	}
}
