/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ContactType", schema = "Person")
public class ContactType extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType> {

	private static final long serialVersionUID = -1414317480;

	/**
	 * The table column <code>Person.ContactType.ContactTypeID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setContactTypeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType.ContactTypeID, value);
	}

	/**
	 * The table column <code>Person.ContactType.ContactTypeID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ContactTypeID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getContactTypeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType.ContactTypeID);
	}

	/**
	 * The table column <code>Person.ContactType.Name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType.Name, value);
	}

	/**
	 * The table column <code>Person.ContactType.Name</code>
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType.Name);
	}

	/**
	 * The table column <code>Person.ContactType.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType.ModifiedDate, value);
	}

	/**
	 * The table column <code>Person.ContactType.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType.ModifiedDate);
	}

	/**
	 * Create a detached ContactType
	 */
	public ContactType() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType);
	}
}
