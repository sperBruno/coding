package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public abstract class BaseHome extends BasePage {

    @FindBy(id = "div.active.oneContent a[title='New']")
    protected static WebElement newButton;

    @FindBy(css = ".uiMenu .slds-icon_container.slds-icon-utility-settings")
    protected static WebElement setting;

    @FindBy(css = ".listViewSettingsMenuNew.uiMenuItem>a")
    protected static WebElement newSettingOption;

}
