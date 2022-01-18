package StepDefinitions;

import PageFactory.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LogoutStepDefinitions {
    LoginPage objLoginPage = new LoginPage();

    @Given("^I am logged in$")
    public void i_am_logged_in() throws Throwable {
        throw new PendingException();
    }

    @When("^I press LOGOUT button$")
    public void i_press_logout_button() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should see the Login page $")
    public void i_should_see_the_login_page() throws Throwable {
        throw new PendingException();
    }

    @And("^I go to Main page $")
    public void i_go_to_main_page() throws Throwable {
        throw new PendingException();
    }

    @And("^I shouldn't see logged user$")
    public void i_shouldnt_see_logged_user() throws Throwable {
        throw new PendingException();
    }

    @And("^I should see \"([^\"]*)\" button$")
    public void i_should_see_something_button(String strArg1) throws Throwable {
        throw new PendingException();
    }

}