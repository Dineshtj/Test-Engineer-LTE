package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.LogoutSteps;

public class LogoutStepsDefinitions {
    @Steps
    LogoutSteps logout;

    @When("I click on the Logout button")
    public void i_click_on_the_logout_button() {
        logout.clickLogoutButton();
    }

    @Then("I should be on the Home Page")
    public void i_should_be_on_the_home_page() {
        logout.verifyHomePage();
    }
}
