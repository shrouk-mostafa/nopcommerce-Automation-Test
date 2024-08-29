Feature: Form Submission
@smoke
  Scenario: Enter First Name
    Given I am on the Selenium Practice Form
    When I enter "shrouk" into the first name field
    Then the first name field should contain "shrouk"

  Scenario: Enter Last Name
    Given I am on the Selenium Practice Form
    When I enter "mostafa" into the last name field
    Then the last name field should contain "mostafa"
