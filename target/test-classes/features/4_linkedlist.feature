@tag6
Feature: Validate Linkedlist

  Scenario: User navigates from home page to linkedlist page
    Given User Clicks on getstarted button of Linked List
    Then User navigates to linked list page

  Scenario: User navigates from linked list page to text editor page
    Given User clicks on Introduction link
    Then User navigates to introduction page
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button

  Scenario: User navigates from Create linked list to text editor page
    Given User is on text editor page of introduction
    Then User should be navigated to Linked list page and click on Creating Linked List
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button

  #Scenario: User navigate from Types of linked List to text editor page with invalid data
    #Given User is on text editor page of Create Linked list
    #Then User should be navigated to Linked List page and click on Types of Linked List
    #And User clicks on Try here button
    #Then User navigates to try editor page and enter invalid python code
    #And User click on Run button
    #Then User  should handle the alert presented with Run result
     
     
  Scenario: User navigate from Types of linked List to text editor page
    Given User is on text editor page of Create Linked list
    Then User should be navigated to Linked List page and click on Types of Linked List
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button

  Scenario: User navigate from Implement Linked List in python to text editor
    Given User is on text editor page of Types of linked List
    Then User should be navigated to Implement Linked List in python
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button

  Scenario: User navigate from Traversal to text editor
    Given User is on text editor page of Implement Linked List
    Then User should be navigated to Traversal
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button

  Scenario: User navigate from Insertion to text editor
    Given User is on text editor of Traversal
    Then User should be navigated to Insertion
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button

  Scenario: User navigate from Deletion to text editor page
    
    Given: User is on text editor of Insertion

    Then user should be navigated to Deletion
    And User clicks on Try here button
    Then User navigates to try editor page and enter python code
    And User click on Run button
