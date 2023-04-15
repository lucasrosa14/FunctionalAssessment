package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddProductPage;
import pages.LoginPage;

public class AddProductSteps {

    LoginPage loginPage = new LoginPage();
    AddProductPage addProductPage = new AddProductPage();

    @Given("^I am logged in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_am_logged_in_with_username_and_password(String email, String pass){
        loginPage.accessAplication();
        loginPage.fillEmail(email);
        loginPage.fillPassword(pass);
        loginPage.clickLogin();
    };

    @When("^I am on the home page$")
    public void i_am_on_the_home_page() {
        addProductPage.onHomePage();
    }
    @When("^I click on any product on the homepage$")
    public void i_click_on_any_product_on_the_homepage() {
        addProductPage.clickOnProduct();
    }

    @When("^I click the add to cart button$")
    public void i_click_the_add_to_cart_button() {
        addProductPage.clickOnAddToCart();
    }

    @Then("^the product should be added to the cart with a count of 1$")
    public void the_product_should_be_added_to_the_cart_with_a_count_of() {
        addProductPage.validateCart();
    }
}
