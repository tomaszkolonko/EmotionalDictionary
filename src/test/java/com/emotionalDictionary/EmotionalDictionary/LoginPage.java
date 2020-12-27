package com.emotionalDictionary.EmotionalDictionary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "inputUsername")
    private WebElement inputUsername;

    @FindBy(id = "inputPassword")
    private WebElement inputPassword;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    @FindBy(id = "signup-link")
    private WebElement signupLink;

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver,  this);
    }

    public void submit() {
        submitButton.click();
    }

    public void enterCredentials(String username, String password) {
        inputUsername.clear();
        inputPassword.clear();
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
    }

    public void goToSignupLink() {
        signupLink.click();
    }
}
