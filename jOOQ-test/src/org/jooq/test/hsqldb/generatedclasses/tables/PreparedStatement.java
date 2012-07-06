/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class PreparedStatement extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.PreparedStatementRecord> {

	private static final long serialVersionUID = 272894126;

	/**
	 * The singleton instance of PUBLIC.PREPARED_STATEMENT
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement PREPARED_STATEMENT = new org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.PreparedStatementRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.PreparedStatementRecord.class;
	}

	/**
	 * The table column <code>PUBLIC.PREPARED_STATEMENT.ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.PreparedStatementRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	public PreparedStatement() {
		super("PREPARED_STATEMENT", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	public PreparedStatement(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement.PREPARED_STATEMENT);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement(alias);
	}
}
