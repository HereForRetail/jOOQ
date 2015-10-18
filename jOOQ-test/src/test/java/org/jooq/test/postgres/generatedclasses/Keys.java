/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;


import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.test.postgres.generatedclasses.tables.TArrays;
import org.jooq.test.postgres.generatedclasses.tables.TBook;
import org.jooq.test.postgres.generatedclasses.tables.TBookStore;
import org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore;
import org.jooq.test.postgres.generatedclasses.tables.TBooleans;
import org.jooq.test.postgres.generatedclasses.tables.TDates;
import org.jooq.test.postgres.generatedclasses.tables.TExoticTypes;
import org.jooq.test.postgres.generatedclasses.tables.TIdentity;
import org.jooq.test.postgres.generatedclasses.tables.TIdentityPk;
import org.jooq.test.postgres.generatedclasses.tables.TLanguage;
import org.jooq.test.postgres.generatedclasses.tables.TTriggers;
import org.jooq.test.postgres.generatedclasses.tables.T_3111;
import org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable;
import org.jooq.test.postgres.generatedclasses.tables.T_681;
import org.jooq.test.postgres.generatedclasses.tables.T_725LobTest;
import org.jooq.test.postgres.generatedclasses.tables.T_986_1;
import org.jooq.test.postgres.generatedclasses.tables.T_986_2;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_2025;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_71;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_85;
import org.jooq.test.postgres.generatedclasses.tables.XUnused;
import org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TBooleansRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TIdentityPkRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.TTriggersRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.T_3111Record;
import org.jooq.test.postgres.generatedclasses.tables.records.T_639NumbersTableRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.T_681Record;
import org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord;
import org.jooq.test.postgres.generatedclasses.tables.records.T_986_1Record;
import org.jooq.test.postgres.generatedclasses.tables.records.T_986_2Record;
import org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_2025Record;
import org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record;
import org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record;
import org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_85Record;
import org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<TIdentityRecord, Integer> IDENTITY_T_IDENTITY = Identities0.IDENTITY_T_IDENTITY;
	public static final Identity<TIdentityPkRecord, Integer> IDENTITY_T_IDENTITY_PK = Identities0.IDENTITY_T_IDENTITY_PK;
	public static final Identity<TTriggersRecord, Integer> IDENTITY_T_TRIGGERS = Identities0.IDENTITY_T_TRIGGERS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<T_3111Record> PK_T_3111 = UniqueKeys0.PK_T_3111;
	public static final UniqueKey<T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = UniqueKeys0.PK_T_639_NUMBERS_TABLE;
	public static final UniqueKey<T_681Record> PK_T_681 = UniqueKeys0.PK_T_681;
	public static final UniqueKey<T_725LobTestRecord> PK_T_725_LOB_TEST = UniqueKeys0.PK_T_725_LOB_TEST;
	public static final UniqueKey<TArraysRecord> PK_T_ARRAYS = UniqueKeys0.PK_T_ARRAYS;
	public static final UniqueKey<TAuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
	public static final UniqueKey<TBookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
	public static final UniqueKey<TBookStoreRecord> UK_T_BOOK_STORE_NAME = UniqueKeys0.UK_T_BOOK_STORE_NAME;
	public static final UniqueKey<TBookToBookStoreRecord> PK_B2BS = UniqueKeys0.PK_B2BS;
	public static final UniqueKey<TBooleansRecord> PK_T_BOOLEANS = UniqueKeys0.PK_T_BOOLEANS;
	public static final UniqueKey<TDatesRecord> PK_T_DATES = UniqueKeys0.PK_T_DATES;
	public static final UniqueKey<TExoticTypesRecord> PK_T_EXOTIC_TYPES = UniqueKeys0.PK_T_EXOTIC_TYPES;
	public static final UniqueKey<TIdentityPkRecord> PK_T_IDENTITY_PK = UniqueKeys0.PK_T_IDENTITY_PK;
	public static final UniqueKey<TLanguageRecord> PK_T_LANGUAGE = UniqueKeys0.PK_T_LANGUAGE;
	public static final UniqueKey<TTriggersRecord> PK_T_TRIGGERS = UniqueKeys0.PK_T_TRIGGERS;
	public static final UniqueKey<XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = UniqueKeys0.PK_X_TEST_CASE_64_69;
	public static final UniqueKey<XTestCase_71Record> PK_X_TEST_CASE_71 = UniqueKeys0.PK_X_TEST_CASE_71;
	public static final UniqueKey<XTestCase_85Record> PK_X_TEST_CASE_85 = UniqueKeys0.PK_X_TEST_CASE_85;
	public static final UniqueKey<XUnusedRecord> PK_X_UNUSED = UniqueKeys0.PK_X_UNUSED;
	public static final UniqueKey<XUnusedRecord> UK_X_UNUSED_ID = UniqueKeys0.UK_X_UNUSED_ID;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<T_986_1Record, XUnusedRecord> T_986_1__FK_986 = ForeignKeys0.T_986_1__FK_986;
	public static final ForeignKey<T_986_2Record, XUnusedRecord> T_986_2__FK_986 = ForeignKeys0.T_986_2__FK_986;
	public static final ForeignKey<TBookRecord, TAuthorRecord> T_BOOK__FK_T_BOOK_AUTHOR_ID = ForeignKeys0.T_BOOK__FK_T_BOOK_AUTHOR_ID;
	public static final ForeignKey<TBookRecord, TAuthorRecord> T_BOOK__FK_T_BOOK_CO_AUTHOR_ID = ForeignKeys0.T_BOOK__FK_T_BOOK_CO_AUTHOR_ID;
	public static final ForeignKey<TBookRecord, TLanguageRecord> T_BOOK__FK_T_BOOK_LANGUAGE_ID = ForeignKeys0.T_BOOK__FK_T_BOOK_LANGUAGE_ID;
	public static final ForeignKey<TBookToBookStoreRecord, TBookStoreRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME = ForeignKeys0.T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME;
	public static final ForeignKey<TBookToBookStoreRecord, TBookRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID = ForeignKeys0.T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID;
	public static final ForeignKey<XTestCase_2025Record, XTestCase_85Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_1 = ForeignKeys0.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_1;
	public static final ForeignKey<XTestCase_2025Record, XTestCase_71Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_2 = ForeignKeys0.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_2;
	public static final ForeignKey<XTestCase_2025Record, XUnusedRecord> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_3 = ForeignKeys0.X_TEST_CASE_2025__FK_X_TEST_CASE_2025_3;
	public static final ForeignKey<XTestCase_64_69Record, XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A = ForeignKeys0.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A;
	public static final ForeignKey<XTestCase_64_69Record, XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B = ForeignKeys0.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B;
	public static final ForeignKey<XTestCase_71Record, XTestCase_64_69Record> X_TEST_CASE_71__FK_X_TEST_CASE_71 = ForeignKeys0.X_TEST_CASE_71__FK_X_TEST_CASE_71;
	public static final ForeignKey<XTestCase_85Record, XUnusedRecord> X_TEST_CASE_85__FK_X_TEST_CASE_85 = ForeignKeys0.X_TEST_CASE_85__FK_X_TEST_CASE_85;
	public static final ForeignKey<XUnusedRecord, XUnusedRecord> X_UNUSED__FK_X_UNUSED_SELF = ForeignKeys0.X_UNUSED__FK_X_UNUSED_SELF;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<TIdentityRecord, Integer> IDENTITY_T_IDENTITY = createIdentity(TIdentity.T_IDENTITY, TIdentity.T_IDENTITY.ID);
		public static Identity<TIdentityPkRecord, Integer> IDENTITY_T_IDENTITY_PK = createIdentity(TIdentityPk.T_IDENTITY_PK, TIdentityPk.T_IDENTITY_PK.ID);
		public static Identity<TTriggersRecord, Integer> IDENTITY_T_TRIGGERS = createIdentity(TTriggers.T_TRIGGERS, TTriggers.T_TRIGGERS.ID_GENERATED);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<T_3111Record> PK_T_3111 = createUniqueKey(T_3111.T_3111, T_3111.T_3111.ID);
		public static final UniqueKey<T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = createUniqueKey(T_639NumbersTable.T_639_NUMBERS_TABLE, T_639NumbersTable.T_639_NUMBERS_TABLE.ID);
		public static final UniqueKey<T_681Record> PK_T_681 = createUniqueKey(T_681.T_681, T_681.T_681.ID);
		public static final UniqueKey<T_725LobTestRecord> PK_T_725_LOB_TEST = createUniqueKey(T_725LobTest.T_725_LOB_TEST, T_725LobTest.T_725_LOB_TEST.ID);
		public static final UniqueKey<TArraysRecord> PK_T_ARRAYS = createUniqueKey(TArrays.T_ARRAYS, TArrays.T_ARRAYS.ID);
		public static final UniqueKey<TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
		public static final UniqueKey<TBookRecord> PK_T_BOOK = createUniqueKey(TBook.T_BOOK, TBook.T_BOOK.ID);
		public static final UniqueKey<TBookStoreRecord> UK_T_BOOK_STORE_NAME = createUniqueKey(TBookStore.T_BOOK_STORE, TBookStore.T_BOOK_STORE.NAME);
		public static final UniqueKey<TBookToBookStoreRecord> PK_B2BS = createUniqueKey(TBookToBookStore.T_BOOK_TO_BOOK_STORE, TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final UniqueKey<TBooleansRecord> PK_T_BOOLEANS = createUniqueKey(TBooleans.T_BOOLEANS, TBooleans.T_BOOLEANS.ID);
		public static final UniqueKey<TDatesRecord> PK_T_DATES = createUniqueKey(TDates.T_DATES, TDates.T_DATES.ID);
		public static final UniqueKey<TExoticTypesRecord> PK_T_EXOTIC_TYPES = createUniqueKey(TExoticTypes.T_EXOTIC_TYPES, TExoticTypes.T_EXOTIC_TYPES.ID);
		public static final UniqueKey<TIdentityPkRecord> PK_T_IDENTITY_PK = createUniqueKey(TIdentityPk.T_IDENTITY_PK, TIdentityPk.T_IDENTITY_PK.ID);
		public static final UniqueKey<TLanguageRecord> PK_T_LANGUAGE = createUniqueKey(TLanguage.T_LANGUAGE, TLanguage.T_LANGUAGE.ID);
		public static final UniqueKey<TTriggersRecord> PK_T_TRIGGERS = createUniqueKey(TTriggers.T_TRIGGERS, TTriggers.T_TRIGGERS.ID_GENERATED);
		public static final UniqueKey<XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = createUniqueKey(XTestCase_64_69.X_TEST_CASE_64_69, XTestCase_64_69.X_TEST_CASE_64_69.ID);
		public static final UniqueKey<XTestCase_71Record> PK_X_TEST_CASE_71 = createUniqueKey(XTestCase_71.X_TEST_CASE_71, XTestCase_71.X_TEST_CASE_71.ID);
		public static final UniqueKey<XTestCase_85Record> PK_X_TEST_CASE_85 = createUniqueKey(XTestCase_85.X_TEST_CASE_85, XTestCase_85.X_TEST_CASE_85.ID);
		public static final UniqueKey<XUnusedRecord> PK_X_UNUSED = createUniqueKey(XUnused.X_UNUSED, XUnused.X_UNUSED.ID, XUnused.X_UNUSED.NAME);
		public static final UniqueKey<XUnusedRecord> UK_X_UNUSED_ID = createUniqueKey(XUnused.X_UNUSED, XUnused.X_UNUSED.ID);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<T_986_1Record, XUnusedRecord> T_986_1__FK_986 = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.UK_X_UNUSED_ID, T_986_1.T_986_1, T_986_1.T_986_1.REF);
		public static final ForeignKey<T_986_2Record, XUnusedRecord> T_986_2__FK_986 = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.UK_X_UNUSED_ID, T_986_2.T_986_2, T_986_2.T_986_2.REF);
		public static final ForeignKey<TBookRecord, TAuthorRecord> T_BOOK__FK_T_BOOK_AUTHOR_ID = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_T_AUTHOR, TBook.T_BOOK, org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
		public static final ForeignKey<TBookRecord, TAuthorRecord> T_BOOK__FK_T_BOOK_CO_AUTHOR_ID = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_T_AUTHOR, TBook.T_BOOK, org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
		public static final ForeignKey<TBookRecord, TLanguageRecord> T_BOOK__FK_T_BOOK_LANGUAGE_ID = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_T_LANGUAGE, TBook.T_BOOK, TBook.T_BOOK.LANGUAGE_ID);
		public static final ForeignKey<TBookToBookStoreRecord, TBookStoreRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.UK_T_BOOK_STORE_NAME, TBookToBookStore.T_BOOK_TO_BOOK_STORE, TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
		public static final ForeignKey<TBookToBookStoreRecord, TBookRecord> T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_T_BOOK, TBookToBookStore.T_BOOK_TO_BOOK_STORE, TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final ForeignKey<XTestCase_2025Record, XTestCase_85Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_1 = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_X_TEST_CASE_85, XTestCase_2025.X_TEST_CASE_2025, XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final ForeignKey<XTestCase_2025Record, XTestCase_71Record> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_2 = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_X_TEST_CASE_71, XTestCase_2025.X_TEST_CASE_2025, XTestCase_2025.X_TEST_CASE_2025.REF_ID);
		public static final ForeignKey<XTestCase_2025Record, XUnusedRecord> X_TEST_CASE_2025__FK_X_TEST_CASE_2025_3 = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_X_UNUSED, XTestCase_2025.X_TEST_CASE_2025, XTestCase_2025.X_TEST_CASE_2025.REF_ID, XTestCase_2025.X_TEST_CASE_2025.REF_NAME);
		public static final ForeignKey<XTestCase_64_69Record, XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.UK_X_UNUSED_ID, XTestCase_64_69.X_TEST_CASE_64_69, XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final ForeignKey<XTestCase_64_69Record, XUnusedRecord> X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.UK_X_UNUSED_ID, XTestCase_64_69.X_TEST_CASE_64_69, XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
		public static final ForeignKey<XTestCase_71Record, XTestCase_64_69Record> X_TEST_CASE_71__FK_X_TEST_CASE_71 = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_X_TEST_CASE_64_69, XTestCase_71.X_TEST_CASE_71, XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
		public static final ForeignKey<XTestCase_85Record, XUnusedRecord> X_TEST_CASE_85__FK_X_TEST_CASE_85 = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_X_UNUSED, XTestCase_85.X_TEST_CASE_85, XTestCase_85.X_TEST_CASE_85.X_UNUSED_ID, XTestCase_85.X_TEST_CASE_85.X_UNUSED_NAME);
		public static final ForeignKey<XUnusedRecord, XUnusedRecord> X_UNUSED__FK_X_UNUSED_SELF = createForeignKey(org.jooq.test.postgres.generatedclasses.Keys.PK_X_UNUSED, XUnused.X_UNUSED, XUnused.X_UNUSED.ID_REF, XUnused.X_UNUSED.NAME_REF);
	}
}
