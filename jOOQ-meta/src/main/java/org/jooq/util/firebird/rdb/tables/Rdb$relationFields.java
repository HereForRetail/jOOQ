/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Rdb$relationFields extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1712305894;

	/**
	 * The singleton instance of <code>RDB$RELATION_FIELDS</code>
	 */
	public static final org.jooq.util.firebird.rdb.tables.Rdb$relationFields RDB$RELATION_FIELDS = new org.jooq.util.firebird.rdb.tables.Rdb$relationFields();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$FIELD_NAME = createField("RDB$FIELD_NAME", org.jooq.impl.SQLDataType.CHAR.length(31), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$RELATION_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$RELATION_NAME = createField("RDB$RELATION_NAME", org.jooq.impl.SQLDataType.CHAR.length(31), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_SOURCE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$FIELD_SOURCE = createField("RDB$FIELD_SOURCE", org.jooq.impl.SQLDataType.CHAR.length(31), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$QUERY_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$QUERY_NAME = createField("RDB$QUERY_NAME", org.jooq.impl.SQLDataType.CHAR.length(31), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$BASE_FIELD</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$BASE_FIELD = createField("RDB$BASE_FIELD", org.jooq.impl.SQLDataType.CHAR.length(31), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$EDIT_STRING</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$EDIT_STRING = createField("RDB$EDIT_STRING", org.jooq.impl.SQLDataType.VARCHAR.length(127), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_POSITION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_POSITION = createField("RDB$FIELD_POSITION", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$QUERY_HEADER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$QUERY_HEADER = createField("RDB$QUERY_HEADER", org.jooq.impl.SQLDataType.CLOB.length(8), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$UPDATE_FLAG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$UPDATE_FLAG = createField("RDB$UPDATE_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$FIELD_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_ID = createField("RDB$FIELD_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$VIEW_CONTEXT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$VIEW_CONTEXT = createField("RDB$VIEW_CONTEXT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$DESCRIPTION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DESCRIPTION = createField("RDB$DESCRIPTION", org.jooq.impl.SQLDataType.CLOB.length(8), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$DEFAULT_VALUE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$DEFAULT_VALUE = createField("RDB$DEFAULT_VALUE", org.jooq.impl.SQLDataType.BLOB.length(8), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$SYSTEM_FLAG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$SYSTEM_FLAG = createField("RDB$SYSTEM_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$SECURITY_CLASS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$SECURITY_CLASS = createField("RDB$SECURITY_CLASS", org.jooq.impl.SQLDataType.CHAR.length(31), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$COMPLEX_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$COMPLEX_NAME = createField("RDB$COMPLEX_NAME", org.jooq.impl.SQLDataType.CHAR.length(31), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$NULL_FLAG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$NULL_FLAG = createField("RDB$NULL_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$DEFAULT_SOURCE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DEFAULT_SOURCE = createField("RDB$DEFAULT_SOURCE", org.jooq.impl.SQLDataType.CLOB.length(8), this);

	/**
	 * The column <code>RDB$RELATION_FIELDS.RDB$COLLATION_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$COLLATION_ID = createField("RDB$COLLATION_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * Create a <code>RDB$RELATION_FIELDS</code> table reference
	 */
	public Rdb$relationFields() {
		super("RDB$RELATION_FIELDS", org.jooq.util.firebird.rdb.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>RDB$RELATION_FIELDS</code> table reference
	 */
	public Rdb$relationFields(java.lang.String alias) {
		super(alias, org.jooq.util.firebird.rdb.DefaultSchema.DEFAULT_SCHEMA, org.jooq.util.firebird.rdb.tables.Rdb$relationFields.RDB$RELATION_FIELDS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.firebird.rdb.tables.Rdb$relationFields as(java.lang.String alias) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$relationFields(alias);
	}
}
