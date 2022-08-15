package pages;


import testUtils.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//article[@class='auth-form']")
    private WebElement loginPage;

    @FindBy(css = "#mandate_login_email")
    private WebElement emailInputField;

    @FindBy(css = "#mandate_login_password")
    private WebElement passwordInputField;

    @FindBy(xpath = "//button[@type=('submit')]")
    private WebElement submitButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void isPageDisplayed() {
        isElementDisplayed(loginPage);
    }

    public void inputEmail() {
        String email = Constants.USER_EMAIL;
        typeText(emailInputField, email);
        log.info(email + " email was entered");
    }

    public void inputPassword() {
        String password = Constants.USER_PASSWORD;
        typeText(passwordInputField, password);
        log.info(password + " password was entered");
    }

    public void clickSubmitButton() {
        clickOnElement(submitButton);
    }
}
