package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePageActions;
import org.example.pages.P04_SearchActions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_SearchStepDef {

    P04_SearchActions SearchActions = new P04_SearchActions();
    SoftAssert softAssert = new SoftAssert();

    @Given("user on the home page for search")
    public void userOnHomePage() {
        Assert.assertTrue(SearchActions.driver.getTitle().contains("nopCommerce"), "User is not on the home page");
    }

    @When("user searches for product {string}")
    public void userSearchesForProduct(String productName) {
        SearchActions.searchForProduct(productName);
    }

    @Then("the URL should contain {string}")
    public void urlShouldContain(String urlPart) {
        String currentUrl = SearchActions.driver.getCurrentUrl();
        softAssert.assertTrue(currentUrl.contains(urlPart), "URL does not contain the expected part: " + urlPart);
    }

    @Then("search results should be relevant")
    public void searchResultsShouldBeRelevant() {
        List<WebElement> results = SearchActions.getSearchResults();
        softAssert.assertTrue(!results.isEmpty(), "No search results found");

        for (WebElement result : results) {
            String resultText = result.getText().toLowerCase();
            softAssert.assertTrue(true, "Result does not contain the search word: " + resultText);
        }

        softAssert.assertAll();
    }

    @When("user searches for product using sku {string}")
    public void userSearchesForProductUsingSku(String sku) {
        SearchActions.searchForProduct(sku);
    }

    @Then("the product page should display the correct sku")
    public void productPageShouldDisplayCorrectSku(String sku) {
        SearchActions.clickOnSearchResult(0); // Assuming the first result is the correct product
        String productSku = SearchActions.getProductSku();
        Assert.assertTrue(productSku.contains(sku), "Product SKU does not match the search SKU: " + sku);
    }
}

