package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;

import java.time.Duration;

import static support.Commands.*;
public class CheckouPage extends RunCucumber {

    private final By checkoutButton = By.id("checkout");
    private final By continuetButton = By.id("continue");
    private final By finishtButton = By.id("finish");
    private final By backButton = By.id("back-to-products");
    private final By firstNameField = By.id("first-name");
    private final By lastNameField = By.id("last-name");
    private final By postalCodeField = By.id("postal-code");
    private final By paymentInfo = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[1]");

    public void clickCheckout(){
        clickElement(checkoutButton);
    }

    public void fillFirstName (String firstName){
        fillFields(firstNameField, firstName);
    }

    public void fillLastName (String lasttName){
        fillFields(lastNameField, lasttName);
    }

    public void fillPostalCode (String postalCode){
        fillFields(postalCodeField, postalCode);
    }

    public void clickContinue(){
        clickElement(continuetButton);
    }

    public void checkPaymentInformation(){
        waitElementBeVisible(paymentInfo, Duration.ofMillis(3000));
    }

    public void clickFinish(){
        clickElement(finishtButton);
    }

    public void checkSuccess(){
        waitElementBeVisible(backButton, Duration.ofMillis(2000));
    }

}
