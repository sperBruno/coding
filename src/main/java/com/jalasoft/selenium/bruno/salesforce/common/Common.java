package com.jalasoft.selenium.bruno.salesforce.common;

import com.jalasoft.selenium.bruno.salesforce.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/21/2017.
 */
public class Common {

    public static void setTextBoxField(By locator, String value) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        DriverManager.getInstance().getDriver().findElement(locator).sendKeys(value);
    }

    public static void clickButton(By locator) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(locator));
        DriverManager.getInstance().getDriver().findElement(locator).click();
    }
}
