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
public class LoginStepDefinitions {

    LoginPage objLoginPage = new LoginPage();

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() throws Throwable {
        objLoginPage.navigateToLoginPage();
    }

    @When("^I fill in Email with \"([^\"]*)\"$")
    public void i_fill_in_email_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should be on the users home page$")
    public void i_should_be_on_the_users_home_page() throws Throwable {
        throw new PendingException();
    }

    @And("^I fill in Password with \"([^\"]*)\"$")
    public void i_fill_in_password_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I press Submit$")
    public void i_press_submit() throws Throwable {
        throw new PendingException();
    }

    @And("^I should see logged user \"([^\"]*)\"$")
    public void i_should_see_logged_user_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I should see \"([^\"]*)\" button$")
    public void i_should_see_something_button(String strArg1) throws Throwable {
        throw new PendingException();
    }

}
