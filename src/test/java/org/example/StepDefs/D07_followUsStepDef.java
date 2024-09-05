package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.driver.BaseDriver;
import org.example.pages.P07_FollowUsActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class D07_followUsStepDef {

    WebDriver driver = BaseDriver.getDriver();
    P07_FollowUsActions followUsActions = new P07_FollowUsActions(); // Initialize actions

    String mainTab; // Store the main window handle

    @Given("user is on home page")
    public void userIsOnHomePage() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user clicks on facebook link")
    public void userClicksOnFacebookLink() throws InterruptedException {
        mainTab = driver.getWindowHandle(); // Store the main window handle
        followUsActions.clickFacebook();    // Click on the Facebook link
        Thread.sleep(2000);                 // Wait for 2 seconds to ensure tab opening
    }

    @When("user clicks on twitter link")
    public void userClicksOnTwitterLink() throws InterruptedException {
        mainTab = driver.getWindowHandle();
        followUsActions.clickTwitter();
        Thread.sleep(2000);
    }

    @When("user clicks on rss link")
    public void userClicksOnRssLink() throws InterruptedException {
        mainTab = driver.getWindowHandle();
        followUsActions.clickRss();
        Thread.sleep(2000);
    }

    @When("user clicks on youtube link")
    public void userClicksOnYoutubeLink() throws InterruptedException {
        mainTab = driver.getWindowHandle();
        followUsActions.clickYoutube();
        Thread.sleep(2000);
    }

    @Then("\"(.*)\" is opened in new tab")
    public void validateNewTab(String expectedUrl) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String tab : windowHandles) {
            if (!tab.equals(mainTab)) {
                driver.switchTo().window(tab); // Switch to the new tab
                String actualUrl = driver.getCurrentUrl();
                Assert.assertEquals(actualUrl, expectedUrl, "URL doesn't match");
                driver.close();                 // Close the new tab
                driver.switchTo().window(mainTab); // Switch back to the main tab
            }
        }
    }
}

