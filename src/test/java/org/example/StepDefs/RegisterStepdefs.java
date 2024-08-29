package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepdefs {
    @Given("I am on register page {string}")
    public void tAmOnRegisterPage(String word) {
        System.out.println(word);
    }

    @When("I enter my valid data")
    public void iEnterMyValidData() {
        System.out.println("two");
    }

    @Then("I registered successfully")
    public void iRegisteredSuccessfully() {
        System.out.println("three");
    }
}
