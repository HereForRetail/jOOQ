/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables.pojos;


import org.jooq.test.redshift.generatedclasses.tables.interfaces.ITIdentity;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity implements ITIdentity {

	private static final long serialVersionUID = 1432492358;

	private final Integer id;
	private final Integer val;

	public TIdentity(TIdentity value) {
		this.id = value.id;
		this.val = value.val;
	}

	public TIdentity(
		Integer id,
		Integer val
	) {
		this.id = id;
		this.val = val;
	}

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public Integer getVal() {
		return this.val;
	}
}
