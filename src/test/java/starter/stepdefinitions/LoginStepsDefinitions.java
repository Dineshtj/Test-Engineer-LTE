package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.actions.LoginSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepsDefinitions {

    @Steps
    LoginSteps login;

    @Given("I click on login icon")
    public void i_click_on_login_icon() {
        login.clickLoginIcon();
    }

    @When("I enter the email {string}")
    public void i_enter_the_email(String string) {
        login.iEnterTheEmail(string);
    }

    @When("I enter the password {string}")
    public void i_enter_the_password(String string) {
        login.iEnterThePassword(string);
    }

    @When("I click on the Login button")
    public void i_click_on_the_login_button() {
        login.clickLoginButton();
    }

    @Then("I should see the {string} message")
    public void i_should_see_the_message(String string) {
        assertThat(login.getLoginWelcomeMessage()).isEqualTo(string);
    }

}
