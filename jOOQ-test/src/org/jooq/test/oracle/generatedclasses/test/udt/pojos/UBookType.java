/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UBookType implements java.io.Serializable {

	private static final long serialVersionUID = 1099207975;

	private java.lang.Integer id;
	private java.lang.String  title;

	public UBookType() {}

	public UBookType(
		java.lang.Integer id,
		java.lang.String  title
	) {
		this.id = id;
		this.title = title;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.String title) {
		this.title = title;
	}
}
