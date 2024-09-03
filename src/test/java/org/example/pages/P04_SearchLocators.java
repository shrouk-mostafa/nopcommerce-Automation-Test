package org.example.pages;
import org.openqa.selenium.By;

public class P04_SearchLocators {
    // Locator for the search bar
    public static By searchBar = By.id("small-searchterms");

    // Locator for search button
    public static By searchButton = By.className("search-box-button");

    // Locator for search results
    public static By searchResults = By.cssSelector(".product-item");

    // Locator for SKU in product details page
    public static By productSku = By.cssSelector("div.sku");
}
