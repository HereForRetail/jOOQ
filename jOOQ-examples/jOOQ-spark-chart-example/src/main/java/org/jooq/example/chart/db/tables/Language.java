/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.chart.db.Keys;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.LanguageRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Language extends TableImpl<LanguageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.language</code>
     */
    public static final Language LANGUAGE = new Language();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LanguageRecord> getRecordType() {
        return LanguageRecord.class;
    }

    /**
     * The column <code>public.language.language_id</code>.
     */
    public final TableField<LanguageRecord, Integer> LANGUAGE_ID = createField(DSL.name("language_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.language.name</code>.
     */
    public final TableField<LanguageRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.language.last_update</code>.
     */
    public final TableField<LanguageRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    private Language(Name alias, Table<LanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Language(Name alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.language</code> table reference
     */
    public Language(String alias) {
        this(DSL.name(alias), LANGUAGE);
    }

    /**
     * Create an aliased <code>public.language</code> table reference
     */
    public Language(Name alias) {
        this(alias, LANGUAGE);
    }

    /**
     * Create a <code>public.language</code> table reference
     */
    public Language() {
        this(DSL.name("language"), null);
    }

    public <O extends Record> Language(Table<O> child, ForeignKey<O, LanguageRecord> key) {
        super(child, key, LANGUAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<LanguageRecord, Integer> getIdentity() {
        return (Identity<LanguageRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LanguageRecord> getPrimaryKey() {
        return Keys.LANGUAGE_PKEY;
    }

    @Override
    public Language as(String alias) {
        return new Language(DSL.name(alias), this);
    }

    @Override
    public Language as(Name alias) {
        return new Language(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(String name) {
        return new Language(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(Name name) {
        return new Language(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
