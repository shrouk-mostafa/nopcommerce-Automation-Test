@smoke
Feature: Hover over categories and select sub-category

  Scenario: User hovers over a main category and selects a sub-category
    Given user is on the home page for hover
    When user hovers over a random main category
    And user selects a random sub-category
    Then the page title should match the selected sub-category
