package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.ComputerPage;
import com.demo.nopcommerce.pages.DesktopPage;
import com.demo.nopcommerce.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Mitul
 */
public class ComputerTest {
    @Given("^I am on nop commerce Home Page$")
    public void iAmOnNopCommerceHomePage() {
    }

    @When("^I click on computer feature$")
    public void iClickOnComputerFeature() {
        new HomePage().clickOnComputerFeature();
    }

    @Then("^I should be on computer page successfully$")
    public void iShouldBeOnComputerPageSuccessfully() {
        Assert.assertEquals(new ComputerPage().getComputerTextMessage(),"Computers");
    }

    @And("^I click on desktop feature$")
    public void iClickOnDesktopFeature() {
        new DesktopPage().clickOnDesktopButton();
    }

    @And("^I click on position field$")
    public void iClickOnPositionField() {
        new DesktopPage().clickOnPosition();
    }

    @And("^I sort item by A to Z button$")
    public void iSortItemByAToZButton() {
        new DesktopPage().aTozSort();
    }

    @When("^I click on build computer button$")
    public void iClickOnBuildComputerButton() {
        new ComputerPage().clickOnBuildComputer();
    }

    @And("^I click on radio button$")
    public void iClickOnRadioButton() {
        new ComputerPage().clickOnRadioButtonFeature();
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ComputerPage().clickOnAddToCartButton();
    }

    @Then("^I should see product added successful message$")
    public void iShouldSeeProductAddedSuccessfulMessage() {
        Assert.assertEquals(new ComputerPage().getAddToCartMessage(),"The product has been added to your shopping cart" );
    }

}
