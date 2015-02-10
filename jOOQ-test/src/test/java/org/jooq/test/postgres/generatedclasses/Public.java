/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;
import org.jooq.test.postgres.generatedclasses.tables.FArrayTables;
import org.jooq.test.postgres.generatedclasses.tables.FSearchBooks;
import org.jooq.test.postgres.generatedclasses.tables.FTables1;
import org.jooq.test.postgres.generatedclasses.tables.FTables2;
import org.jooq.test.postgres.generatedclasses.tables.FTables3;
import org.jooq.test.postgres.generatedclasses.tables.FTables4;
import org.jooq.test.postgres.generatedclasses.tables.FTables5;
import org.jooq.test.postgres.generatedclasses.tables.TArrays;
import org.jooq.test.postgres.generatedclasses.tables.TBook;
import org.jooq.test.postgres.generatedclasses.tables.TBookStore;
import org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore;
import org.jooq.test.postgres.generatedclasses.tables.TBooleans;
import org.jooq.test.postgres.generatedclasses.tables.TDates;
import org.jooq.test.postgres.generatedclasses.tables.TExoticTypes;
import org.jooq.test.postgres.generatedclasses.tables.TIdentity;
import org.jooq.test.postgres.generatedclasses.tables.TIdentityPk;
import org.jooq.test.postgres.generatedclasses.tables.TInheritanceAll;
import org.jooq.test.postgres.generatedclasses.tables.TInheritance_1;
import org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1;
import org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2;
import org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1;
import org.jooq.test.postgres.generatedclasses.tables.TLanguage;
import org.jooq.test.postgres.generatedclasses.tables.TTriggers;
import org.jooq.test.postgres.generatedclasses.tables.TUnsigned;
import org.jooq.test.postgres.generatedclasses.tables.T_2781;
import org.jooq.test.postgres.generatedclasses.tables.T_3111;
import org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable;
import org.jooq.test.postgres.generatedclasses.tables.T_725LobTest;
import org.jooq.test.postgres.generatedclasses.tables.T_785;
import org.jooq.test.postgres.generatedclasses.tables.T_959;
import org.jooq.test.postgres.generatedclasses.tables.T_986_1;
import org.jooq.test.postgres.generatedclasses.tables.T_986_2;
import org.jooq.test.postgres.generatedclasses.tables.VBook;
import org.jooq.test.postgres.generatedclasses.tables.VLibrary;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_2025;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_71;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_85;
import org.jooq.test.postgres.generatedclasses.tables.XUnused;
import org.jooq.test.postgres.generatedclasses.udt.UAddressType;
import org.jooq.test.postgres.generatedclasses.udt.UStreetType;
import org.jooq.test.postgres.generatedclasses.udt.UUuids;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

	private static final long serialVersionUID = -1540869222;

	/**
	 * The reference instance of <code>public</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			org.jooq.test.postgres.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			FArrayTables.F_ARRAY_TABLES,
			FSearchBooks.F_SEARCH_BOOKS,
			FTables1.F_TABLES1,
			FTables2.F_TABLES2,
			FTables3.F_TABLES3,
			FTables4.F_TABLES4,
			FTables5.F_TABLES5,
			T_2781.T_2781,
			T_3111.T_3111,
			T_639NumbersTable.T_639_NUMBERS_TABLE,
			T_725LobTest.T_725_LOB_TEST,
			T_785.T_785,
			T_959.T_959,
			T_986_1.T_986_1,
			T_986_2.T_986_2,
			TArrays.T_ARRAYS,
			org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR,
			TBook.T_BOOK,
			TBookStore.T_BOOK_STORE,
			TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			TBooleans.T_BOOLEANS,
			TDates.T_DATES,
			TExoticTypes.T_EXOTIC_TYPES,
			TIdentity.T_IDENTITY,
			TIdentityPk.T_IDENTITY_PK,
			TInheritance_1.T_INHERITANCE_1,
			TInheritance_1_1.T_INHERITANCE_1_1,
			TInheritance_1_2.T_INHERITANCE_1_2,
			TInheritance_1_2_1.T_INHERITANCE_1_2_1,
			TInheritanceAll.T_INHERITANCE_ALL,
			TLanguage.T_LANGUAGE,
			TTriggers.T_TRIGGERS,
			TUnsigned.T_UNSIGNED,
			org.jooq.test.postgres.generatedclasses.tables.VAuthor.V_AUTHOR,
			VBook.V_BOOK,
			VLibrary.V_LIBRARY,
			XTestCase_2025.X_TEST_CASE_2025,
			XTestCase_64_69.X_TEST_CASE_64_69,
			XTestCase_71.X_TEST_CASE_71,
			XTestCase_85.X_TEST_CASE_85,
			XUnused.X_UNUSED);
	}

	@Override
	public final List<UDT<?>> getUDTs() {
		List result = new ArrayList();
		result.addAll(getUDTs0());
		return result;
	}

	private final List<UDT<?>> getUDTs0() {
		return Arrays.<UDT<?>>asList(
			UAddressType.U_ADDRESS_TYPE,
			UStreetType.U_STREET_TYPE,
			UUuids.U_UUIDS);
	}
}
