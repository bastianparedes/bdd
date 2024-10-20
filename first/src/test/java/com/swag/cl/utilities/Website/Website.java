package com.swag.cl.utilities.Website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Website {
    @Steps(shared = true)
    PageObject swag;

    @Step("Navegate to url")
    public void navegateTo(String url) {
        this.swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
