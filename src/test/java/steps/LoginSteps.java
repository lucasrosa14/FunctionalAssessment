package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import support.ScreenshotUtils;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @Given("^I am on the Saucedemo login page$")
    public void i_am_on_the_saucedemo_login_page() {
        loginPage.accessAplication();
    }

    @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_username_and_password(String email, String pass) {
        loginPage.fillEmail(email);
        loginPage.fillPassword(pass);
    }

    @When("^I click the Login button$")
    public void i_click_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("^I should be redirected to the homepage$")
    public void i_should_be_redirected_to_the_homepage() {
        loginPage.checkLoginSuccess();
    }

    @After
    public static void afterScenario(Scenario scenario){
        ScreenshotUtils.addScreenshotOnScenario(scenario);
    }
}
