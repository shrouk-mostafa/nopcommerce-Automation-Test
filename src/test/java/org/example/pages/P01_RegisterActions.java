package org.example.pages;

import org.example.driver.BaseDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_RegisterActions {

    P01_RegisterLocators locators = new P01_RegisterLocators();

    public void clickRegisterLink() {
        BaseDriver.getDriver().findElement(locators.registerLink).click();
    }

    public void selectGenderFemale() {
        BaseDriver.getDriver().findElement(locators.genderFemale).click();
    }

    public void enterFirstName(String firstName) {
        BaseDriver.getDriver().findElement(locators.firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        BaseDriver.getDriver().findElement(locators.lastNameField).sendKeys(lastName);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        new Select(BaseDriver.getDriver().findElement(locators.dayOfBirthDropdown)).selectByValue(day);
        new Select(BaseDriver.getDriver().findElement(locators.monthOfBirthDropdown)).selectByValue(month);
        new Select(BaseDriver.getDriver().findElement(locators.yearOfBirthDropdown)).selectByValue(year);
    }

    public void enterEmail(String email) {
        BaseDriver.getDriver().findElement(locators.emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        BaseDriver.getDriver().findElement(locators.passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        BaseDriver.getDriver().findElement(locators.confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        BaseDriver.getDriver().findElement(locators.registerButton).click();
    }

    public String getSuccessMessage() {
        return BaseDriver.getDriver().findElement(locators.successMessage).getText();
    }

    public String getSuccessMessageColor() {
        return BaseDriver.getDriver().findElement(locators.successMessage).getCssValue("color");
    }
}
