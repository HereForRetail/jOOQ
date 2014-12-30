/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;


import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.h2.generatedclasses.tables.TBookStore;
import org.jooq.test.h2.generatedclasses.tables.records.TBookStoreRecord;


/**
 * A book store
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStoreDao extends DAOImpl<TBookStoreRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore, String> {

	/**
	 * Create a new TBookStoreDao without any configuration
	 */
	public TBookStoreDao() {
		super(TBookStore.T_BOOK_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore.class);
	}

	/**
	 * Create a new TBookStoreDao with an attached configuration
	 */
	public TBookStoreDao(Configuration configuration) {
		super(TBookStore.T_BOOK_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getId(org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore object) {
		return object.getName();
	}

	/**
	 * Fetch records that have <code>NAME IN (values)</code>
	 */
	public List<org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore> fetchByName(String... values) {
		return fetch(TBookStore.T_BOOK_STORE.NAME, values);
	}

	/**
	 * Fetch a unique record that has <code>NAME = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.TBookStore fetchOneByName(String value) {
		return fetchOne(TBookStore.T_BOOK_STORE.NAME, value);
	}
}
