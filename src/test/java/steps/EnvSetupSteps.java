package steps;

import io.cucumber.java.en.Given;
import pages.*;

public class EnvSetupSteps {
    EnvSetupPage envSetupPage = new EnvSetupPage();

    @Given("I open Clark {string} page")
    public void openClarkPage(String pageName) {
        envSetupPage.openClarkPage(pageName);
    }
}
