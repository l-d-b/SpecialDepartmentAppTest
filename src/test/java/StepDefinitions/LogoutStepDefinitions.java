package StepDefinitions;

import PageFactory.LoginPage;
import PageFactory.MainPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LogoutStepDefinitions {
    LoginPage objLoginPage = new LoginPage();
    MainPage objMainPage = new MainPage();

    @Given("^I am logged in$")
    public void i_am_logged_in() {
        objLoginPage.loginCorrectly("test@test.com");
    }

    @When("^I press LOGOUT button$")
    public void i_press_logout_button() throws Throwable {
        objMainPage.pressLogoutButton();
    }

    @And("^I shouldn't see logged user$")
    public void i_shouldnt_see_logged_user() throws Throwable {
        Assertions.assertFalse(objMainPage.loggedUserIsVisible());
    }

    @Then("I should see the Login page")
    public void iShouldSeeTheLoginPage() {
        Assertions.assertTrue(objLoginPage.loginBlockIsVisible());
    }

    @And("I go to Main page")
    public void iGoToMainPage() {
        objMainPage.navigateToMainPage();
    }
}