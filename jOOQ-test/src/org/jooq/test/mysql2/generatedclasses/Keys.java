/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the test2 schema
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> IDENTITY_t_identity_pk = createIdentity(org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
	public static final org.jooq.Identity<org.jooq.test.mysql2.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> IDENTITY_t_triggers = createIdentity(org.jooq.test.mysql2.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.mysql2.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_639NumbersTableRecord> KEY_t_639_numbers_table_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.mysql2.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> KEY_t_725_lob_test_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> KEY_t_author_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.mysql2.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> KEY_t_book_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord> KEY_t_book_store_uk_t_book_store_name = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.mysql2.generatedclasses.tables.TBookStore.T_BOOK_STORE.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> KEY_t_book_to_book_store_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBooleansRecord> KEY_t_booleans_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.mysql2.generatedclasses.tables.TBooleans.T_BOOLEANS.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TIdentityPkRecord> KEY_t_identity_pk_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.mysql2.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TTriggersRecord> KEY_t_triggers_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.mysql2.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record> KEY_x_test_case_64_69_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record> KEY_x_test_case_71_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record> KEY_x_test_case_85_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XUnusedRecord> KEY_x_unused_PRIMARY = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID, org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XUnusedRecord> KEY_x_unused_uk_x_unused_id = createUniqueKey(org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> fk_t_book_author_id = createForeignKey(KEY_t_author_PRIMARY, org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord, org.jooq.test.mysql2.generatedclasses.tables.records.TAuthorRecord> fk_t_book_co_author_id = createForeignKey(KEY_t_author_PRIMARY, org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.mysql2.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.mysql2.generatedclasses.tables.records.TBookStoreRecord> fk_b2bs_bs_name = createForeignKey(KEY_t_book_store_uk_t_book_store_name, org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.mysql2.generatedclasses.tables.records.TBookRecord> fk_b2bs_b_id = createForeignKey(KEY_t_book_PRIMARY, org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.mysql2.generatedclasses.tables.records.XUnusedRecord> fk_x_test_case_64_69 = createForeignKey(KEY_x_unused_PRIMARY, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_64_69Record> fk_x_test_case_71 = createForeignKey(KEY_x_test_case_64_69_PRIMARY, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.mysql2.generatedclasses.tables.records.XUnusedRecord> fk_x_test_case_85 = createForeignKey(KEY_x_unused_PRIMARY, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.mysql2.generatedclasses.tables.records.XUnusedRecord> fk_x_unused_self = createForeignKey(KEY_x_unused_PRIMARY, org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.ID_REF, org.jooq.test.mysql2.generatedclasses.tables.XUnused.X_UNUSED.NAME_REF);

	/**
	 * No instances
	 */
	private Keys() {}
}
