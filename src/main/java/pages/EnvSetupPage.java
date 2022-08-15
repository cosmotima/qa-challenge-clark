package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EnvSetupPage extends BasePage {

    public EnvSetupPage() {
        PageFactory.initElements(driver, this);
    }

    public void openClarkPage(String pageName) {
        driver.get(baseUrl + pageName);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-test-spinner]")));
    }
}
