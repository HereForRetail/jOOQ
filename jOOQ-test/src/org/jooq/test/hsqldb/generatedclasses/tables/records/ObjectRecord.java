/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class ObjectRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ObjectRecord> {

	private static final long serialVersionUID = 145103968;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (OTHER, null) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setOther(java.lang.Object value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT.OTHER, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (OTHER, null) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getOther() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT.OTHER);
	}

	/**
	 * Create a detached ObjectRecord
	 */
	public ObjectRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Object.OBJECT);
	}
}
