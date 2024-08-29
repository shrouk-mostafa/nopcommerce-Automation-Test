package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActions {
    WebDriver driver;
    LoginLocators locators;

    public LoginActions() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html?m=1");
        this.locators = new LoginLocators();
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(locators.firstNameField);
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public String getFirstName() {
        return driver.findElement(locators.firstNameField).getAttribute("value");
    }

    public void enterLastName(String lastName) {
        WebElement lastNameField = driver.findElement(locators.lastNameField);
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public String getLastName() {
        return driver.findElement(locators.lastNameField).getAttribute("value");
    }
}
