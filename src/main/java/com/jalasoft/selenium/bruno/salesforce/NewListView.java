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

    @FindBy(xpath = "span[text()='All users can see this list view']")
    protected static WebElement allUsersRadioButton;

    @FindBy(xpath = "span[text()All users can see this list view']")
    protected static WebElement onlyICanSeeRadioButton;

    @FindBy(css = ".slds-button.slds-button--neutral.test-cancelButton.uiButton")
    protected static WebElement cancelButton;

    @FindBy(css = ".slds-button.slds-button--neutral.test-confirmButton.uiButton--default.uiButton--brand.uiButton")
    protected static WebElement saveButton;

    public void setNewListViewName(String listViewName) {
        ActionUtil.setTextField(listNameTextField, listViewName);
    }

    public void clickViewListOption(WebElement option) {
        ActionUtil.clickElement(option);
    }


}
