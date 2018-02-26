/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq;

import com.epam.ta.reportportal.jooq.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.bug_tracking_system</code>.
     */
    public static final BugTrackingSystem BUG_TRACKING_SYSTEM = com.epam.ta.reportportal.jooq.tables.BugTrackingSystem.BUG_TRACKING_SYSTEM;

    /**
     * The table <code>public.dashboard</code>.
     */
    public static final Dashboard DASHBOARD = com.epam.ta.reportportal.jooq.tables.Dashboard.DASHBOARD;

    /**
     * The table <code>public.dashboard_widget</code>.
     */
    public static final DashboardWidget DASHBOARD_WIDGET = com.epam.ta.reportportal.jooq.tables.DashboardWidget.DASHBOARD_WIDGET;

    /**
     * The table <code>public.defect_field_allowed_value</code>.
     */
    public static final DefectFieldAllowedValue DEFECT_FIELD_ALLOWED_VALUE = com.epam.ta.reportportal.jooq.tables.DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE;

    /**
     * The table <code>public.defect_form_field</code>.
     */
    public static final DefectFormField DEFECT_FORM_FIELD = com.epam.ta.reportportal.jooq.tables.DefectFormField.DEFECT_FORM_FIELD;

    /**
     * The table <code>public.issue</code>.
     */
    public static final Issue ISSUE = com.epam.ta.reportportal.jooq.tables.Issue.ISSUE;

    /**
     * The table <code>public.issue_ticket</code>.
     */
    public static final IssueTicket ISSUE_TICKET = com.epam.ta.reportportal.jooq.tables.IssueTicket.ISSUE_TICKET;

    /**
     * The table <code>public.issue_type</code>.
     */
    public static final IssueType ISSUE_TYPE = com.epam.ta.reportportal.jooq.tables.IssueType.ISSUE_TYPE;

    /**
     * The table <code>public.issue_type_project_configuration</code>.
     */
    public static final IssueTypeProjectConfiguration ISSUE_TYPE_PROJECT_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION;

    /**
     * The table <code>public.item_tag</code>.
     */
    public static final ItemTag ITEM_TAG = com.epam.ta.reportportal.jooq.tables.ItemTag.ITEM_TAG;

    /**
     * The table <code>public.launch</code>.
     */
    public static final Launch LAUNCH = com.epam.ta.reportportal.jooq.tables.Launch.LAUNCH;

    /**
     * The table <code>public.launch_tag</code>.
     */
    public static final LaunchTag LAUNCH_TAG = com.epam.ta.reportportal.jooq.tables.LaunchTag.LAUNCH_TAG;

    /**
     * The table <code>public.log</code>.
     */
    public static final Log LOG = com.epam.ta.reportportal.jooq.tables.Log.LOG;

    /**
     * The table <code>public.oauth_access_token</code>.
     */
    public static final OauthAccessToken OAUTH_ACCESS_TOKEN = com.epam.ta.reportportal.jooq.tables.OauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>public.oauth_registration</code>.
     */
    public static final OauthRegistration OAUTH_REGISTRATION = com.epam.ta.reportportal.jooq.tables.OauthRegistration.OAUTH_REGISTRATION;

    /**
     * The table <code>public.oauth_registration_scope</code>.
     */
    public static final OauthRegistrationScope OAUTH_REGISTRATION_SCOPE = com.epam.ta.reportportal.jooq.tables.OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE;

    /**
     * The table <code>public.project</code>.
     */
    public static final Project PROJECT = com.epam.ta.reportportal.jooq.tables.Project.PROJECT;

    /**
     * The table <code>public.project_configuration</code>.
     */
    public static final ProjectConfiguration PROJECT_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.ProjectConfiguration.PROJECT_CONFIGURATION;

    /**
     * The table <code>public.project_email_configuration</code>.
     */
    public static final ProjectEmailConfiguration PROJECT_EMAIL_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.ProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION;

    /**
     * The table <code>public.project_user</code>.
     */
    public static final ProjectUser PROJECT_USER = com.epam.ta.reportportal.jooq.tables.ProjectUser.PROJECT_USER;

    /**
     * The table <code>public.server_settings</code>.
     */
    public static final ServerSettings SERVER_SETTINGS = com.epam.ta.reportportal.jooq.tables.ServerSettings.SERVER_SETTINGS;

    /**
     * The table <code>public.test_item</code>.
     */
    public static final TestItem TEST_ITEM = com.epam.ta.reportportal.jooq.tables.TestItem.TEST_ITEM;

    /**
     * The table <code>public.test_item_results</code>.
     */
    public static final TestItemResults TEST_ITEM_RESULTS = com.epam.ta.reportportal.jooq.tables.TestItemResults.TEST_ITEM_RESULTS;

    /**
     * The table <code>public.test_item_structure</code>.
     */
    public static final TestItemStructure TEST_ITEM_STRUCTURE = com.epam.ta.reportportal.jooq.tables.TestItemStructure.TEST_ITEM_STRUCTURE;

    /**
     * The table <code>public.ticket</code>.
     */
    public static final Ticket TICKET = com.epam.ta.reportportal.jooq.tables.Ticket.TICKET;

    /**
     * The table <code>public.users</code>.
     */
    public static final Users USERS = com.epam.ta.reportportal.jooq.tables.Users.USERS;

    /**
     * The table <code>public.widget</code>.
     */
    public static final Widget WIDGET = com.epam.ta.reportportal.jooq.tables.Widget.WIDGET;
}
