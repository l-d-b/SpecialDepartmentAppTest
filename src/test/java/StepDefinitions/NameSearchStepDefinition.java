package StepDefinitions;

import PageFactory.MainPageNameSearch;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
public class NameSearchStepDefinition {
    MainPageNameSearch mainPageNameSearch = new MainPageNameSearch();

    @Then("^User write in the Name Search field (.+)$")
    public void user_write_in_the_name_search_field(String name) throws Throwable {
        mainPageNameSearch.sendKeyToSearchField(name);
    }

    @Then("^Check that the proper workers show up (.+)$")
    public void check_that_the_proper_workers_show_up(String expectedWorker) throws Throwable {
        String actualWorker = mainPageNameSearch.actualWorker(expectedWorker);
        assertEquals(actualWorker, expectedWorker);
    }
}
