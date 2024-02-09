package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchProductPage extends PageObject {

    public static final By SEARCH_BAR_FIELD = By.xpath("//*[@id=\"header_wrapper\"]/div[1]/form/div/input");

    public static final By SEARCH_BUTTON = By.xpath("//*[@id=\"header_wrapper\"]/div[1]/form/button");

    public static final By PRODUCT_NAME = By.xpath("//*[@id=\"main\"]/section/div/section/div/div/div/div[2]/a[1]");
}
