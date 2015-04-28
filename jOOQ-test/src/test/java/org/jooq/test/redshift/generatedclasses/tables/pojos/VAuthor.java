/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.pojos;


import java.sql.Date;

import org.jooq.test.redshift.generatedclasses.tables.interfaces.IVAuthor;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor implements IVAuthor {

	private static final long serialVersionUID = -713023167;

	private final Integer id;
	private final Object  firstName;
	private final Object  lastName;
	private final Date    dateOfBirth;
	private final Integer yearOfBirth;
	private final Object  address;

	public VAuthor(VAuthor value) {
		this.id = value.id;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.dateOfBirth = value.dateOfBirth;
		this.yearOfBirth = value.yearOfBirth;
		this.address = value.address;
	}

	public VAuthor(
		Integer id,
		Object  firstName,
		Object  lastName,
		Date    dateOfBirth,
		Integer yearOfBirth,
		Object  address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public Object getFirstName() {
		return this.firstName;
	}

	@Override
	public Object getLastName() {
		return this.lastName;
	}

	@Override
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	@Override
	public Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	@Override
	public Object getAddress() {
		return this.address;
	}
}
