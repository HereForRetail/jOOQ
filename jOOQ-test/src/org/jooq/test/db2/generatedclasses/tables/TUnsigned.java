/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned extends org.jooq.impl.TableImpl<org.jooq.test.db2.generatedclasses.tables.records.TUnsignedRecord> {

	private static final long serialVersionUID = -512414008;

	/**
	 * The singleton instance of <code>LIBRARY.T_UNSIGNED</code>
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TUnsigned T_UNSIGNED = new org.jooq.test.db2.generatedclasses.tables.TUnsigned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TUnsignedRecord> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.TUnsignedRecord.class;
	}

	/**
	 * The column <code>LIBRARY.T_UNSIGNED.U_BYTE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UByte> U_BYTE = createField("U_BYTE", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>LIBRARY.T_UNSIGNED.U_SHORT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UShort> U_SHORT = createField("U_SHORT", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>LIBRARY.T_UNSIGNED.U_INT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UInteger> U_INT = createField("U_INT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>LIBRARY.T_UNSIGNED.U_LONG</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.ULong> U_LONG = createField("U_LONG", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, T_UNSIGNED);

	/**
	 * No further instances allowed
	 */
	private TUnsigned() {
		super("T_UNSIGNED", org.jooq.test.db2.generatedclasses.Library.LIBRARY);
	}
}
