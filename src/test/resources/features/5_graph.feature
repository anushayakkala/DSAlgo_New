@tag10
Feature: Validate Graph

  Scenario: User navigate to Graph page from home page
    Given User Clicks on get started button of Graph Section
    Then User navigates to Graph page

  Scenario: User navigate from Graph page to text editor
    Given User clicks on Graph link
    Then User navigates to Graph page
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button

  Scenario: User navigate from Graph Representations to text editor with invalid code
    Given User clicks on Graph Representations link
    Then User navigates to Graph Representations page
    And User clicks on Try here button
    Then User navigates to try editor page and enter invalid python code
    And User click on Run button
    Then User  should handle the alert presented with Run result

  Scenario: User navigate from Graph Representations to text editor
    Given User clicks on Graph Representations link
    Then User navigates to Graph Representations page
    And User clicks on Try here button
    Then User navigates to try editor page and enter  python code
    And User click on Run button
    And Browser is closed
