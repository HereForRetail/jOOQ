/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TDatesDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates, java.lang.Integer> {

	/**
	 * Create a new TDatesDao without any factory
	 */
	public TDatesDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates.class);
	}

	/**
	 * Create a new TDatesDao with an attached factory
	 */
	public TDatesDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES, org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.TDates object) {
		return object.getId();
	}
}
