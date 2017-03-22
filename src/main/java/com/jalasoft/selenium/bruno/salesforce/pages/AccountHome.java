package com.jalasoft.selenium.bruno.salesforce.pages;

import com.jalasoft.selenium.bruno.salesforce.AccountForm;
import com.jalasoft.selenium.bruno.salesforce.BaseHome;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class AccountHome extends BaseHome {

    public AccountForm clickNewButton() {
        super.clickNew();
        return new AccountForm();
    }
}
