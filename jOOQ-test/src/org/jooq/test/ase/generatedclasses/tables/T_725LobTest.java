/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -1638381352;

	/**
	 * The singleton instance of dbo.t_725_lob_test
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.ase.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The table column <code>dbo.t_725_lob_test.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_725_LOB_TEST);

	/**
	 * The table column <code>dbo.t_725_lob_test.lob</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("lob", org.jooq.impl.SQLDataType.VARBINARY, T_725_LOB_TEST);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.ase.generatedclasses.Keys.T_725_LOB_TEST__PK_T_725_LOB_TEST);
	}
}
