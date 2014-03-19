/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VTransactionsByTime extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord> {

	private static final long serialVersionUID = -1711280268;

	/**
	 * The singleton instance of <code>TEST.V_TRANSACTIONS_BY_TIME</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.VTransactionsByTime V_TRANSACTIONS_BY_TIME = new org.jooq.test.oracle.generatedclasses.test.tables.VTransactionsByTime();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord.class;
	}

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.lang.Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.ACCOUNT_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.lang.Long> ACCOUNT_ID = createField("ACCOUNT_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.VALUE_DATE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.sql.Date> VALUE_DATE = createField("VALUE_DATE", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.AMOUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.math.BigDecimal> AMOUNT = createField("AMOUNT", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2).nullable(false), this, "");

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.CREDIT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.math.BigDecimal> CREDIT = createField("CREDIT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.DEBIT</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.math.BigDecimal> DEBIT = createField("DEBIT", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.CURRENT_BALANCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.math.BigDecimal> CURRENT_BALANCE = createField("CURRENT_BALANCE", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 2).nullable(false), this, "");

	/**
	 * The column <code>TEST.V_TRANSACTIONS_BY_TIME.TRANSACTION_NUMBER</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord, java.math.BigDecimal> TRANSACTION_NUMBER = createField("TRANSACTION_NUMBER", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * Create a <code>TEST.V_TRANSACTIONS_BY_TIME</code> table reference
	 */
	public VTransactionsByTime() {
		this("V_TRANSACTIONS_BY_TIME", null);
	}

	/**
	 * Create an aliased <code>TEST.V_TRANSACTIONS_BY_TIME</code> table reference
	 */
	public VTransactionsByTime(java.lang.String alias) {
		this(alias, org.jooq.test.oracle.generatedclasses.test.tables.VTransactionsByTime.V_TRANSACTIONS_BY_TIME);
	}

	private VTransactionsByTime(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord> aliased) {
		this(alias, aliased, null);
	}

	private VTransactionsByTime(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.VTransactionsByTimeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.VTransactionsByTime as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VTransactionsByTime(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.VTransactionsByTime rename(java.lang.String name) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.VTransactionsByTime(name, null);
	}
}
