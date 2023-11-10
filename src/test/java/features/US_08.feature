Feature: AC_08 Functionality

  Background: Admin logs in with valid credentials
    Given the user is on the login page
    When the user enters the valid username and password
    And the user clicks the login button
    Then the user should be successfully logged into the system

  Scenario: Perform Actions in Document Types
    Given the user is on the Document Types page
    When the user creates a new Citizenship document
    Then they should be able to edit its name later
    And they should be able to delete the contact