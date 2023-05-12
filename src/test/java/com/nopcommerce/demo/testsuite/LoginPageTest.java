package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage; // Declaring LoginPage Object
    HomePage homePage; // Declaring HomePage Object

    @BeforeMethod(alwaysRun = true)
    public void inIt() { // Method to initialize page objects before every method executes
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickingOnLoginLinkFromTheHomePage(); // Clicking on the login link from home page
        loginPage.isWelcomeTextDisplayed(); // Verifying that welcome is displayed or not
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickingOnLoginLinkFromTheHomePage(); // Clicking on the login link from home page
        loginPage.enteringEmailInToEmailField("prime123@gmail.com"); // Entering email
        loginPage.enteringPasswordInToPasswordField("prime123"); // Entering password
        loginPage.clickingOnTheLoginButton(); // Clicking on the login button
        loginPage.isErrorMessageDisplayed(); // Verifying error message is displayed or not
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickingOnLoginLinkFromTheHomePage(); // Clicking on the login link from home page
        loginPage.enteringEmailInToEmailField("sareejunction@gmail.com"); // Entering email
        loginPage.enteringPasswordInToPasswordField("abc12345"); // Entering password
        loginPage.clickingOnTheLoginButton(); // Clicking on the login button
        homePage.isLogoutLinkDisplayed(); // Verifying that logout link is displayed or not
    }

    @Test(groups = "regression")
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homePage.clickingOnLoginLinkFromTheHomePage(); // Clicking on the login link from home page
        loginPage.enteringEmailInToEmailField("sareejunction@gmail.com"); // Entering email
        loginPage.enteringPasswordInToPasswordField("abc12345"); // Entering password
        loginPage.clickingOnTheLoginButton(); // Clicking on the login button
        homePage.clickingOnTheLogoutLink(); // Clicking ont the logout link
        homePage.isLoginLinkDisplayed(); // Verifying that login link is displayed after logging out
    }
}