Feature: Create and delete a city

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression
  Scenario: Create a city

    When Click Setup/Parameters/Cities
    And Create a city name as "Bayburt" and country name as "Sumerler" and code as "SU2"
    Then Success message should be displayed!

  @Regression
  Scenario: Delete the city
    When Delete "Bayburt" city
    Then Success message should be_displayed.

