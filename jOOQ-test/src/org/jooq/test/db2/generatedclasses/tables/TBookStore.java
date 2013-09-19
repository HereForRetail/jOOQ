/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStore extends org.jooq.impl.TableImpl<org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -1774203089;

	/**
	 * The singleton instance of <code>LIBRARY.T_BOOK_STORE</code>
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.db2.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>LIBRARY.T_BOOK_STORE.NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), T_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookStore() {
		super("T_BOOK_STORE", org.jooq.test.db2.generatedclasses.Library.LIBRARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_BOOK_STORE__UK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_BOOK_STORE__UK_T_BOOK_STORE_NAME);
	}
}
