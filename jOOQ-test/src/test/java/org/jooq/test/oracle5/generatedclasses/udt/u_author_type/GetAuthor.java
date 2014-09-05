/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle5.generatedclasses.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetAuthor extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle5.generatedclasses.udt.records.UAuthorTypeRecord> {

	private static final long serialVersionUID = -1795999463;

	/**
	 * The parameter <code>TEST.U_AUTHOR_TYPE.GET_AUTHOR.RETURN_VALUE</code>.
	 */
		public static final org.jooq.Parameter<org.jooq.test.oracle5.generatedclasses.udt.records.UAuthorTypeRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle5.generatedclasses.udt.UAuthorType.U_AUTHOR_TYPE.getDataType(), false);

	/**
	 * The parameter <code>TEST.U_AUTHOR_TYPE.GET_AUTHOR.P_ID</code>.
	 */
		public static final org.jooq.Parameter<java.math.BigDecimal> P_ID = createParameter("P_ID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public GetAuthor() {
		super("GET_AUTHOR", org.jooq.test.oracle5.generatedclasses.Test.TEST, org.jooq.test.oracle5.generatedclasses.udt.UAuthorType.U_AUTHOR_TYPE, org.jooq.test.oracle5.generatedclasses.udt.UAuthorType.U_AUTHOR_TYPE.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_ID);
	}

	/**
	 * Set the <code>P_ID</code> parameter IN value to the routine
	 */
	public void setPId(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle5.generatedclasses.udt.u_author_type.GetAuthor.P_ID, value);
	}

	/**
	 * Set the <code>P_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPId(org.jooq.Field<java.math.BigDecimal> field) {
		setField(P_ID, field);
	}
}
