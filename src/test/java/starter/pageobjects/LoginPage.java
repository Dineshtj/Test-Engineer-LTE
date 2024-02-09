package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final By LOGIN_ICON = By.xpath("//*[@id=\"header_wrapper\"]/div[3]/a[2]/div");
    public static final By EMAIL_FIELD = By.id("quick_login__email");
    public static final By PASSWORD_FIELD = By.id("quick_login__password");
    public static final By LOGIN_BUTTON = By.id("quick_login__submit");

}
