package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.example.driver.BaseDriver;

public class P06_SliderActions {
    WebDriver driver = BaseDriver.getDriver();
    P06_SliderLocators locators = new P06_SliderLocators();

    // Action to click on the first slider
    public void clickFirstSlider() {
        driver.findElement(locators.firstSlider).click();
    }

    // Action to click on the second slider
    public void clickSecondSlider() {
        driver.findElement(locators.secondSlider).click();
    }

    // Action to get the current URL
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
