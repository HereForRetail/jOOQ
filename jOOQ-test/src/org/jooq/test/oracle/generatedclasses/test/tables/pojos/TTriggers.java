/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS", schema = "TEST")
public class TTriggers implements java.io.Serializable {

	private static final long serialVersionUID = -1198626880;

	private java.lang.Integer idGenerated;
	private java.lang.Integer id;
	private java.lang.Integer counter;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false)
	public java.lang.Integer getIdGenerated() {
		return this.idGenerated;
	}

	public void setIdGenerated(java.lang.Integer idGenerated) {
		this.idGenerated = idGenerated;
	}

	@javax.persistence.Column(name = "ID", nullable = false)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "COUNTER", nullable = false)
	public java.lang.Integer getCounter() {
		return this.counter;
	}

	public void setCounter(java.lang.Integer counter) {
		this.counter = counter;
	}
}
