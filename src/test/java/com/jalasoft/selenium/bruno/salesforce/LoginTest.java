package com.jalasoft.selenium.bruno.salesforce;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class LoginTest {

    @Test
    public void testLogin() {
        //When
        Login login = new Login();
        login.setUserNameTextField("kaos_bruno@hotmail.es");
        login.setUserPasswordTextField("74139807Bbv");
        HomePage homePage = login.clickLoginButton();
        homePage.clickProfileIcon();
        String actualProfileName = homePage.getProfileName();

        //Then
        final String expectedProfile = "bruno barrios";
        Assert.assertEquals(expectedProfile, actualProfileName);
    }
}