package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Es visible la plp")
    public Boolean titleIsVisible() {
        return this.labelProduct.isDisplayed();
    }

    @Step("Es visible message de error")
    public Boolean messageIsVisible() {
        return this.labelErrorMessage.isDisplayed();
    }
}
