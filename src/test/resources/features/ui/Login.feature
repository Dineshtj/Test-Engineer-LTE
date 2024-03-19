Feature: Login Feature

  Background:
    Given I am on the Home Page

  @nonValidLogin
  Scenario Outline: Login with non-valid credentials
    Given I click on login icon
    When I enter the email <email>
    And I enter the password <password>
    And I click on the Login button
    Then I should see the <message> message
    Examples:
      | email           | password   | message                |
      | "test@test.com" | "test123!" | "Bine ai venit, test!" |
      | "test@test.com" | "test123"  | "Bine ai venit, test!" |

  @validLogin
  Scenario: Login with valid credentials
    Given I click on login icon
    When I enter the email "test@test.com"
    And I enter the password "test123"
    And I click on the Login button
    Then I should see the "Bine ai venit, test!" message

