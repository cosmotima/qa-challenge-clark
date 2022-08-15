package steps;

import io.cucumber.java.en.Then;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Then("Login page > Page is displayed")
    public void pageIsDisplayed() {
        loginPage.isPageDisplayed();
    }

    @Then("Login page > Input email")
    public void inputEmail() {
        loginPage.inputEmail();
    }

    @Then("Login page > Input password")
    public void inputPassword() {
        loginPage.inputPassword();
    }

    @Then("Login page > Click submit button")
    public void clickSubmitButton() {
        loginPage.clickSubmitButton();
    }

}
