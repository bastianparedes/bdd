package com.swag.pe.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {
    @FindBy(id = "user-name")
    protected WebElementFacade usernameElement;

    @FindBy(id = "password")
    protected WebElementFacade passwordElement;

    @FindBy(id = "login-button")
    protected WebElementFacade btnLoginElement;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/h3")
    protected WebElementFacade labelError;

    @FindBy(xpath = "//div[@class='product_label']")
    protected WebElementFacade labelProduct;
}
