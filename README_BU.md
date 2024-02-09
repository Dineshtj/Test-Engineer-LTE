Lumea lui Andrei - Serenity BDD using Cucumber

Overview

This project, named "Lumea lui Andrei," is a Serenity BDD project utilizing Cucumber for behavior-driven development. The project is built using Maven and adheres to the standard directory structure. It incorporates various actions, page objects, and step definitions to create a comprehensive testing suite.

Project Structure
Actions (Package: starter.actions)

This package contains classes representing various actions performed during test scenarios.

AddToCartSteps

-Clicks on the "Add to Cart" button.

-Verifies the product is added to the cart.

HomeSteps

-Navigates to the home page.

-Accepts cookies on the home page.

LoginSteps

-Clicks on the login icon.

-Enters email and password.

-Clicks on the login button.

-Retrieves the login welcome message.

LogoutSteps

-Clicks on the logout button.

-Verifies redirection to the home page after logout.

SearchProductSteps

-Clicks on the search bar.

-Enters a product name in the search bar.

-Clicks on the search button.

-Verifies search results for a given product.

Page Objects (Package: starter.pageobjects)

This package contains classes representing the locators for different pages.

AccountPage

-Locators for elements on the account page.

AddToCartPage

-Locators for elements related to adding items to the cart.

HomePage

-Locators for elements on the home page.

LoginPage

-Locators for elements on the login page.

SearchProductPage

-Locators for elements on the search product page.

Step Definitions (Package: starter.stepdefinitions)

This package contains classes representing step definitions for Cucumber scenarios.

AddToCartStepsDefinitions

-Step definitions for the "Add to Cart" feature.

HomeStepsDefinitions

-Step definitions for the home page navigation and cookie acceptance.

LogoutStepsDefinitions

-Step definitions for logging out and verifying redirection.

SearchProductStepsDefinitions

-Step definitions for searching a product and verifying search results.

LoginStepsDefinitions

-Step definitions for logging in with non-valid and valid credentials and verifying the login message.

Features

-This section provides an overview of the features and scenarios covered in the project.


Add to Cart Feature

-Adds a product to the cart and verifies successful addition.

Login Feature

-Covers scenarios of logging in with non-valid credentials.

-Logs in with valid credentials and verifies the welcome message.

Logout Feature

-Logs in, performs a successful logout, and verifies redirection to the home page.

Search Product Feature

-Searches for a product and verifies the search results.

How to Run

To execute the tests, follow these steps:

-Clone the repository.

-Ensure Maven is installed on your system.

-Open a terminal and navigate to the project directory.

-Run the command: mvn clean verify

This will run the Serenity BDD tests using Cucumber.