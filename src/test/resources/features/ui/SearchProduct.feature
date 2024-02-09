Feature: Search product Feature

  Background:
    Given I am on the Home Page
    And I click on accept cookies

  @validSearch
  Scenario: Successful search of a given product
    Given I click on the search bar
    And I entered the product name "urs panda" on search bar
    When I click on the search button
    Then I should see results for "Plus National Geographic - Urs panda mare"

