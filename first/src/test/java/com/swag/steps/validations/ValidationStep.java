package com.swag.steps.validations;

import com.swag.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Es visible la plp")
    public Boolean titleIsVisible() {
        return this.labelProduct.isDisplayed();
    }

    @Step("Es visible el mensage de error")
    public Boolean errorMessageIsVisible() {
        return this.labelErrorMessage.isDisplayed();
    }
}
