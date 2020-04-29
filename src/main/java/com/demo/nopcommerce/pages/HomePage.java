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
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(linkText = "Register")
    WebElement _registerFeature;
    @FindBy(linkText = "Log in")
    WebElement _loginFeature;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computerFeature;






    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement _booksFeature;


    public void clickOnBooksButton() {
        Reporter.addStepLog("Clicking on Books Button " + _booksFeature.toString());
        clickOnElement(_booksFeature);
        log.info("Clicking on Books Button " + _booksFeature.toString());
    }













    public void clickOnRegisterFeature() {
        Reporter.addStepLog("Clicking on register button " + _registerFeature.toString());
        clickOnElement(_registerFeature);
        log.info("Clicking on register button " + _registerFeature.toString());
    }

    public void clickOnLoginFeature() {
        //Reporter.log("Clicking on login button " + _loginFeature.toString());
        clickOnElement(_loginFeature);
        // log.info("Clicking on login button " + _loginFeature.toString());
    }

    public void clickOnComputerFeature() {
        Reporter.addStepLog("Clicking on computer button " + _computerFeature.toString());
        clickOnElement(_computerFeature);
        log.info("Clicking on computer button " + _computerFeature.toString());
    }


}
