package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/22/2017.
 */
public class AccountDetail extends BasePage {

    @FindBy(css = "div.active.oneContent h1 > span.uiOutputText")
    protected WebElement accountNameLabel;

    /**
     * This method will get the account name.
     */
    public String getAccountName() {
        wait.until(ExpectedConditions.visibilityOf(accountNameLabel));
        return accountNameLabel.getText();
    }
}
