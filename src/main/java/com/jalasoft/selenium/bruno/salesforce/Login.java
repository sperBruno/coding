package com.jalasoft.selenium.bruno.salesforce;

import com.jalasoft.selenium.bruno.salesforce.common.Common;
import com.jalasoft.selenium.bruno.salesforce.pages.HomePage;
import org.openqa.selenium.By;

/**
 * Created by Bruno Barrios on 3/15/2017.
 */
public class Login extends BasePage {
    private final By usernameTextField = By.id("username");
    private final By passwordTextField = By.id("password");
    private final By loginButton = By.id("Login");

    /**
     * This method will be used to set the user login.
     *
     * @param userName of the user.
     */
    public void setUserNameTextField(String userName) {
        Common.setTextBoxField(usernameTextField, userName);
    }

    /**
     * This method will set the password of a user in login page.
     *
     * @param userPassword of the user.
     */
    public void setUserPasswordTextField(String userPassword) {
        Common.setTextBoxField(passwordTextField, userPassword);
    }

    /**
     * This method will click on login button.
     *
     * @return Salesforce home page.
     */
    public HomePage clickLoginButton() {
        Common.clickButton(loginButton);
        return new HomePage();
    }
}
