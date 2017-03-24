package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import com.jalasoft.selenium.bruno.salesforce.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class Login extends BasePage {
    @FindBy(id = "username")
    @CacheLookup
    private WebElement usernameTextField;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement passwordTextField;

    @FindBy(id = "Login")
    @CacheLookup
    private WebElement loginButton;

    public void setUserNameTextField(String userName) {
        ActionUtil.setTextField(usernameTextField,userName);
    }

    public void setPasswordTextField(String password) {
        ActionUtil.setTextField(passwordTextField,password);
    }

    public HomePage clickLoginButton() {
        ActionUtil.clickElement(loginButton);
        return new HomePage();
    }

    public static HomePage loginAs(String username, String password) {
         if(HomePage.isProfileIconVisible() == true) {
             Login.logout();
         }
        return new HomePage();
    }

}
