/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq;

import com.epam.ta.reportportal.jooq.tables.*;
import com.epam.ta.reportportal.jooq.udt.Parameter;
import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.UDT;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1085767748;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.bug_tracking_system</code>.
     */
    public final BugTrackingSystem BUG_TRACKING_SYSTEM = com.epam.ta.reportportal.jooq.tables.BugTrackingSystem.BUG_TRACKING_SYSTEM;

    /**
     * The table <code>public.dashboard</code>.
     */
    public final Dashboard DASHBOARD = com.epam.ta.reportportal.jooq.tables.Dashboard.DASHBOARD;

    /**
     * The table <code>public.dashboard_widget</code>.
     */
    public final DashboardWidget DASHBOARD_WIDGET = com.epam.ta.reportportal.jooq.tables.DashboardWidget.DASHBOARD_WIDGET;

    /**
     * The table <code>public.defect_field_allowed_value</code>.
     */
    public final DefectFieldAllowedValue DEFECT_FIELD_ALLOWED_VALUE = com.epam.ta.reportportal.jooq.tables.DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE;

    /**
     * The table <code>public.defect_form_field</code>.
     */
    public final DefectFormField DEFECT_FORM_FIELD = com.epam.ta.reportportal.jooq.tables.DefectFormField.DEFECT_FORM_FIELD;

    /**
     * The table <code>public.issue</code>.
     */
    public final Issue ISSUE = com.epam.ta.reportportal.jooq.tables.Issue.ISSUE;

    /**
     * The table <code>public.issue_ticket</code>.
     */
    public final IssueTicket ISSUE_TICKET = com.epam.ta.reportportal.jooq.tables.IssueTicket.ISSUE_TICKET;

    /**
     * The table <code>public.issue_type</code>.
     */
    public final IssueType ISSUE_TYPE = com.epam.ta.reportportal.jooq.tables.IssueType.ISSUE_TYPE;

    /**
     * The table <code>public.issue_type_project_configuration</code>.
     */
    public final IssueTypeProjectConfiguration ISSUE_TYPE_PROJECT_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION;

    /**
     * The table <code>public.item_tag</code>.
     */
    public final ItemTag ITEM_TAG = com.epam.ta.reportportal.jooq.tables.ItemTag.ITEM_TAG;

    /**
     * The table <code>public.launch</code>.
     */
    public final Launch LAUNCH = com.epam.ta.reportportal.jooq.tables.Launch.LAUNCH;

    /**
     * The table <code>public.launch_tag</code>.
     */
    public final LaunchTag LAUNCH_TAG = com.epam.ta.reportportal.jooq.tables.LaunchTag.LAUNCH_TAG;

    /**
     * The table <code>public.log</code>.
     */
    public final Log LOG = com.epam.ta.reportportal.jooq.tables.Log.LOG;

    /**
     * The table <code>public.oauth_access_token</code>.
     */
    public final OauthAccessToken OAUTH_ACCESS_TOKEN = com.epam.ta.reportportal.jooq.tables.OauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>public.oauth_registration</code>.
     */
    public final OauthRegistration OAUTH_REGISTRATION = com.epam.ta.reportportal.jooq.tables.OauthRegistration.OAUTH_REGISTRATION;

    /**
     * The table <code>public.oauth_registration_scope</code>.
     */
    public final OauthRegistrationScope OAUTH_REGISTRATION_SCOPE = com.epam.ta.reportportal.jooq.tables.OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE;

    /**
     * The table <code>public.project</code>.
     */
    public final Project PROJECT = com.epam.ta.reportportal.jooq.tables.Project.PROJECT;

    /**
     * The table <code>public.project_configuration</code>.
     */
    public final ProjectConfiguration PROJECT_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.ProjectConfiguration.PROJECT_CONFIGURATION;

    /**
     * The table <code>public.project_email_configuration</code>.
     */
    public final ProjectEmailConfiguration PROJECT_EMAIL_CONFIGURATION = com.epam.ta.reportportal.jooq.tables.ProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION;

    /**
     * The table <code>public.project_user</code>.
     */
    public final ProjectUser PROJECT_USER = com.epam.ta.reportportal.jooq.tables.ProjectUser.PROJECT_USER;

    /**
     * The table <code>public.server_settings</code>.
     */
    public final ServerSettings SERVER_SETTINGS = com.epam.ta.reportportal.jooq.tables.ServerSettings.SERVER_SETTINGS;

    /**
     * The table <code>public.test_item</code>.
     */
    public final TestItem TEST_ITEM = com.epam.ta.reportportal.jooq.tables.TestItem.TEST_ITEM;

    /**
     * The table <code>public.test_item_results</code>.
     */
    public final TestItemResults TEST_ITEM_RESULTS = com.epam.ta.reportportal.jooq.tables.TestItemResults.TEST_ITEM_RESULTS;

    /**
     * The table <code>public.test_item_structure</code>.
     */
    public final TestItemStructure TEST_ITEM_STRUCTURE = com.epam.ta.reportportal.jooq.tables.TestItemStructure.TEST_ITEM_STRUCTURE;

    /**
     * The table <code>public.ticket</code>.
     */
    public final Ticket TICKET = com.epam.ta.reportportal.jooq.tables.Ticket.TICKET;

    /**
     * The table <code>public.users</code>.
     */
    public final Users USERS = com.epam.ta.reportportal.jooq.tables.Users.USERS;

    /**
     * The table <code>public.widget</code>.
     */
    public final Widget WIDGET = com.epam.ta.reportportal.jooq.tables.Widget.WIDGET;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.BUG_TRACKING_SYSTEM_ID_SEQ,
            Sequences.DASHBOARD_ID_SEQ,
            Sequences.DEFECT_FIELD_ALLOWED_VALUE_ID_SEQ,
            Sequences.DEFECT_FORM_FIELD_ID_SEQ,
            Sequences.ISSUE_ID_SEQ,
            Sequences.ISSUE_TYPE_ID_SEQ,
            Sequences.ITEM_TAG_ID_SEQ,
            Sequences.LAUNCH_ID_SEQ,
            Sequences.LAUNCH_TAG_ID_SEQ,
            Sequences.LOG_ID_SEQ,
            Sequences.OAUTH_REGISTRATION_SCOPE_ID_SEQ,
            Sequences.PROJECT_CONFIGURATION_ID_SEQ,
            Sequences.PROJECT_EMAIL_CONFIGURATION_ID_SEQ,
            Sequences.PROJECT_ID_SEQ,
            Sequences.SERVER_SETTINGS_ID_SEQ,
            Sequences.TEST_ITEM_ID_SEQ,
            Sequences.TEST_ITEM_RESULTS_ID_SEQ,
            Sequences.TEST_ITEM_STRUCTURE_ID_SEQ,
            Sequences.TICKET_ID_SEQ,
            Sequences.USERS_ID_SEQ,
            Sequences.WIDGET_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            BugTrackingSystem.BUG_TRACKING_SYSTEM,
            Dashboard.DASHBOARD,
            DashboardWidget.DASHBOARD_WIDGET,
            DefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE,
            DefectFormField.DEFECT_FORM_FIELD,
            Issue.ISSUE,
            IssueTicket.ISSUE_TICKET,
            IssueType.ISSUE_TYPE,
            IssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION,
            ItemTag.ITEM_TAG,
            Launch.LAUNCH,
            LaunchTag.LAUNCH_TAG,
            Log.LOG,
            OauthAccessToken.OAUTH_ACCESS_TOKEN,
            OauthRegistration.OAUTH_REGISTRATION,
            OauthRegistrationScope.OAUTH_REGISTRATION_SCOPE,
            Project.PROJECT,
            ProjectConfiguration.PROJECT_CONFIGURATION,
            ProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION,
            ProjectUser.PROJECT_USER,
            ServerSettings.SERVER_SETTINGS,
            TestItem.TEST_ITEM,
            TestItemResults.TEST_ITEM_RESULTS,
            TestItemStructure.TEST_ITEM_STRUCTURE,
            Ticket.TICKET,
            Users.USERS,
            Widget.WIDGET);
    }

    @Override
    public final List<UDT<?>> getUDTs() {
        List result = new ArrayList();
        result.addAll(getUDTs0());
        return result;
    }

    private final List<UDT<?>> getUDTs0() {
        return Arrays.<UDT<?>>asList(
            Parameter.PARAMETER);
    }
}
