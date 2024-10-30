package com.swag.utilities.website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class Website {
    @Steps(shared = true)
    PageObject swag;

    @Step("Navigate to url")
    public void navigateTo(String url) {
        this.swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
