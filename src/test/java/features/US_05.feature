Feature: Position Adding

  Background: Admin logs in with valid credentials
    Given the user is on the login page
    When the user enters the valid username and password
    And the user clicks the login button
    Then the user should be successfully logged into the system

    And they navigate to the Positions section

    When they create a new Position
    Then a success message should be displayed
    And they edit the Position

    When the user deletes the Position
    Then a success message should be displayed
