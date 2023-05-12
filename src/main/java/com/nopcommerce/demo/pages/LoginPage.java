package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email; // Declaring email text box locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password; // Declaring password text box locator
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton; // Declaring login button locator
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText; // Declaring Welcome text locator
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage; // Declaring error message locator

    // Defining Methods

    public void enteringEmailInToEmailField(String emailValue) { // Method to send email o email text box
        sendTextToElement(email, emailValue);
    }

    public void enteringPasswordInToPasswordField(String passwordValue) { // Method to send password to password text box
        sendTextToElement(password, passwordValue);
    }

    public void clickingOnTheLoginButton() { // Method to click on login button
        clickOnElement(loginButton);
    }

    public void isWelcomeTextDisplayed() { // Method to verify that welcome text is displayed or not
        verifyThatElementIsDisplayed(welcomeText);
    }

    // Method to verify that error message is displayed upon entering invalid credentials or not
    public void isErrorMessageDisplayed() {
        verifyThatElementIsDisplayed(errorMessage);
    }
}
