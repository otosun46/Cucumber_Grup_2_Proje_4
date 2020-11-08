Feature: Human Resources Positions

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create a positions
    Given Navigate to Positions page
    When Create a positions as "E-2 position" short name "E-2"
    Then Success message shuld be diplayed

  Scenario: Edit the positions
    Given Navigate to Positions page
    When Edit the "E-2 position" "E-2" to "E-3 position" "E-3"
    Then Success message shuld be diplayed

  Scenario: Delete the positions
    Given Navigate to Positions page
    When Delete the "E-3 position"
    Then Success message shuld be diplayed