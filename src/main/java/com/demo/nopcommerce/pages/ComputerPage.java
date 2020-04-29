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
public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computerTextMessage;
    @FindBy(linkText = "Build your own computer")
    WebElement _buildYourComputer;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement _clickOnRadioButton;
    @FindBy(id = "add-to-cart-button-1")
    WebElement _addToCartButton;
    @FindBy(className = "content")
    WebElement _addToCartConfirmMessage;

    //below all methods for each elements and doing actions on that each elements
    public String getComputerTextMessage() {
        Reporter.addStepLog("Getting computer text message " + _computerTextMessage.toString());
        log.info("Getting computer text message " + _computerTextMessage.toString());
        return getTextFromElement(_computerTextMessage);
    }

    public void clickOnBuildComputer() {
        Reporter.addStepLog("Clicking on build computer " + _buildYourComputer.toString());
        clickOnElement(_buildYourComputer);
        log.info("Clicking on build computer " + _buildYourComputer.toString());
    }

    public void clickOnRadioButtonFeature() {
        Reporter.addStepLog("Clicking on radio button feature " + _clickOnRadioButton.toString());
        clickOnElement(_clickOnRadioButton);
        log.info("Clicking on radio button feature " + _clickOnRadioButton.toString());
    }

    public void clickOnAddToCartButton() {
        Reporter.addStepLog("Clicking On add cart button " + _addToCartButton.toString());
        clickOnElement(_addToCartButton);
        log.info("Clicking on add cart button " + _addToCartButton.toString());
    }

    public String getAddToCartMessage() {
        Reporter.addStepLog("Getting add to cart message " + _addToCartConfirmMessage.toString());
        log.info("Getting add to cart message " + _addToCartConfirmMessage.toString());
        return getTextFromElement(_addToCartConfirmMessage);
    }


}
