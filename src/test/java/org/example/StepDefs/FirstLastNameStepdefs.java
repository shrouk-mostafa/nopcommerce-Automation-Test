package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.BaseDriver;
import org.example.pages.LoginActions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class FirstLastNameStepdefs{
    LoginActions loginActions;
    public FirstLastNameStepdefs() {
        loginActions = new LoginActions();
    }
    @Given("I am on the Selenium Practice Form")
    public void iAmOnTheSeleniumPracticeForm() {
    }

    @When("I enter {string} into the first name field")
    public void iEnterIntoTheFirstNameField(String firstName) {
        loginActions.enterFirstName(firstName);
    }

    @Then("the first name field should contain {string}")
    public void theFirstNameFieldShouldContain(String expectedFirstName) {
        String actualFirstName = loginActions.getFirstName();
        Assert.assertEquals(actualFirstName, expectedFirstName);
    }

    @When("I enter {string} into the last name field")
    public void iEnterIntoTheLastNameField(String lastName) {
        loginActions.enterLastName(lastName);
    }

    @Then("the last name field should contain {string}")
    public void theLastNameFieldShouldContain(String expectedLastName) {
        String actualLastName = loginActions.getLastName();
        Assert.assertEquals(actualLastName, expectedLastName);
    }
}
