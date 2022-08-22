Feature: Validating forex page title
@Forex
  Scenario: Verify Forex page title
    Given user is on home page
    When user clicks on Forex tab
    And user is navigated to forex page
    Then user is able to verify Forex page title
