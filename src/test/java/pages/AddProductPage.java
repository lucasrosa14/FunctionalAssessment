package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumber;

import java.time.Duration;

import static support.Commands.*;
import static support.Utils.*;

public class AddProductPage extends RunCucumber {

    private final By backToProducts = By.id("back-to-products");
    private final By addToCart = By.className("btn_inventory");
    private final By cartBadge = By.className("shopping_cart_badge");

    public void onHomePage() {
        String getHomePage = getDriver().getCurrentUrl();
        String homePage = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(homePage, getHomePage);
    }

    public void clickOnProduct(){
        clickElement(generateLink());
        waitElementBeVisible(backToProducts, Duration.ofMillis(10000));
    }

    public void clickOnAddToCart(){
        clickElement(addToCart);
    }

    public void validateCart(){
        waitElementBeVisible(cartBadge, Duration.ofMillis(5000));
    }
}
