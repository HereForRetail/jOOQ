/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;


import java.io.Serializable;
import java.sql.Date;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVAuthor extends Serializable {

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.ID</code>.
	 */
	public IVAuthor setId(Integer value);

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.ID</code>.
	 */
	public Integer getId();

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.FIRST_NAME</code>.
	 */
	public IVAuthor setFirstName(String value);

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.FIRST_NAME</code>.
	 */
	public String getFirstName();

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.LAST_NAME</code>.
	 */
	public IVAuthor setLastName(String value);

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.LAST_NAME</code>.
	 */
	public String getLastName();

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public IVAuthor setDateOfBirth(Date value);

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	public Date getDateOfBirth();

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public IVAuthor setYearOfBirth(Integer value);

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	public Integer getYearOfBirth();

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.ADDRESS</code>.
	 */
	public IVAuthor setAddress(String value);

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.ADDRESS</code>.
	 */
	public String getAddress();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IVAuthor
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IVAuthor from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IVAuthor
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IVAuthor> E into(E into);
}
