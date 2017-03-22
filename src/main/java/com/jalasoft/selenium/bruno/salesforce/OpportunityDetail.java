package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/22/2017.
 */
public class OpportunityDetail extends BasePage {
    private By opportunityNameLabel = By.cssSelector("div.active.oneContent h1 > span.uiOutputText");

    public String getOpportunityName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(opportunityNameLabel));
        return driver.findElement(opportunityNameLabel).getText();
    }
}
