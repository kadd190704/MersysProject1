Feature: Managing School Locations

  Scenario: Adding and Editing School Locations
    Given User logs in as an administrator
    And goes to the School Locations tab
    And adds a new School Location
    And edits the School Location information
    Then the System updates the information and displays a success message
