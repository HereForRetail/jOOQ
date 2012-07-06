/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class T_986_1Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = -721011219;

	/**
	 * The table column <code>DBA.t_986_1.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_986_1__fk_986
	 * FOREIGN KEY (REF)
	 * REFERENCES DBA.x_unused (ID)
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF, value);
	}

	/**
	 * The table column <code>DBA.t_986_1.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_986_1__fk_986
	 * FOREIGN KEY (REF)
	 * REFERENCES DBA.x_unused (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF);
	}

	/**
	 * The table column <code>DBA.t_986_1.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_986_1__fk_986
	 * FOREIGN KEY (REF)
	 * REFERENCES DBA.x_unused (ID)
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF)))
			.fetchOne();
	}

	/**
	 * Create a detached T_986_1Record
	 */
	public T_986_1Record() {
		super(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1);
	}
}
