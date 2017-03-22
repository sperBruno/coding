package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class OpportunityHome extends BaseHome{


    public static final By newOportunityButton = By.cssSelector(".slds-button.slds-button--neutral.slds-truncate");
    private final WebDriver driver;


    public OpportunityHome() {
        driver = DriverManager.getInstance().getDriver();
    }

    public OpportunityForm clickNewOportunitiesButton() {
        driver.findElement(newOportunityButton).click();
        return new OpportunityForm();
    }

    @Override
    public void clickNewButton() {

    }
}
