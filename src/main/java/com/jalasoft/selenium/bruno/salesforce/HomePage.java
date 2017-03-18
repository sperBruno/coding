package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class HomePage {
    private WebDriver driver;
    private final WebDriverWait wait;
    private By profileIcon = By.cssSelector(".profileTrigger");
    private By profileNameText = By.cssSelector(".active.oneContent div[title='New']");
    private By oportunitiesOption = By.cssSelector("a[title='Oportunidades'");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void clickProfileIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(profileIcon));
        driver.findElement(profileIcon).click();
    }

    public String getProfileName() {
        return driver.findElement(profileNameText).getText();
    }

    public Oportunities clickOportunitiesOption() {
        driver.findElement(oportunitiesOption).click();
        return new Oportunities(driver);
    }
}
