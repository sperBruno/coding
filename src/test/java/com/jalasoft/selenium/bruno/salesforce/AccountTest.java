package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.pages.AccountHome;
import com.jalasoft.selenium.bruno.salesforce.pages.OpportunityHome;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by xain on 3/15/2017.
 */
public class AccountTest {

    @BeforeClass(groups = {"Smoke", "Mobile"})
    public static void setUp() {
        // Given
        Login login = new Login();
        login.setUserNameTextField("cgonzales@freeorg02.com");
        login.setPasswordTextField("P@ssw0rd");
        login.clickLoginButton();
    }

    @Test(groups = {"Smoke", "Mobile"})
    public void testCreateAccount() {
        // When
        AccountHome accountsHome = NavigationBar.clickAccountTab();
        AccountForm accountForm = accountsHome.clickNewAccount();
        final String accountName = "My Account Test";
        accountForm.setAccountNameTextField(accountName);
        AccountDetail accountDetail = accountForm.clickSaveButton();

        // Then
        final String actualAccountName = accountDetail.getAccountName();
        assertEquals(accountName, actualAccountName);
    }

    @Test
    public void testCreateOpportunity() {
        // When
        OpportunityHome opportunitiesHome = NavigationBar.clickOpportunityTab();
        final String opportunityName = "Test opportunity";
        final String closeDate = "3/18/2017";
        final String qualificationStage = "Qualification";
        OpportunityForm opportunityForm = opportunitiesHome.clickNewOpportunityButton();
        opportunityForm.setOpportunityName(opportunityName);
        opportunityForm.setCloseDateTextInput(closeDate);
        opportunityForm.selectStage(qualificationStage);
        OpportunityDetail opportunityDetail = opportunityForm.clickSaveButton();

        // Then
        final String actualOpportunityName = opportunityDetail.getOpportunityName();
        assertEquals(opportunityName, actualOpportunityName);
    }
}
