Feature: Human Resources Position Salary

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression1
  Scenario: Create a position salary
    Given Navigate to Position Salary page
    When Create a position salary as "E-2 position"
    Then Success message shuld be diplayed

  @Regression1
  Scenario: Edit the position salary
    Given Navigate to Position Salary page
    When Edit the "E-2 position" to "E-3 position"
    Then Success message shuld be diplayed

  @Regression1
  Scenario: Delete the position salary
    Given Navigate to Position Salary page
    When Delete the "E-3 position"
    Then Success message shuld be diplayed