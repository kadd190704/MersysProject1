Feature: Position Categories Management


  Background:
    Given I am logged in as an admin in the dashboard

  Scenario: Login with valid username and password
    And Navigate to Position Categories
    When Create a New Position Category
    Then Success message should be displayed
    And User must be able to edit Position Categories
    When User delete the "name"
    Then Success message should be displayed