/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;

import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JIntegrationRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIntegration extends TableImpl<JIntegrationRecord> {

    private static final long serialVersionUID = 678487208;

    /**
     * The reference instance of <code>public.integration</code>
     */
    public static final JIntegration INTEGRATION = new JIntegration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JIntegrationRecord> getRecordType() {
        return JIntegrationRecord.class;
    }

    /**
     * The column <code>public.integration.id</code>.
     */
    public final TableField<JIntegrationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('integration_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.integration.name</code>.
     */
    public final TableField<JIntegrationRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.integration.project_id</code>.
     */
    public final TableField<JIntegrationRecord, Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.integration.type</code>.
     */
    public final TableField<JIntegrationRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.integration.enabled</code>.
     */
    public final TableField<JIntegrationRecord, Boolean> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.integration.params</code>.
     */
    public final TableField<JIntegrationRecord, Object> PARAMS = createField("params", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), this, "");

    /**
     * The column <code>public.integration.creation_date</code>.
     */
    public final TableField<JIntegrationRecord, Timestamp> CREATION_DATE = createField("creation_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.integration</code> table reference
     */
    public JIntegration() {
        this(DSL.name("integration"), null);
    }

    /**
     * Create an aliased <code>public.integration</code> table reference
     */
    public JIntegration(String alias) {
        this(DSL.name(alias), INTEGRATION);
    }

    /**
     * Create an aliased <code>public.integration</code> table reference
     */
    public JIntegration(Name alias) {
        this(alias, INTEGRATION);
    }

    private JIntegration(Name alias, Table<JIntegrationRecord> aliased) {
        this(alias, aliased, null);
    }

    private JIntegration(Name alias, Table<JIntegrationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JIntegration(Table<O> child, ForeignKey<O, JIntegrationRecord> key) {
        super(child, key, INTEGRATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INTEGR_PROJECT_IDX, Indexes.INTEGRATION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JIntegrationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_INTEGRATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JIntegrationRecord> getPrimaryKey() {
        return Keys.INTEGRATION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JIntegrationRecord>> getKeys() {
        return Arrays.<UniqueKey<JIntegrationRecord>>asList(Keys.INTEGRATION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JIntegrationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JIntegrationRecord, ?>>asList(Keys.INTEGRATION__INTEGRATION_PROJECT_ID_FKEY, Keys.INTEGRATION__INTEGRATION_TYPE_FKEY);
    }

    public JProject project() {
        return new JProject(this, Keys.INTEGRATION__INTEGRATION_PROJECT_ID_FKEY);
    }

    public JIntegrationType integrationType() {
        return new JIntegrationType(this, Keys.INTEGRATION__INTEGRATION_TYPE_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegration as(String alias) {
        return new JIntegration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegration as(Name alias) {
        return new JIntegration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JIntegration rename(String name) {
        return new JIntegration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JIntegration rename(Name name) {
        return new JIntegration(name, null);
    }
}
