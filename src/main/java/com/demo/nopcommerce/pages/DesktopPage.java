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
public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    @FindBy(css = "div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.category-page div.page-body div.category-grid.sub-category-grid div.item-grid div.item-box:nth-child(1) div.sub-category-item h2.title > a:nth-child(1)")
    WebElement _clickOnDesktopFeature;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement _sortByPosition;
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement _aToZSorting;

    public void clickOnDesktopButton() {
        Reporter.addStepLog("Clicking on Desktop button " + _clickOnDesktopFeature.toString());
        clickOnElement(_clickOnDesktopFeature);
        log.info("Clicking on Desktop button " + _clickOnDesktopFeature.toString());
    }

    public void clickOnPosition() {
        Reporter.addStepLog("Clicking on position " + _sortByPosition.toString());
        clickOnElement(_sortByPosition);
        log.info("Clicking on position " + _sortByPosition.toString());
    }

    public void aTozSort() {
        Reporter.addStepLog("Clicking on A to Z " + _aToZSorting.toString());
        clickOnElement(_aToZSorting);
        log.info("Clicking on A to Z " + _aToZSorting.toString());
    }


}
