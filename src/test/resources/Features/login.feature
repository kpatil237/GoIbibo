

Feature: feature to test login functionality using datatable

@Success
  Scenario: Check otp is sent successfully with valid credentials
    
    Given user is on home page
    And clicks on login button
    When user enters mobileNumber using datatable
    |8605065964|
    |8605065964|
    And clicks on continue button
    Then phone number Validated message is dislpayed

    
    