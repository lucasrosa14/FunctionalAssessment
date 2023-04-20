package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckouPage;
import pages.LoginPage;
import pages.ProductActionPage;
import support.ScreenshotUtils;

public class CheckoutSteps {

    LoginPage loginPage = new LoginPage();
    ProductActionPage productActionPage = new ProductActionPage();
    CheckouPage checkouPage = new CheckouPage();

    @Given("I am logged in to the website with {string} and {string}")
    public void i_am_logged_in_to_the_website_with_and(String user, String pass) {
        loginPage.accessAplication();
        loginPage.fillEmail(user);
        loginPage.fillPassword(pass);
        loginPage.clickLogin();
    }
    @When("I add a product to the cart and click the cart button")
    public void i_add_a_product_to_the_cart_and_click_the_cart_button() {
        productActionPage.onHomePage();
        productActionPage.clickOnProduct();
        productActionPage.clickOnAddToCart();
        productActionPage.clickCartIcon();
    }

    @When("I click the checkout button")
    public void i_click_the_checkout_button() {
        checkouPage.clickCheckout();
    }

    @When("I enter the required shipping information")
    public void i_enter_the_required_shipping_information() {
        checkouPage.fillFirstName("Lucas");
        checkouPage.fillLastName("Rosa");
        checkouPage.fillPostalCode("88780-000");
    }

    @When("I click the continue button")
    public void i_click_the_continue_button() {
        checkouPage.clickContinue();
    }

    @When("I see the payment information")
    public void i_see_the_payment_information() {
        checkouPage.checkPaymentInformation();
    }

    @When("I click the finish button")
    public void i_click_the_finish_button() {
        checkouPage.clickFinish();
    }

    @Then("the order should be successfully placed")
    public void the_order_should_be_successfully_placed() {
        checkouPage.checkSuccess();
    }

    @AfterStep
    public static void afterStep(Scenario scenario){
        ScreenshotUtils.addScreenshotOnScenario(scenario);
    }
}
