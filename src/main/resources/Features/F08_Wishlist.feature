@smoke
Feature: F08_Wishlist | users can add products to the wishlist

  Scenario: Add HTC One M8 Android L 5.0 Lollipop to wishlist
    Given user is on home page for wishlist
    When user clicks on wishlist button for "HTC One M8 Android L 5.0 Lollipop"
    Then success message "The product has been added to your wishlist" is displayed with green background color

  Scenario: Verify quantity in wishlist
    Given user is on home page for wishlist
    When user clicks on wishlist button for "HTC One M8 Android L 5.0 Lollipop"
    And success message disappears
    Then user navigates to wishlist page
    And quantity is greater than 0
