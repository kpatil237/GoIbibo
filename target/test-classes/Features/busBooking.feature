Feature: Search Bus availability

  @Bus
  Scenario: Bus availability from Source to Destination
    Given user is on home page
    And user clicks on bus button on homepage
    When user enters Souce and Destination
    And clicks on search bus
    Then buses from source to destination is displayed
		