package com.jalasoft.selenium.bruno.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Bruno Barrios on 3/20/2017.
 */
public class OpportunityForm extends BaseForm {

    private By opportunityNameTextInput = By.cssSelector("div[aria-label='Opportunity Name - Opportunity Name*'] input");

    private By closeDateTextInput = By.cssSelector("[aria-label='Close Date - Close Date*Date PickerClear Button'] input");

    private By stageSelectBox = By.cssSelector("[aria-label *= 'Stage - Stage'] .select");

    public void setOpportunityName(String opportunityName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(opportunityNameTextInput));
        driver.findElement(opportunityNameTextInput).sendKeys(opportunityName);
    }

    public void setCloseDateTextInput(String closeDate) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeDateTextInput));
        driver.findElement(closeDateTextInput).sendKeys(closeDate);
    }

    public void selectStage(String stage) {
        String selector = "a[title='" + stage + "']";
        By stageValue = new By.ByCssSelector(selector);
        wait.until(ExpectedConditions.elementToBeClickable(stageSelectBox));
        driver.findElement(stageSelectBox).click();
        wait.until(ExpectedConditions.elementToBeClickable(stageValue));
        driver.findElement(stageValue).click();
    }

    @Override
    public OpportunityDetail clickSaveButton() {
        clickOption(SAVE);
        return new OpportunityDetail();
    }

    @Override
    public OpportunityForm clickSaveAndNewButton() {
        clickOption(SAVEANDNEW);
        return new OpportunityForm();
    }

    @Override
    public BasePage clickCancelButton() {
        return null;
    }
}
