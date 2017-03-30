package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/29/2017.
 */
public class DeleteAlert extends BasePage{

    @FindBy(css = ".test-confirmButton")
    public WebElement deleteButton;

    @FindBy(css = ".uiModal")
    private  WebElement modalContainer;

    public void clickDeleteButton() {
        ActionUtil.clickElement(deleteButton);
        
    }
}
