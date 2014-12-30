/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IT_639NumbersTable extends Serializable {

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.ID</code>.
	 */
	public IT_639NumbersTable setId(Integer value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.ID</code>.
	 */
	public Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.BYTE</code>.
	 */
	public IT_639NumbersTable setByte(Byte value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.BYTE</code>.
	 */
	public Byte getByte();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.SHORT</code>.
	 */
	public IT_639NumbersTable setShort(Short value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.SHORT</code>.
	 */
	public Short getShort();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.INTEGER</code>.
	 */
	public IT_639NumbersTable setInteger(Integer value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.INTEGER</code>.
	 */
	public Integer getInteger();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.LONG</code>.
	 */
	public IT_639NumbersTable setLong(Long value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.LONG</code>.
	 */
	public Long getLong();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>.
	 */
	public IT_639NumbersTable setByteDecimal(Byte value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>.
	 */
	public Byte getByteDecimal();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>.
	 */
	public IT_639NumbersTable setShortDecimal(Short value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>.
	 */
	public Short getShortDecimal();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>.
	 */
	public IT_639NumbersTable setIntegerDecimal(Integer value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>.
	 */
	public Integer getIntegerDecimal();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>.
	 */
	public IT_639NumbersTable setLongDecimal(Long value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>.
	 */
	public Long getLongDecimal();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.BIG_INTEGER</code>.
	 */
	public IT_639NumbersTable setBigInteger(BigInteger value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.BIG_INTEGER</code>.
	 */
	public BigInteger getBigInteger();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>.
	 */
	public IT_639NumbersTable setBigDecimal(BigDecimal value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>.
	 */
	public BigDecimal getBigDecimal();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.FLOAT</code>.
	 */
	public IT_639NumbersTable setFloat(Float value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.FLOAT</code>.
	 */
	public Float getFloat();

	/**
	 * Setter for <code>PUBLIC.T_639_NUMBERS_TABLE.DOUBLE</code>.
	 */
	public IT_639NumbersTable setDouble(Double value);

	/**
	 * Getter for <code>PUBLIC.T_639_NUMBERS_TABLE.DOUBLE</code>.
	 */
	public Double getDouble();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IT_639NumbersTable
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IT_639NumbersTable from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IT_639NumbersTable
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IT_639NumbersTable> E into(E into);
}
