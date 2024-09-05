package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.driver.BaseDriver;
import org.example.pages.P08_WishlistActions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {

    WebDriver driver = BaseDriver.getDriver();
    P08_WishlistActions wishlistActions = new P08_WishlistActions(driver);
    SoftAssert softAssert = new SoftAssert();

    @Given("user is on home page")
    public void userIsOnHomePage() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("user clicks on wishlist button for \"HTC One M8 Android L 5.0 Lollipop\"")
    public void userClicksOnWishlistButton() {
        wishlistActions.clickWishlistHTC();
    }

    @Then("success message \"The product has been added to your wishlist\" is displayed with green background color")
    public void verifySuccessMessage() {
        // Verifying the success message text
        String expectedMessage = "The product has been added to your wishlist";
        String actualMessage = wishlistActions.getSuccessMessageText();
        softAssert.assertTrue(actualMessage.contains(expectedMessage), "Success message is incorrect");

        // Verifying the background color is green
        String actualColor = wishlistActions.getSuccessMessageBackgroundColor();
        String expectedColor = "rgba(75, 176, 122, 1)"; // Green color in RGBA format
        softAssert.assertEquals(actualColor, expectedColor, "Background color is not green");

        softAssert.assertAll(); // Complete soft assertion
    }

    @When("success message disappears")
    public void waitForSuccessMessageToDisappear() {
        wishlistActions.waitForSuccessMessageToDisappear();
    }

    @Then("user navigates to wishlist page")
    public void userNavigatesToWishlistPage() {
        wishlistActions.clickWishlistTab();
    }

    @Then("quantity is greater than 0")
    public void verifyWishlistQuantity() {
        int actualQty = wishlistActions.getWishlistQuantity();
        Assert.assertTrue(actualQty > 0, "Quantity is not greater than 0");
    }
}

