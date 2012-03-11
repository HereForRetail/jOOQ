/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR", schema = "TEST")
public class VAuthor implements java.io.Serializable {

	private static final long serialVersionUID = 1980522144;

	private java.lang.Integer                                                         id;
	private java.lang.String                                                          firstName;
	private java.lang.String                                                          lastName;
	private java.sql.Date                                                             dateOfBirth;
	private java.lang.Integer                                                         yearOfBirth;
	private org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord address;

	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	@javax.persistence.Column(name = "LAST_NAME", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 7)
	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@javax.persistence.Column(name = "YEAR_OF_BIRTH", precision = 7)
	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	public void setYearOfBirth(java.lang.Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	@javax.persistence.Column(name = "ADDRESS", length = 448)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord getAddress() {
		return this.address;
	}

	public void setAddress(org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord address) {
		this.address = address;
	}
}
