package org.example.StepDefs;

import io.cucumber.java.en.*;
import org.example.pages.P01_RegisterActions;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_RegisterActions registerActions = new P01_RegisterActions();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to register page")
    public void go_to_register() {
        registerActions.clickRegisterLink();
    }

    @When("user select gender type")
    public void select_gender() {
        registerActions.selectGenderFemale();
    }

    @And("user enter first name {string} and last name {string}")
    public void enter_names(String firstName, String lastName) {
        registerActions.enterFirstName(firstName);
        registerActions.enterLastName(lastName);
    }

    @And("user enter date of birth")
    public void enter_date_of_birth() {
        registerActions.selectDateOfBirth("10", "10", "1990");
    }

    @And("user enter email {string} field")
    public void enter_email(String email) {
        registerActions.enterEmail(email);
    }

    @And("user fills Password fields {string} {string}")
    public void enter_password(String password, String confirmPassword) {
        registerActions.enterPassword(password);
        registerActions.enterConfirmPassword(confirmPassword);
    }

    @And("user clicks on register button")
    public void click_register_button() {
        registerActions.clickRegisterButton();
    }

    @Then("success message is displayed")
    public void verify_success_message() {
        String expectedMessage = "Your registration completed";
        String actualMessage = registerActions.getSuccessMessage();
        softAssert.assertEquals(actualMessage, expectedMessage, "Success message mismatch");

        String expectedColor = "rgba(76, 177, 124, 1)";
        String actualColor = registerActions.getSuccessMessageColor();
        softAssert.assertEquals(actualColor, expectedColor, "Success message color mismatch");

        softAssert.assertAll();
    }
}
