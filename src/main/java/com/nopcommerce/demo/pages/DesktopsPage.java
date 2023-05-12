package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText; // Declaring desktops text locator
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByDropDown; // Declaring sort by drop down locator
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayDropDown; // Declaring display drop down locator
    @CacheLookup
    @FindBy(xpath = "//a[@title='Grid']")
    WebElement gridIcon; // Declaring grid icon locator
    @CacheLookup
    @FindBy(xpath = "//a[@title='List']")
    WebElement listIcon; // Declaring list icon locator
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer; // Declaring build your own computer link locator

    // Defining Methods
    public void isDesktopsTextDisplayed() { // Method to verify that desktops text is displayed or not
        verifyThatElementIsDisplayed(desktopsText);
    }

    public void selectingOptionFromSortByDropDown(String sortOrder) { // Method to select sorting order from drop down
        clickOnElement(sortByDropDown);
        selectByVisibleTextFromDropDown(sortByDropDown, sortOrder);
    }

    public void selectingOptionFromDisplayDropDown(String displayOrder) { // Method to select display option from drop down
        clickOnElement(displayDropDown);
        selectByVisibleTextFromDropDown(displayDropDown, displayOrder);
    }

    public void clickingOnBuildYourOwnComputerLink() { // Method to click on build your own computer link
        clickOnElement(buildYourOwnComputer);
    }

    public void clickingOnGridIcon() { // Method to click on grid icon
        clickOnElement(gridIcon);
    }

    public void clickingOnListIcon() { // Method to click on list icon
        clickOnElement(listIcon);
    }
}