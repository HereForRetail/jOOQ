/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;


import java.sql.Date;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.h2.generatedclasses.tables.TAuthor;
import org.jooq.test.h2.generatedclasses.tables.interfaces.ITAuthor;


/**
 * An entity holding authors of books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthorRecord extends UpdatableRecordImpl<TAuthorRecord> implements Record6<Integer, String, String, Date, Integer, String>, ITAuthor {

	private static final long serialVersionUID = 778352958;

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.ID</code>. The author ID
	 */
	@Override
	public TAuthorRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.ID</code>. The author ID
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>. The author's first name
	 */
	@Override
	public TAuthorRecord setFirstName(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>. The author's first name
	 */
	@Override
	public String getFirstName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>. The author's last name
	 */
	@Override
	public TAuthorRecord setLastName(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.LAST_NAME</code>. The author's last name
	 */
	@Override
	public String getLastName() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	@Override
	public TAuthorRecord setDateOfBirth(Date value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	@Override
	public Date getDateOfBirth() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	@Override
	public TAuthorRecord setYearOfBirth(Integer value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	@Override
	public Integer getYearOfBirth() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>. The author's address
	 */
	@Override
	public TAuthorRecord setAddress(String value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.T_AUTHOR.ADDRESS</code>. The author's address
	 */
	@Override
	public String getAddress() {
		return (String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TAuthor.T_AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TAuthor.T_AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return TAuthor.T_AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return TAuthor.T_AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return TAuthor.T_AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return TAuthor.T_AUTHOR.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthorRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthorRecord value2(String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthorRecord value3(String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthorRecord value4(Date value) {
		setDateOfBirth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthorRecord value5(Integer value) {
		setYearOfBirth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthorRecord value6(String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthorRecord values(Integer value1, String value2, String value3, Date value4, Integer value5, String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITAuthor from) {
		setId(from.getId());
		setFirstName(from.getFirstName());
		setLastName(from.getLastName());
		setDateOfBirth(from.getDateOfBirth());
		setYearOfBirth(from.getYearOfBirth());
		setAddress(from.getAddress());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITAuthor> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(TAuthor.T_AUTHOR);
	}

	/**
	 * Create a detached, initialised TAuthorRecord
	 */
	public TAuthorRecord(Integer id, String firstName, String lastName, Date dateOfBirth, Integer yearOfBirth, String address) {
		super(TAuthor.T_AUTHOR);

		setValue(0, id);
		setValue(1, firstName);
		setValue(2, lastName);
		setValue(3, dateOfBirth);
		setValue(4, yearOfBirth);
		setValue(5, address);
	}
}
