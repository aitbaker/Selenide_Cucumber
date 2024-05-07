Feature: Sconto Login Feature
  In order to see error message

  @wrongPassword
  Scenario: Login with a wrong password
    Given User is on the Homepage
    When User clicks on the Login icon
    Then User verifies Login form

    When User enters wrong data:
      | email            | password    |
      | manuel@gmail.com | Manuel12345 |

    And User clicks on Login button
    Then User verifies error message

  @wrongEmail
  Scenario Outline: Login with a wrong password
    Given User is on the Homepage
    When User clicks on the Login icon
    Then User verifies Login form

    When User enters wrong data:
      | email   | password   |
      | <email> | <password> |

    And User clicks on Login button
    Then I see passwordError message

    Examples:
      | email             | password     |
      | manuell@gmail.com | Manuel12345! |
      | Manuel@gmail.com | Manuel12345! |
