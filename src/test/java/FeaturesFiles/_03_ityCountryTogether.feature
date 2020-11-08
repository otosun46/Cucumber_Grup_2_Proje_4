Feature: Create a country and a city again, then delete the country

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create a country and a city

    Given Click Setup -> Parameters -> Countries
    And Create a country named "Urartular" and coded as "URA"
    And Success message should be seen on the screen

    When Click on Cities
    And Create a city name as "Van" and country name as "Urartular"
    And Success message must be displayed!

    Then Click on Countries
    And Find the country "Urartular" and try to delete it
    And Error message should be displayed!

    And Click on Cities again
    And Delete "Van"
    And Success message should be observed