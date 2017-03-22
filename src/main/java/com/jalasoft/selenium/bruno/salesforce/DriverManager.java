package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bruno Barrios on 3/20/2017.
 * Singleton Class.
 */
public class DriverManager {

    private static DriverManager instance;

    private WebDriver driver;
    private WebDriverWait wait;

    private DriverManager() {
        //must do something
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        driver.get("https://login.salesforce.com");

        driver.manage().window().maximize();
    }

    public static DriverManager getInstance() {
        if(instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

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
