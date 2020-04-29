package com.demo.nopcommerce.pages;


import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Mitul
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @FindBy(id = "Email")
    WebElement _emailField;
    @FindBy(id = "Password")
    WebElement _passwordField;
    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _clickOnLogin;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement _welcomeMessage;
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _welcomeToOurStore;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement _loginError;
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement _LoginErrorMs;


    public String getLoginErrorMs(){
        Reporter.addStepLog("Getting Error Message " + _LoginErrorMs.toString());
        log.info("Getting Error Message " + _LoginErrorMs.toString());
        return getTextFromElement(_LoginErrorMs);
    }

    public void enterEmailId(String email) {
        Reporter.addStepLog("Enter email " + email + "On Email Field " + _emailField.toString());
        sendTextToElement(_emailField, email);
        log.info("Enter email " + email + "On Email Field " + _emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Enter password " + password + "On Password Field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, password);
        log.info("Enter password " + password + "On Password Field " + _passwordField.toString());
    }

    public void clickOnLoginButton() {
        Reporter.addStepLog("Clicking on login button " + _clickOnLogin.toString());
        clickOnElement(_clickOnLogin);
        log.info("Clicking on login button " + _clickOnLogin.toString());
    }

    public String getWelcomeMessage() {
        Reporter.addStepLog("Getting welcome " + _welcomeMessage.toString());
        log.info("Getting welcome " + _welcomeMessage.toString());
        return getTextFromElement(_welcomeMessage);

    }

    public String welcomeToStore() {
        Reporter.addStepLog("Getting welcome to store message " + _welcomeToOurStore.toString());
        log.info("Getting welcome to store message " + _welcomeToOurStore.toString());
        return getTextFromElement(_welcomeToOurStore);
    }
    public String getLoginErrorMessage(){
        Reporter.addStepLog("Getting Login Error Message " + _loginError.toString());
        log.info("Getting Login Error Message " + _loginError.toString());
        return getTextFromElement(_loginError);
    }

    //  public void waitForVisibilityToSeeElement() {
    // waitUntilVisibilityOfElementLocated((By) _emailField, 10);

    public void logToApp(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }

}



