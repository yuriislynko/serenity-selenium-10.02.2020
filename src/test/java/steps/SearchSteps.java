package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Every;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import pages.SearchPage;

import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;

public class SearchSteps extends ScenarioSteps {
    private SearchPage searchPage;

    @Then("I should see $searchTerm in each result")
    @Step
    public SearchSteps verifyEachResultContains (String searchTerm) {
        List<String> searchResultsList = searchPage.getSearchResultsList();

        /*for (String searchResult : searchResultsList){
            Assert.assertTrue("SearchTerm not found " + searchTerm, searchResult.toLowerCase().contains(searchTerm));
        }*/

        Assert.assertThat("SearchTerm not found.", searchResultsList, Every.everyItem(containsString(searchTerm)));
        return this;
    }

    @Step
    public SearchSteps verifyEachResultContains(String[] searchTerm) {
        List<String> searchResultsList = searchPage.getSearchResultsList();
        Assert.assertThat("SearchTerm not found.", searchResultsList,
                Every.everyItem(anyOf(containsString("hr"), containsString("HR")))
        );
        return this;
    }
}