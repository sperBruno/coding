package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.pages.LeadsPage;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class LeadForm extends BaseForm {


    @Override
    public LeadDetail clickSaveButton() {
        clickOption(SAVE);
        return new LeadDetail();
    }

    @Override
    public LeadForm clickSaveAndNewButton() {
        clickOption(SAVEANDNEW);
        return new LeadForm();
    }

    @Override
    public LeadsPage clickCancelButton() {
        return new LeadsPage();
    }
}
