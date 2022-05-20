Feature: As user I want to order tensi darah elektrik

  @cobabuy
  Scenario: As user I want to order tensi darah elektrik
    Given User on Home page
    When user click beli tensi darah elektrik
    Then user click cart
    And user buy tensi darah elektrik