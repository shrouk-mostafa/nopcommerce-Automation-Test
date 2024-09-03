package org.example.pages;

import org.openqa.selenium.By;

public class P02_LoginLocators {

    // Define locators using By only
     By loginLink = By.className("ico-login");
     By emailField = By.id("Email");
     By passwordField = By.id("Password");
     By loginButton = By.className("login-button");
     By myAccountTab = By.cssSelector("a.ico-account");
     By loginErrorMessage = By.cssSelector("div.message-error");
}

