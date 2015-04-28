/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.TInheritanceAll;
import org.jooq.test.postgres.generatedclasses.tables.interfaces.ITInheritanceAll;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritanceAllRecord extends TableRecordImpl<TInheritanceAllRecord> implements Record4<String, String, String, String>, ITInheritanceAll {

	private static final long serialVersionUID = -1135614502;

	/**
	 * Setter for <code>public.t_inheritance_all.text_1</code>.
	 */
	public TInheritanceAllRecord setText_1(String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_all.text_1</code>.
	 */
	@Override
	public String getText_1() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_inheritance_all.text_1_1</code>.
	 */
	public TInheritanceAllRecord setText_1_1(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_all.text_1_1</code>.
	 */
	@Override
	public String getText_1_1() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.t_inheritance_all.text_1_2</code>.
	 */
	public TInheritanceAllRecord setText_1_2(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_all.text_1_2</code>.
	 */
	@Override
	public String getText_1_2() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.t_inheritance_all.text_1_all</code>.
	 */
	public TInheritanceAllRecord setText_1All(String value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_inheritance_all.text_1_all</code>.
	 */
	@Override
	public String getText_1All() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<String, String, String, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return TInheritanceAll.T_INHERITANCE_ALL.TEXT_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TInheritanceAll.T_INHERITANCE_ALL.TEXT_1_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TInheritanceAll.T_INHERITANCE_ALL.TEXT_1_2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TInheritanceAll.T_INHERITANCE_ALL.TEXT_1_ALL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getText_1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getText_1_1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getText_1_2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getText_1All();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInheritanceAllRecord value1(String value) {
		setText_1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInheritanceAllRecord value2(String value) {
		setText_1_1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInheritanceAllRecord value3(String value) {
		setText_1_2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInheritanceAllRecord value4(String value) {
		setText_1All(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TInheritanceAllRecord values(String value1, String value2, String value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TInheritanceAllRecord
	 */
	public TInheritanceAllRecord() {
		super(TInheritanceAll.T_INHERITANCE_ALL);
	}

	/**
	 * Create a detached, initialised TInheritanceAllRecord
	 */
	public TInheritanceAllRecord(String text_1, String text_1_1, String text_1_2, String text_1All) {
		super(TInheritanceAll.T_INHERITANCE_ALL);

		setValue(0, text_1);
		setValue(1, text_1_1);
		setValue(2, text_1_2);
		setValue(3, text_1All);
	}
}
