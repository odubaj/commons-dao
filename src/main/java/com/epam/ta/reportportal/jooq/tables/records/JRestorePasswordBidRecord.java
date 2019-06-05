/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.JRestorePasswordBid;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class JRestorePasswordBidRecord extends UpdatableRecordImpl<JRestorePasswordBidRecord> implements Record3<String, Timestamp, String> {

    private static final long serialVersionUID = -111967646;

    /**
     * Setter for <code>public.restore_password_bid.uuid</code>.
     */
    public void setUuid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.restore_password_bid.uuid</code>.
     */
    public String getUuid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.restore_password_bid.last_modified</code>.
     */
    public void setLastModified(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.restore_password_bid.last_modified</code>.
     */
    public Timestamp getLastModified() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>public.restore_password_bid.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.restore_password_bid.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Timestamp, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Timestamp, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return JRestorePasswordBid.RESTORE_PASSWORD_BID.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return JRestorePasswordBid.RESTORE_PASSWORD_BID.LAST_MODIFIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JRestorePasswordBid.RESTORE_PASSWORD_BID.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getLastModified();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JRestorePasswordBidRecord value1(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JRestorePasswordBidRecord value2(Timestamp value) {
        setLastModified(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JRestorePasswordBidRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JRestorePasswordBidRecord values(String value1, Timestamp value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JRestorePasswordBidRecord
     */
    public JRestorePasswordBidRecord() {
        super(JRestorePasswordBid.RESTORE_PASSWORD_BID);
    }

    /**
     * Create a detached, initialised JRestorePasswordBidRecord
     */
    public JRestorePasswordBidRecord(String uuid, Timestamp lastModified, String email) {
        super(JRestorePasswordBid.RESTORE_PASSWORD_BID);

        set(0, uuid);
        set(1, lastModified);
        set(2, email);
    }
}
