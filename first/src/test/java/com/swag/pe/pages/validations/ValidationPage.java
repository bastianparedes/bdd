package com.swag.pe.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[@class='product_label']")
    protected WebElementFacade labelProduct;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Username and password do not match any user in this service']")
    protected WebElementFacade labelErrorMessage;
}
