/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;


import java.io.Serializable;

import org.jooq.test.all.converters.T_3571;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IT_3571 extends Serializable {

	/**
	 * Setter for <code>PUBLIC.T_3571.E1</code>.
	 */
	public IT_3571 setE1(T_3571 value);

	/**
	 * Getter for <code>PUBLIC.T_3571.E1</code>.
	 */
	public T_3571 getE1();

	/**
	 * Setter for <code>PUBLIC.T_3571.E2</code>.
	 */
	public IT_3571 setE2(T_3571 value);

	/**
	 * Getter for <code>PUBLIC.T_3571.E2</code>.
	 */
	public T_3571 getE2();

	/**
	 * Setter for <code>PUBLIC.T_3571.E3</code>.
	 */
	public IT_3571 setE3(T_3571 value);

	/**
	 * Getter for <code>PUBLIC.T_3571.E3</code>.
	 */
	public T_3571 getE3();

	/**
	 * Setter for <code>PUBLIC.T_3571.E4</code>.
	 */
	public IT_3571 setE4(T_3571 value);

	/**
	 * Getter for <code>PUBLIC.T_3571.E4</code>.
	 */
	public T_3571 getE4();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_3571
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3571 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_3571
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3571> E into(E into);
}
