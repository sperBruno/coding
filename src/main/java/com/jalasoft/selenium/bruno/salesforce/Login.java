package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class Login {
    private final By usernameTextField = By.id("username");
    private final By passwordTextField = By.id("password");
    private final By loginButton = By.id("Login");
    private final WebDriverWait wait;
    private WebDriver driver;

    public Login() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        driver.get("https://login.salesforce.com");

        driver.manage().window().maximize();
    }

    public void setUserNameTextField(String userName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameTextField));
        driver.findElement(usernameTextField).sendKeys(userName);
    }

    public void setUserPasswordTextField(String userPassword) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextField));
        driver.findElement(passwordTextField).sendKeys(userPassword);
    }

    public HomePage clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
