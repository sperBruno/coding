package com.jalasoft.selenium.bruno.salesforce.pages;

import com.jalasoft.selenium.bruno.salesforce.BaseHome;
import com.jalasoft.selenium.bruno.salesforce.NewListView;
import com.jalasoft.selenium.bruno.salesforce.OpportunityForm;
import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class OpportunityHome extends BaseHome {


    public OpportunityForm clickNewOpportunityButton() {
        ActionUtil.clickElement(newButton);
        return new OpportunityForm();
    }

    public NewListView selectOptionSetting() {
        ActionUtil.clickElement(setting);
        ActionUtil.clickElement(newSettingOption);
        return new NewListView();
    }
}
