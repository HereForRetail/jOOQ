/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "t_identity_pk", schema = "test2")
public class TIdentityPk implements java.io.Serializable {

	private static final long serialVersionUID = 274303620;

	private java.lang.Integer id;
	private java.lang.Integer val;

	public TIdentityPk() {}

	public TIdentityPk(
		java.lang.Integer id,
		java.lang.Integer val
	) {
		this.id = id;
		this.val = val;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "val", precision = 10)
	public java.lang.Integer getVal() {
		return this.val;
	}

	public void setVal(java.lang.Integer val) {
		this.val = val;
	}
}
