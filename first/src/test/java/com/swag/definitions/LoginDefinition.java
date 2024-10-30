package com.swag.definitions;

import com.swag.steps.login.LoginStep;
import com.swag.steps.validations.ValidationStep;
import com.swag.utilities.website.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginDefinition {

    @Steps(shared = true)
    Website url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validationStep;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        this.url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("ingresa credenciales correctas")
    public void loginWithValidCredentials() {
        this.login.typeUsername("standard_user");
        this.login.typePassword("secret_sauce");
        this.login.clickLogin();
    }

    @Then("la aplicación muestra la plp")
    public void loginSuccess() {
        Assert.assertTrue(this.validationStep.titleIsVisible());
    }

    @When("ingresa credenciales incorrectas")
    public void loginWithNoValidCredentials() {
        this.login.typeUsername("standard_user");
        this.login.typePassword("wrong password");
        this.login.clickLogin();
    }

    @Then("la aplicación no muestra la plp")
    public void loginNoSuccess() {
        Assert.assertTrue(this.validationStep.errorMessageIsVisible());
    }
}
