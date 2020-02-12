import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Managed(driver = "chrome")
    WebDriver webDriver;

    LandingPage landingPage;
    LoginSubmit loginSubmit;

    @Steps
    UserSteps userSteps;

    @Test
    public void negativeLoginTest(){
        landingPage.open();
        userSteps.login("a@b.c", "P@ssword123");
    }
}
