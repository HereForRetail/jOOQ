/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DIRECTORY", schema = "TEST")
public class TDirectoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> {

	private static final long serialVersionUID = 1112825583;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> fetchTDirectoryList() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public void setParentId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "PARENT_ID", precision = 7)
	public java.lang.Integer getParentId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord fetchTDirectory() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setIsDirectory(java.lang.Byte value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.IS_DIRECTORY, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "IS_DIRECTORY", precision = 1)
	public java.lang.Byte getIsDirectory() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.IS_DIRECTORY);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "name", length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.NAME);
	}

	/**
	 * Create a detached TDirectoryRecord
	 */
	public TDirectoryRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY);
	}
}
