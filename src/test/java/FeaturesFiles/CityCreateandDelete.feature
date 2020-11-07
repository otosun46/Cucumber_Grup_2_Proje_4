Feature: Create and delete a city

  Background:
    Given Navigate to basqar

    When Enter username and password and click Login button

    Then User should login successfully

  Scenario: Create a city

    When Click Setup/Parameters/Cities
    And Create a city name as "Bayburt2" and country name as "Sumerler2" and code as "SU2"
    Then Success message should be displayed!


  Scenario: Delete the city
    When Delete "Bayburt2" city
    Then Success message should be_displayed.

