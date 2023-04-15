package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;

import java.time.Duration;

import static support.Commands.*;
public class LoginPage extends RunCucumber {

    private String URL = "https://www.saucedemo.com/";
    private By cartContainer = By.id("shopping_cart_container");
    private By loginButton = By.id("login-button");
    private By userField = By.id("user-name");
    private By passField = By.id("password");

    public void accessAplication() {
        String browser = System.getProperty("browser");
        getDriver(browser).get(URL);
    }

    public void fillEmail(String email) {
        fillFields(userField, email);
    }

    public void fillPassword(String pass) {
        fillFields(passField, pass);
    }

    public void clickLogin() {
        clickElement(loginButton);
    }

    public void checkLoginSuccess(){
        waitElementBeVisible(cartContainer, Duration.ofMillis(10000));
    }
}
