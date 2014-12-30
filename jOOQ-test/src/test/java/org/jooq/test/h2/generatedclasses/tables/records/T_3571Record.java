/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.T_3571;
import org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3571;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3571Record extends TableRecordImpl<T_3571Record> implements Record4<org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571>, IT_3571 {

	private static final long serialVersionUID = 605468503;

	/**
	 * Setter for <code>PUBLIC.T_3571.E1</code>.
	 */
	@Override
	public T_3571Record setE1(org.jooq.test.all.converters.T_3571 value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_3571.E1</code>.
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 getE1() {
		return (org.jooq.test.all.converters.T_3571) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_3571.E2</code>.
	 */
	@Override
	public T_3571Record setE2(org.jooq.test.all.converters.T_3571 value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_3571.E2</code>.
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 getE2() {
		return (org.jooq.test.all.converters.T_3571) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_3571.E3</code>.
	 */
	@Override
	public T_3571Record setE3(org.jooq.test.all.converters.T_3571 value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_3571.E3</code>.
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 getE3() {
		return (org.jooq.test.all.converters.T_3571) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_3571.E4</code>.
	 */
	@Override
	public T_3571Record setE4(org.jooq.test.all.converters.T_3571 value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_3571.E4</code>.
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 getE4() {
		return (org.jooq.test.all.converters.T_3571) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571, org.jooq.test.all.converters.T_3571> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<org.jooq.test.all.converters.T_3571> field1() {
		return T_3571.T_3571.E1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<org.jooq.test.all.converters.T_3571> field2() {
		return T_3571.T_3571.E2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<org.jooq.test.all.converters.T_3571> field3() {
		return T_3571.T_3571.E3;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<org.jooq.test.all.converters.T_3571> field4() {
		return T_3571.T_3571.E4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 value1() {
		return getE1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 value2() {
		return getE2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 value3() {
		return getE3();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.all.converters.T_3571 value4() {
		return getE4();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3571Record value1(org.jooq.test.all.converters.T_3571 value) {
		setE1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3571Record value2(org.jooq.test.all.converters.T_3571 value) {
		setE2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3571Record value3(org.jooq.test.all.converters.T_3571 value) {
		setE3(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3571Record value4(org.jooq.test.all.converters.T_3571 value) {
		setE4(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_3571Record values(org.jooq.test.all.converters.T_3571 value1, org.jooq.test.all.converters.T_3571 value2, org.jooq.test.all.converters.T_3571 value3, org.jooq.test.all.converters.T_3571 value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IT_3571 from) {
		setE1(from.getE1());
		setE2(from.getE2());
		setE3(from.getE3());
		setE4(from.getE4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IT_3571> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_3571Record
	 */
	public T_3571Record() {
		super(T_3571.T_3571);
	}

	/**
	 * Create a detached, initialised T_3571Record
	 */
	public T_3571Record(org.jooq.test.all.converters.T_3571 e1, org.jooq.test.all.converters.T_3571 e2, org.jooq.test.all.converters.T_3571 e3, org.jooq.test.all.converters.T_3571 e4) {
		super(T_3571.T_3571);

		setValue(0, e1);
		setValue(1, e2);
		setValue(2, e3);
		setValue(3, e4);
	}
}
