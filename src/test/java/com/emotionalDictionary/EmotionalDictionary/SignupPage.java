package com.emotionalDictionary.EmotionalDictionary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

    @FindBy(id = "inputFirstName")
    private WebElement inputFirstName;

    @FindBy(id = "inputLastName")
    private WebElement inputLastName;

    @FindBy(id = "inputUsername")
    private WebElement inputUsername;

    @FindBy(id = "inputPassword")
    private WebElement inputPassword;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    @FindBy(css = "body > div > div > label > a")
    private WebElement backToLoginPage;

    public SignupPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver,  this);
    }

    public void enterCredentials(String firstName, String lastName, String username, String password) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
    }

    public void submit() {
        submitButton.click();
    }

    public void backToLogin() {
        backToLoginPage.click();
    }
}
