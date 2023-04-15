package support;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import java.time.Duration;

public class Commands extends RunCucumber {

    public static void waitElementBeClickable(By element, Duration tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitElementBeVisible(By element, Duration tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        System.out.println("### Element " + element + " is visible ###");
    }

    public static void clickElement(By element) {
        System.out.println("##############################################");
        try {
            System.out.println("********* Click on element: " + element);
            waitElementBeClickable(element, Duration.ofMillis(10000));
            getDriver().findElement(element).click();
            System.out.println("********* Clicked on element: " + element);
        } catch (Exception error) {
            System.out.println("********* Error on element click: " + element);
            System.out.println(error);
        }
        System.out.println("##############################################");
    }

    public static void fillFields(By element, String value) {
        System.out.println("##############################################");
        try {
            System.out.println("********* Fill field: " + element);
            waitElementBeVisible(element, Duration.ofMillis(10000));
            getDriver().findElement(element).sendKeys(value);
            System.out.println("********* Field filled: " + element);
            JavascriptExecutor jse = (JavascriptExecutor)getDriver();
            jse.executeScript("window.scrollBy(0,100)", "");
        } catch (Exception error) {
            System.out.println("********* Error on fill field: " + element);
            System.out.println(error);
        }
        System.out.println("##############################################");
    }

    public static void checkMessage(By element, String expectedMessage) {
        System.out.println("***************************************************");
        System.out.println("********* Validate Message: " + expectedMessage);
        waitElementBeVisible(element, Duration.ofMillis(2000));
        String actualMessage = getDriver().findElement(element).getText();

        Assert.assertEquals("Validate Message Error", expectedMessage, actualMessage);


        System.out.println("********* Message validated: " + expectedMessage);
        System.out.println("***************************************************");

    }

    public static void checkCart(By element){
        try {
            if (getDriver().findElement(element).isDisplayed()) {
                System.out.println("An error has ocurred");
            } else {
                System.out.println("Item removed from cart");
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }

}
