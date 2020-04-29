package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Mitul
 */
public class LoginTest {
    @When("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginFeature();
    }

    @Then("^I should be in login page$")
    public void iShouldBeInLoginPage() {
        Assert.assertEquals(new LoginPage().getWelcomeMessage(), "Welcome, Please Sign In!");
    }

    @When("^I enter email id \"([^\"]*)\"$")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);

    }

    @And("^I click on Login tab$")
    public void iClickOnLoginTab() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should be login successfully$")
    public void iShouldBeLoginSuccessfully() {
        Assert.assertEquals(new LoginPage().welcomeToStore(), "Welcome to our store");
    }

    @Then("^I should be not login system throws \"([^\"]*)\"$")
    public void iShouldBeNotLoginSystemThrows(String errorMessage) {
        Assert.assertEquals(new LoginPage().getLoginErrorMs(),"Please enter your email");

    }
}
