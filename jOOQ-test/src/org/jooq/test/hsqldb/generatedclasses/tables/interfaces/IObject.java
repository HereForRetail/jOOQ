/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public interface IObject extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.OBJECT.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.OBJECT.ID</code>. 
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.OBJECT.OTHER</code>. 
	 */
	public void setOther(java.lang.Object value);

	/**
	 * Getter for <code>PUBLIC.OBJECT.OTHER</code>. 
	 */
	public java.lang.Object getOther();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IObject
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IObject from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IObject
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IObject> E into(E into);
}
