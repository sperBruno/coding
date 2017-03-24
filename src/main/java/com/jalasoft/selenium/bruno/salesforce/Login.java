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
    private static WebElement usernameTextField;

    @FindBy(id = "password")
    @CacheLookup
    private static WebElement passwordTextField;

    @FindBy(id = "Login")
    @CacheLookup
    private static WebElement loginButton;

    public static void setUserNameTextField(String userName) {
        ActionUtil.setTextField(usernameTextField, userName);
    }

    public static void setPasswordTextField(String password) {
        ActionUtil.setTextField(passwordTextField, password);
    }

    public static HomePage clickLoginButton() {
        ActionUtil.clickElement(loginButton);
        return new HomePage();
    }

    public static HomePage loginAs(String username, String password) {
        if (HomePage.isProfileIconVisible()) {
            Login.logout();
            Login.loginAs(username, password);
        }
        Login.setUserNameTextField(username);
        Login.setPasswordTextField(password);
        Login.clickLoginButton();
        return new HomePage();
    }

    public static Login logout() {

        return new Login();
    }

}
