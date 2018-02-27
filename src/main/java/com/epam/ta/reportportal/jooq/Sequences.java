/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;

import javax.annotation.Generated;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.bug_tracking_system_id_seq</code>
     */
    public static final Sequence<Integer> BUG_TRACKING_SYSTEM_ID_SEQ = new SequenceImpl<Integer>("bug_tracking_system_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.dashboard_id_seq</code>
     */
    public static final Sequence<Integer> DASHBOARD_ID_SEQ = new SequenceImpl<Integer>("dashboard_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.defect_field_allowed_value_id_seq</code>
     */
    public static final Sequence<Integer> DEFECT_FIELD_ALLOWED_VALUE_ID_SEQ = new SequenceImpl<Integer>("defect_field_allowed_value_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.defect_form_field_id_seq</code>
     */
    public static final Sequence<Integer> DEFECT_FORM_FIELD_ID_SEQ = new SequenceImpl<Integer>("defect_form_field_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.issue_id_seq</code>
     */
    public static final Sequence<Long> ISSUE_ID_SEQ = new SequenceImpl<Long>("issue_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.issue_type_id_seq</code>
     */
    public static final Sequence<Integer> ISSUE_TYPE_ID_SEQ = new SequenceImpl<Integer>("issue_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.item_tag_id_seq</code>
     */
    public static final Sequence<Integer> ITEM_TAG_ID_SEQ = new SequenceImpl<Integer>("item_tag_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.launch_id_seq</code>
     */
    public static final Sequence<Long> LAUNCH_ID_SEQ = new SequenceImpl<Long>("launch_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.launch_tag_id_seq</code>
     */
    public static final Sequence<Long> LAUNCH_TAG_ID_SEQ = new SequenceImpl<Long>("launch_tag_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.log_id_seq</code>
     */
    public static final Sequence<Long> LOG_ID_SEQ = new SequenceImpl<Long>("log_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.oauth_registration_scope_id_seq</code>
     */
    public static final Sequence<Integer> OAUTH_REGISTRATION_SCOPE_ID_SEQ = new SequenceImpl<Integer>("oauth_registration_scope_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.project_configuration_id_seq</code>
     */
    public static final Sequence<Integer> PROJECT_CONFIGURATION_ID_SEQ = new SequenceImpl<Integer>("project_configuration_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.project_email_configuration_id_seq</code>
     */
    public static final Sequence<Integer> PROJECT_EMAIL_CONFIGURATION_ID_SEQ = new SequenceImpl<Integer>("project_email_configuration_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.project_id_seq</code>
     */
    public static final Sequence<Integer> PROJECT_ID_SEQ = new SequenceImpl<Integer>("project_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.server_settings_id_seq</code>
     */
    public static final Sequence<Short> SERVER_SETTINGS_ID_SEQ = new SequenceImpl<Short>("server_settings_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.SMALLINT.nullable(false));

    /**
     * The sequence <code>public.test_item_item_id_seq</code>
     */
    public static final Sequence<Long> TEST_ITEM_ITEM_ID_SEQ = new SequenceImpl<Long>("test_item_item_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.ticket_id_seq</code>
     */
    public static final Sequence<Long> TICKET_ID_SEQ = new SequenceImpl<Long>("ticket_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

    /**
     * The sequence <code>public.users_id_seq</code>
     */
    public static final Sequence<Integer> USERS_ID_SEQ = new SequenceImpl<Integer>("users_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.widget_id_seq</code>
     */
    public static final Sequence<Integer> WIDGET_ID_SEQ = new SequenceImpl<Integer>("widget_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}
