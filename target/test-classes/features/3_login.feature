@Login
Feature: User Login

  Scenario Outline: Sign in with invalid credentials
    Given User enter "<uname>" and "<pass>"
    And User click on login button
    Then Invalid credentials message is displayed

    Examples: 
      | uname   | pass      |
      | Numpy   | password1 |
      | Numpy12 | password2 |

  Scenario: Check Invalid login with data table
    Given User enter the below details
      | username11 | password11 |
      | username22 | password22 |
      | username33 | password33 |
      | username44 | password44 |
    Then Invalid credentials message is displayed

  Scenario Outline: Sign In with valid credentials
    Given User enter "<uname>" and "<pass>"
    And User click on login button
    Then Success message "you are logged in" is displayed

    Examples: 
      | uname   | pass          |
      | numpi09 | numpyninja123 |
