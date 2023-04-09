Feature: Homepage launch

  Scenario: User is able to launch the page successfully
    Given User launch the dsAlgo website
    When User clicks Get Started button on launch page
    And User clicks Get Started on Array section
    Then Error message is displayed

  Scenario: User gets error when click on Linked List section without sign-in
    Given User clicks Get Started button on Linked List section
    Then Error message is displayed

  Scenario: User gets error when click on Tree section without sign-in
    Given User clicks Get Started button on Tree section
    Then Error message is displayed

  Scenario: User gets error when click on Graph section without sign-in
    Given User clicks Get Started button on Graph section
    Then Error message is displayed

  Scenario: User is able to navigate to Register page
    Given User clicks on the Register link
    Then Registration page is displayed
