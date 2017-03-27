package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/27/2017.
 */
public class NewListView {


    @FindBy(css = ".uiLabel-left.form-element__label.uiLabel > listViewTitle input")
    protected static WebElement listNameTextField;

    protected  static  String allUsersRadioButton = "span[text()='All users can see this list view']";

    protected  static  String onlyICanSeeRadioButton = "span[text()All users can see this list view']";

    @FindBy(css = ".slds-button.slds-button--neutral.test-cancelButton.uiButton")
    protected static WebElement cancelButton;
    
    @FindBy(css = ".slds-button.slds-button--neutral.test-confirmButton.uiButton--default.uiButton--brand.uiButton")
    protected static WebElement saveButton;

    protected void clickCancel() {
        ActionUtil.clickElement(cancelButton);
    }

    public void clickSave() {
        ActionUtil.clickElement(saveButton);
    }

}
