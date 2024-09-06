package org.example.pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_SearchActions {

    public WebDriver driver = Hooks.driver;

    // Method to search for a product
    public void searchForProduct(String productName) {
        WebElement searchField = driver.findElement(P04_SearchLocators.searchBar);
        searchField.clear();
        searchField.sendKeys(productName);
        driver.findElement(P04_SearchLocators.searchButton).click();
    }

    // Method to get search results
    public List<WebElement> getSearchResults() {
        return driver.findElements(P04_SearchLocators.searchResults);
    }

    // Method to get the SKU on the product page
    public String getProductSku() {
        return driver.findElement(P04_SearchLocators.productSku).getText();
    }

    // Method to click on a search result
    public void clickOnSearchResult(int index) {
        List<WebElement> results = getSearchResults();
        if (index < results.size()) {
            results.get(index).click();
        }
    }
}

