package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.driver.BaseDriver;
import org.example.pages.P05_HoverActions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {

    P05_HoverActions hoverActions = new P05_HoverActions(BaseDriver.getDriver());
    String selectedSubCategory;

    @Given("user is on the home page")
    public void userIsOnHomePage() {
        Assert.assertTrue(BaseDriver.getDriver().getTitle().contains("nopCommerce"), "User is not on the home page");
    }

    @When("user hovers over a random main category")
    public void userHoversOverRandomMainCategory() {
        hoverActions.hoverOverRandomMainCategory();
    }

    @When("user selects a random sub-category")
    public void userSelectsRandomSubCategory() {
        selectedSubCategory = hoverActions.selectRandomSubCategory();
    }

    @Then("the page title should match the selected sub-category")
    public void verifyPageTitle() {
        String pageTitle = hoverActions.getPageTitle();
        Assert.assertTrue(pageTitle.contains(selectedSubCategory), "Page title does not match the selected sub-category");
    }
}
