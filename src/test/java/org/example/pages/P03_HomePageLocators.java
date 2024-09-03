package org.example.pages;

import org.openqa.selenium.By;

public class P03_HomePageLocators {

    // Locator for the currency dropdown
    public static By currencyDropdown = By.id("customerCurrency");

    // Locator for product prices on the homepage
    public static By productPrices = By.cssSelector("span.price");
}

