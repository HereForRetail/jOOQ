/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_877Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.T_877Record> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.IT_877 {

	private static final long serialVersionUID = -145481039;

	/**
	 * Setter for <code>PUBLIC.T_877.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.T_877.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_877.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.T_877.ID);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.T_877.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_877Record
	 */
	public T_877Record() {
		super(org.jooq.test.h2.generatedclasses.tables.T_877.T_877);
	}
}
