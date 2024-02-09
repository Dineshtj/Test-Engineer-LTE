package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.AddToCartSteps;

public class AddToCartStepsDefinitions {

    @Steps
    AddToCartSteps addToCart;

    @When("I click on Add to Cart button")
    public void i_click_on_add_to_cart_button() {
        addToCart.clickOnAddToCartButton();
    }

    @Then("I should see the product name {string} added on cart")
    public void i_should_see_the_product_added_on_cart(String productName) {
        addToCart.verifyProductNameOnCart(productName);
    }
}
