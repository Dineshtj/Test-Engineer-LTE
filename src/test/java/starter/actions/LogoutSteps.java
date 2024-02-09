package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.AccountPage;

import static org.assertj.core.api.Assertions.assertThat;

public class LogoutSteps extends UIInteractionSteps {

    @Step("I click on the Logout button")
    public void clickLogoutButton(){
        find(AccountPage.LOGOUT_BUTTON).click();
    }

    @Step("I should be on the Home Page")
    public void verifyHomePage(){
        String currentUrlAfterLogout = getDriver().getCurrentUrl();
        assertThat(currentUrlAfterLogout)
                .as("After logout, expected to be on the home page but found %s", currentUrlAfterLogout)
                .isEqualTo("https://www.lumea-lui-andrei.ro/");
    }

}
