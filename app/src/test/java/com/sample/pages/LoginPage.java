package com.sample.pages;

import com.sample.core.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Driver {

    public LoginPage() {
        super();
        PageFactory.initElements(this.driver, this);
    }


    @FindBy(id = "username")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "btnSignin")
    public WebElement loginButton;

    public void LoginToApp(String userName, String password){
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
