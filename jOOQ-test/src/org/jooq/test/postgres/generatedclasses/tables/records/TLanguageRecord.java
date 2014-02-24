/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITLanguage {

	private static final long serialVersionUID = -978550168;

	/**
	 * Setter for <code>public.t_language.cd</code>.
	 */
	public TLanguageRecord setCd(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.cd</code>.
	 */
	@Override
	public java.lang.String getCd() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.t_language.description</code>.
	 */
	public TLanguageRecord setDescription(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.description</code>.
	 */
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.t_language.description_english</code>.
	 */
	public TLanguageRecord setDescriptionEnglish(java.lang.String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.description_english</code>.
	 */
	@Override
	public java.lang.String getDescriptionEnglish() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.t_language.id</code>.
	 */
	public TLanguageRecord setId(java.lang.Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_language.id</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescriptionEnglish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value1(java.lang.String value) {
		setCd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value2(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value3(java.lang.String value) {
		setDescriptionEnglish(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord value4(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TLanguageRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}

	/**
	 * Create a detached, initialised TLanguageRecord
	 */
	public TLanguageRecord(java.lang.String cd, java.lang.String description, java.lang.String descriptionEnglish, java.lang.Integer id) {
		super(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE);

		setValue(0, cd);
		setValue(1, description);
		setValue(2, descriptionEnglish);
		setValue(3, id);
	}
}
