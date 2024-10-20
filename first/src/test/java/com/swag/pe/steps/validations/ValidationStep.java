package com.swag.pe.steps.validations;

import com.swag.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends LoginPage {

    @Step("In plp")
    public Boolean titleIsVisible() {
        return this.labelProduct.isDisplayed();
    }

    @Step("Error message is displayed")
    public Boolean errorMessageIsDisplayed() {
        return this.labelError.isDisplayed();
    }
}
