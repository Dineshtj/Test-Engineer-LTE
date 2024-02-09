package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;
import starter.pageobjects.SearchProductPage;

import static org.junit.Assert.assertEquals;

public class SearchProductSteps extends UIInteractionSteps {

    @Step("I click on the search bar")
    public void clickOnSearchbar() {
        find(SearchProductPage.SEARCH_BAR_FIELD).click();
    }

    @Step("I entered the product name {string} on search bar")
    public void enteredProductName(String productName) {
        find(SearchProductPage.SEARCH_BAR_FIELD).sendKeys(productName);
    }

    @Step("I click on search button")
    public void clickSearchButton() {
        find(SearchProductPage.SEARCH_BUTTON).click();
    }

    @Step("I should see results for {string}")
    public void verifySearchResults(String expectedProductName) {
        WebElement productNameElement = find(SearchProductPage.PRODUCT_NAME);
        String actualProductName = productNameElement.getText();
        assertEquals("Product name should match", expectedProductName, actualProductName);
    }

}
