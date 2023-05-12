package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest {
    HomePage homePage; // Declaring HomePage Object
    ComputerPage computerPage; // Declaring ComputerPage Object
    DesktopsPage desktopsPage; // Declaring DesktopsPage Object
    BuildYourOwnComputerPage buildYourOwnComputerPage; // Declaring BuildYourOwnComputerPage Object

    @BeforeMethod(alwaysRun = true)
    public void inIt() { // Method to initialize page objects before every test execution
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickingOnComputersMenu(); // Clicking on computers menu
        computerPage.isComputersTextDisplayed(); // Verifying computer text is displayed or not
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickingOnComputersMenu(); // Clicking on computers menu
        computerPage.clickingOnDesktopsLink(); // Clicking on desktop menu
        desktopsPage.isDesktopsTextDisplayed(); // Verifying desktops text
    }

    @Test(groups = "regression", dataProvider = "dataSet", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram,
                                                                                    String hdd, String os, String software) {
        homePage.clickingOnComputersMenu(); // Clicking on computers menu
        homePage.clickingOnDesktopsLink(); // Clicking on desktops link
        desktopsPage.clickingOnBuildYourOwnComputerLink(); // Clicking on build your own computer link
        buildYourOwnComputerPage.selectingProcessorOptionFromDropDown(processor); // Selecting processor
        buildYourOwnComputerPage.selectingRAMOptionFromDropDown(ram); // Selecting RAM
        buildYourOwnComputerPage.selectingHDDOption(hdd); // Selecting HDD
        buildYourOwnComputerPage.selectingWindowsOption(os); // Selecting windows
        buildYourOwnComputerPage.selectingSoftwareOption(software); // Selecting software
        buildYourOwnComputerPage.clickingOnAddToCartButton(); // Clicking on add to cart button
        buildYourOwnComputerPage.isProductAddedTextDisplayed(); // Verifying product added text
    }
}