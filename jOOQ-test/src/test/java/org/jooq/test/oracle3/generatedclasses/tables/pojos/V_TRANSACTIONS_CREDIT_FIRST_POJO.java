/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_TRANSACTIONS_CREDIT_FIRST", schema = "TEST")
public class V_TRANSACTIONS_CREDIT_FIRST_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_TRANSACTIONS_CREDIT_FIRST_INTERFACE {

	private static final long serialVersionUID = 1249307618;

	private java.lang.Long       ID;
	private java.lang.Long       ACCOUNT_ID;
	private java.sql.Date        VALUE_DATE;
	private java.math.BigDecimal AMOUNT;
	private java.math.BigDecimal CREDIT;
	private java.math.BigDecimal DEBIT;
	private java.math.BigDecimal CURRENT_BALANCE;
	private java.math.BigDecimal TRANSACTION_NUMBER;

	public V_TRANSACTIONS_CREDIT_FIRST_POJO() {}

	public V_TRANSACTIONS_CREDIT_FIRST_POJO(
		java.lang.Long       ID,
		java.lang.Long       ACCOUNT_ID,
		java.sql.Date        VALUE_DATE,
		java.math.BigDecimal AMOUNT,
		java.math.BigDecimal CREDIT,
		java.math.BigDecimal DEBIT,
		java.math.BigDecimal CURRENT_BALANCE,
		java.math.BigDecimal TRANSACTION_NUMBER
	) {
		this.ID = ID;
		this.ACCOUNT_ID = ACCOUNT_ID;
		this.VALUE_DATE = VALUE_DATE;
		this.AMOUNT = AMOUNT;
		this.CREDIT = CREDIT;
		this.DEBIT = DEBIT;
		this.CURRENT_BALANCE = CURRENT_BALANCE;
		this.TRANSACTION_NUMBER = TRANSACTION_NUMBER;
	}

	@javax.persistence.Column(name = "ID", nullable = false, precision = 10)
	@Override
	public java.lang.Long getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Long ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "ACCOUNT_ID", nullable = false, precision = 10)
	@Override
	public java.lang.Long getACCOUNT_ID() {
		return this.ACCOUNT_ID;
	}

	@Override
	public void setACCOUNT_ID(java.lang.Long ACCOUNT_ID) {
		this.ACCOUNT_ID = ACCOUNT_ID;
	}

	@javax.persistence.Column(name = "VALUE_DATE", nullable = false, length = 7)
	@Override
	public java.sql.Date getVALUE_DATE() {
		return this.VALUE_DATE;
	}

	@Override
	public void setVALUE_DATE(java.sql.Date VALUE_DATE) {
		this.VALUE_DATE = VALUE_DATE;
	}

	@javax.persistence.Column(name = "AMOUNT", nullable = false, precision = 10, scale = 2)
	@Override
	public java.math.BigDecimal getAMOUNT() {
		return this.AMOUNT;
	}

	@Override
	public void setAMOUNT(java.math.BigDecimal AMOUNT) {
		this.AMOUNT = AMOUNT;
	}

	@javax.persistence.Column(name = "CREDIT", length = 22)
	@Override
	public java.math.BigDecimal getCREDIT() {
		return this.CREDIT;
	}

	@Override
	public void setCREDIT(java.math.BigDecimal CREDIT) {
		this.CREDIT = CREDIT;
	}

	@javax.persistence.Column(name = "DEBIT", length = 22)
	@Override
	public java.math.BigDecimal getDEBIT() {
		return this.DEBIT;
	}

	@Override
	public void setDEBIT(java.math.BigDecimal DEBIT) {
		this.DEBIT = DEBIT;
	}

	@javax.persistence.Column(name = "CURRENT_BALANCE", nullable = false, precision = 10, scale = 2)
	@Override
	public java.math.BigDecimal getCURRENT_BALANCE() {
		return this.CURRENT_BALANCE;
	}

	@Override
	public void setCURRENT_BALANCE(java.math.BigDecimal CURRENT_BALANCE) {
		this.CURRENT_BALANCE = CURRENT_BALANCE;
	}

	@javax.persistence.Column(name = "TRANSACTION_NUMBER", length = 22)
	@Override
	public java.math.BigDecimal getTRANSACTION_NUMBER() {
		return this.TRANSACTION_NUMBER;
	}

	@Override
	public void setTRANSACTION_NUMBER(java.math.BigDecimal TRANSACTION_NUMBER) {
		this.TRANSACTION_NUMBER = TRANSACTION_NUMBER;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_TRANSACTIONS_CREDIT_FIRST_INTERFACE from) {
		setID(from.getID());
		setACCOUNT_ID(from.getACCOUNT_ID());
		setVALUE_DATE(from.getVALUE_DATE());
		setAMOUNT(from.getAMOUNT());
		setCREDIT(from.getCREDIT());
		setDEBIT(from.getDEBIT());
		setCURRENT_BALANCE(from.getCURRENT_BALANCE());
		setTRANSACTION_NUMBER(from.getTRANSACTION_NUMBER());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_TRANSACTIONS_CREDIT_FIRST_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
