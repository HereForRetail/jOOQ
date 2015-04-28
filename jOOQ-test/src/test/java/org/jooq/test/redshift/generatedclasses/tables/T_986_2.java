/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.redshift.generatedclasses.Public;
import org.jooq.test.redshift.generatedclasses.tables.records.T_986_2Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_986_2 extends TableImpl<T_986_2Record> {

	private static final long serialVersionUID = 1323576211;

	/**
	 * The reference instance of <code>public.t_986_2</code>
	 */
	public static final T_986_2 T_986_2 = new T_986_2();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T_986_2Record> getRecordType() {
		return T_986_2Record.class;
	}

	/**
	 * The column <code>public.t_986_2.ref</code>.
	 */
	public final TableField<T_986_2Record, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.t_986_2</code> table reference
	 */
	public T_986_2() {
		this("t_986_2", null);
	}

	/**
	 * Create an aliased <code>public.t_986_2</code> table reference
	 */
	public T_986_2(String alias) {
		this(alias, T_986_2);
	}

	private T_986_2(String alias, Table<T_986_2Record> aliased) {
		this(alias, aliased, null);
	}

	private T_986_2(String alias, Table<T_986_2Record> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_986_2 as(String alias) {
		return new T_986_2(alias, this);
	}

	/**
	 * Rename this table
	 */
	public T_986_2 rename(String name) {
		return new T_986_2(name, null);
	}
}
