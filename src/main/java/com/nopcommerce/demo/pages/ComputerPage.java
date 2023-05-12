package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText; // Declaring computers text locator
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink; // Declaring desktops link locator
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement noteBooksLink; // Declaring notebooks link locator
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement softwareLink; // Declaring software link locator

    // Defining Methods
    public void isComputersTextDisplayed() { // Method to verify that computers text is displayed
        verifyThatElementIsDisplayed(computersText);
    }

    public void clickingOnDesktopsLink() { // Method to click on desktops link
        clickOnElement(desktopsLink);
    }

    public void clickingOnNoteBooksLink() { // Method to click on notebooks link
        clickOnElement(noteBooksLink);
    }

    public void clickingOnSoftwareLink() { // Method to click on software link
        clickOnElement(softwareLink);
    }
}