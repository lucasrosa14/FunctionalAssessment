package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductActionPage;

public class ProductActionSteps {

    LoginPage loginPage = new LoginPage();
    ProductActionPage productActionPage = new ProductActionPage();

    @Given("^I am logged in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_am_logged_in_with_username_and_password(String email, String pass){
        loginPage.accessAplication();
        loginPage.fillEmail(email);
        loginPage.fillPassword(pass);
        loginPage.clickLogin();
    }

    @When("^I am on the home page$")
    public void i_am_on_the_home_page() {
        productActionPage.onHomePage();
    }
    @When("^I click on any product on the homepage$")
    public void i_click_on_any_product_on_the_homepage() {
        productActionPage.clickOnProduct();
    }

    @When("^I click the add to cart button$")
    public void i_click_the_add_to_cart_button() {
        productActionPage.clickOnAddToCart();
    }

    @Then("^the product should be added to the cart with a count of 1$")
    public void the_product_should_be_added_to_the_cart_with_a_count_of() {
        productActionPage.validateCart();
    }

    @When("I click the cart icon")
    public void i_click_the_cart_icon() {
        productActionPage.clickCartIcon();
    }

    @When("I click the remove button next to the product in the cart")
    public void i_click_the_remove_button_next_to_the_product_in_the_cart() {
        productActionPage.clickOnRemoveFromCart();
    }

    @Then("the product should be removed from the cart")
    public void the_product_should_be_removed_from_the_cart() {
        productActionPage.checkCartIsEmpty();
    }


}
