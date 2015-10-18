/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;


import org.jooq.Field;
import org.jooq.test.postgres.generatedclasses.tables.FArrayTables;
import org.jooq.test.postgres.generatedclasses.tables.FGetArrays;
import org.jooq.test.postgres.generatedclasses.tables.FSearchBookIds;
import org.jooq.test.postgres.generatedclasses.tables.FSearchBookTitles;
import org.jooq.test.postgres.generatedclasses.tables.FSearchBooks;
import org.jooq.test.postgres.generatedclasses.tables.FSetofBigint;
import org.jooq.test.postgres.generatedclasses.tables.FSetofVoid;
import org.jooq.test.postgres.generatedclasses.tables.FTables1;
import org.jooq.test.postgres.generatedclasses.tables.FTables2;
import org.jooq.test.postgres.generatedclasses.tables.FTables3;
import org.jooq.test.postgres.generatedclasses.tables.FTables4;
import org.jooq.test.postgres.generatedclasses.tables.FTables5;
import org.jooq.test.postgres.generatedclasses.tables.TArrays;
import org.jooq.test.postgres.generatedclasses.tables.TAuthor;
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
import org.jooq.test.postgres.generatedclasses.tables.T_681;
import org.jooq.test.postgres.generatedclasses.tables.T_725LobTest;
import org.jooq.test.postgres.generatedclasses.tables.T_785;
import org.jooq.test.postgres.generatedclasses.tables.T_959;
import org.jooq.test.postgres.generatedclasses.tables.T_986_1;
import org.jooq.test.postgres.generatedclasses.tables.T_986_2;
import org.jooq.test.postgres.generatedclasses.tables.VAuthor;
import org.jooq.test.postgres.generatedclasses.tables.VBook;
import org.jooq.test.postgres.generatedclasses.tables.VLibrary;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_2025;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_71;
import org.jooq.test.postgres.generatedclasses.tables.XTestCase_85;
import org.jooq.test.postgres.generatedclasses.tables.XUnused;


/**
 * Convenience access to all tables in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table public.f_array_tables
	 */
	public static final FArrayTables F_ARRAY_TABLES = org.jooq.test.postgres.generatedclasses.tables.FArrayTables.F_ARRAY_TABLES;

	/**
	 * Get <code>public.f_array_tables</code> as a field
	 */
	public static FArrayTables F_ARRAY_TABLES(String[] inText, Integer[] inInteger) {
		return FArrayTables.F_ARRAY_TABLES.call(inText, inInteger);
	}

	/**
	 * Get <code>public.f_array_tables</code> as a field
	 */
	public static FArrayTables F_ARRAY_TABLES(Field<String[]> inText, Field<Integer[]> inInteger) {
		return FArrayTables.F_ARRAY_TABLES.call(inText, inInteger);
	}

	/**
	 * The table public.f_get_arrays
	 */
	public static final FGetArrays F_GET_ARRAYS = org.jooq.test.postgres.generatedclasses.tables.FGetArrays.F_GET_ARRAYS;

	/**
	 * Get <code>public.f_get_arrays</code> as a field
	 */
	public static FGetArrays F_GET_ARRAYS(Integer pId) {
		return FGetArrays.F_GET_ARRAYS.call(pId);
	}

	/**
	 * Get <code>public.f_get_arrays</code> as a field
	 */
	public static FGetArrays F_GET_ARRAYS(Field<Integer> pId) {
		return FGetArrays.F_GET_ARRAYS.call(pId);
	}

	/**
	 * The table public.f_search_book_ids
	 */
	public static final FSearchBookIds F_SEARCH_BOOK_IDS = org.jooq.test.postgres.generatedclasses.tables.FSearchBookIds.F_SEARCH_BOOK_IDS;

	/**
	 * Get <code>public.f_search_book_ids</code> as a field
	 */
	public static FSearchBookIds F_SEARCH_BOOK_IDS(String pTitle, Long pLimit, Long pOffset) {
		return FSearchBookIds.F_SEARCH_BOOK_IDS.call(pTitle, pLimit, pOffset);
	}

	/**
	 * Get <code>public.f_search_book_ids</code> as a field
	 */
	public static FSearchBookIds F_SEARCH_BOOK_IDS(Field<String> pTitle, Field<Long> pLimit, Field<Long> pOffset) {
		return FSearchBookIds.F_SEARCH_BOOK_IDS.call(pTitle, pLimit, pOffset);
	}

	/**
	 * The table public.f_search_book_titles
	 */
	public static final FSearchBookTitles F_SEARCH_BOOK_TITLES = org.jooq.test.postgres.generatedclasses.tables.FSearchBookTitles.F_SEARCH_BOOK_TITLES;

	/**
	 * Get <code>public.f_search_book_titles</code> as a field
	 */
	public static FSearchBookTitles F_SEARCH_BOOK_TITLES(String pTitle, Long pLimit, Long pOffset) {
		return FSearchBookTitles.F_SEARCH_BOOK_TITLES.call(pTitle, pLimit, pOffset);
	}

	/**
	 * Get <code>public.f_search_book_titles</code> as a field
	 */
	public static FSearchBookTitles F_SEARCH_BOOK_TITLES(Field<String> pTitle, Field<Long> pLimit, Field<Long> pOffset) {
		return FSearchBookTitles.F_SEARCH_BOOK_TITLES.call(pTitle, pLimit, pOffset);
	}

	/**
	 * The table public.f_search_books
	 */
	public static final FSearchBooks F_SEARCH_BOOKS = org.jooq.test.postgres.generatedclasses.tables.FSearchBooks.F_SEARCH_BOOKS;

	/**
	 * Get <code>public.f_search_books</code> as a field
	 */
	public static FSearchBooks F_SEARCH_BOOKS(String pTitle, Long pLimit, Long pOffset) {
		return FSearchBooks.F_SEARCH_BOOKS.call(pTitle, pLimit, pOffset);
	}

	/**
	 * Get <code>public.f_search_books</code> as a field
	 */
	public static FSearchBooks F_SEARCH_BOOKS(Field<String> pTitle, Field<Long> pLimit, Field<Long> pOffset) {
		return FSearchBooks.F_SEARCH_BOOKS.call(pTitle, pLimit, pOffset);
	}

	/**
	 * The table public.f_setof_bigint
	 */
	public static final FSetofBigint F_SETOF_BIGINT = org.jooq.test.postgres.generatedclasses.tables.FSetofBigint.F_SETOF_BIGINT;

	/**
	 * Get <code>public.f_setof_bigint</code> as a field
	 */
	public static FSetofBigint F_SETOF_BIGINT(Long arg) {
		return FSetofBigint.F_SETOF_BIGINT.call(arg);
	}

	/**
	 * Get <code>public.f_setof_bigint</code> as a field
	 */
	public static FSetofBigint F_SETOF_BIGINT(Field<Long> arg) {
		return FSetofBigint.F_SETOF_BIGINT.call(arg);
	}

	/**
	 * The table public.f_setof_void
	 */
	public static final FSetofVoid F_SETOF_VOID = org.jooq.test.postgres.generatedclasses.tables.FSetofVoid.F_SETOF_VOID;

	/**
	 * Get <code>public.f_setof_void</code> as a field
	 */
	public static FSetofVoid F_SETOF_VOID(Long arg) {
		return FSetofVoid.F_SETOF_VOID.call(arg);
	}

	/**
	 * Get <code>public.f_setof_void</code> as a field
	 */
	public static FSetofVoid F_SETOF_VOID(Field<Long> arg) {
		return FSetofVoid.F_SETOF_VOID.call(arg);
	}

	/**
	 * The table public.f_tables1
	 */
	public static final FTables1 F_TABLES1 = org.jooq.test.postgres.generatedclasses.tables.FTables1.F_TABLES1;

	/**
	 * Get <code>public.f_tables1</code> as a field
	 */
	public static FTables1 F_TABLES1() {
		return FTables1.F_TABLES1.call();
	}

	/**
	 * The table public.f_tables2
	 */
	public static final FTables2 F_TABLES2 = org.jooq.test.postgres.generatedclasses.tables.FTables2.F_TABLES2;

	/**
	 * Get <code>public.f_tables2</code> as a field
	 */
	public static FTables2 F_TABLES2() {
		return FTables2.F_TABLES2.call();
	}

	/**
	 * The table public.f_tables3
	 */
	public static final FTables3 F_TABLES3 = org.jooq.test.postgres.generatedclasses.tables.FTables3.F_TABLES3;

	/**
	 * Get <code>public.f_tables3</code> as a field
	 */
	public static FTables3 F_TABLES3() {
		return FTables3.F_TABLES3.call();
	}

	/**
	 * The table public.f_tables4
	 */
	public static final FTables4 F_TABLES4 = org.jooq.test.postgres.generatedclasses.tables.FTables4.F_TABLES4;

	/**
	 * Get <code>public.f_tables4</code> as a field
	 */
	public static FTables4 F_TABLES4(Integer inId) {
		return FTables4.F_TABLES4.call(inId);
	}

	/**
	 * Get <code>public.f_tables4</code> as a field
	 */
	public static FTables4 F_TABLES4(Field<Integer> inId) {
		return FTables4.F_TABLES4.call(inId);
	}

	/**
	 * The table public.f_tables5
	 */
	public static final FTables5 F_TABLES5 = org.jooq.test.postgres.generatedclasses.tables.FTables5.F_TABLES5;

	/**
	 * Get <code>public.f_tables5</code> as a field
	 */
	public static FTables5 F_TABLES5(Integer v1, Integer v2, Integer v3) {
		return FTables5.F_TABLES5.call(v1, v2, v3);
	}

	/**
	 * Get <code>public.f_tables5</code> as a field
	 */
	public static FTables5 F_TABLES5(Field<Integer> v1, Field<Integer> v2, Field<Integer> v3) {
		return FTables5.F_TABLES5.call(v1, v2, v3);
	}

	/**
	 * The table public.t_2781
	 */
	public static final T_2781 T_2781 = org.jooq.test.postgres.generatedclasses.tables.T_2781.T_2781;

	/**
	 * The table public.t_3111
	 */
	public static final T_3111 T_3111 = org.jooq.test.postgres.generatedclasses.tables.T_3111.T_3111;

	/**
	 * The table public.t_639_numbers_table
	 */
	public static final T_639NumbersTable T_639_NUMBERS_TABLE = org.jooq.test.postgres.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE;

	/**
	 * The table public.t_681
	 */
	public static final T_681 T_681 = org.jooq.test.postgres.generatedclasses.tables.T_681.T_681;

	/**
	 * The table public.t_725_lob_test
	 */
	public static final T_725LobTest T_725_LOB_TEST = org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST;

	/**
	 * The table public.t_785
	 */
	public static final T_785 T_785 = org.jooq.test.postgres.generatedclasses.tables.T_785.T_785;

	/**
	 * The table public.t_959
	 */
	public static final T_959 T_959 = org.jooq.test.postgres.generatedclasses.tables.T_959.T_959;

	/**
	 * The table public.t_986_1
	 */
	public static final T_986_1 T_986_1 = org.jooq.test.postgres.generatedclasses.tables.T_986_1.T_986_1;

	/**
	 * The table public.t_986_2
	 */
	public static final T_986_2 T_986_2 = org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2;

	/**
	 * The table public.t_arrays
	 */
	public static final TArrays T_ARRAYS = org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS;

	/**
	 * An entity holding authors of books
	 */
	public static final TAuthor T_AUTHOR = org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR;

	/**
	 * An entity holding books
	 */
	public static final TBook T_BOOK = org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK;

	/**
	 * A book store
	 */
	public static final TBookStore T_BOOK_STORE = org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE;

	/**
	 * An m:n relation between books and book stores
	 */
	public static final TBookToBookStore T_BOOK_TO_BOOK_STORE = org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE;

	/**
	 * The table public.t_booleans
	 */
	public static final TBooleans T_BOOLEANS = org.jooq.test.postgres.generatedclasses.tables.TBooleans.T_BOOLEANS;

	/**
	 * The table public.t_dates
	 */
	public static final TDates T_DATES = org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES;

	/**
	 * The table public.t_exotic_types
	 */
	public static final TExoticTypes T_EXOTIC_TYPES = org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES;

	/**
	 * The table public.t_identity
	 */
	public static final TIdentity T_IDENTITY = org.jooq.test.postgres.generatedclasses.tables.TIdentity.T_IDENTITY;

	/**
	 * The table public.t_identity_pk
	 */
	public static final TIdentityPk T_IDENTITY_PK = org.jooq.test.postgres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK;

	/**
	 * The table public.t_inheritance_1
	 */
	public static final TInheritance_1 T_INHERITANCE_1 = org.jooq.test.postgres.generatedclasses.tables.TInheritance_1.T_INHERITANCE_1;

	/**
	 * The table public.t_inheritance_1_1
	 */
	public static final TInheritance_1_1 T_INHERITANCE_1_1 = org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_1.T_INHERITANCE_1_1;

	/**
	 * The table public.t_inheritance_1_2
	 */
	public static final TInheritance_1_2 T_INHERITANCE_1_2 = org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2.T_INHERITANCE_1_2;

	/**
	 * The table public.t_inheritance_1_2_1
	 */
	public static final TInheritance_1_2_1 T_INHERITANCE_1_2_1 = org.jooq.test.postgres.generatedclasses.tables.TInheritance_1_2_1.T_INHERITANCE_1_2_1;

	/**
	 * The table public.t_inheritance_all
	 */
	public static final TInheritanceAll T_INHERITANCE_ALL = org.jooq.test.postgres.generatedclasses.tables.TInheritanceAll.T_INHERITANCE_ALL;

	/**
	 * An entity holding language master data
	 */
	public static final TLanguage T_LANGUAGE = org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE;

	/**
	 * The table public.t_triggers
	 */
	public static final TTriggers T_TRIGGERS = org.jooq.test.postgres.generatedclasses.tables.TTriggers.T_TRIGGERS;

	/**
	 * The table public.t_unsigned
	 */
	public static final TUnsigned T_UNSIGNED = org.jooq.test.postgres.generatedclasses.tables.TUnsigned.T_UNSIGNED;

	/**
	 * The table public.v_author
	 */
	public static final VAuthor V_AUTHOR = org.jooq.test.postgres.generatedclasses.tables.VAuthor.V_AUTHOR;

	/**
	 * The table public.v_book
	 */
	public static final VBook V_BOOK = org.jooq.test.postgres.generatedclasses.tables.VBook.V_BOOK;

	/**
	 * The table public.v_library
	 */
	public static final VLibrary V_LIBRARY = org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY;

	/**
	 * The table public.x_test_case_2025
	 */
	public static final XTestCase_2025 X_TEST_CASE_2025 = org.jooq.test.postgres.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025;

	/**
	 * The table public.x_test_case_64_69
	 */
	public static final XTestCase_64_69 X_TEST_CASE_64_69 = org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69;

	/**
	 * The table public.x_test_case_71
	 */
	public static final XTestCase_71 X_TEST_CASE_71 = org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71;

	/**
	 * The table public.x_test_case_85
	 */
	public static final XTestCase_85 X_TEST_CASE_85 = org.jooq.test.postgres.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85;

	/**
	 * An unused table in the same schema.
	 */
	public static final XUnused X_UNUSED = org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED;
}
