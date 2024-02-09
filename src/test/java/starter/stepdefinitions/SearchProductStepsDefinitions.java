package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.SearchProductSteps;


public class SearchProductStepsDefinitions {
    @Steps
    SearchProductSteps searchProduct;

    @Given("I click on the search bar")
    public void i_click_on_the_SearchBar() {
        searchProduct.clickOnSearchbar();
    }

    @Given("I entered the product name {string} on search bar")
    public void i_enter_product_name(String productName) {
        searchProduct.enteredProductName(productName);
    }

    @When("I click on the search button")
    public void i_click_on_search_button() {
        searchProduct.clickSearchButton();
    }

    @Then("I should see results for {string}")
    public void i_should_see_results_for(String productName) {
        searchProduct.verifySearchResults(productName);
    }

}
