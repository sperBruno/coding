package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import com.jalasoft.selenium.bruno.salesforce.pages.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class NavigationBar extends BasePage {

    @FindBy(css = "a[title='Opportunities'")
    private static  WebElement opportunitiesTab;

    @FindBy(css = "a[title='Accounts'")
    private static WebElement accountTab;

    @FindBy(css = "a[title='Home'")
    private static WebElement homeTab;

    @FindBy(css = "a[title='Chatter'")
    private static WebElement chatterTab;

    @FindBy(css = "a[title='Constacts'")
    private static WebElement contactsTab;

    @FindBy(css = "a[title='Leads'")
    private static WebElement leadsTab;

    @FindBy(css = "a[title='Calendar'")
    private static WebElement calendarTab;

    @FindBy(css = "a[title='Dashboards'")
    private static WebElement dashboardsTab;

    @FindBy(css = "a[title='Groups'")
    private static WebElement groupsTab;

    @FindBy(css = "a[title='Notes'")
    private static WebElement notesTab;

    @FindBy(css = "a[title='Files'")
    private static WebElement filesTab;

    @FindBy(css = "a[title='Quotes'")
    private static WebElement quotesTab;

    /**
     * This method will select a Opportunity tab
     * @return opportunity.
     */
    public static OpportunityHome clickOpportunityTab() {
        ActionUtil.clickElement(opportunitiesTab);
        return new OpportunityHome();
    }

    /**
     * This method will select account tab
     * @return
     */
    public static AccountHome clickAccountTab() {
        ActionUtil.clickElement(accountTab);
        return new AccountHome();
    }

    public static HomePage clickHomeTab() {
        ActionUtil.clickElement(homeTab);
        return new HomePage();
    }

    public static ChatterPage clickChatterTab() {
        ActionUtil.clickElement(chatterTab);
        return new ChatterPage();
    }

    public static ContactsPage clickContactsTab() {
        ActionUtil.clickElement(contactsTab);
        return new ContactsPage();
    }

    public static LeadsPage clickLeadsTab() {
        ActionUtil.clickElement(leadsTab);
        return new LeadsPage();
    }

    public static CalendarPage clickCalendarTab() {
        ActionUtil.clickElement(calendarTab);
        return new CalendarPage();
    }

    public static DashboardsPage clickDashboardsTab() {
        ActionUtil.clickElement(dashboardsTab);
        return new DashboardsPage();
    }

    public static GroupsPage clickGroupsTab() {
        ActionUtil.clickElement(groupsTab);
        return new GroupsPage();
    }

    public static NotesPage clickNotesTab() {
        ActionUtil.clickElement(notesTab);
        return new NotesPage();
    }

    public static FilesPage clickFilesTab() {
        ActionUtil.clickElement(filesTab);
        return new FilesPage();
    }

    public static QuotesPage clickQuotesTab() {
        ActionUtil.clickElement(quotesTab);
        return new QuotesPage();
    }

}
