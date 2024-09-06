package org.example.pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_HomePageActions {

    WebDriver driver = Hooks.driver;

    public boolean isOnHomePage() {
        return driver.getTitle().contains("nopCommerce");
    }

    // Method to select a currency
    public void selectCurrency(String currency) {
        WebElement dropdown = driver.findElement(P03_HomePageLocators.currencyDropdown);
        dropdown.click();
        dropdown.findElement(By.xpath("//option[contains(text(),'" + currency + "')]")).click();
    }

    // Method to get the list of product prices
    public List<WebElement> getProductPrices() {
        return driver.findElements(P03_HomePageLocators.productPrices);
    }
}

