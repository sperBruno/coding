package com.jalasoft.selenium.bruno.salesforce.pages;

import com.jalasoft.selenium.bruno.salesforce.*;
import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class AccountHome extends BaseHome {


    @FindBy(css = ".triggerLinkText.selectedListView.uiOutputText")
    protected static WebElement listViewName;


    public NewListView clickAccountListView() {
        ActionUtil.clickElement(setting);
        ActionUtil.clickElement(newSettingOption);
        return new NewListView();
    }
    public String getAccountListViewName() {
        return ActionUtil.getTextElement(listViewName);
    }

    public AccountForm clickNewAccount() {
        ActionUtil.clickElement(newButton);
        return new AccountForm();
    }

}
