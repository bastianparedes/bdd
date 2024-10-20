package com.swag.cl.steps.validations;

import com.swag.cl.pages.Login;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends Login {

    @Step("In plp")
    public Boolean titleIsVisible() {
        return this.labelProduct.isDisplayed();
    }

    @Step("Error message is displayed")
    public Boolean errorMessageIsDisplayed() {
        return this.labelError.isDisplayed();
    }
}
