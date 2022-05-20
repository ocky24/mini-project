Feature: As a user I want to see tools category

  @cobakategori
  Scenario: AS a user I want to see tools category
    Given User on Home page
    When user click select category
    And user click tools category
    Then tools category is displayed
