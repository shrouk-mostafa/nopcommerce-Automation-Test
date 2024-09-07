package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_SliderActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class D06_homeSlidersStepDef {

    P06_SliderActions homePageActions = new P06_SliderActions();
    WebDriver driver = Hooks.driver;

    @Given("user is on the home page for homeslider")
    public void userIsOnHomePage() {
        driver.get("https://demo.nopcommerce.com/");
        Assert.assertTrue(driver.getTitle().contains("nopCommerce"), "User is not on the home page");
    }

    @When("user clicks on the first slider")
    public void userClicksOnFirstSlider() {
        homePageActions.clickFirstSlider();
    }

    @Then("user should be redirected to Nokia Lumia 1020 page")
    public void userShouldBeRedirectedToNokiaPage() {
        String expectedUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(homePageActions.getCurrentUrl(), expectedUrl, "Redirection to Nokia Lumia 1020 page failed.");
    }

    @When("user clicks on the second slider")
    public void userClicksOnSecondSlider() {
        homePageActions.clickSecondSlider();
    }

    @Then("user should be redirected to iPhone page")
    public void userShouldBeRedirectedToIphonePage() {
        String expectedUrl = "https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(homePageActions.getCurrentUrl(), expectedUrl, "Redirection to iPhone page failed.");
    }
}
