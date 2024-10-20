package com.swag.cl.definitions;

import com.swag.cl.steps.Login;
import com.swag.cl.steps.validations.ValidationStep;
import com.swag.cl.utilities.Website.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDefinition {

    @Steps(shared = true)
    Website url;

    @Steps(shared = true)
    Login login;

    @Steps(shared = true)
    ValidationStep validationStep;

    @Given("The user is in website")
    public void userNavigateTo() {
        this.url.navegateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("user enters wrong user and password")
    public void loginWithValidCredentials() {
        this.login.typeUsername("standard_user");
        this.login.typePassword("wrong password");
        this.login.clickOnLoginButton();
    }

    @Then("message is displayed")
    public void loginFails() {
        Assert.assertTrue(this.validationStep.errorMessageIsDisplayed());
    }
}
