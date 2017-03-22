package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.pages.*;
import org.openqa.selenium.By;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class NavigationBar extends BasePage{

    public static OpportunityHome clickOpportunityTab() {
        By opportunitiesTab = By.cssSelector("a[title='Opportunities'");
        DriverManager.getInstance().getDriver().findElement(opportunitiesTab).click();
        return new OpportunityHome();
    }

    public static AccountHome clickAccountTab() {
        By accountTab = By.cssSelector("a[title='Accounts'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new AccountHome();
    }

    public static HomePage clickHomeTab() {
        By accountTab = By.cssSelector("a[title='Home'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new HomePage();
    }

    public static ChatterPage clickChatterTab() {
        By accountTab = By.cssSelector("a[title='Chatter'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new ChatterPage();
    }

    public static ContactsPage clickContactsTab() {
        By accountTab = By.cssSelector("a[title='Constacts'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new ContactsPage();
    }

    public static LeadsPage clickLeadsTab() {
        By accountTab = By.cssSelector("a[title='Leads'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new LeadsPage();
    }

    public static CalendarPage clickCalendarTab() {
        By accountTab = By.cssSelector("a[title='Calendar'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new CalendarPage();
    }

    public static DashboardsPage clickDashboardsTab() {
        By accountTab = By.cssSelector("a[title='Dashboards'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new DashboardsPage();
    }

    public static GroupsPage clickGroupsTab() {
        By accountTab = By.cssSelector("a[title='Groups'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new GroupsPage();
    }

    public static NotesPage clickNotesTab() {
        By accountTab = By.cssSelector("a[title='Notes'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new NotesPage();
    }
    public static FilesPage clickFilesTab() {
        By accountTab = By.cssSelector("a[title='Files'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new FilesPage();
    }

    public static QuotesPage clickQuotesTab() {
        By accountTab = By.cssSelector("a[title='Quotes'");
        DriverManager.getInstance().getDriver().findElement(accountTab).click();
        return new QuotesPage();
    }
    private static void clickTab(String tab) {
        DriverManager.getInstance().getDriver().findElement(By.className(tab));
    }

}
