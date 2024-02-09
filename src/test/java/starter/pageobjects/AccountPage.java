package starter.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountPage extends PageObject {
    public static final By WELCOME_MESSAGE = By.xpath("//*[@id=\"main\"]/section/div/aside[1]/h1");
    public static final By LOGOUT_BUTTON = By.xpath("//*[@id=\"main\"]/section/div/aside[2]/ul/li[7]/a");

}
