/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.h2.generatedclasses.Public;
import org.jooq.test.h2.generatedclasses.tables.records.V_2603Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class V_2603 extends TableImpl<V_2603Record> {

	private static final long serialVersionUID = 76824716;

	/**
	 * The reference instance of <code>PUBLIC.V_2603</code>
	 */
	public static final V_2603 V_2603 = new V_2603();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<V_2603Record> getRecordType() {
		return V_2603Record.class;
	}

	/**
	 * The column <code>PUBLIC.V_2603.COL1</code>.
	 */
	public final TableField<V_2603Record, Integer> COL1 = createField("COL1", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.V_2603.COL4</code>.
	 */
	public final TableField<V_2603Record, Integer> COL4 = createField("COL4", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.V_2603</code> table reference
	 */
	public V_2603() {
		this("V_2603", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.V_2603</code> table reference
	 */
	public V_2603(String alias) {
		this(alias, V_2603);
	}

	private V_2603(String alias, Table<V_2603Record> aliased) {
		this(alias, aliased, null);
	}

	private V_2603(String alias, Table<V_2603Record> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_2603 as(String alias) {
		return new V_2603(alias, this);
	}

	/**
	 * Rename this table
	 */
	public V_2603 rename(String name) {
		return new V_2603(name, null);
	}
}
