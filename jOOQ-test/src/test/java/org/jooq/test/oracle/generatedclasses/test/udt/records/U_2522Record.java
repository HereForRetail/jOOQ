/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row;
import org.jooq.Row1;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.udt.U_2522;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_2522Record extends UDTRecordImpl<U_2522Record> implements Record1<Integer> {

	private static final long serialVersionUID = 223467712;

	/**
	 * Setter for <code>TEST.U_2522.V</code>.
	 */
	public void setV(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.U_2522.V</code>.
	 */
	public Integer getV() {
		return (Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return U_2522.V;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getV();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2522Record value1(Integer value) {
		setV(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_2522Record values(Integer value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_2522Record
	 */
	public U_2522Record() {
		super(U_2522.U_2522);
	}

	/**
	 * Create a detached, initialised U_2522Record
	 */
	public U_2522Record(Integer v) {
		super(U_2522.U_2522);

		setValue(0, v);
	}
}
