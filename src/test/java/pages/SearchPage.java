package pages;

import net.serenitybdd.core.pages.PageObject;

import org.jbehave.core.annotations.Then;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

//@At("https://www.linkedin.com/search/results/all/?keywords=hr")
public class SearchPage extends PageObject {

    @FindBy(xpath = "//h3[contains(@class,'search-results__total')]")
    private WebElement searchResultsTotal;


    @FindBy(xpath = "//li[contains(@class,'search-result__occluded-item')]")
    private List<WebElement> searchResults;


    public boolean isPageLoaded() {
        try {
            waitFor(ExpectedConditions.visibilityOf(searchResultsTotal));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    @Then("I should see search results which contain searchTerm")
    public List<String> getSearchResultsList() {

        List<String> searchResultsList = new ArrayList<>();

        // for each WebElement searchResult in searchResults List
        for (WebElement searchResult : searchResults) {
            evaluateJavascript("arguments[0].scrollIntoView(true);", searchResult);
            searchResultsList.add(searchResult.getText());
        }
        return searchResultsList;
    }

}