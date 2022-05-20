Feature: As user I want to see detail and rating tensi darah elektrik

  @cobaa
  Scenario: As user I want to see detail and rating tensi darah elektrik
    Given  User on home page
    When user click detail tensi darah elektrik
    And user can see detail and rating of product
    Then user see detail and rating of product successfully
