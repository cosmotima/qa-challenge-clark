package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import config.WebDriverFactory;
import testUtils.Constants;


public class Hooks {

    @Before
    public void createDriver() {
        WebDriver driver = WebDriverFactory.getWebDriver();
        String baseUrl = WebDriverFactory.getAppBaseUrl(); // move to Utils
        driver.manage().window().maximize();
        BasePage.setDriver(driver);
        BasePage.setWait(Constants.TIMEOUT_IN_MILLIS);
        BasePage.setBaseUrl(baseUrl);
    }

    @After
    public void shutDownDriver() {
        BasePage.getDriver().close();
    }
}
