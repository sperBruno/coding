package com.jalasoft.selenium.bruno.salesforce.common;

import com.jalasoft.selenium.bruno.salesforce.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/24/2017.
 */
public class ActionUtil {

    public static void setTextField(WebElement webElement, String text) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.visibilityOf(webElement));
        webElement.clear();
        webElement.sendKeys(text);
    }

    public static void clickElement(WebElement webElement) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }
}
