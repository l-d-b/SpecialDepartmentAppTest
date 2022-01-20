package StepDefinitions;


import PageFactory.LoginPage;
import PageFactory.MainPageWorkObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
public class WorkObjectStepDefinition {
    MainPageWorkObject mainPageWorkObject = new MainPageWorkObject("");

    @Then("^User click on Extra Search menu point$")
    public void user_click_on_extra_search_menu_point() throws Throwable {
        mainPageWorkObject.clickOnExtraSearchMenuPoint();
    }

    @And("^User click on Work Object menu point$")
    public void user_click_on_work_object_menu_point() throws Throwable {
        mainPageWorkObject.clickOnWorkObjectMenuPoint();
    }

    @Then("^User click on a work Object (.+)$")
    public void user_click_on_a_work_object(String workObject) throws Throwable {
        MainPageWorkObject mainPageWorkObject = new MainPageWorkObject(workObject);
        mainPageWorkObject.clickOnRadioButton();
    }

    @And("^Chek that the proper workers show up (.+)$")
    public void chek_that_the_proper_workers_show_up(int numberofworker) throws Throwable {
        int actualNumberOfWorker = mainPageWorkObject.returnNumberOfWorkersWhereProfessionIsAppeared();
        assertEquals(numberofworker, actualNumberOfWorker);
    }
}
