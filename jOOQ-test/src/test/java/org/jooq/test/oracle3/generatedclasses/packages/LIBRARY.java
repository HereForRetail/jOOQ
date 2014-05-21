/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in LIBRARY
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LIBRARY extends org.jooq.impl.PackageImpl implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -1583024469;

	/**
	 * The singleton instance of <code>TEST.LIBRARY</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.packages.LIBRARY LIBRARY = new org.jooq.test.oracle3.generatedclasses.packages.LIBRARY();

	/**
	 * Call <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS</code>
	 */
	public static java.math.BigDecimal call_PKG_F_AUTHOR_EXISTS______ABC_1(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_1(java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		return f.asField();
	}

	/**
	 * Get <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_1(org.jooq.Field<java.lang.String> AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_1();
		f.setAUTHOR_NAME(AUTHOR_NAME);

		return f.asField();
	}

	/**
	 * Call <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS</code>
	 */
	public static java.math.BigDecimal call_PKG_F_AUTHOR_EXISTS______ABC_2(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_2(java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		return f.asField();
	}

	/**
	 * Get <code>TEST.LIBRARY.PKG_F_AUTHOR_EXISTS</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_AUTHOR_EXISTS______ABC_2(org.jooq.Field<java.lang.String> AUTHOR_NAME, org.jooq.Field<? extends java.lang.Number> UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2 f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_AUTHOR_EXISTS______ABC_2();
		f.setAUTHOR_NAME(AUTHOR_NAME);
		f.setUNUSED(UNUSED);

		return f.asField();
	}

	/**
	 * Call <code>TEST.LIBRARY.PKG_F_UNUSED</code>
	 */
	public static java.math.BigDecimal call_PKG_F_UNUSED(org.jooq.Configuration configuration) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>TEST.LIBRARY.PKG_F_UNUSED</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_PKG_F_UNUSED() {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED f = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F_UNUSED();

		return f.asField();
	}

	/**
	 * Call <code>TEST.LIBRARY.PKG_F378</code>
	 */
	public static org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378 call_PKG_F378(org.jooq.Configuration configuration, java.lang.Number I, java.lang.Number IO) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378 p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_F378();
		p.setI(I);
		p.setIO(IO);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>TEST.LIBRARY.PKG_P_AUTHOR_EXISTS</code>
	 */
	public static java.math.BigDecimal call_PKG_P_AUTHOR_EXISTS______ABC_1(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_1 p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_1();
		p.setAUTHOR_NAME(AUTHOR_NAME);

		p.execute(configuration);
		return p.getRESULT();
	}

	/**
	 * Call <code>TEST.LIBRARY.PKG_P_AUTHOR_EXISTS</code>
	 */
	public static org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2 call_PKG_P_AUTHOR_EXISTS______ABC_2(org.jooq.Configuration configuration, java.lang.String AUTHOR_NAME, java.lang.Number UNUSED) {
		org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2 p = new org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2();
		p.setAUTHOR_NAME(AUTHOR_NAME);
		p.setUNUSED(UNUSED);

		p.execute(configuration);
		return p;
	}

	/**
	 * No further instances allowed
	 */
	private LIBRARY() {
		super("LIBRARY", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}
}
