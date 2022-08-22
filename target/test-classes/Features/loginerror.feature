Feature: Login with wrong credentials should display error

  @Error
  Scenario Outline: Check error message is displayed with invalid credentials
    Given user is on home page
    And clicks on loginOrSignup button
    When user enters wrong <mobileNumber>
    And clicks on continue
    Then error message is dislpayed
    

    Examples: 
      | mobileNumber |
      |       860506 |
      |      8605067 |
      |     86050622 |
