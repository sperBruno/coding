package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bruno Barrios on 3/20/2017.
 * Singleton Class.
 */
public final class DriverManager {

    public static final int IMPLICIT_WAIT = 40;
    public static final int EXPLICIT_WAIT = 60;
    private static DriverManager instance;

    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * This is the constructor of Driver Manager.
     */
    private DriverManager() {
        //must do something
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, EXPLICIT_WAIT);
        driver.get("https://login.salesforce.com");
        driver.manage().window().maximize();
    }

    /**
     * This method will return the instance of driver.
     * @return intance driver.
     */
    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    /**
     * Getter of wait.
     * @return wait.
     */
    public WebDriverWait getWait() {
        return wait;
    }

    /**
     * Getter of driver.
     * @return driver.
     */
    public WebDriver getDriver() {
        return driver;
    }
}
