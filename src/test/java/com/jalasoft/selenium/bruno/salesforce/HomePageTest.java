package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.pages.AccountHome;
import com.jalasoft.selenium.bruno.salesforce.pages.HomePage;
import com.jalasoft.selenium.bruno.salesforce.pages.OpportunityHome;
import org.junit.Test;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class HomePageTest {

    @Test
    public void seleceOportunitiesOption() {
        //When
        Login login = new Login();
        login.setUserNameTextField("kaos_bruno@hotmail.es");
        login.setPasswordTextField("74139807Bbv");
        login.clickLoginButton();
         OpportunityHome accountHome = NavigationBar.clickOpportunityTab();
//        String actualProfileName = homePage.getProfileName();
    }
}