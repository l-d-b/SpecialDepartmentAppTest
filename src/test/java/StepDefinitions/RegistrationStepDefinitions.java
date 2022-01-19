package StepDefinitions;

import PageFactory.LoginPage;
import PageFactory.RegistrationPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class RegistrationStepDefinitions {

    RegistrationPage objRegistrationPage = new RegistrationPage();
    LoginPage objLoginPage = new LoginPage();
    int userNumber = 1;

    @Given("^I am on the registration page$")
    public void i_am_on_the_registration_page() {
        objRegistrationPage.navigateToRegistrationPage();
    }

    @When("^I fill in First name with \"([^\"]*)\"$")
    public void i_fill_in_first_name_with_something(String strArg1) {
        objRegistrationPage.setFirstName(strArg1);
    }

    @And("^I fill in Last name with \"([^\"]*)\"$")
    public void i_fill_in_last_name_with_something(String strArg1) {
        objRegistrationPage.setLastName(strArg1);
    }

    @And("^I fill in RegistrationEmail with \"([^\"]*)\"$")
    public void i_fill_in_registrationemail_with_something(String strArg1) {
        objRegistrationPage.setEmail(userNumber + strArg1);
    }

    @And("^I fill in RegistrationPassword with \"([^\"]*)\"$")
    public void i_fill_in_registrationpassword_with_something(String strArg1) {
        objRegistrationPage.setPassword(strArg1);
    }

    @And("^I fill in RegistrationPasswordAgain with \"([^\"]*)\"$")
    public void i_fill_in_registrationpasswordagain_with_something(String strArg1) {
        objRegistrationPage.setPasswordAgain(strArg1);
    }

    @And("^I fill in date of birth with \"([^\"]*)\"$")
    public void i_fill_in_date_of_birth_with_something(String strArg1) {
        objRegistrationPage.setBirthDate(strArg1);
    }

    @And("^I choose \"([^\"]*)\"$")
    public void i_choose_radio_button(String strArg1) {
        objRegistrationPage.setRadioButton(strArg1);
    }

    @And("^I press RegistrationSubmit$")
    public void i_press_registrationsubmit(){
        objRegistrationPage.clickSubmit();
    }

    @And("^I press DetailsSubmit$")
    public void i_press_detailssubmit() {
        objRegistrationPage.clickDetailSubmit();
    }


    @And("^I fill in Description with \"([^\"]*)\"$")
    public void i_fill_in_description_with_something(String strArg1) {
        objRegistrationPage.setDescription(strArg1);
    }

    @And("^I fill in Phone Number with \"([^\"]*)\"$")
    public void i_fill_in_phone_number_with_something(String strArg1) {
        objRegistrationPage.setPhoneNumber(strArg1);
    }

    @And("^I am able to log in with \"([^\"]*)\"$")
    public void i_am_able_to_log_in_with_something(String strArg1) {
        objLoginPage.loginCorrectly(userNumber + strArg1);
        userNumber++;
    }
}
