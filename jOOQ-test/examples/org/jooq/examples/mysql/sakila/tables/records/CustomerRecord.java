/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class CustomerRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> {

	private static final long serialVersionUID = -1712418677;

	/**
	 * The table column <code>sakila.customer.customer_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setCustomerId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID, value);
	}

	/**
	 * The table column <code>sakila.customer.customer_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Short getCustomerId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID);
	}

	/**
	 * The table column <code>sakila.customer.customer_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> fetchPaymentList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT)
			.where(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * The table column <code>sakila.customer.customer_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> fetchRentalList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL)
			.where(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * The table column <code>sakila.customer.store_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public void setStoreId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID, value);
	}

	/**
	 * The table column <code>sakila.customer.store_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public java.lang.Byte getStoreId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID);
	}

	/**
	 * The table column <code>sakila.customer.store_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_store
	 * FOREIGN KEY (store_id)
	 * REFERENCES sakila.store (store_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.StoreRecord fetchStore() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>sakila.customer.first_name</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.FIRST_NAME, value);
	}

	/**
	 * The table column <code>sakila.customer.first_name</code>
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.FIRST_NAME);
	}

	/**
	 * The table column <code>sakila.customer.last_name</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_NAME, value);
	}

	/**
	 * The table column <code>sakila.customer.last_name</code>
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_NAME);
	}

	/**
	 * The table column <code>sakila.customer.email</code>
	 */
	public void setEmail(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.EMAIL, value);
	}

	/**
	 * The table column <code>sakila.customer.email</code>
	 */
	public java.lang.String getEmail() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.EMAIL);
	}

	/**
	 * The table column <code>sakila.customer.address_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_address
	 * FOREIGN KEY (address_id)
	 * REFERENCES sakila.address (address_id)
	 * </pre></code>
	 */
	public void setAddressId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID, value);
	}

	/**
	 * The table column <code>sakila.customer.address_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_address
	 * FOREIGN KEY (address_id)
	 * REFERENCES sakila.address (address_id)
	 * </pre></code>
	 */
	public java.lang.Short getAddressId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID);
	}

	/**
	 * The table column <code>sakila.customer.address_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_customer_address
	 * FOREIGN KEY (address_id)
	 * REFERENCES sakila.address (address_id)
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.AddressRecord fetchAddress() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS)
			.where(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>sakila.customer.active</code>
	 */
	public void setActive(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ACTIVE, value);
	}

	/**
	 * The table column <code>sakila.customer.active</code>
	 */
	public java.lang.Byte getActive() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ACTIVE);
	}

	/**
	 * The table column <code>sakila.customer.create_date</code>
	 */
	public void setCreateDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CREATE_DATE, value);
	}

	/**
	 * The table column <code>sakila.customer.create_date</code>
	 */
	public java.sql.Timestamp getCreateDate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CREATE_DATE);
	}

	/**
	 * The table column <code>sakila.customer.last_update</code>
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_UPDATE, value);
	}

	/**
	 * The table column <code>sakila.customer.last_update</code>
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_UPDATE);
	}

	/**
	 * Create a detached CustomerRecord
	 */
	public CustomerRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER);
	}
}
