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
      | email                 | password       | message      |
      | "email_test@yahoo.ro" | "Exemplu2023!" | "Acces cont" |
      | "email_test@yahoo.com"   | "Exemplu2023"  | "Acces cont" |

  @validLogin
  Scenario: Login with valid credentials
    Given I click on login icon
    When I enter the email "email_test@yahoo.com"
    And I enter the password "Exemplu2023!"
    And I click on the Login button
    Then I should see the "Bine ai venit, Cristina!" message

