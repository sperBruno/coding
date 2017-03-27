package com.jalasoft.selenium.bruno.salesforce.pages;

import com.jalasoft.selenium.bruno.salesforce.BaseHome;
import com.jalasoft.selenium.bruno.salesforce.BasePage;
import com.jalasoft.selenium.bruno.salesforce.OpportunityForm;
import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import org.openqa.selenium.WebElement;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class AccountHome extends BaseHome {



    @Override
    public OpportunityForm clickOption() {
        ActionUtil.clickElement(newSettingOption);
        return new OpportunityForm();
    }
}
