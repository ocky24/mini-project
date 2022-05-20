
Feature: As a user I want to login so that i can buy books

  @cobalogin
  Scenario: As a user I want to login successfully
    Given user on login page
    When user input valid email
    And user input valid password
    And click login button
    Then user on the home page


