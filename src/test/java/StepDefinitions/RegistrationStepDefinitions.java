package StepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class RegistrationStepDefinitions {
    @Given("^I am on the registration page$")
    public void i_am_on_the_registration_page() throws Throwable {
        throw new PendingException();
    }

    @When("^I fill in First name with \"([^\"]*)\"$")
    public void i_fill_in_first_name_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I fill in Last name with \"([^\"]*)\"$")
    public void i_fill_in_last_name_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }


    @And("^I fill in date of birth with \"([^\"]*)\"$")
    public void i_fill_in_date_of_birth_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I choose \"([^\"]*)\"$")
    public void i_choose_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I fill in Description with \"([^\"]*)\"$")
    public void i_fill_in_description_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I fill in Phone Number with \"([^\"]*)\"$")
    public void i_fill_in_phone_number_with_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^I am able to log in$")
    public void i_am_able_to_log_in() throws Throwable {
        throw new PendingException();
    }


}
