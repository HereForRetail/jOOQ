/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hana.generatedclasses.routines;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.hana.generatedclasses.Dev_2zuu8jbrepcg8swgl0xwk7ntf;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FBook extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1955646855;

	/**
	 * The parameter <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_BOOK.P_IN</code>.
	 */
	public static final Parameter<Object> P_IN = createParameter("P_IN", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE_TYPE"), false);

	/**
	 * The parameter <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_BOOK.P_OUT</code>.
	 */
	public static final Parameter<Integer> P_OUT = createParameter("P_OUT", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public FBook() {
		super("F_BOOK", Dev_2zuu8jbrepcg8swgl0xwk7ntf.DEV_2ZUU8JBREPCG8SWGL0XWK7NTF);

		addInParameter(P_IN);
		addOutParameter(P_OUT);
	}

	/**
	 * Set the <code>P_IN</code> parameter IN value to the routine
	 */
	public void setPIn(Object value) {
		setValue(P_IN, value);
	}

	/**
	 * Get the <code>P_OUT</code> parameter OUT value from the routine
	 */
	public Integer getPOut() {
		return getValue(P_OUT);
	}
}
