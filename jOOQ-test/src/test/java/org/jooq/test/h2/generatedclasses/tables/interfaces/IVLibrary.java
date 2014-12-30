/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IVLibrary extends Serializable {

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>.
	 */
	public IVLibrary setAuthor(String value);

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.AUTHOR</code>.
	 */
	public String getAuthor();

	/**
	 * Setter for <code>PUBLIC.V_LIBRARY.TITLE</code>.
	 */
	public IVLibrary setTitle(String value);

	/**
	 * Getter for <code>PUBLIC.V_LIBRARY.TITLE</code>.
	 */
	public String getTitle();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IVLibrary
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IVLibrary from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IVLibrary
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IVLibrary> E into(E into);
}
