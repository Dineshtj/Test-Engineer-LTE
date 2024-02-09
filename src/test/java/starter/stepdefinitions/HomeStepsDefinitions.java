package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import starter.actions.HomeSteps;

public class HomeStepsDefinitions {
    @Steps
    HomeSteps navigate;

    @Given("I am on the Home Page")
    public void i_am_on_the_home_page() {
        navigate.getHomePage();
    }

    @Given("I click on accept cookies")
    public void i_click_on_accept_cookies(){
        navigate.acceptCookies();
    }
}
