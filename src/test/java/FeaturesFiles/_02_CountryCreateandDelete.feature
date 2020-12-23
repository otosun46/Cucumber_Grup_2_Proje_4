Feature: Create and delete a country

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression1
  Scenario: Create a country

    When Click Setup/Parameters/Countries
    And Create a country name as "Muz Cumhuriyeti5" and code as "MC5"
    Then Success message should be displayed

  @Regression1
  Scenario: Delete the country
    When Delete "Muz Cumhuriyeti5" country
    Then Success message should be displayed
