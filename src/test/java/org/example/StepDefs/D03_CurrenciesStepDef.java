package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePageActions;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D03_CurrenciesStepDef {

    P03_HomePageActions homePageActions = new P03_HomePageActions();

    @Given("user is on the home page")
    public void userIsOnHomePage() {
        // Assuming the base URL is already set in BaseDriver
        Assert.assertTrue(homePageActions.isOnHomePage(), "User is not on the home page");
    }

    @When("user selects Euro currency from the dropdown")
    public void userSelectsEuroCurrency() {
        homePageActions.selectCurrency("Euro");
    }

    @Then("the Euro symbol \\(€) should be displayed on all products listed on the home page")
    public void verifyEuroSymbolOnProducts() {
        List<WebElement> prices = homePageActions.getProductPrices();
        for (WebElement price : prices) {
            String priceText = price.getText();
            Assert.assertTrue(priceText.contains("€"), "Price does not contain the Euro symbol: " + priceText);
        }
    }
}
