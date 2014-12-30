/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.h2.generatedclasses.Keys;
import org.jooq.test.h2.generatedclasses.Public;
import org.jooq.test.h2.generatedclasses.tables.records.XTestCase_2025Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025 extends TableImpl<XTestCase_2025Record> {

	private static final long serialVersionUID = -1930473819;

	/**
	 * The reference instance of <code>PUBLIC.X_TEST_CASE_2025</code>
	 */
	public static final XTestCase_2025 X_TEST_CASE_2025 = new XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_2025Record> getRecordType() {
		return XTestCase_2025Record.class;
	}

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_2025.REF_ID</code>.
	 */
	public final TableField<XTestCase_2025Record, Integer> REF_ID = createField("REF_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	public final TableField<XTestCase_2025Record, String> REF_NAME = createField("REF_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.X_TEST_CASE_2025</code> table reference
	 */
	public XTestCase_2025() {
		this("X_TEST_CASE_2025", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.X_TEST_CASE_2025</code> table reference
	 */
	public XTestCase_2025(String alias) {
		this(alias, X_TEST_CASE_2025);
	}

	private XTestCase_2025(String alias, Table<XTestCase_2025Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_2025(String alias, Table<XTestCase_2025Record> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<XTestCase_2025Record, ?>> getReferences() {
		return Arrays.<ForeignKey<XTestCase_2025Record, ?>>asList(Keys.FK_X_TEST_CASE_2025_1, Keys.FK_X_TEST_CASE_2025_2, Keys.FK_X_TEST_CASE_2025_3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_2025 as(String alias) {
		return new XTestCase_2025(alias, this);
	}

	/**
	 * Rename this table
	 */
	public XTestCase_2025 rename(String name) {
		return new XTestCase_2025(name, null);
	}
}
