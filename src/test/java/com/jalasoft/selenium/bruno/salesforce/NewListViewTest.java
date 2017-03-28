package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.pages.AccountHome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.jalasoft.selenium.bruno.salesforce.NewListView.allUsersRadioButton;
import static com.jalasoft.selenium.bruno.salesforce.NewListView.saveButton;
import static org.junit.Assert.*;

/**
 * Created by Bruno Barrios on 3/27/2017.
 */
public class NewListViewTest {
    @Before
    public void setUp() throws Exception {
        // Given
        Login login = new Login();
        login.setUserNameTextField("Kaos_bruno@hotmail.es");
        login.setPasswordTextField("74139807Bbv");
        login.clickLoginButton();
    }

    @Test
    public  void crateNewAccountListView() {
        AccountHome accountsHome = NavigationBar.clickAccountTab();
        NewListView newAccountListView = accountsHome.clickAccountListView();
        final String listViewName = "Testing Account List View";
        newAccountListView.setNewListViewName(listViewName);
        newAccountListView.clickViewListOption(allUsersRadioButton);
        newAccountListView.clickViewListOption(saveButton);

        // Then
        final String actualAccountName = accountsHome.getAccountListViewName();
        
        assertEquals(listViewName, actualAccountName);
    }

}