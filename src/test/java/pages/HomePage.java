package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy (xpath = "//form[@id='extended-nav-search']//input")
    private WebElement searchField;

    /*@FindBy (xpath = "//div[@data-control-name=\"identity_welcome_message\"]")
    private WebElement identityWelcomeMessage;*/

    public HomePage (WebDriver webDriver) {
        super(webDriver);
    }

}
