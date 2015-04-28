/**
 * This class is generated by jOOQ
 */
package org.jooq.test.redshift.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.redshift.generatedclasses.Public;
import org.jooq.test.redshift.generatedclasses.tables.records.TBookRecord;


/**
 * An entity holding books
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends TableImpl<TBookRecord> {

	private static final long serialVersionUID = 1731968653;

	/**
	 * The reference instance of <code>public.t_book</code>
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return TBookRecord.class;
	}

	/**
	 * The column <code>public.t_book.id</code>. The book ID
	 */
	public final TableField<TBookRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The book ID");

	/**
	 * The column <code>public.t_book.author_id</code>. The author ID in entity 'author'
	 */
	public final TableField<TBookRecord, Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The author ID in entity 'author'");

	/**
	 * The column <code>public.t_book.co_author_id</code>.
	 */
	public final TableField<TBookRecord, Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.t_book.details_id</code>.
	 */
	public final TableField<TBookRecord, Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.t_book.title</code>. The book's title
	 */
	public final TableField<TBookRecord, Object> TITLE = createField("title", org.jooq.impl.DefaultDataType.getDefaultDataType("character varying"), this, "The book's title");

	/**
	 * The column <code>public.t_book.published_in</code>. The year the book was published in
	 */
	public final TableField<TBookRecord, Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The year the book was published in");

	/**
	 * The column <code>public.t_book.language_id</code>. The language of the book
	 */
	public final TableField<TBookRecord, Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "The language of the book");

	/**
	 * The column <code>public.t_book.content_text</code>. Some textual content of the book
	 */
	public final TableField<TBookRecord, Object> CONTENT_TEXT = createField("content_text", org.jooq.impl.DefaultDataType.getDefaultDataType("character varying"), this, "Some textual content of the book");

	/**
	 * The column <code>public.t_book.content_pdf</code>.
	 */
	public final TableField<TBookRecord, Object> CONTENT_PDF = createField("content_pdf", org.jooq.impl.DefaultDataType.getDefaultDataType("character varying"), this, "");

	/**
	 * Create a <code>public.t_book</code> table reference
	 */
	public TBook() {
		this("t_book", null);
	}

	/**
	 * Create an aliased <code>public.t_book</code> table reference
	 */
	public TBook(String alias) {
		this(alias, T_BOOK);
	}

	private TBook(String alias, Table<TBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBook(String alias, Table<TBookRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "An entity holding books");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBook as(String alias) {
		return new TBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TBook rename(String name) {
		return new TBook(name, null);
	}
}
