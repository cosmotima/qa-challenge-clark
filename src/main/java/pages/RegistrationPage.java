package pages;

import testUtils.TestUtils;
import testUtils.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage{

    @FindBy(xpath = "//form[contains(@class, 'registration-page')]")
    private WebElement registrationPage;

    @FindBy(xpath = "//input[@type=('email')]")
    private WebElement emailInputField;

    @FindBy(xpath = "//input[@type=('password')]")
    private WebElement passwordInputField;

    @FindBy(xpath = "//button[@type=('submit')]")
    private WebElement submitButton;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

    public void isPageDisplayed() {
        isElementDisplayed(registrationPage);
    }

    public void inputEmail() {
        String randomEmail = TestUtils.getRandomString() + "@gmail.com";
        typeText(emailInputField, randomEmail);
    }

    public void inputPassword() {
        String password = Constants.USER_PASSWORD;
        typeText(passwordInputField, password);
    }

    public void clickSubmitButton() {
        clickOnElement(submitButton);
    }

}

