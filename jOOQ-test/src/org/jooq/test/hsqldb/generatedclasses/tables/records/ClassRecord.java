/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class ClassRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ClassRecord> {

	private static final long serialVersionUID = -456332098;

	/**
	 * An uncommented item
	 */
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS.CLASS_, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS.CLASS_);
	}

	/**
	 * Create a detached ClassRecord
	 */
	public ClassRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Class.CLASS);
	}
}
