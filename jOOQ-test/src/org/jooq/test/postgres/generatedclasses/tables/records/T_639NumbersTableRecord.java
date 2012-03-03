/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_639_numbers_table", schema = "public")
public class T_639NumbersTableRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 1572715679;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setShort(java.lang.Short value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "short")
	public java.lang.Short getShort() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT);
	}

	/**
	 * An uncommented item
	 */
	public void setInteger(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "integer")
	public java.lang.Integer getInteger() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER);
	}

	/**
	 * An uncommented item
	 */
	public void setLong(java.lang.Long value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "long")
	public java.lang.Long getLong() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG);
	}

	/**
	 * An uncommented item
	 */
	public void setByteDecimal(java.lang.Byte value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "byte_decimal")
	public java.lang.Byte getByteDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setShortDecimal(java.lang.Short value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "short_decimal")
	public java.lang.Short getShortDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setIntegerDecimal(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "integer_decimal")
	public java.lang.Integer getIntegerDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setLongDecimal(java.lang.Long value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "long_decimal")
	public java.lang.Long getLongDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "big_integer")
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER);
	}

	/**
	 * An uncommented item
	 */
	public void setBigDecimal(java.math.BigDecimal value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "big_decimal")
	public java.math.BigDecimal getBigDecimal() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL);
	}

	/**
	 * An uncommented item
	 */
	public void setFloat(java.lang.Float value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.FLOAT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "float")
	public java.lang.Float getFloat() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.FLOAT);
	}

	/**
	 * An uncommented item
	 */
	public void setDouble(java.lang.Double value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.DOUBLE, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "double")
	public java.lang.Double getDouble() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.DOUBLE);
	}

	/**
	 * Create a detached T_639NumbersTableRecord
	 */
	public T_639NumbersTableRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}
}
