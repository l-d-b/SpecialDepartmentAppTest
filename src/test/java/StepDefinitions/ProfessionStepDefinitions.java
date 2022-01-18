package StepDefinitions;


import PageFactory.MainPageProfession;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
public class ProfessionStepDefinitions {
    MainPageProfession mainPageProfession = new MainPageProfession("");

    @Given("^User should landing on main page$")
    public void user_should_landing_on_main_page() throws Throwable {
        mainPageProfession.navigateToMainPage();
    }

    @When("^User click on Profession menu point$")
    public void user_click_on_profession_menu_point() throws Throwable {
        mainPageProfession.clickOnProfessionsMenuPoint();
    }

    @Then("^User click on a profession (.+)$")
    public void user_click_on_a_profession(String profession) throws Throwable {
        MainPageProfession mainPageProfession = new MainPageProfession(profession);
        mainPageProfession.professionMenuPoint.click();
    }

    @And("^Chek that the corresponding workers show up (.+) (.+)$")
    public void chek_that_the_corresponding_workers_show_up(String profession, int numberofworker) throws Throwable {
        int actualNumberOfWorker = mainPageProfession.returnNumberOfWorkersWhereProfessionIsAppeared(profession);
        assertEquals(numberofworker, actualNumberOfWorker);
    }
}
