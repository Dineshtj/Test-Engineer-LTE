package starter.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;
import starter.pageobjects.AddToCartPage;

import static org.junit.Assert.assertEquals;

public class AddToCartSteps extends UIInteractionSteps {

    @Step("I click on Add to Cart button")
    public void clickOnAddToCartButton() {
        find(AddToCartPage.ADD_TO_CART_BUTTON).click();
    }

    @Step("I should see the product added on cart")
    public void verifyProductNameOnCart(String expectedProduct) {
        WebElement productNameElement = find(AddToCartPage.PRODUCT_ON_CART);
        String actualProductName = productNameElement.getText();
        assertEquals("Product name should match", expectedProduct, actualProductName);
    }
}
