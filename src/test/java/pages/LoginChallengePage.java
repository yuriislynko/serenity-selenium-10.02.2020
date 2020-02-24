package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginChallengePage extends PageObject {

    @FindBy (xpath="//h1/../p")
    private WebElement errorMessage;

    public String getErrorMessage (){
        return errorMessage.getText();
    }

}