/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IT_3488AbcXyzEee extends Serializable {

	/**
	 * Setter for <code>PUBLIC.T_3488_ABC_XYZ_EEE.ID</code>.
	 */
	public IT_3488AbcXyzEee setId(Integer value);

	/**
	 * Getter for <code>PUBLIC.T_3488_ABC_XYZ_EEE.ID</code>.
	 */
	public Integer getId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_3488AbcXyzEee
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3488AbcXyzEee from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_3488AbcXyzEee
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_3488AbcXyzEee> E into(E into);
}
