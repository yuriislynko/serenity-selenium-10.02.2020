package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;


public class SearchPage extends PageObject {
    private WebDriver webDriver;

    @FindBy(xpath = "//li[contains(@class, 'search-result ')]")
    private List<WebElement> searchResults;

    @FindBy(xpath = "//h3[contains(@class, 'search-results__total')]")
    private WebElement searchResultsTotal;

    public boolean isPageLoaded() {
        try {
            waitFor(ExpectedConditions.visibilityOf(searchResultsTotal));
            return true;
        } catch (TimeoutException e) {
            return false;
        }

    }

    public int getSearchResultCount () {
        return searchResults.size();
    }

    public List<String> getSearchResultsList() {
        List<String> searchResultsList = new ArrayList<String>();

        for (WebElement searchResult : searchResults) {
            ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", searchResult);
            String searchResultText = searchResult.getText();
            searchResultsList.add(searchResultText);
        }
        return searchResultsList;
    }
}