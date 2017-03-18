package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class Oportunities {

    public static final By newOportunityButton = By.cssSelector(".slds-button.slds-button--neutral.slds-truncate");
    private final WebDriver driver;


    public Oportunities(WebDriver driver) {
        this.driver = driver;
    }

    public CreateOportunity clickNewOportunitiesButton() {
        driver.findElement(newOportunityButton).click();
        return new CreateOportunity(driver);
    }
}
