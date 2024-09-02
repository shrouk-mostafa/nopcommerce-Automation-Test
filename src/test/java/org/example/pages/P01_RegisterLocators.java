package org.example.pages;

import org.openqa.selenium.By;

public class P01_RegisterLocators {

    // Define locators using By only
    public By registerLink = By.cssSelector("a.ico-register");
    public By genderFemale = By.id("gender-female");
    public By firstNameField = By.id("FirstName");
    public By lastNameField = By.id("LastName");
    public By dayOfBirthDropdown = By.name("DateOfBirthDay");
    public By monthOfBirthDropdown = By.name("DateOfBirthMonth");
    public By yearOfBirthDropdown = By.name("DateOfBirthYear");
    public By emailField = By.id("Email");
    public By passwordField = By.id("Password");
    public By confirmPasswordField = By.id("ConfirmPassword");
    public By registerButton = By.id("register-button");
    public By successMessage = By.xpath("//div[@class='result']");
}
