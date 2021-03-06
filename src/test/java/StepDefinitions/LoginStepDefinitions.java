package StepDefinitions;

import PageFactory.LoginPage;
import PageFactory.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginStepDefinitions {

    LoginPage objLoginPage = new LoginPage();
    MainPage objMainPage = new MainPage();

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() {
        objLoginPage.navigateToLoginPage();
    }

    @When("^I fill in Email with \"([^\"]*)\"$")
    public void i_fill_in_email_with_valid_email(String strArg1) {
        objLoginPage.setEmail(strArg1);
    }

    @And("^I fill in Password with \"([^\"]*)\"$")
    public void i_fill_in_password_with_valid_password(String strArg1) {
        objLoginPage.setPassword(strArg1);
    }

    @And("^I press Submit$")
    public void i_press_submit() {
        objLoginPage.pressSubmit();
    }

    @Then("^I should see warning message (.+)$")
    public void i_should_see_warning_message(String expectedtext) {
        Assertions.assertEquals(objLoginPage.getWarning(), expectedtext);
    }

    @Then("^I should see logged user \"([^\"]*)\"$")
    public void i_should_see_logged_user_name(String strArg1) {
        Assertions.assertEquals(objMainPage.getLoggedUser(), strArg1);
    }

    @And("^I should see \"([^\"]*)\" button$")
    public void i_should_see_something_button(String strArg1) {
        Assertions.assertEquals(objMainPage.getLoggingButtonText(), strArg1);
    }

    @And("Tear down")
    public void tearDown() {
        objLoginPage.tearDown();
    }

    @And("Login correct")
    public void loginCorrect() {
        objLoginPage.loginCorrectly("test@test.com");
    }
}
