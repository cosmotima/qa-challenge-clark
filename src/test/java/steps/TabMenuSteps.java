package steps;


import io.cucumber.java.en.When;
import pages.TabMenuPage;

public class TabMenuSteps {
    TabMenuPage tabMenuPage = new TabMenuPage();

    @When("Click Bedarf tab button")
    public void clickBedarfTabItem() {
        tabMenuPage.clickBedarfTabItem();
    }

    @When("Open Account tab menu")
    public void openAccountMenu() {
        tabMenuPage.openAccountMenu();
    }

    @When("Click 'Ausloggen' button")
    public void logOut() {
        tabMenuPage.logOut();
    }
}
