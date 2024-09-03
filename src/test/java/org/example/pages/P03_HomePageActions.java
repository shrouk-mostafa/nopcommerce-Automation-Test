package org.example.pages;

import org.example.driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_HomePageActions {

    private WebDriver driver = BaseDriver.getDriver();

    public boolean isOnHomePage() {
        return driver.getTitle().contains("nopCommerce");
    }

    // Method to select a currency
    public void selectCurrency(String currency) {
        WebElement dropdown = BaseDriver.getDriver().findElement(P03_HomePageLocators.currencyDropdown);
        dropdown.click();
        dropdown.findElement(By.xpath("//option[contains(text(),'" + currency + "')]")).click();
    }

    // Method to get the list of product prices
    public List<WebElement> getProductPrices() {
        return BaseDriver.getDriver().findElements(P03_HomePageLocators.productPrices);
    }
}

