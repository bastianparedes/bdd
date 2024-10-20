package com.swag.cl.steps;

import net.thucydides.core.annotations.Step;

public class Login extends com.swag.cl.pages.Login {

    @Step("Insert username")
    public void typeUsername(String newUsername) {
        this.usernameElement.sendKeys(newUsername);
    }

    @Step("Insert password")
    public void typePassword(String newPassword) {
        this.passwordElement.sendKeys(newPassword);
    }

    @Step("Click on login button")
    public void clickOnLoginButton() {
        this.btnLoginElement.click();
    }
}
