package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/27/2017.
 */
public class NewListView extends BasePage{
    @FindBy(css = ".listViewTitle")
    private WebElement listName;

    @FindBy(css = ".listViewTitle input")
    protected static WebElement listNameTextField;

    @FindBy(xpath = "span[text()='All users can see this list view']")
    protected static WebElement allUsersRadioButton;

    @FindBy(xpath = "span[text()='All users can see this list view']")
    protected static WebElement onlyICanSeeRadioButton;

    @FindBy(css = ".slds-button.slds-button--neutral.test-cancelButton.uiButton")
    protected static WebElement cancelButton;

    @FindBy(css = ".test-confirmButton")
    protected static WebElement saveButton;

    @FindBy(css = ".uiModal")
    private  WebElement modalContainer;
    /**
     * This method will be used to set new list view name.
     * @param listViewName name for the new list view.
     */
    public void setNewListViewNameTextField(String listViewName) {
        ActionUtil.setTextField(listNameTextField, listViewName);
    }

    /**
     *
     * @param option
     */
    public void clickViewListOption(WebElement option) {
        ActionUtil.clickElement(option);
    }


    public void selectGlobalRadioButton()
    {
        ActionUtil.clickElement(globalaction);
    }

    public void clickSaveButton() {
        ActionUtil.clickElement(saveButton);
        wait.until(ExpectedConditions.invisibilityOf(modalContainer));
    }
}
