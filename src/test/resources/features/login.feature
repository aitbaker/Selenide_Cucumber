Feature: Login
  In order to see the user area
  I log in to the website

  @login
  Scenario: Successful Login
    Given User is on the Homepage
    When User clicks on the Login icon
    Then User verifies Login form

    When User enters valid credentials
    And User clicks on Login button
    Then User verifies User icon

    When User clicks on User icon
    Then User verifies his name




