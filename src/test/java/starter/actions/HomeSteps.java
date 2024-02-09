package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import starter.pageobjects.HomePage;

public class HomeSteps extends UIInteractionSteps {
    HomePage navigate;

    @Step("I am on the Home Page")
    public void getHomePage() {
        navigate.open();
        Serenity.getDriver().manage().window().maximize();

    }

    @Step("I click on accept cookies")
    public void acceptCookies() {
        find(HomePage.ACCEPT_COOKIES).click();
    }
}
