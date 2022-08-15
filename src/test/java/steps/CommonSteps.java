package steps;

import io.cucumber.java.en.When;
import pages.CommonPage;


public class CommonSteps {
    CommonPage commonPage = new CommonPage();

    @When("Click Accept cookies button")
    public void acceptCookies() {
        commonPage.acceptCookies();
    }

    @When("'Wie gut bist du versichert?' Modal is displayed")
    public void promoModalIsOpened() {
        commonPage.promoIsDisplayed();
    }

    @When("Close promo modal")
    public void closePromoModal() {
        commonPage.closePromoModal();
    }

    @When("Registration approval is displayed")
    public void registrationApprovalIsDisplayed() {
        commonPage.registrationApprovalIsDisplayed();
    }

    @When("Click 'Empfehlungen ansehen' button")
    public void clickSeeRecommendations() {
        commonPage.clickSeeRecommendations();
    }

}
