@tag1
Feature: User registration

  Scenario: Click Register button with empty fields
    Given User clicks on Register button
    Then Error message for empty field is displayed

  Scenario: Check Login functionality on the register page
    Given User clicks on the login link
    Then login page should be displayed

  Scenario Outline: Register successfully with valid data
    Given User enters "<username>" and "<passwd>" and "<confirmPassword>"
    When User clicks on Register button
    Then user is able to register sucessfully

    Examples: 
      | username | passwd         | confirmPassword |
      | numpi264 | numpyninja1234 | numpyninja1234  |

  Scenario: check sign out
    Given User click on Sign out link
    Then Sign out done successfully
    And Click on Signin link
