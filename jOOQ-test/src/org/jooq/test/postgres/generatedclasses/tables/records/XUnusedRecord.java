/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "x_unused", schema = "public", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"id", "name"})
})
public class XUnusedRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -809123154;

	/**
	 * Setter for <code>public.x_unused.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID, value);
	}

	/**
	 * Getter for <code>public.x_unused.id</code>. 
	 */
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID);
	}

	/**
	 * Setter for <code>public.x_unused.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME, value);
	}

	/**
	 * Getter for <code>public.x_unused.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 10)
	public java.lang.String getName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME);
	}

	/**
	 * Setter for <code>public.x_unused.big_integer</code>. 
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.BIG_INTEGER, value);
	}

	/**
	 * Getter for <code>public.x_unused.big_integer</code>. 
	 */
	@javax.persistence.Column(name = "big_integer", precision = 25)
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.BIG_INTEGER);
	}

	/**
	 * Setter for <code>public.x_unused.id_ref</code>. 
	 */
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID_REF, value);
	}

	/**
	 * Getter for <code>public.x_unused.id_ref</code>. 
	 */
	@javax.persistence.Column(name = "id_ref", precision = 32)
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID_REF);
	}

	/**
	 * Setter for <code>public.x_unused.class</code>. 
	 */
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.CLASS, value);
	}

	/**
	 * Getter for <code>public.x_unused.class</code>. 
	 */
	@javax.persistence.Column(name = "class", precision = 32)
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.CLASS);
	}

	/**
	 * Setter for <code>public.x_unused.fields</code>. 
	 */
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.FIELDS, value);
	}

	/**
	 * Getter for <code>public.x_unused.fields</code>. 
	 */
	@javax.persistence.Column(name = "fields", precision = 32)
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.FIELDS);
	}

	/**
	 * Setter for <code>public.x_unused.configuration</code>. 
	 */
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.CONFIGURATION, value);
	}

	/**
	 * Getter for <code>public.x_unused.configuration</code>. 
	 */
	@javax.persistence.Column(name = "configuration", precision = 32)
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.CONFIGURATION);
	}

	/**
	 * Setter for <code>public.x_unused.u_d_t</code>. 
	 */
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.U_D_T, value);
	}

	/**
	 * Getter for <code>public.x_unused.u_d_t</code>. 
	 */
	@javax.persistence.Column(name = "u_d_t", precision = 32)
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.U_D_T);
	}

	/**
	 * Setter for <code>public.x_unused.meta_data</code>. 
	 */
	public void setMetaData(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.META_DATA, value);
	}

	/**
	 * Getter for <code>public.x_unused.meta_data</code>. 
	 */
	@javax.persistence.Column(name = "meta_data", precision = 32)
	public java.lang.Integer getMetaData() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.META_DATA);
	}

	/**
	 * Setter for <code>public.x_unused.values</code>. 
	 */
	public void setValues_(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.VALUES, value);
	}

	/**
	 * Getter for <code>public.x_unused.values</code>. 
	 */
	@javax.persistence.Column(name = "values", precision = 32)
	public java.lang.Integer getValues_() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.VALUES);
	}

	/**
	 * Setter for <code>public.x_unused.type0</code>. 
	 */
	public void setType0(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.TYPE0, value);
	}

	/**
	 * Getter for <code>public.x_unused.type0</code>. 
	 */
	@javax.persistence.Column(name = "type0", precision = 32)
	public java.lang.Integer getType0() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.TYPE0);
	}

	/**
	 * Setter for <code>public.x_unused.primary_key</code>. 
	 */
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.PRIMARY_KEY, value);
	}

	/**
	 * Getter for <code>public.x_unused.primary_key</code>. 
	 */
	@javax.persistence.Column(name = "primary_key", precision = 32)
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.PRIMARY_KEY);
	}

	/**
	 * Setter for <code>public.x_unused.primarykey</code>. 
	 */
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.PRIMARYKEY, value);
	}

	/**
	 * Getter for <code>public.x_unused.primarykey</code>. 
	 */
	@javax.persistence.Column(name = "primarykey", precision = 32)
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.PRIMARYKEY);
	}

	/**
	 * Setter for <code>public.x_unused.name_ref</code>. 
	 */
	public void setNameRef(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF, value);
	}

	/**
	 * Getter for <code>public.x_unused.name_ref</code>. 
	 */
	@javax.persistence.Column(name = "name_ref", length = 10)
	public java.lang.String getNameRef() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF);
	}

	/**
	 * Setter for <code>public.x_unused.FIELD 737</code>. 
	 */
	public void setField_737(java.math.BigDecimal value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.FIELD_737, value);
	}

	/**
	 * Getter for <code>public.x_unused.FIELD 737</code>. 
	 */
	@javax.persistence.Column(name = "FIELD 737", precision = 25, scale = 2)
	public java.math.BigDecimal getField_737() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.FIELD_737);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>public.x_test_case_85</code> referencing this <code>public.x_unused</code>
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_85Record> fetchXTestCase_85List() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85)
			.where(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID)))
			.and(org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>public.x_unused</code> referencing this <code>public.x_unused</code>
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord> fetchXUnusedList() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID_REF.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID)))
			.and(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>public.x_test_case_64_69</code> referencing this <code>public.x_unused</code>
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> fetchXTestCase_64_69List() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>public.x_unused</code> referenced by this <code>public.x_unused</code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID_REF)))
			.and(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
