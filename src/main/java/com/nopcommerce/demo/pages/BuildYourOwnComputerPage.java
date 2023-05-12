package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText; // Declaring build your own computer text locator
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown; // Declaring processor drop down locator
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement rAMDropDown; // Declaring RAM drop down locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDD320GB; // declaring 320GB HDD radio button locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement HDD400GB; // Declaring 400GB HDD radio button locator
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_5_10']")
    WebElement mSOfficeCheckBox; // Declaring MS Office Check Box locator
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']//li[1]")
    WebElement acrobatReaderCheckBox; // Declaring acrobat reader check box locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderCheckBox; // Declaring total commander check box locator
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton; // Declaring add to cart button locator
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedText; // Declaring product successfully added text locator
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_4_8']")
    WebElement vistaOption; // Declaring vista option locator
    @CacheLookup
    @FindBy(xpath = "//label[@for='product_attribute_4_9']")
    WebElement vistaPremiumOption; // Declaring vista premium option locator

    // Defining Methods
    // Method to verify that build your own computer text is displayed or not
    public void isBuildYourOwnComputerTextDisplayed() {
        verifyThatElementIsDisplayed(buildYourOwnComputerText);
    }

    // Method to select processor option from drop down
    public void selectingProcessorOptionFromDropDown(String processor) {
        clickOnElement(processorDropDown);
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    // Method to select RAM option from drop down
    public void selectingRAMOptionFromDropDown(String rAM) {
        clickOnElement(rAMDropDown);
        selectByVisibleTextFromDropDown(rAMDropDown, rAM);
    }

    public void selectingHDDOption(String hDD) { // Method to select 320GB HDD option
        if (hDD == "320GB")
            clickOnElement(HDD320GB);
        else clickOnElement(HDD400GB);
    }

    public void selectingWindowsOption(String winOption) { // Method to select windows option
        if (winOption == "Vista Home [+$50.00]") {
            clickOnElement(vistaOption);
        } else clickOnElement(vistaPremiumOption);
    }

    public void selectingSoftwareOption(String sWOption) { // Method to select MS Office option
        if (sWOption == "Microsoft Office [+$50.00]")
            clickOnElement(mSOfficeCheckBox);
        else if (sWOption == "Acrobat Reader [+$10.00]") {
            clickOnElement(acrobatReaderCheckBox);
        } else clickOnElement(totalCommanderCheckBox);
    }

    public void clickingOnAddToCartButton() { // Method to click on add to cart button
        clickOnElement(addToCartButton);
    }

    public void isProductAddedTextDisplayed() { // Method to verify the product added successfully text
        verifyThatElementIsDisplayed(productAddedText);
    }
}