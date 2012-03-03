/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DIRECTORY", schema = "TEST")
public class TDirectory implements java.io.Serializable {

	private static final long serialVersionUID = 1258234535;

	private java.lang.Integer id;
	private java.lang.Integer parentId;
	private java.lang.Byte    isDirectory;
	private java.lang.String  name;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "PARENT_ID")
	public java.lang.Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(java.lang.Integer parentId) {
		this.parentId = parentId;
	}

	@javax.persistence.Column(name = "IS_DIRECTORY")
	public java.lang.Byte getIsDirectory() {
		return this.isDirectory;
	}

	public void setIsDirectory(java.lang.Byte isDirectory) {
		this.isDirectory = isDirectory;
	}

	@javax.persistence.Column(name = "name")
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
}
