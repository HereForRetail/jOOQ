/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
public enum T_658_21 implements org.jooq.MasterDataType<java.lang.Integer> {

	/**
	 * 1
	 */
	_1(1),

	/**
	 * 2
	 */
	_2(2),

	/**
	 * 3
	 */
	_3(3),
	;

	private final java.lang.Integer id;

	private T_658_21(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.Integer getPrimaryKey() {
		return id;
	}

	/**
	 * The table column <code>LUKAS.T_658_21.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final java.lang.Integer getId() {
		return id;
	}
}
