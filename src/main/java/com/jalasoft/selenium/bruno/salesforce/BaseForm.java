package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BaseForm extends BasePage {

    protected By saveBtn = By.cssSelector("button[title='Save']");
    protected By cancelBtn = By.cssSelector("button[title='Cancel']");
    protected By saveAndNew = By.cssSelector("button[title='Save & New']");


    public void clickSave() {
        DriverManager.getInstance().getDriver().findElement(saveBtn);
    }


    public void clickSaveAndNew() {
        DriverManager.getInstance().getDriver().findElement(saveAndNew);
    }

    public  void  clickCancel() {
        DriverManager.getInstance().getDriver().findElement(cancelBtn);
    }
}
