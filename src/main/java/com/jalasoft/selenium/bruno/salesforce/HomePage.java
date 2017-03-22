package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class HomePage extends BaseHome {
    private By profileIcon = By.cssSelector(".profileTrigger");
    private By profileNameText = By.cssSelector(".active.oneContent div[title='New']");


    public HomePage() {
    }

    public void clickProfileIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
        driver.findElement(profileIcon).click();
    }

    public String getProfileName() {
        return driver.findElement(profileNameText).getText();
    }


    @Override
    public void clickNewButton() {
    }
}
