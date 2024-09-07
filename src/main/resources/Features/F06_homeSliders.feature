@smoke
Feature: Home Sliders

  Scenario: First slider is clickable on the home page
    Given user is on the home page for homeslider
    When user clicks on the first slider
    Then user should be redirected to Nokia Lumia 1020 page

  Scenario: Second slider is clickable on the home page
    Given user is on the home page for homeslider
    When user clicks on the second slider
    Then user should be redirected to iPhone page
