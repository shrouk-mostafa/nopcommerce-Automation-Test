package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P02_LoginActions;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {

    P02_LoginActions loginActions = new P02_LoginActions();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login page")
    public void goToLoginPage() {
        loginActions.goToLoginPage();
    }

    @When("user login with {string} {string} and {string}")
    public void loginUser(String type, String email, String password) {
        loginActions.loginUser(email, password);
    }

    @And("user press on login button")
    public void pressLoginButton() {
        loginActions.pressLoginButton();
    }

    @Then("user login to the system successfully")
    public void verifySuccessfulLogin() {
        softAssert.assertEquals(loginActions.getCurrentUrl(), "https://demo.nopcommerce.com/", "URL mismatch after login");
        softAssert.assertTrue(loginActions.isMyAccountDisplayed(), "'My account' tab is not displayed");
        softAssert.assertAll();
    }

    @Then("user could not login to the system")
    public void verifyUnsuccessfulLogin() {
        softAssert.assertTrue(loginActions.getLoginErrorMessage().contains("Login was unsuccessful."), "Error message does not contain expected text");
        softAssert.assertEquals(loginActions.getLoginErrorMessageColor(), "#e4434b", "Error message color mismatch");
        softAssert.assertAll();
    }
}

