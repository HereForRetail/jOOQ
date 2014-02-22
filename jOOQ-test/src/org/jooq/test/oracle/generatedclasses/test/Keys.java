/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>TEST</code> 
 * schema
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> PK_T_ARRAYS = UniqueKeys0.PK_T_ARRAYS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> UK_T_BOOK_STORE_NAME = UniqueKeys0.UK_T_BOOK_STORE_NAME;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> PK_B2BS = UniqueKeys0.PK_B2BS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord> PK_T_BOOLEANS = UniqueKeys0.PK_T_BOOLEANS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> PK_T_DATES = UniqueKeys0.PK_T_DATES;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> PK_T_DIRECTORY = UniqueKeys0.PK_T_DIRECTORY;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = UniqueKeys0.PK_T_EXOTIC_TYPES;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord> PK_T_LANGUAGE = UniqueKeys0.PK_T_LANGUAGE;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TTempRecord> PK_T_TEMP = UniqueKeys0.PK_T_TEMP;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TTriggersRecord> PK_T_TRIGGERS = UniqueKeys0.PK_T_TRIGGERS;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_2845CaseSensitivityRecord> PK_T_2845_CASE_SENSITIVITY = UniqueKeys0.PK_T_2845_CASE_SENSITIVITY;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = UniqueKeys0.PK_T_639_NUMBERS_TABLE;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = UniqueKeys0.PK_T_725_LOB_TEST;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = UniqueKeys0.PK_X_TEST_CASE_64_69;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record> PK_X_TEST_CASE_71 = UniqueKeys0.PK_X_TEST_CASE_71;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> PK_X_TEST_CASE_85 = UniqueKeys0.PK_X_TEST_CASE_85;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> PK_X_UNUSED = UniqueKeys0.PK_X_UNUSED;
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> UK_X_UNUSED_ID = UniqueKeys0.UK_X_UNUSED_ID;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> FK_T_BOOK_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_AUTHOR_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = ForeignKeys0.FK_T_BOOK_CO_AUTHOR_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord> FK_T_BOOK_LANGUAGE_ID = ForeignKeys0.FK_T_BOOK_LANGUAGE_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> FK_B2BS_BS_NAME = ForeignKeys0.FK_B2BS_BS_NAME;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> FK_B2BS_B_ID = ForeignKeys0.FK_B2BS_B_ID;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> PK_T_DIRECTORY_SELF = ForeignKeys0.PK_T_DIRECTORY_SELF;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> FK_X_TEST_CASE_2025_1 = ForeignKeys0.FK_X_TEST_CASE_2025_1;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record> FK_X_TEST_CASE_2025_2 = ForeignKeys0.FK_X_TEST_CASE_2025_2;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_2025_3 = ForeignKeys0.FK_X_TEST_CASE_2025_3;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69A = ForeignKeys0.FK_X_TEST_CASE_64_69A;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69B = ForeignKeys0.FK_X_TEST_CASE_64_69B;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> FK_X_TEST_CASE_71 = ForeignKeys0.FK_X_TEST_CASE_71;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_85 = ForeignKeys0.FK_X_TEST_CASE_85;
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_UNUSED_SELF = ForeignKeys0.FK_X_UNUSED_SELF;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TArraysRecord> PK_T_ARRAYS = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS, org.jooq.test.oracle.generatedclasses.test.tables.TArrays.T_ARRAYS.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR, org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> PK_T_BOOK = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> UK_T_BOOK_STORE_NAME = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE, org.jooq.test.oracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> PK_B2BS = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBooleansRecord> PK_T_BOOLEANS = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS, org.jooq.test.oracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> PK_T_DATES = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES, org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> PK_T_DIRECTORY = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY, org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes.T_EXOTIC_TYPES.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord> PK_T_LANGUAGE = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE, org.jooq.test.oracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TTempRecord> PK_T_TEMP = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TTemp.T_TEMP, org.jooq.test.oracle.generatedclasses.test.tables.TTemp.T_TEMP.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TTriggersRecord> PK_T_TRIGGERS = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS, org.jooq.test.oracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_2845CaseSensitivityRecord> PK_T_2845_CASE_SENSITIVITY = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY, org.jooq.test.oracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record> PK_X_TEST_CASE_71 = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> PK_X_TEST_CASE_85 = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> PK_X_UNUSED = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED, org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED.ID, org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> UK_X_UNUSED_ID = createUniqueKey(org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED, org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED.ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> FK_T_BOOK_AUTHOR_ID = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_AUTHOR, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_AUTHOR, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TLanguageRecord> FK_T_BOOK_LANGUAGE_ID = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_LANGUAGE, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.LANGUAGE_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TBookStoreRecord> FK_B2BS_BS_NAME = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.UK_T_BOOK_STORE_NAME, org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> FK_B2BS_B_ID = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_BOOK, org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TDirectoryRecord> PK_T_DIRECTORY_SELF = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_DIRECTORY, org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY, org.jooq.test.oracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY.PARENT_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> FK_X_TEST_CASE_2025_1 = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_85, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record> FK_X_TEST_CASE_2025_2 = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_71, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_2025Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_2025_3 = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_UNUSED, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_ID, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_2025.X_TEST_CASE_2025.REF_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69A = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.UK_X_UNUSED_ID, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69B = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.UK_X_UNUSED_ID, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> FK_X_TEST_CASE_71 = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_64_69, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_TEST_CASE_85 = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_UNUSED, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.XUnusedRecord> FK_X_UNUSED_SELF = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_UNUSED, org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED, org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED.ID_REF, org.jooq.test.oracle.generatedclasses.test.tables.XUnused.X_UNUSED.NAME_REF);
	}
}
