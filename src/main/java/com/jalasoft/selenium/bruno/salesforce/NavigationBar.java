package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.Common;
import com.jalasoft.selenium.bruno.salesforce.pages.*;
import org.openqa.selenium.By;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class NavigationBar extends BasePage {

    private static final By opportunitiesTab = By.cssSelector("a[title='Opportunities'");
    private static final By accountTab = By.cssSelector("a[title='Accounts'");
    private static final By homeTab = By.cssSelector("a[title='Home'");
    private static final By chatterTab = By.cssSelector("a[title='Chatter'");
    private static final By contactsTab = By.cssSelector("a[title='Constacts'");
    private static final By leadsTab = By.cssSelector("a[title='Leads'");
    private static final By calendarTab = By.cssSelector("a[title='Calendar'");
    private static final By dashboardsTab = By.cssSelector("a[title='Dashboards'");
    private static final By groupsTab = By.cssSelector("a[title='Groups'");
    private static final By notesTab = By.cssSelector("a[title='Notes'");
    private static final By filesTab = By.cssSelector("a[title='Files'");
    private static final By quotesTab = By.cssSelector("a[title='Quotes'");

    public static OpportunityHome clickOpportunityTab() {
        Common.clickButton(opportunitiesTab);
        return new OpportunityHome();
    }

    public static AccountHome clickAccountTab() {
        Common.clickButton(accountTab);
        return new AccountHome();
    }

    public static HomePage clickHomeTab() {
        Common.clickButton(homeTab);
        return new HomePage();
    }

    public static ChatterPage clickChatterTab() {
        Common.clickButton(chatterTab);
        return new ChatterPage();
    }

    public static ContactsPage clickContactsTab() {
        Common.clickButton(contactsTab);
        return new ContactsPage();
    }

    public static LeadsPage clickLeadsTab() {
        Common.clickButton(leadsTab);
        return new LeadsPage();
    }

    public static CalendarPage clickCalendarTab() {
        Common.clickButton(calendarTab);
        return new CalendarPage();
    }

    public static DashboardsPage clickDashboardsTab() {
        Common.clickButton(dashboardsTab);
        return new DashboardsPage();
    }

    public static GroupsPage clickGroupsTab() {
        Common.clickButton(groupsTab);
        return new GroupsPage();
    }

    public static NotesPage clickNotesTab() {
        Common.clickButton(notesTab);
        return new NotesPage();
    }

    public static FilesPage clickFilesTab() {
        Common.clickButton(filesTab);
        return new FilesPage();
    }

    public static QuotesPage clickQuotesTab() {
        Common.clickButton(quotesTab);
        return new QuotesPage();
    }

}
