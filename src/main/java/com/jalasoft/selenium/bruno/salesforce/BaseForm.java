package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BaseForm extends BasePage {

    protected static final String SAVE = "Save";

    protected static final String CANCEL = "Cancel";

    protected static final String SAVEANDNEW = "Save & New";

    /**
     * This method will click on an option from the form.
     * @param option text name.
     */
    protected void clickOption(final String option) {
        By optionButton = By.cssSelector(String.format("button[title='%s']", option));

        wait.until(ExpectedConditions.elementToBeClickable(optionButton));
        driver.findElement(optionButton).click();
    }

    /**
     * This method will be used to save the form.
     * @return a Base Page.
     */
    public abstract BasePage clickSaveButton();

    /**
     * This method will be used to click save and new button.
     * @return Base page.
     */
    public abstract BasePage clickSaveAndNewButton();

    /**
     * This method will click on cancel button.
     * @return Base Page.
     */
    public abstract BasePage clickCancelButton();

}
