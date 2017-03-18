package com.jalasoft.selenium.bruno.salesforce;

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
        login.setUserPasswordTextField("74139807Bbv");
        HomePage homePage = login.clickLoginButton();
        homePage.clickOportunitiesOption();
//        String actualProfileName = homePage.getProfileName();
    }
}