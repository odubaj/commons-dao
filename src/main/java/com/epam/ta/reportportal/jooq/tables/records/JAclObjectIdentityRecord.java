/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JAclObjectIdentity;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JAclObjectIdentityRecord extends UpdatableRecordImpl<JAclObjectIdentityRecord> implements Record6<Long, Long, String, Long, Long, Boolean> {

    private static final long serialVersionUID = 1370439583;

    /**
     * Setter for <code>public.acl_object_identity.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.acl_object_identity.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.acl_object_identity.object_id_class</code>.
     */
    public void setObjectIdClass(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.acl_object_identity.object_id_class</code>.
     */
    public Long getObjectIdClass() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.acl_object_identity.object_id_identity</code>.
     */
    public void setObjectIdIdentity(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.acl_object_identity.object_id_identity</code>.
     */
    public String getObjectIdIdentity() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.acl_object_identity.parent_object</code>.
     */
    public void setParentObject(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.acl_object_identity.parent_object</code>.
     */
    public Long getParentObject() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>public.acl_object_identity.owner_sid</code>.
     */
    public void setOwnerSid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.acl_object_identity.owner_sid</code>.
     */
    public Long getOwnerSid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.acl_object_identity.entries_inheriting</code>.
     */
    public void setEntriesInheriting(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.acl_object_identity.entries_inheriting</code>.
     */
    public Boolean getEntriesInheriting() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, String, Long, Long, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Long, String, Long, Long, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JAclObjectIdentity.ACL_OBJECT_IDENTITY.ID;
    }

    @Override
    public Field<Long> field2() {
        return JAclObjectIdentity.ACL_OBJECT_IDENTITY.OBJECT_ID_CLASS;
    }

    @Override
    public Field<String> field3() {
        return JAclObjectIdentity.ACL_OBJECT_IDENTITY.OBJECT_ID_IDENTITY;
    }

    @Override
    public Field<Long> field4() {
        return JAclObjectIdentity.ACL_OBJECT_IDENTITY.PARENT_OBJECT;
    }

    @Override
    public Field<Long> field5() {
        return JAclObjectIdentity.ACL_OBJECT_IDENTITY.OWNER_SID;
    }

    @Override
    public Field<Boolean> field6() {
        return JAclObjectIdentity.ACL_OBJECT_IDENTITY.ENTRIES_INHERITING;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getObjectIdClass();
    }

    @Override
    public String component3() {
        return getObjectIdIdentity();
    }

    @Override
    public Long component4() {
        return getParentObject();
    }

    @Override
    public Long component5() {
        return getOwnerSid();
    }

    @Override
    public Boolean component6() {
        return getEntriesInheriting();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getObjectIdClass();
    }

    @Override
    public String value3() {
        return getObjectIdIdentity();
    }

    @Override
    public Long value4() {
        return getParentObject();
    }

    @Override
    public Long value5() {
        return getOwnerSid();
    }

    @Override
    public Boolean value6() {
        return getEntriesInheriting();
    }

    @Override
    public JAclObjectIdentityRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public JAclObjectIdentityRecord value2(Long value) {
        setObjectIdClass(value);
        return this;
    }

    @Override
    public JAclObjectIdentityRecord value3(String value) {
        setObjectIdIdentity(value);
        return this;
    }

    @Override
    public JAclObjectIdentityRecord value4(Long value) {
        setParentObject(value);
        return this;
    }

    @Override
    public JAclObjectIdentityRecord value5(Long value) {
        setOwnerSid(value);
        return this;
    }

    @Override
    public JAclObjectIdentityRecord value6(Boolean value) {
        setEntriesInheriting(value);
        return this;
    }

    @Override
    public JAclObjectIdentityRecord values(Long value1, Long value2, String value3, Long value4, Long value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JAclObjectIdentityRecord
     */
    public JAclObjectIdentityRecord() {
        super(JAclObjectIdentity.ACL_OBJECT_IDENTITY);
    }

    /**
     * Create a detached, initialised JAclObjectIdentityRecord
     */
    public JAclObjectIdentityRecord(Long id, Long objectIdClass, String objectIdIdentity, Long parentObject, Long ownerSid, Boolean entriesInheriting) {
        super(JAclObjectIdentity.ACL_OBJECT_IDENTITY);

        set(0, id);
        set(1, objectIdClass);
        set(2, objectIdIdentity);
        set(3, parentObject);
        set(4, ownerSid);
        set(5, entriesInheriting);
    }
}
