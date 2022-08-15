package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BasePage {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(@class, 'cucumber-cookie-banner-accept-btn')]")
    private WebElement acceptCookiesButton;

    @FindBy(css = "header.demancheck_reminder__top_image")
    private WebElement modalHeader;

    @FindBy(xpath = "//button[contains(@class, 'modal-close')]")
    private WebElement modalCloseButton;

    @FindBy(xpath = "//h1[text()='Deine Empfehlungen sind verfügbar']")
    private WebElement registrationApprovalHeader;

    @FindBy(xpath = "//span[text()='Empfehlungen ansehen']")
    private WebElement seeRecommendations;

    public void acceptCookies() {
        clickOnElement(acceptCookiesButton);
    }

    public void promoIsDisplayed() {
        isElementDisplayed(modalHeader);
    }

    public void closePromoModal() {
        clickOnElement(modalCloseButton);
    }

    public void registrationApprovalIsDisplayed() {
        isElementDisplayed(registrationApprovalHeader);
    }

    public void clickSeeRecommendations() {
        clickOnElement(seeRecommendations);
    }
}
