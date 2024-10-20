package com.swag.cl.utilities.Website;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class Website {
    @Steps(shared = true)
    PageObject swag;

    @Step("Navegate to url")
    public void navegateTo(String url) {
        this.swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
