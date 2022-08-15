package steps;

import io.cucumber.java.en.Then;
import pages.RecommendationPage;

public class RecommendationSteps {
    RecommendationPage recommendationPage = new RecommendationPage();

    @Then("Recommendation page > 'Persönliche Situation bewerten' button is displayed")
    public void pageIsDisplayed() {
        recommendationPage.isOpenPersonalRecommendationsBtnDisplayed();
    }
}
