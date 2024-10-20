package com.swag.pe.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Website {
    @Steps(shared = true)
    PageObject swag;

    @Step("Navigate to url")
    public void navigateTo(String url) {
        this.swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
