package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class LoginTest {

    @Test
    public void testLogin() {
        //When

//        HomePage homePage = Login.loginAs("kaos_bruno@hotmail.es","74139807Bbv");
//        homePage.clickProfileIcon();
//        String actualProfileName = homePage.getProfileName();

        //Then
        final String expectedProfile = "bruno barrios";
//        Assert.assertEquals(expectedProfile, actualProfileName);
    }
}