/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = -1195915207;

	/**
	 * The singleton instance of test.t_booleans
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.mysql.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord.class;
	}

	/**
	 * The table column <code>test.t_booleans.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.one_zero</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_10> ONE_ZERO = createField("one_zero", org.jooq.impl.SQLDataType.INTEGER.asConvertedDataType(new org.jooq.test._.converters.Boolean_10_Converter()), T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.true_false_lc</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_LC> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_LC_Converter()), T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.true_false_uc</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_UC> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_UC_Converter()), T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.yes_no_lc</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_LC> YES_NO_LC = createField("yes_no_lc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_LC_Converter()), T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.yes_no_uc</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_UC> YES_NO_UC = createField("yes_no_uc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_UC_Converter()), T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.y_n_lc</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_LC> Y_N_LC = createField("y_n_lc", org.jooq.impl.SQLDataType.CHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_LC_Converter()), T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.y_n_uc</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_UC> Y_N_UC = createField("y_n_uc", org.jooq.impl.SQLDataType.CHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_UC_Converter()), T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.vc_boolean</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("vc_boolean", org.jooq.impl.SQLDataType.BOOLEAN, T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.c_boolean</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("c_boolean", org.jooq.impl.SQLDataType.BOOLEAN, T_BOOLEANS);

	/**
	 * The table column <code>test.t_booleans.n_boolean</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("n_boolean", org.jooq.impl.SQLDataType.BOOLEAN, T_BOOLEANS);

	/**
	 * No further instances allowed
	 */
	private TBooleans() {
		super("t_booleans", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOLEANS_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOLEANS_PRIMARY);
	}
}
