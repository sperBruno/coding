package com.jalasoft.selenium.bruno;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.jalasoft.selenium.Constants.EXPLICIT_WAIT;
import static com.jalasoft.selenium.Constants.IMPLICIT_WAIT;

/**
 * Created by Bruno Barrios on 3/13/2017.
 */
public class LoginTest {
    /**
     * This is a UI test for login to Salesforce.
     */
    @Test
    public void testLoginToSalesforce() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
        driver.get("https://login.salesforce.com");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.cssSelector("#username"));
        wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys("kaos_bruno@hotmail.es");

        WebElement password = driver.findElement(By.cssSelector("#password"));
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("74139807Bbv");


        WebElement loginBtn = driver.findElement(By.cssSelector("#Login"));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();

        final By userIcon = By.cssSelector(".bare.slds-button.uiButton.forceHeaderButton.oneUserProfileCardTrigger");
        final ExpectedCondition<WebElement> userBtn = ExpectedConditions.elementToBeClickable(userIcon);
        wait.until(userBtn).click();

        final By currentUser = By.cssSelector(".profile-card-name>.profile-link-label");
        String expectedResult = wait.until(ExpectedConditions.visibilityOfElementLocated(currentUser)).getText();

        Assert.assertEquals("Is not correct user", "bruno barrios", expectedResult);
        driver.close();
    }
}
