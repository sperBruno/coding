package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.pages.AccountHome;
import org.openqa.selenium.By;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class AccountForm extends BaseForm {

    private By accountNameTextField = By.cssSelector("div[aria-label='Account Name - Account Name*'] input");

    public void setAccountNameTextField(String accountName) {
        driver.findElement(accountNameTextField).sendKeys(accountName);
    }

    @Override
    public AccountDetail clickSaveButton() {
        clickOption(SAVE);
        return new AccountDetail();
    }

    @Override
    public AccountForm clickSaveAndNewButton() {
        clickOption(SAVEANDNEW);
        return new AccountForm();
    }

    @Override
    public AccountHome clickCancelButton() {
        clickOption(CANCEL);
        return new AccountHome();
    }
}
