package steps;

import io.cucumber.java.en.Then;
import pages.RegistrationPage;

public class RegistrationSteps {
    RegistrationPage registrationPage = new RegistrationPage();

    @Then("Registration page > Page is displayed")
    public void pageIsDisplayed() {
        registrationPage.isPageDisplayed();
    }

    @Then("Registration page > Input random email")
    public void inputEmail() {
        registrationPage.inputEmail();
    }

    @Then("Registration page > Input default password")
    public void inputPassword() {
        registrationPage.inputPassword();
    }

    @Then("Registration page > Click submit button")
    public void clickSubmitButton() {
        registrationPage.clickSubmitButton();
    }
}
