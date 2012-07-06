/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
public interface ITArrays extends java.io.Serializable {

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId();

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>
	 */
	public void setStringArray(java.lang.String[] value);

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>
	 */
	public java.lang.String[] getStringArray();

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	public void setNumberArray(java.lang.Integer[] value);

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	public java.lang.Integer[] getNumberArray();

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>
	 */
	public void setDateArray(java.sql.Date[] value);

	/**
	 * The table column <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>
	 */
	public java.sql.Date[] getDateArray();
}
