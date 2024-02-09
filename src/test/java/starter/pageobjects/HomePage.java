package starter.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.lumea-lui-andrei.ro/")
public class HomePage extends PageObject {
    public static final By ACCEPT_COOKIES = By.xpath("//*[@id=\"cookie-policy-overlay\"]/div/div[2]/div[2]/button[1]");
}
