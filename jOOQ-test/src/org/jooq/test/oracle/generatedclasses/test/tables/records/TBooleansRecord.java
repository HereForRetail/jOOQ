/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOLEANS", schema = "TEST")
public class TBooleansRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = -829264375;

	/**
	 * Setter for <code>TEST.T_BOOLEANS.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ID, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ID);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.ONE_ZERO</code>. 
	 */
	public void setOneZero(org.jooq.test._.converters.Boolean_10 value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ONE_ZERO, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.ONE_ZERO</code>. 
	 */
	@javax.persistence.Column(name = "ONE_ZERO", precision = 7)
	public org.jooq.test._.converters.Boolean_10 getOneZero() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ONE_ZERO);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.TRUE_FALSE_LC</code>. 
	 */
	public void setTrueFalseLc(org.jooq.test._.converters.Boolean_TF_LC value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_LC, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.TRUE_FALSE_LC</code>. 
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_LC", length = 5)
	public org.jooq.test._.converters.Boolean_TF_LC getTrueFalseLc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_LC);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.TRUE_FALSE_UC</code>. 
	 */
	public void setTrueFalseUc(org.jooq.test._.converters.Boolean_TF_UC value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_UC, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.TRUE_FALSE_UC</code>. 
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_UC", length = 5)
	public org.jooq.test._.converters.Boolean_TF_UC getTrueFalseUc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.TRUE_FALSE_UC);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.YES_NO_LC</code>. 
	 */
	public void setYesNoLc(org.jooq.test._.converters.Boolean_YES_NO_LC value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_LC, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.YES_NO_LC</code>. 
	 */
	@javax.persistence.Column(name = "YES_NO_LC", length = 3)
	public org.jooq.test._.converters.Boolean_YES_NO_LC getYesNoLc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_LC);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.YES_NO_UC</code>. 
	 */
	public void setYesNoUc(org.jooq.test._.converters.Boolean_YES_NO_UC value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_UC, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.YES_NO_UC</code>. 
	 */
	@javax.persistence.Column(name = "YES_NO_UC", length = 3)
	public org.jooq.test._.converters.Boolean_YES_NO_UC getYesNoUc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.YES_NO_UC);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.Y_N_LC</code>. 
	 */
	public void setYNLc(org.jooq.test._.converters.Boolean_YN_LC value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_LC, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.Y_N_LC</code>. 
	 */
	@javax.persistence.Column(name = "Y_N_LC", length = 1)
	public org.jooq.test._.converters.Boolean_YN_LC getYNLc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_LC);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.Y_N_UC</code>. 
	 */
	public void setYNUc(org.jooq.test._.converters.Boolean_YN_UC value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_UC, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.Y_N_UC</code>. 
	 */
	@javax.persistence.Column(name = "Y_N_UC", length = 1)
	public org.jooq.test._.converters.Boolean_YN_UC getYNUc() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.Y_N_UC);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.VC_BOOLEAN</code>. 
	 */
	public void setVcBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.VC_BOOLEAN, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.VC_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "VC_BOOLEAN", length = 1)
	public java.lang.Boolean getVcBoolean() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.VC_BOOLEAN);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.C_BOOLEAN</code>. 
	 */
	public void setCBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.C_BOOLEAN, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.C_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "C_BOOLEAN", length = 1)
	public java.lang.Boolean getCBoolean() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.C_BOOLEAN);
	}

	/**
	 * Setter for <code>TEST.T_BOOLEANS.N_BOOLEAN</code>. 
	 */
	public void setNBoolean(java.lang.Boolean value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.N_BOOLEAN, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOLEANS.N_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "N_BOOLEAN", precision = 7)
	public java.lang.Boolean getNBoolean() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.N_BOOLEAN);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBooleansRecord
	 */
	public TBooleansRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS);
	}
}
