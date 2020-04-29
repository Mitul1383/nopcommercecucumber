package com.demo.nopcommerce.cucumber.stepdefs;

import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


/**
 * Created by Mitul
 */


public class RegisterTest extends Utility {


    @When("^I click on register feature$")
    public void iClickOnRegisterFeature() {
        new HomePage().clickOnRegisterFeature();
    }

    @Then("^I should be on register page successfully$")
    public void iShouldBeOnRegisterPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().getRegisterMessage(), "Your Personal Details");
    }

    @And("^I select gender$")
    public void iSelectGender() {
        new RegisterPage().clickOnRadioButton();
    }

    @When("^I enter user first name \"([^\"]*)\"$")
    public void iEnterUserFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);

    }

    @And("^I select day of birth \"([^\"]*)\"$")
    public void iSelectDayOfBirth(String day) {
        new RegisterPage().selectDayOfBirth(day);

    }

    @And("^I select date of birth month \"([^\"]*)\"$")
    public void iSelectDateOfBirthMonth(String month) {
        new RegisterPage().selectDateOfBirthMonth(month);

    }

    @And("^I select date of birth year \"([^\"]*)\"$")
    public void iSelectDateOfBirthYear(String year) {
        new RegisterPage().selectDateOfBirthYear(year);

    }

    @And("^I enter \"([^\"]*)\"$")
    public void iEnter(String email) {
        new RegisterPage().enterEmailId(generateRandomNumber() + "@gmail.com");
    }

    @And("^I enter company name \"([^\"]*)\"$")
    public void iEnterCompanyName(String companyName) {
        new RegisterPage().enterCompanyName(companyName);

    }

    @And("^I click on check box of news letter$")
    public void iClickOnCheckBoxOfNewsLetter() {
        new RegisterPage().selectCheckBoxOfNewsLetter();
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);

    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegistrationButton();
    }

    @Then("^I should register successfully$")
    public void iShouldRegisterSuccessfully() {
        Assert.assertEquals(new RegisterPage().registrationCompleteMessage(), "Your registration completed");
    }


    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String emailId) {
        new RegisterPage().enterEmailId(emailId);

    }

    @Then("^I should not register successfully \"([^\"]*)\"$")
    public void iShouldNotRegisterSuccessfully(String errorMessage) {
        Assert.assertEquals(new RegisterPage().getErrorMs(),"Last name is required.");


    }
}
