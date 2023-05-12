package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText; // Declaring register text locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleRadioButton; // Declaring female radio button locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName; // Declaring first name text box locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName; // Declaring last name text box locator
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayOfBirth; // Declaring day of birth drop down locator
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirth; // Declaring month of birth drop down locator
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirth; // Declaring year of birth drop down locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email; // Declaring email text box locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password; // Declaring password text box locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword; // Declaring confirm password text box locator
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton; // Declaring register button locator
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredText; // Declaring first name required error text locator
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredText; // Declaring last name required error text locator
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredText; // Declaring email required error text locator
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequiredText; // Declaring password required error text locator
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequiredText; // Declaring confirm password required error text locator
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedText; // Declaring your registration completed text locator
    @CacheLookup
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement continueButton; // Declaring continue button locator

    // Defining Methods
    public void isRegisterTextDisplayed() { // Method to verify that register text is displayed or not
        verifyThatElementIsDisplayed(registerText);
    }

    public void clickingOnRegisterButton() { // Method to click on register button
        clickOnElement(registerButton);
    }

    // Method to verify that first name required error text is displayed or not
    public void isFirstNameRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(firstNameRequiredText);
    }

    // Method to verify that last name required error text is displayed or not
    public void isLastNameRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(lastNameRequiredText);
    }

    // Method to verify that email required text is displayed or not
    public void isEmailRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(emailRequiredText);
    }

    // Method to verify that password required text is displayed or not
    public void isPasswordRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(passwordRequiredText);
    }

    // Method to verify that confirm password required text is displayed or not
    public void isConfirmedPasswordRequiredTextDisplayed() {
        verifyThatElementIsDisplayed(confirmPasswordRequiredText);
    }

    public void selectingFemaleRadioButton() { // Method to select female radio button
        clickOnElement(femaleRadioButton);
    }

    public void enteringFirstNameInToFirstNameField(String fName) { // Method to send first name to first name field
        sendTextToElement(firstName, fName);
    }

    public void enteringLastNameInToLastNameField(String lName) { // Method to send last name to last name field
        sendTextToElement(lastName, lName);
    }

    public void enteringEmailToEmailField(String emailValue) { // Method to send email to email field
        sendTextToElement(email, emailValue);
    }

    public void enteringPasswordToPasswordField(String passwordValue) { // Method to send password to password field
        sendTextToElement(password, passwordValue);
    }

    // Method to send password to confirm password field
    public void enteringPasswordToConfirmPasswordField(String confirmPasswordValue) {
        sendTextToElement(confirmPassword, confirmPasswordValue);
    }

    // Method to select day of birth from drop down
    public void selectingDayOfBirthFromDropDown(String day) {
        clickOnElement(dayOfBirth);
        selectByVisibleTextFromDropDown(dayOfBirth, day);
    }

    // Method to select month of birth from drop down
    public void selectingMonthOfBirthFromDropDown(String month) {
        clickOnElement(monthOfBirth);
        selectByVisibleTextFromDropDown(monthOfBirth, month);
    }

    // Method to select year of birth from drop down
    public void selectingYearOfBirthFromDropDown(String year) {
        clickOnElement(yearOfBirth);
        selectByVisibleTextFromDropDown(yearOfBirth, year);
    }

    // Method to verify your registration complete text
    public void isYourRegistrationCompleteTextDisplayed() {
        verifyThatElementIsDisplayed(registrationCompletedText);
    }

    // Method to click on continue button
    public void clickingOnContinueButton() {
        clickOnElement(continueButton);
    }
}