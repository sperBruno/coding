package com.jalasoft.selenium.bruno.salesforce.pages;

import com.jalasoft.selenium.bruno.salesforce.*;
import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class HomePage extends BasePage {
    @FindBy(css = ".profileTrigger")
    private static  WebElement profileIcon;

    @FindBy(css = ".profile-card-name .profile-link-label")
    private WebElement profileNameText;

    @FindBy(css = ".profile-link-label.logout.uiOutputURL")
    protected static WebElement logoutButton;

    /**
     * This method will click profile icon.
     */
    public static void clickProfileIcon() {
        ActionUtil.clickElement(profileIcon);
    }

    /**
     * This method will be used to profile name text.
     * @return profile name text.
     */
    public  String getProfileName() {
       return ActionUtil.getTextElement(profileNameText);
    }

    /**
     * This method will be used to verify if profile icon is visible
     * @return true if it is visible and false if not.
     */
    public static boolean isProfileIconVisible() {
        boolean isVisible = false;
        try {
            DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            isVisible = profileIcon.isDisplayed();
            DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }catch (WebDriverException e) {
            System.out.println(isVisible);
            return isVisible;
        }
        System.out.println(isVisible);
        return isVisible;
    }

    /**
     * This method will logout from salesforce.
     * @return login page.
     */
    public static Login logout() {
        HomePage.clickProfileIcon();
        ActionUtil.clickElement(logoutButton);
        return new Login();
    }
}
