package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TabMenuPage extends BasePage {

    public TabMenuPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Bedarf']")
    private WebElement bedarfItem;

    @FindBy(css = "#ember7")
    private WebElement accountIcon;

    @FindBy(xpath = "//span[text()='Ausloggen']")
    private WebElement logOutButton;


    public void clickBedarfTabItem() {
        clickOnElement(bedarfItem);
    }

    public void openAccountMenu() {
        clickOnElement(accountIcon);
    }

    public void logOut() {
        clickOnElement(logOutButton);
    }
}
