package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BaseForm extends BasePage {

    protected static final String SAVE = "Save";
    protected static final String CANCEL = "Cancel";
    protected static final String SAVEANDNEW = "Save & New";

    

    protected void clickOption(String option) {
        By optionButton = By.cssSelector(String.format("button[title='%s']", option));

        wait.until(ExpectedConditions.elementToBeClickable(optionButton));
        driver.findElement(optionButton).click();
    }

    public abstract BasePage clickSaveButton();

    public abstract BasePage clickSaveAndNewButton();

    public abstract BasePage clickCancelButton();

}
