package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class BasePage {

    protected static String baseUrl;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Logger log = Logger.getLogger(BasePage.class.getName());

    public static void setDriver(WebDriver WebDriver) {
        driver = WebDriver;
    }

    public static void setWait(Long duration) {
        wait = new WebDriverWait(driver, Duration.ofMillis(duration));
    }

    public static void setBaseUrl(String url) {
        baseUrl = url;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    protected static void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        log.info(element + " element was clicked");
    }

    protected static void typeText(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }

    protected static void isElementDisplayed(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }
}
