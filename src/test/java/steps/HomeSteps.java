package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import pages.HomePage;

import static org.hamcrest.CoreMatchers.is;

public class HomeSteps extends ScenarioSteps {
    private HomePage homePage;

    @Then("I should see Home page")
    @Step
    public HomeSteps validateHomePageIsLoaded(){
        Assert.assertThat("Wrong page title", homePage.getTitle(), is("LinkedIn"));
        Assert.assertTrue("Page is not loaded", homePage.isPageLoaded());
        return this;
    }



    @Step
    public HomeSteps searchFor (String searchTerm){
        homePage.searchFor(searchTerm);
        return this;

    }

}