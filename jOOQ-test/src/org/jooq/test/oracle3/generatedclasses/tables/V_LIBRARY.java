/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class V_LIBRARY extends org.jooq.impl.TableImpl<org.jooq.Record> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1730092957;

	/**
	 * The singleton instance of TEST.V_LIBRARY
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY V_LIBRARY = new org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>TEST.V_LIBRARY.AUTHOR</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>TEST.V_LIBRARY.TITLE</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	public V_LIBRARY() {
		super("V_LIBRARY", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public V_LIBRARY(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY(alias);
	}
}
