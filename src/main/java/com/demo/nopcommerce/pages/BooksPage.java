package com.demo.nopcommerce.pages;

import com.cucumber.listener.Reporter;
import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mitul
 */
public class BooksPage extends Utility {

    private static final Logger log = LogManager.getLogger(BooksPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement _getBooksText;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement _clickPosition;

    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement _selectAtoZ;

    @FindBy(xpath = "//option[contains(text(),'Price: Low to High')]")
    WebElement _lowToHigh;


    public void clickOnLowToHigh() {
        Reporter.addStepLog("Clicking On Low To High Price " + _lowToHigh.toString());
        clickOnElement(_lowToHigh);
        log.info("Clicking On Low To High Price " + _lowToHigh.toString());
    }

    public void clickOnAtoZ() {
        Reporter.addStepLog("Selecting From A to Z List " + _selectAtoZ.toString());
        clickOnElement(_selectAtoZ);
        log.info("Selecting From A to Z List " + _selectAtoZ.toString());
    }

    public void verifyingBooksDisplayedAtoZ() {
        sortingAtoZ(By.tagName("h2"));
    }

    public void verifyingLowToHighPriceDisplayed() {
        priceSortingLowToHigh();
    }


    public void clickingPosition() {
        Reporter.addStepLog("Clicking on Position Button " + _clickPosition.toString());
        clickOnElement(_clickPosition);
        log.info("Clicking on Position Button " + _clickPosition.toString());
    }


    public String getBooksConfirmMessage() {
        Reporter.addStepLog("Getting Books Text " + _getBooksText.toString());
        log.info("Getting Books Text " + _getBooksText);
        return getTextFromElement(_getBooksText);
    }

}
