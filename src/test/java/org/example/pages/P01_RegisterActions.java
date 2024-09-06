package org.example.pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_RegisterActions {
    WebDriver driver = Hooks.driver;
    P01_RegisterLocators locators = new P01_RegisterLocators();

    public void clickRegisterLink() {
        driver.findElement(locators.registerLink).click();
    }

    public void selectGenderFemale() {
        driver.findElement(locators.genderFemale).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(locators.firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(locators.lastNameField).sendKeys(lastName);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        new Select(driver.findElement(locators.dayOfBirthDropdown)).selectByValue(day);
        new Select(driver.findElement(locators.monthOfBirthDropdown)).selectByValue(month);
        new Select(driver.findElement(locators.yearOfBirthDropdown)).selectByValue(year);
    }

    public void enterEmail(String email) {
        driver.findElement(locators.emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(locators.passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(locators.confirmPasswordField).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        driver.findElement(locators.registerButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(locators.successMessage).getText();
    }

    public String getSuccessMessageColor() {
        return driver.findElement(locators.successMessage).getCssValue("color");
    }
}
