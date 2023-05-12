package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logo; // Declaring nopcommerce logo locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersMenu; // Declaring computers menu locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsMenu; // Declaring electronics menu locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparelMenu; // Declaring apparel menu locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloadsMenu; // Declaring digital downloads menu locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement booksMenu; // Declaring books menu locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelry; // Declaring jewelry menu locator
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCardsMenu; // Declaring gift cards menu locator
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLinkHomePage; // Declaring Login link locator on Home Page
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink; // Declaring register link locator
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logoutLink; // Declaring logout link locator
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;

    // Defining Methods
    public void isLogoutLinkDisplayed() { // Method to verify that logout link is displayed
        verifyThatElementIsDisplayed(logoutLink);
    }

    public void clickingOnTheLogoutLink() { // Method to click on logout link
        clickOnElement(logoutLink);
    }

    public void clickingOnLoginLinkFromTheHomePage() { // Method to click on the login link from home page
        clickOnElement(loginLinkHomePage);
    }

    // Method to verify that Login link is displayed on home page after logging out
    public void isLoginLinkDisplayed() {
        WebElement link = driver.findElement(By.xpath("//a[@class='ico-login']"));
        boolean isEnabled = link.isEnabled();
    }

    public void clickingOnRegisterLink() { // Method to click on register link
        clickOnElement(registerLink);
    }

    public void clickingOnComputersMenu() { // Method to click on computers menu
        clickOnElement(computersMenu);
    }

    public void clickingOnDesktopsLink() { // Method to click on desktops link
        clickOnElement(desktopsLink);
    }
}
