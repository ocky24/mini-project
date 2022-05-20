Feature: As user I want to register my account so that i can buy products

  @cobaregister
  Scenario: As user I want register my account successfully
    Given user on register page
    When user input name
    And user input email
    And user input password
    And user click register button
    Then user is redirected to login page