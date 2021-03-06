/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JSenderCaseRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JSenderCase extends TableImpl<JSenderCaseRecord> {

    private static final long serialVersionUID = -964535423;

    /**
     * The reference instance of <code>public.sender_case</code>
     */
    public static final JSenderCase SENDER_CASE = new JSenderCase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JSenderCaseRecord> getRecordType() {
        return JSenderCaseRecord.class;
    }

    /**
     * The column <code>public.sender_case.id</code>.
     */
    public final TableField<JSenderCaseRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('sender_case_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.sender_case.send_case</code>.
     */
    public final TableField<JSenderCaseRecord, String> SEND_CASE = createField(DSL.name("send_case"), org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>public.sender_case.project_id</code>.
     */
    public final TableField<JSenderCaseRecord, Long> PROJECT_ID = createField(DSL.name("project_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('sender_case_project_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.sender_case.enabled</code>.
     */
    public final TableField<JSenderCaseRecord, Boolean> ENABLED = createField(DSL.name("enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>public.sender_case</code> table reference
     */
    public JSenderCase() {
        this(DSL.name("sender_case"), null);
    }

    /**
     * Create an aliased <code>public.sender_case</code> table reference
     */
    public JSenderCase(String alias) {
        this(DSL.name(alias), SENDER_CASE);
    }

    /**
     * Create an aliased <code>public.sender_case</code> table reference
     */
    public JSenderCase(Name alias) {
        this(alias, SENDER_CASE);
    }

    private JSenderCase(Name alias, Table<JSenderCaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private JSenderCase(Name alias, Table<JSenderCaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JSenderCase(Table<O> child, ForeignKey<O, JSenderCaseRecord> key) {
        super(child, key, SENDER_CASE);
    }

    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SENDER_CASE_PK, Indexes.SENDER_CASE_PROJECT_IDX);
    }

    @Override
    public Identity<JSenderCaseRecord, Long> getIdentity() {
        return Keys.IDENTITY_SENDER_CASE;
    }

    @Override
    public UniqueKey<JSenderCaseRecord> getPrimaryKey() {
        return Keys.SENDER_CASE_PK;
    }

    @Override
    public List<UniqueKey<JSenderCaseRecord>> getKeys() {
        return Arrays.<UniqueKey<JSenderCaseRecord>>asList(Keys.SENDER_CASE_PK);
    }

    @Override
    public List<ForeignKey<JSenderCaseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JSenderCaseRecord, ?>>asList(Keys.SENDER_CASE__SENDER_CASE_PROJECT_ID_FKEY);
    }

    public JProject project() {
        return new JProject(this, Keys.SENDER_CASE__SENDER_CASE_PROJECT_ID_FKEY);
    }

    @Override
    public JSenderCase as(String alias) {
        return new JSenderCase(DSL.name(alias), this);
    }

    @Override
    public JSenderCase as(Name alias) {
        return new JSenderCase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JSenderCase rename(String name) {
        return new JSenderCase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JSenderCase rename(Name name) {
        return new JSenderCase(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, Long, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
