import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends PageObject {

    @FindBy(xpath = "//input[@name='session_key']")
    private WebElement userEmailField;

    @FindBy(xpath = "//input[@name='session_password']")
    private WebElement userPasswordField;

    @FindBy(xpath = "//button[@aria-label='i18n_sign-in']")
    private WebElement loginButton;

    public void login(String userEmail, String userPassword){
        userEmailField.sendKeys(userEmail);
        userPasswordField.sendKeys(userPassword);
        loginButton.click();
    }

}
