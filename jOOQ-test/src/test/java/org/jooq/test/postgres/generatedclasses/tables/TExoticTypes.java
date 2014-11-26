/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 756796636;

	/**
	 * The reference instance of <code>public.t_exotic_types</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.postgres.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>public.t_exotic_types.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>public.t_exotic_types.uu</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("uu", org.jooq.impl.SQLDataType.UUID, this, "");

	/**
	 * The column <code>public.t_exotic_types.js</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Object> JS = createField("js", org.jooq.impl.SQLDataType.OTHER, this, "");

	/**
	 * The column <code>public.t_exotic_types.js_gson</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, com.google.gson.JsonElement> JS_GSON = createField("js_gson", org.jooq.impl.SQLDataType.OTHER, this, "", new org.jooq.test.all.bindings.PostgresJSONGsonBinding());

	/**
	 * The column <code>public.t_exotic_types.js_javax</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Object> JS_JAVAX = createField("js_javax", org.jooq.impl.SQLDataType.OTHER, this, "");

	/**
	 * The column <code>public.t_exotic_types.js_jackson</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, org.jooq.test.all.types.JSONJacksonHelloWorld> JS_JACKSON = createField("js_jackson", org.jooq.impl.SQLDataType.OTHER, this, "", new org.jooq.test.all.bindings.PostgresJSONJacksonBinding());

	/**
	 * The column <code>public.t_exotic_types.js_jackson_json_node</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, org.codehaus.jackson.JsonNode> JS_JACKSON_JSON_NODE = createField("js_jackson_json_node", org.jooq.impl.SQLDataType.OTHER, this, "", new org.jooq.test.all.bindings.PostgresJSONJacksonJsonNodeBinding());

	/**
	 * The column <code>public.t_exotic_types.hstore</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Object> HSTORE = createField("hstore", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

	/**
	 * The column <code>public.t_exotic_types.hstore_map</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord, java.util.Map<String, String>> HSTORE_MAP = createField("hstore_map", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "", new org.jooq.test.all.bindings.PostgresHstoreMapBinding());

	/**
	 * Create a <code>public.t_exotic_types</code> table reference
	 */
	public TExoticTypes() {
		this("t_exotic_types", null);
	}

	/**
	 * Create an aliased <code>public.t_exotic_types</code> table reference
	 */
	public TExoticTypes(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}

	private TExoticTypes(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord> aliased) {
		this(alias, aliased, null);
	}

	private TExoticTypes(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TExoticTypes as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TExoticTypes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.TExoticTypes rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.TExoticTypes(name, null);
	}
}
