Feature: E2E Recommendation funnel

  Scenario: E2E Recommendation funnel

    Given I open Clark "login" page
    When Login page > Page is displayed
    Then Click Accept cookies button

    When Login page > Input email
    When Login page > Input password
    Then Login page > Click submit button

    When 'Wie gut bist du versichert?' Modal is displayed
    Then Close promo modal

    When Open Account tab menu
    And Click 'Ausloggen' button
    Then Login page > Page is displayed

    Given I open Clark "contracts?cv=2" page
    When Click Bedarf tab button
    Then Questionnaire > slide is opened

    When Questionnaire > Click 'Jetzt starten' button
    Then Questionnaire > "Wann bist du geboren?" question is displayed

    When Questionnaire > Input "11.03.2000" date
    And Questionnaire > Click 'Weiter' button
    And Questionnaire > "Was ist dein Geschlecht?" question is displayed
    Then Questionnaire > choose "Weiblich" answer

    When Questionnaire > "Wo wohnst du?" question is displayed
    Then Questionnaire > choose "In meiner eigenen Wohnung" answer

    When Questionnaire > "Besitzt du eines der folgenden Fahrzeuge?" question is displayed
    And Questionnaire > choose "Wohnwagen" answer
    And Questionnaire > choose "Anhänger" answer
    Then Questionnaire > Click 'Weiter' button

    When Questionnaire > "Wie ist deine Familiensituation?" question is displayed
    Then Questionnaire > choose "Ich bin verheiratet" answer

    When Questionnaire > "Hast du Kinder, die unter 18 Jahre alt oder noch in Ausbildung sind?" question is displayed
    Then Questionnaire > choose "Nein" answer

    When Questionnaire > "Was machst du beruflich?" question is displayed
    Then Questionnaire > choose "Freiberuflich tätig" answer

    When Questionnaire > "Bist du gesetzlich rentenversichert?" question is displayed
    Then Questionnaire > choose "Ja" answer

    When Questionnaire > "Was ist deine Berufsbezeichnung?" question is displayed
    Then Questionnaire > Input "QA Engineer" job title
    And Questionnaire > Click 'Weiter' button

    When Questionnaire > "Bist du gesetzlich oder privat krankenversichert?" question is displayed
    Then Questionnaire > choose "Privat" answer

    When Questionnaire > "Was machst du in deiner Freizeit?" question is displayed
    And Questionnaire > Click 'Weiter' button

    When Questionnaire > "Hast du Tiere?" question is displayed
    Then Questionnaire > choose "Katze" answer
    And Questionnaire > Click 'Weiter' button

    When Questionnaire > Input "75000" salary
    Then Questionnaire > Click 'Speichern' button

    When Registration page > Page is displayed
    And Registration page > Input random email
    And Registration page > Input default password
    Then Registration page > Click submit button

    When Registration approval is displayed
    Then Click 'Empfehlungen ansehen' button

    Then Recommendation page > 'Persönliche Situation bewerten' button is displayed



