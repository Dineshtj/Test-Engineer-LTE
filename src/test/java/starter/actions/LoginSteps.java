package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.LoginPage;
import starter.pageobjects.AccountPage;

public class LoginSteps extends UIInteractionSteps {

    @Step("I click on login icon")
    public void clickLoginIcon() {
        find(LoginPage.LOGIN_ICON).click();
    }

    @Step("I enter the email {string}")
    public void iEnterTheEmail(String string) {
        find(LoginPage.EMAIL_FIELD).sendKeys(string);
    }

    @Step("I enter the password {string}")
    public void iEnterThePassword(String string) {
        find(LoginPage.PASSWORD_FIELD).sendKeys(string);
    }

    @Step("I click on the Login button")
    public void clickLoginButton() {
        find(LoginPage.LOGIN_BUTTON).click();
    }

    @Step("I should see the {string} message")
    public String getLoginWelcomeMessage() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return find(AccountPage.WELCOME_MESSAGE).getText();
    }

}
