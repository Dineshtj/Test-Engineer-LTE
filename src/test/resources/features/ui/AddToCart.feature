Feature: Add to Cart Feature

  Background:
    Given I am on the Home Page
    And I click on accept cookies

    @validAddProductToCart
  Scenario: Successful Add product to cart
      Given I click on the search bar
      And I entered the product name "urs panda" on search bar
      When I click on the search button
      And I click on Add to Cart button
      Then I should see the product name "Plus National Geographic - Urs panda mare" added on cart