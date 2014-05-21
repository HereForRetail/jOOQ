/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR", schema = "TEST")
public class V_AUTHOR extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_AUTHOR> implements java.lang.Cloneable, org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_AUTHOR_INTERFACE {

	private static final long serialVersionUID = -1206373480;

	/**
	 * Setter for <code>TEST.V_AUTHOR.ID</code>.
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.V_AUTHOR.ID</code>.
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.V_AUTHOR.FIRST_NAME</code>.
	 */
	@Override
	public void setFIRST_NAME(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.V_AUTHOR.FIRST_NAME</code>.
	 */
	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	@Override
	public java.lang.String getFIRST_NAME() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>TEST.V_AUTHOR.LAST_NAME</code>.
	 */
	@Override
	public void setLAST_NAME(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.V_AUTHOR.LAST_NAME</code>.
	 */
	@javax.persistence.Column(name = "LAST_NAME", nullable = false, length = 50)
	@Override
	public java.lang.String getLAST_NAME() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	@Override
	public void setDATE_OF_BIRTH(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 7)
	@Override
	public java.sql.Date getDATE_OF_BIRTH() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	@Override
	public void setYEAR_OF_BIRTH(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH", precision = 7)
	@Override
	public java.lang.Integer getYEAR_OF_BIRTH() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>TEST.V_AUTHOR.ADDRESS</code>.
	 */
	@Override
	public void setADDRESS(org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.V_AUTHOR.ADDRESS</code>.
	 */
	@javax.persistence.Column(name = "ADDRESS", length = 40)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE getADDRESS() {
		return (org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> field6() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.ADDRESS;
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
		return getFIRST_NAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLAST_NAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDATE_OF_BIRTH();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYEAR_OF_BIRTH();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value6() {
		return getADDRESS();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value1(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value2(java.lang.String value) {
		setFIRST_NAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value3(java.lang.String value) {
		setLAST_NAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value4(java.sql.Date value) {
		setDATE_OF_BIRTH(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value5(java.lang.Integer value) {
		setYEAR_OF_BIRTH(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value6(org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value) {
		setADDRESS(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.sql.Date value4, java.lang.Integer value5, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_AUTHOR_INTERFACE from) {
		setID(from.getID());
		setFIRST_NAME(from.getFIRST_NAME());
		setLAST_NAME(from.getLAST_NAME());
		setDATE_OF_BIRTH(from.getDATE_OF_BIRTH());
		setYEAR_OF_BIRTH(from.getYEAR_OF_BIRTH());
		setADDRESS(from.getADDRESS());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_AUTHOR_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V_AUTHOR
	 */
	public V_AUTHOR() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR);
	}

	/**
	 * Create a detached, initialised V_AUTHOR
	 */
	public V_AUTHOR(java.lang.Integer ID, java.lang.String FIRST_NAME, java.lang.String LAST_NAME, java.sql.Date DATE_OF_BIRTH, java.lang.Integer YEAR_OF_BIRTH, org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE ADDRESS) {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR);

		setValue(0, ID);
		setValue(1, FIRST_NAME);
		setValue(2, LAST_NAME);
		setValue(3, DATE_OF_BIRTH);
		setValue(4, YEAR_OF_BIRTH);
		setValue(5, ADDRESS);
	}
}
