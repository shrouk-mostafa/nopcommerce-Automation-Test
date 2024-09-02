package org.example.pages;

import org.example.driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P01_RegisterActions {

    P01_RegisterLocators locators = new P01_RegisterLocators();
    WebDriver driver = BaseDriver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

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

    public void clickContinueButton() {
        // Assuming there's a "Continue" button to go to the homepage
        By continueButton = By.cssSelector("input.button-1.register-continue-button");
        driver.findElement(continueButton).click();

        // Wait until we're redirected to the homepage
        wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/register"));
    }
}
