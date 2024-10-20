package com.swag.cl.pages;

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
}
