/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_LANGUAGE", schema = "TEST")
public class T_LANGUAGE_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE {

	private static final long serialVersionUID = -793600651;

	private java.lang.String  CD;
	private java.lang.String  DESCRIPTION;
	private java.lang.String  DESCRIPTION_ENGLISH;
	private java.lang.Integer ID;

	public T_LANGUAGE_POJO() {}

	public T_LANGUAGE_POJO(
		java.lang.String  CD,
		java.lang.String  DESCRIPTION,
		java.lang.String  DESCRIPTION_ENGLISH,
		java.lang.Integer ID
	) {
		this.CD = CD;
		this.DESCRIPTION = DESCRIPTION;
		this.DESCRIPTION_ENGLISH = DESCRIPTION_ENGLISH;
		this.ID = ID;
	}

	@javax.persistence.Column(name = "CD", nullable = false, length = 2)
	@Override
	public java.lang.String getCD() {
		return this.CD;
	}

	@Override
	public void setCD(java.lang.String CD) {
		this.CD = CD;
	}

	@javax.persistence.Column(name = "DESCRIPTION", length = 50)
	@Override
	public java.lang.String getDESCRIPTION() {
		return this.DESCRIPTION;
	}

	@Override
	public void setDESCRIPTION(java.lang.String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}

	@javax.persistence.Column(name = "DESCRIPTION_ENGLISH", length = 50)
	@Override
	public java.lang.String getDESCRIPTION_ENGLISH() {
		return this.DESCRIPTION_ENGLISH;
	}

	@Override
	public void setDESCRIPTION_ENGLISH(java.lang.String DESCRIPTION_ENGLISH) {
		this.DESCRIPTION_ENGLISH = DESCRIPTION_ENGLISH;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE from) {
		setCD(from.getCD());
		setDESCRIPTION(from.getDESCRIPTION());
		setDESCRIPTION_ENGLISH(from.getDESCRIPTION_ENGLISH());
		setID(from.getID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_LANGUAGE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
