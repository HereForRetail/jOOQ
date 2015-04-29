/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hana.generatedclasses;


import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.test.hana.generatedclasses.routines.F317;
import org.jooq.test.hana.generatedclasses.routines.FBook;
import org.jooq.test.hana.generatedclasses.routines.FNumber;
import org.jooq.test.hana.generatedclasses.routines.FOne;
import org.jooq.test.hana.generatedclasses.routines.FOneTwo;
import org.jooq.test.hana.generatedclasses.routines.FTables1;
import org.jooq.test.hana.generatedclasses.routines.FTables2;
import org.jooq.test.hana.generatedclasses.routines.FTables3;
import org.jooq.test.hana.generatedclasses.routines.FTables4;
import org.jooq.test.hana.generatedclasses.routines.FTables5;
import org.jooq.test.hana.generatedclasses.routines.P391;
import org.jooq.test.hana.generatedclasses.routines.PAuthorExists;
import org.jooq.test.hana.generatedclasses.routines.PCreateAuthor;
import org.jooq.test.hana.generatedclasses.routines.PCreateAuthorByName;
import org.jooq.test.hana.generatedclasses.routines.PUnused;


/**
 * Convenience access to all stored procedures and functions in DEV_2ZUU8JBREPCG8SWGL0XWK7NTF
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F317</code>
	 */
	public static Integer f317(Configuration configuration, Integer p1, Integer p2, Integer p3, Integer p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F317</code> as a field
	 */
	public static Field<Integer> f317(Integer p1, Integer p2, Integer p3, Integer p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F317</code> as a field
	 */
	public static Field<Integer> f317(Field<Integer> p1, Field<Integer> p2, Field<Integer> p3, Field<Integer> p4) {
		F317 f = new F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_BOOK</code>
	 */
	public static Integer fBook(Configuration configuration, Object pIn) {
		FBook p = new FBook();
		p.setPIn(pIn);

		p.execute(configuration);
		return p.getPOut();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_NUMBER</code>
	 */
	public static Integer fNumber(Configuration configuration, Integer n) {
		FNumber f = new FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_NUMBER</code> as a field
	 */
	public static Field<Integer> fNumber(Integer n) {
		FNumber f = new FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_NUMBER</code> as a field
	 */
	public static Field<Integer> fNumber(Field<Integer> n) {
		FNumber f = new FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_ONE</code>
	 */
	public static Integer fOne(Configuration configuration) {
		FOne f = new FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_ONE</code> as a field
	 */
	public static Field<Integer> fOne() {
		FOne f = new FOne();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_ONE_TWO</code>
	 */
	public static void fOneTwo(Configuration configuration) {
		FOneTwo p = new FOneTwo();

		p.execute(configuration);
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES1</code>
	 */
	public static Object fTables1(Configuration configuration) {
		FTables1 f = new FTables1();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES1</code> as a field
	 */
	public static Field<Object> fTables1() {
		FTables1 f = new FTables1();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES2</code>
	 */
	public static Object fTables2(Configuration configuration) {
		FTables2 f = new FTables2();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES2</code> as a field
	 */
	public static Field<Object> fTables2() {
		FTables2 f = new FTables2();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES3</code>
	 */
	public static Object fTables3(Configuration configuration) {
		FTables3 f = new FTables3();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES3</code> as a field
	 */
	public static Field<Object> fTables3() {
		FTables3 f = new FTables3();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4</code>
	 */
	public static Object fTables4(Configuration configuration, Integer inId) {
		FTables4 f = new FTables4();
		f.setInId(inId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4</code> as a field
	 */
	public static Field<Object> fTables4(Integer inId) {
		FTables4 f = new FTables4();
		f.setInId(inId);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4</code> as a field
	 */
	public static Field<Object> fTables4(Field<Integer> inId) {
		FTables4 f = new FTables4();
		f.setInId(inId);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES5</code>
	 */
	public static Object fTables5(Configuration configuration, Integer v1, Integer v2, Integer v3) {
		FTables5 f = new FTables5();
		f.setV1(v1);
		f.setV2(v2);
		f.setV3(v3);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES5</code> as a field
	 */
	public static Field<Object> fTables5(Integer v1, Integer v2, Integer v3) {
		FTables5 f = new FTables5();
		f.setV1(v1);
		f.setV2(v2);
		f.setV3(v3);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES5</code> as a field
	 */
	public static Field<Object> fTables5(Field<Integer> v1, Field<Integer> v2, Field<Integer> v3) {
		FTables5 f = new FTables5();
		f.setV1(v1);
		f.setV2(v2);
		f.setV3(v3);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P391</code>
	 */
	public static P391 p391(Configuration configuration, Integer i1, Integer io1, Integer io2, Integer i2) {
		P391 p = new P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_AUTHOR_EXISTS</code>
	 */
	public static Integer pAuthorExists(Configuration configuration, String authorName) {
		PAuthorExists p = new PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_CREATE_AUTHOR</code>
	 */
	public static void pCreateAuthor(Configuration configuration) {
		PCreateAuthor p = new PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_CREATE_AUTHOR_BY_NAME</code>
	 */
	public static void pCreateAuthorByName(Configuration configuration, String firstName, String lastName) {
		PCreateAuthorByName p = new PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_UNUSED</code>
	 */
	public static PUnused pUnused(Configuration configuration, String in1, Integer out2) {
		PUnused p = new PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}
}
