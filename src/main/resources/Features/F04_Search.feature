@smoke
Feature: F04_Search | Verify search functionality on homepage

  Scenario Outline: user could search using product name
    Given user on the home page for search
    When user searches for product "<product>"
    Then the URL should contain "https://demo.nopcommerce.com/search?q="
    And search results should be relevant

    Examples:
      | product  |
      | book     |
      | laptop   |
      | nike     |

  Scenario Outline: user could search for product using sku
    Given user is on the home page
    When user searches for product using sku "<sku>"
    Then the product page should display the correct sku

    Examples:
      | sku         |
      | SCI_FAITH   |
      | APPLE_CAM   |
      | SF_PRO_11   |
