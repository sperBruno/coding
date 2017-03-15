package com.jalasoft.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.jalasoft.selenium.Constants.IMPLICIT_WAIT;

/**
 * Created by Bruno Barrios on 3/10/2017.
 */
public class SeleniumClass {

    /**
     * This is a Login example.
     */
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("http://only-testing-blog.blogspot.in/2013/09/test.html");

        driver.manage().window().maximize();
        WebElement firstNameTextField = driver.findElement(By.id("fname"));
        firstNameTextField.sendKeys("Bruno");

        WebElement lastNameTestField = driver.findElement(By.name("lname"));
        System.out.println(firstNameTextField.isEnabled());
        System.out.println(lastNameTestField.isEnabled());

        WebElement bikeCheckBox = driver.findElement(By.cssSelector("input[value='Bike']"));

        //select checkbox
        if (!bikeCheckBox.isSelected()) {
            bikeCheckBox.click();
        }
        driver.close();
    }

}
