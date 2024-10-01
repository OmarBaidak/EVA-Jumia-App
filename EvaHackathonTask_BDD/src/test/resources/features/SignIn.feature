Feature: User Registration on Jumia
  check that the user can Sign in successfully in Jumia.

  Scenario Outline: User Registration with Valid Email and Password
    Given The user is on Jumia Home page
    When the user closes the PopUp,clicks on the Account button then Sign In button
    And the user enters a valid email "<email>",clicks on the Continue button
    And the user enters valid password and confirmPassword "<password>", clicks the Continue button
    And the user enters their personal data "<firstName>" , "<lastName>" , "<phoneNumber>",clicks Continue button
    And the user selects their gender, "<birthDate>",accepts the terms and conditions,clicks the Continue button
    Then the user should be successfully registered with the "<firstName>"

    Examples:
      | email                    | password          | firstName | lastName | phoneNumber | birthDate  |
      | omarbaidak99@gmail.com | baidak123456789* | omar   | baidak     | 01144477035 | 08-03-2001 |
