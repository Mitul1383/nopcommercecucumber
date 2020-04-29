package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.BooksPage;
import com.demo.nopcommerce.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Mitul
 */
public class BooksTest {
    @When("^I click on Books feature$")
    public void iClickOnBooksFeature() {
        new HomePage().clickOnBooksButton();
    }

    @Then("^I should be in Books page successfully$")
    public void iShouldBeInBooksPageSuccessfully() {
        Assert.assertEquals(new BooksPage().getBooksConfirmMessage(),"Books");
    }

    @When("^I click on sort by position button$")
    public void iClickOnSortByPositionButton() {
        new BooksPage().clickingPosition();
    }

    @And("^I select Name A to Z$")
    public void iSelectNameAToZ() {
        new BooksPage().clickOnAtoZ();
    }

    @Then("^I should see below books displayed in A to Z order$")
    public void iShouldSeeBelowBooksDisplayedInAToZOrder() {
        new BooksPage().verifyingBooksDisplayedAtoZ();



    }

    @And("^I select Price Low to High$")
    public void iSelectPriceLowToHigh() {
        new BooksPage().clickOnLowToHigh();
    }

    @Then("^I should see below books displayed in Low to High order$")
    public void iShouldSeeBelowBooksDisplayedInLowToHighOrder() {
   new BooksPage().verifyingLowToHighPriceDisplayed();

    }
}
