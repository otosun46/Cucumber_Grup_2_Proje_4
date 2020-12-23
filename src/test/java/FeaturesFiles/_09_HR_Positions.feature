Feature: Human Resources Positions

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression1
  Scenario: Create a positions
    Given Navigate to Positions page
    When Create a positions as "Robotics Teacher" short name "ROTE"
    Then Success message shuld be diplayed

  @Regression1
  Scenario: Edit the positions
    Given Navigate to Positions page
    When Edit the "Robotics Teacher" "ROTE" to "Make Teacher" "MATE"
    Then Success message shuld be diplayed

  @Regression1
  Scenario: Delete the positions
    Given Navigate to Positions page
    When Delete the "Make Teacher"
    Then Success message shuld be diplayed