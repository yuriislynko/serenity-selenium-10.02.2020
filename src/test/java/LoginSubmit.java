import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSubmit extends PageObject {

    @FindBy (xpath = "//form[@class='login__form']")
    private WebElement loginForm;

    @FindBy(xpath = "//div[@id='error-for-username']")
    private WebElement userEmailValidationMessage;

    @FindBy(xpath = "//div[@id='error-for-password']")
    private WebElement userPasswordErrorValidationMessage;

    public boolean isPageLoaded () {
        return loginForm.isDisplayed();
    }
}