Feature: Login Functionality

  Scenario: Admin logs in with valid credentials
    Given the user is on the login page
    When the user enters the valid username and password
    And the user clicks the login button
    Then the user should be successfully logged into the system