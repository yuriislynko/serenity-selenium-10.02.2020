package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.SearchPage;

import java.util.List;

public class SearchSteps extends ScenarioSteps {

    private SearchPage searchPage;

    @Step
    public SearchSteps verifySearchResultsCount () {
        Assert.assertEquals(searchPage.getSearchResultCount(), 10);
        return this;
    }

    @Step
    public SearchSteps verifyEachResultContains(String searchTerm) {
        List<String> SearchResultsList= searchPage.getSearchResultsList();

        for(String searchResult : SearchResultsList) {
            Assert.assertTrue("SearchTerm: "+searchTerm+" not found in: \n"+searchResult, searchResult.contains(searchTerm));
        }
        return this;
    }
}