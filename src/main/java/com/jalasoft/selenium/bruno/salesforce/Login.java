package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.ActionUtil;
import com.jalasoft.selenium.bruno.salesforce.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class Login extends BasePage {

    @FindBy(id = "username")
    protected static WebElement usernameTextField;

    @FindBy(id = "password")
    protected static WebElement passwordTextField;

    @FindBy(id = "Login")
    protected static WebElement loginButton;


    /**
     * This method will be used to set the user name on login name text field.
     * @param userName of user.
     */
    public static void setUserNameTextField(final String userName) {
        ActionUtil.setTextField(usernameTextField, userName);
    }

    /**
     * This method type the password on password text field.
     * @param password of user.
     */
    public static void setPasswordTextField(final String password) {
        ActionUtil.setTextField(passwordTextField, password);
    }

    /**
     * This method will click on login button
     * @return Home Page.
     */
    public static HomePage clickLoginButton() {
        ActionUtil.clickElement(loginButton);
        return new HomePage();
    }

    /**
     * This method will be used to login to salesforce.
     * @param username text.
     * @param password text.
     * @return Home page.
     */
    public static HomePage loginAs(String username, String password) {
        if (HomePage.isProfileIconVisible()) {
            HomePage.logout();
            Login.loginAs(username, password);
        }
        Login.setUserNameTextField(username);
        Login.setPasswordTextField(password);
        Login.clickLoginButton();
        return new HomePage();
    }



}
