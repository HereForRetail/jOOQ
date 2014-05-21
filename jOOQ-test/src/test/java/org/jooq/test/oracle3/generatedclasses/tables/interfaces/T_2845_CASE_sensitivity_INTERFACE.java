/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_2845_CASE_sensitivity", schema = "TEST")
public interface T_2845_CASE_sensitivity_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.ID</code>.
	 */
	public void setID(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.ID</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 22)
	public java.math.BigDecimal getID();

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	public void setINSENSITIVE(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	@javax.persistence.Column(name = "INSENSITIVE", length = 22)
	public java.math.BigDecimal getINSENSITIVE();

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	public void setUPPER(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	@javax.persistence.Column(name = "UPPER", length = 22)
	public java.math.BigDecimal getUPPER();

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.lower</code>.
	 */
	public void setlower(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.lower</code>.
	 */
	@javax.persistence.Column(name = "lower", length = 22)
	public java.math.BigDecimal getlower();

	/**
	 * Setter for <code>TEST.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	public void setMixed(java.math.BigDecimal value);

	/**
	 * Getter for <code>TEST.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	@javax.persistence.Column(name = "Mixed", length = 22)
	public java.math.BigDecimal getMixed();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_2845_CASE_sensitivity_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_2845_CASE_sensitivity_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_2845_CASE_sensitivity_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_2845_CASE_sensitivity_INTERFACE> E into(E into);
}
