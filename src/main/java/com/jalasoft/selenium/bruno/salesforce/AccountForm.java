package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import com.jalasoft.selenium.bruno.salesforce.pages.AccountHome;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class AccountForm extends BaseForm {

    @FindBy(css = "div[aria-label='Account Name - Account Name*'] input")
    protected WebElement accountNameTextField;

    /**
     * This method will set account text field.
     * @param accountName
     */
    public void setAccountNameTextField(final String accountName) {
        ActionUtil.setTextField(accountNameTextField,accountName);
    }

    /**
     * This method will save the new account.
     * @return a new Account Detail.
     */
    @Override
    public AccountDetail clickSaveButton() {
        clickOption(SAVE);
        return new AccountDetail();
    }

    /**
     * This method will click save and new button.
     * @return a new Account form.
     */
    @Override
    public AccountForm clickSaveAndNewButton() {
        clickOption(SAVEANDNEW);
        return new AccountForm();
    }

    /**
     * This method will click on cancel button
     * @return Account Home.
     */
    @Override
    public AccountHome clickCancelButton() {
        clickOption(CANCEL);
        return new AccountHome();
    }
}
