/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -229409175;

	/**
	 * The singleton instance of dbo.t_725_lob_test
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The table column <code>dbo.t_725_lob_test.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>dbo.t_725_lob_test.LOB</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.VARBINARY, this);

	public T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	public T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_725_LOB_TEST;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_725_LOB_TEST);
	}

	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.T_725LobTest(alias);
	}
}
