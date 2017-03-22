package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BaseHome extends BasePage{

    protected By newButton = By.id("div.active.oneContent a[title='New']");


    protected void clickNew() {
        wait.until(ExpectedConditions.elementToBeClickable(newButton));
        driver.findElement(newButton).click();
    }

    public abstract BasePage clickNewButton();

}
