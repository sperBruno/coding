package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {

        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();

    }

}
