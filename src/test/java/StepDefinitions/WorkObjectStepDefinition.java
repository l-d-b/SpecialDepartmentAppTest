package StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class WorkObjectStepDefinition {

    @Then("^User click on Extra Search menu point$")
    public void user_click_on_extra_search_menu_point() throws Throwable {

    }

    @Then("^User click on a workObject (.+)$")
    public void user_click_on_a_workobject(String workobject) throws Throwable {

    }

    @And("^User click on Work Object menu point$")
    public void user_click_on_work_object_menu_point() throws Throwable {

    }

    @And("^Chek that the proper workers show up (.+) (.+)$")
    public void chek_that_the_proper_workers_show_up(String workobject, String numberofworker) throws Throwable {

    }
}
