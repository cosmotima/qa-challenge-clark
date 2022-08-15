package steps;

import io.cucumber.java.en.When;
import pages.QuestionnairePage;

public class QuestionnaireSteps {
    QuestionnairePage questionnairePage = new QuestionnairePage();

    @When("Questionnaire > slide is opened")
    public void questionnaireIsOpened() {
        questionnairePage.questionnaireIsOpened();
    }

    @When("Questionnaire > Click 'Jetzt starten' button")
    public void clickStartButton() {
        questionnairePage.clickStartButton();
    }

    @When("Questionnaire > {string} question is displayed")
    public void questionIsDisplayed(String question) {
        questionnairePage.questionIsDisplayed(question);
    }

    @When("Questionnaire > Input {string} date")
    public void inputBirthday(String date) {
        questionnairePage.inputBirthday(date);
    }

    @When("Questionnaire > Click 'Weiter' button")
    public void clickWeiterButton() {
        questionnairePage.clickWeiterButton();
    }

    @When("Questionnaire > Click 'Speichern' button")
    public void clickSpeichernButton() {
        questionnairePage.clickSpeichernButton();
    }

    @When("Questionnaire > choose {string} answer")
    public void chooseRadiobuttonWithText(String answer) {
        questionnairePage.chooseRadiobuttonWithText(answer);
    }

    @When("Questionnaire > Input {string} job title")
    public void inputJobTitle(String answer) {
        questionnairePage.inputJobTitle(answer);
    }

    @When("Questionnaire > Input {string} salary")
    public void inputSalary(String salary) {
        questionnairePage.inputSalary(salary);
    }

}
