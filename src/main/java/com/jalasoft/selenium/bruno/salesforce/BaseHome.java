package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BaseHome extends BasePage {
    //.list
    @FindBy(id = "div.active.oneContent a[title='New']")
    protected static WebElement newButton;

    @FindBy(css = ".uiMenu .slds-icon_container.slds-icon-utility-settings")
    protected static WebElement setting;

    @FindBy(css = ".listViewSettingsMenuNew a[title='New']")
    protected static WebElement newMenuItem;

    public abstract BasePage clickNewButton() ;

    public void clickListViewControlButton() {
        setting.click();
    }

    public  NewListView 

    public DeleteAlert deleteAlert() {
        return new DeleteAlert();
    }

}
