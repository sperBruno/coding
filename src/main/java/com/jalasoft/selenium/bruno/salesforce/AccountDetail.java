package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/22/2017.
 */
public class AccountDetail extends BasePage {
    private By accountNameLabel = By.cssSelector("div.active.oneContent h1 > span.uiOutputText");

    public String getAccountName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountNameLabel));
        return driver.findElement(accountNameLabel).getText();
    }
}
