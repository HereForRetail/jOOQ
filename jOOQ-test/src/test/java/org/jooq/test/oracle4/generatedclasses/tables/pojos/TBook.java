/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle4.generatedclasses.tables.pojos;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_BOOK", schema = "TEST")
public class TBook implements Serializable {

	private static final long serialVersionUID = -2069084652;

	private Integer id;
	private Integer authorId;

	public TBook() {}

	public TBook(TBook value) {
		this.id = value.id;
		this.authorId = value.authorId;
	}

	public TBook(
		Integer id,
		Integer authorId
	) {
		this.id = id;
		this.authorId = authorId;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@NotNull
	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
}
