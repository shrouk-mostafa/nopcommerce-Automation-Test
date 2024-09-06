package org.example.pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;


public class P02_LoginActions {

    WebDriver driver = Hooks.driver;
    P02_LoginLocators locators = new P02_LoginLocators();

    public void goToLoginPage() {
        driver.findElement(locators.loginLink).click();
    }

    public void loginUser(String username, String password) {
        driver.findElement(locators.emailField).sendKeys(username);
        driver.findElement(locators.passwordField).sendKeys(password);
    }

    public void pressLoginButton() {
        driver.findElement(locators.loginButton).click();
    }

    public boolean isMyAccountDisplayed() {
        return driver.findElement(locators.myAccountTab).isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getLoginErrorMessage() {
        return driver.findElement(locators.loginErrorMessage).getText();
    }

    public String getLoginErrorMessageColor() {
        WebElement errorMessage = driver.findElement(locators.loginErrorMessage);
        return Color.fromString(errorMessage.getCssValue("color")).asHex();
    }
}

