package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


import static org.hamcrest.CoreMatchers.is;

public class UserSteps extends ScenarioSteps {

    @Steps
    LoginSteps loginSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    HomeSteps homeSteps;

    public LoginSteps auth () {
        return loginSteps;
    }

    public HomeSteps homePage (){
        return homeSteps;
    }

    public SearchSteps searchPage (){
        return searchSteps;
    }

    @Step
    public UserSteps validatePageTitle (String pageTitle) {
        Assert.assertThat("Wrong page title", getDriver().getTitle(), is("LinkedIn"));
        return this;
    }

}