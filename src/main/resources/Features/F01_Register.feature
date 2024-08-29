Feature: Register Function Test
  Scenario: Verify the registration with valid crediential
    Given I am on register page "Shrouk"
    When I enter my valid data
    Then I registered successfully