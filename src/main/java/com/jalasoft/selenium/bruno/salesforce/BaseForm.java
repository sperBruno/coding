package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BaseForm extends BasePage{

    protected By save = By.className("");



    public abstract void clickSave();


}
