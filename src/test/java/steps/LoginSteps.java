package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.Given;
import org.junit.Assert;
import pages.LandingPage;
import pages.LoginChallengePage;

public class LoginSteps extends ScenarioSteps {
    private LandingPage landingPage;
    private LoginChallengePage loginChallengePage;

    @Given("I open Landing page")
    @Step
    public LoginSteps openLandingPage() {
        landingPage.open();
        return this;
    }

    @Step
    public LoginSteps login(String userEmail, String userPassword) {
        landingPage.login(userEmail, userPassword);
        //waitABit(60000);
        return this;
    }

    @Step
    public LoginSteps validatePageHeader(String expectedMessage) {
        Assert.assertEquals("Wrong header message.", expectedMessage, loginChallengePage.getErrorMessage());
        return this;
    }
}