package com.swag.steps.login;

import com.swag.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Insert username")
    public void typeUsername(String newUsername) {
        this.txtUsername.sendKeys(newUsername);
    }

    @Step("Insert password")
    public void typePassword(String newPassword) {
        this.txtPassword.sendKeys(newPassword);
    }

    @Step("Click on login button")
    public void clickLogin() {
        this.btnLogin.click();
    }
}
