/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.5"},
                            comments = "This class is generated by jOOQ")
public class IiconstraintIndexesRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.ingres.ingres.tables.records.IiconstraintIndexesRecord> {

	private static final long serialVersionUID = 858518295;

	/**
	 * An uncommented item
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.CONSTRAINT_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getConstraintName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.CONSTRAINT_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setSchemaName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.SCHEMA_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSchemaName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.SCHEMA_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIndexName(java.lang.String value) {
		setValue(org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.INDEX_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getIndexName() {
		return getValue(org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.INDEX_NAME);
	}

	/**
	 * Create a detached IiconstraintIndexesRecord
	 */
	public IiconstraintIndexesRecord() {
		super(org.jooq.util.ingres.ingres.tables.IiconstraintIndexes.IICONSTRAINT_INDEXES);
	}
}
