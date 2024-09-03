package org.example.pages;

import org.example.driver.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;


public class P02_LoginActions {

    P02_LoginLocators locators = new P02_LoginLocators();

    public void goToLoginPage() {
        BaseDriver.getDriver().findElement(locators.loginLink).click();
    }

    public void loginUser(String username, String password) {
        BaseDriver.getDriver().findElement(locators.emailField).sendKeys(username);
        BaseDriver.getDriver().findElement(locators.passwordField).sendKeys(password);
    }

    public void pressLoginButton() {
        BaseDriver.getDriver().findElement(locators.loginButton).click();
    }

    public boolean isMyAccountDisplayed() {
        return BaseDriver.getDriver().findElement(locators.myAccountTab).isDisplayed();
    }

    public String getCurrentUrl() {
        return BaseDriver.getDriver().getCurrentUrl();
    }

    public String getLoginErrorMessage() {
        return BaseDriver.getDriver().findElement(locators.loginErrorMessage).getText();
    }

    public String getLoginErrorMessageColor() {
        WebElement errorMessage = BaseDriver.getDriver().findElement(locators.loginErrorMessage);
        return Color.fromString(errorMessage.getCssValue("color")).asHex();
    }
}

