/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_785", schema = "TEST")
public class T_785 extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_785> implements java.lang.Cloneable, org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_785_INTERFACE {

	private static final long serialVersionUID = -993952173;

	/**
	 * Setter for <code>TEST.T_785.ID</code>.
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_785.ID</code>.
	 */
	@javax.persistence.Column(name = "ID", precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_785.NAME</code>.
	 */
	@Override
	public void setNAME(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_785.NAME</code>.
	 */
	@javax.persistence.Column(name = "NAME", length = 50)
	@Override
	public java.lang.String getNAME() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_785.VALUE</code>.
	 */
	@Override
	public void setVALUE(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_785.VALUE</code>.
	 */
	@javax.persistence.Column(name = "VALUE", length = 50)
	@Override
	public java.lang.String getVALUE() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_785.T_785.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_785.T_785.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_785.T_785.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getNAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getVALUE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_785 value1(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_785 value2(java.lang.String value) {
		setNAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_785 value3(java.lang.String value) {
		setVALUE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_785 values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_785_INTERFACE from) {
		setID(from.getID());
		setNAME(from.getNAME());
		setVALUE(from.getVALUE());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_785_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_785
	 */
	public T_785() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_785.T_785);
	}

	/**
	 * Create a detached, initialised T_785
	 */
	public T_785(java.lang.Integer ID, java.lang.String NAME, java.lang.String VALUE) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_785.T_785);

		setValue(0, ID);
		setValue(1, NAME);
		setValue(2, VALUE);
	}
}
