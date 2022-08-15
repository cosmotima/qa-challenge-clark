package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendationPage extends BasePage{
    @FindBy(xpath = "//a[text()='Persönliche Situation bewerten']")
    private WebElement openPersonalRecommendationsBtn;

    public RecommendationPage() {
        PageFactory.initElements(driver, this);
    }

    public void isOpenPersonalRecommendationsBtnDisplayed() {
        isElementDisplayed(openPersonalRecommendationsBtn);
    }

}
