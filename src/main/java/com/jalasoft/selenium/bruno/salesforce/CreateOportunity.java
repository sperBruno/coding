package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Bruno Barrios on 3/17/2017.
 */
public class CreateOportunity {

    public static final By opportunityNameField = By.xpath("//span[text()='Opportunity Name']/ancestor::label/following::input");

    public static final By accountNameField = By.cssSelector("input[placeholder='Buscar Cuentas']");

    private final WebDriver driver;

    public CreateOportunity(WebDriver driver) {
        this.driver = driver;
    }

    public void setOpportunityName(String name) {
        driver.findElement(opportunityNameField).sendKeys(name);
    }

    public void setAccountName(String accountName) {
        driver.findElement(opportunityNameField).sendKeys(accountName);
    }


}
