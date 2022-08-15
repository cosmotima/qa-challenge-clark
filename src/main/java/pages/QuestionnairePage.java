package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import testUtils.TestUtils;

public class QuestionnairePage extends BasePage{
    @FindBy(css = "div.swiper-container")
    private WebElement slidesContainer;

    @FindBy(xpath = "//span[text()='Jetzt starten']")
    private WebElement startButton;

    @FindBy(css = "#mandate_birthdate")
    private WebElement birthdayInput;

    @FindBy(xpath = "//span[text()='Weiter']")
    private WebElement weiterButton;

    @FindBy(xpath = "//span[text()='Speichern']")
    private WebElement speichernButton;

    @FindBy(xpath = "//input[@placeholder='Berufsbezeichnung']")
    private WebElement jobTitleInput;

    @FindBy(xpath = "//h1[contains(., 'Dein ')]") // unappropriate locator and element name
    private WebElement dein;

    @FindBy(xpath = "//input[@placeholder='z.B. 40.000']")
    private WebElement salaryInput;

    public QuestionnairePage() {
        PageFactory.initElements(driver, this);
    }

    public void questionnaireIsOpened() {
        isElementDisplayed(dein);
    }

    public void clickStartButton() {
        clickOnElement(startButton);
    }

    public void questionIsDisplayed(String question) {
        String locator = String.format("//span[text()='%s']", question);
        FluentWait fluentWait = TestUtils.fluentWait(driver);
        fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));

        WebElement questionLabel = driver.findElement(By.xpath(String.format("//span[text()='%s']", question)));
        Assert.assertTrue(questionLabel.isDisplayed());
    }

    public void inputBirthday(String date) {
        typeText(birthdayInput, date);
    }

    public void clickWeiterButton() {
        clickOnElement(weiterButton);
    }

    public void chooseRadiobuttonWithText(String answer) {
        WebElement questionLabel = driver.findElement(By.xpath(String.format("//label[text()='%s']", answer)));
        clickOnElement(questionLabel);
    }

    public void inputJobTitle(String jobTitle) {
        typeText(jobTitleInput, jobTitle);
    }

    public void inputSalary(String salary) {
        typeText(salaryInput, salary);
    }

    public void clickSpeichernButton() {
        clickOnElement(speichernButton);
    }

}
