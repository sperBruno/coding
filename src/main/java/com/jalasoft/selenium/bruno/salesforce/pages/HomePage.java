package com.jalasoft.selenium.bruno.salesforce.pages;

import com.jalasoft.selenium.bruno.salesforce.BaseHome;
import com.jalasoft.selenium.bruno.salesforce.BasePage;
import com.jalasoft.selenium.bruno.salesforce.DriverManager;
import com.jalasoft.selenium.bruno.salesforce.OpportunityForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class HomePage extends BasePage {
    private static final By profileIcon = By.cssSelector(".profileTrigger");

    private By profileNameText = By.cssSelector(".profile-card-name .profile-link-label");

    public void clickProfileIcon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileIcon));
        driver.findElement(profileIcon).click();
    }

    public  String getProfileName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileNameText));
        return driver.findElement(profileNameText).getText();
    }

    public static boolean isProfileIconVisible() {
        boolean isVisible = false;
        try {
            DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            isVisible = DriverManager.getInstance().getDriver().findElement(profileIcon).isDisplayed();
            DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }catch (WebDriverException e) {
            return isVisible;
        }
        return isVisible;
    }

}
