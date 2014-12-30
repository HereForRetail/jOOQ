/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;


import org.jooq.test.h2.generatedclasses.tables.interfaces.IÄä;


/**
 * This is a POJO for table Ää.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ää implements IÄä {

	private static final long serialVersionUID = -705028557;

	private Integer öö;

	public Ää() {}

	public Ää(
		Integer öö
	) {
		this.öö = öö;
	}

	@Override
	public Integer getÖö() {
		return this.öö;
	}

	@Override
	public Ää setÖö(Integer öö) {
		this.öö = öö;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IÄä from) {
		setÖö(from.getÖö());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IÄä> E into(E into) {
		into.from(this);
		return into;
	}

	// Here, a toString() method could be generated
}
