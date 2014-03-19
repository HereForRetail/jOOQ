/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = 859137447;

	/**
	 * The singleton instance of <code>public.t_identity</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.postgres.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord.class;
	}

	/**
	 * The column <code>public.t_identity.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.t_identity.val</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>public.t_identity</code> table reference
	 */
	public TIdentity() {
		this("t_identity", null);
	}

	/**
	 * Create an aliased <code>public.t_identity</code> table reference
	 */
	public TIdentity(java.lang.String alias) {
		this(alias, org.jooq.test.postgres.generatedclasses.tables.TIdentity.T_IDENTITY);
	}

	private TIdentity(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> aliased) {
		this(alias, aliased, null);
	}

	private TIdentity(java.lang.String alias, org.jooq.Table<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.postgres.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TIdentity as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TIdentity(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.postgres.generatedclasses.tables.TIdentity rename(java.lang.String name) {
		return new org.jooq.test.postgres.generatedclasses.tables.TIdentity(name, null);
	}
}
