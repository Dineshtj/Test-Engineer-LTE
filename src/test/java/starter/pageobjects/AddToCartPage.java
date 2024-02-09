package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddToCartPage extends PageObject {

    public static final By ADD_TO_CART_BUTTON = By.xpath("//*[@id=\"main\"]/section/div/section/div/div/div/div[2]/div[2]/a");
    public static final By PRODUCT_ON_CART = By.cssSelector(".drawer-items__item-name");

}
