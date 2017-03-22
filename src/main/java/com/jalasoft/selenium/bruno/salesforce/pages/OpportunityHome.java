package com.jalasoft.selenium.bruno.salesforce.pages;

import com.jalasoft.selenium.bruno.salesforce.BaseHome;
import com.jalasoft.selenium.bruno.salesforce.OpportunityForm;
import org.openqa.selenium.By;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class OpportunityHome extends BaseHome {


    @Override
    public OpportunityForm clickNewButton() {
            super.clickNew();
            return new OpportunityForm();
    }
}
