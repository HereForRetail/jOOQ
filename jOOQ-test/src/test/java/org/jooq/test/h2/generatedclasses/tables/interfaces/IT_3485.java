/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IT_3485 extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_3485.ID</code>.
	 */
	public IT_3485 setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_3485.ID</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_3485.PW</code>.
	 */
	public IT_3485 setPw(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_3485.PW</code>.
	 */
	public java.lang.String getPw();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_3485
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3485 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_3485
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3485> E into(E into);
}
