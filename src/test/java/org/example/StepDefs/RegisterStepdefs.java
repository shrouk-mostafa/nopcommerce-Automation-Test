package org.example.StepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterStepdefs {
    @Given("user go to register page")
    public void userGoToRegisterPage() {
        WebElement registerBtn = BaseDriver.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        registerBtn.click();
    }
}
