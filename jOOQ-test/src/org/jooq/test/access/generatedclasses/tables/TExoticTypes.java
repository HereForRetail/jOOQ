/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = -1726496052;

	/**
	 * The singleton instance of <code>t_exotic_types</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.access.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>t_exotic_types.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>t_exotic_types.UU</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, this, "");

	/**
	 * Create a <code>t_exotic_types</code> table reference
	 */
	public TExoticTypes() {
		this("t_exotic_types", null);
	}

	/**
	 * Create an aliased <code>t_exotic_types</code> table reference
	 */
	public TExoticTypes(java.lang.String alias) {
		this(alias, org.jooq.test.access.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}

	private TExoticTypes(java.lang.String alias, org.jooq.Table<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord> aliased) {
		this(alias, aliased, null);
	}

	private TExoticTypes(java.lang.String alias, org.jooq.Table<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.access.generatedclasses.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.access.generatedclasses.Keys.PK_T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.access.generatedclasses.tables.TExoticTypes as(java.lang.String alias) {
		return new org.jooq.test.access.generatedclasses.tables.TExoticTypes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.access.generatedclasses.tables.TExoticTypes rename(java.lang.String name) {
		return new org.jooq.test.access.generatedclasses.tables.TExoticTypes(name, null);
	}
}
