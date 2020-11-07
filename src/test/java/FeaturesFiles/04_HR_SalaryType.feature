Feature: Human Resources Salary Type

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create a New Salary Type
    Given Navigate to salary type page
    When Create a new salary type name as "User_1"
    And Click and Select options form class
      | userType | User |
    Then Success message shuld be diplayed

  Scenario: Edit the salary type
    Given Navigate to salary type page
    When Edit the salary type "User_1" to "User_11"
    And Click and edit options form class
      | userType | Student |
    Then Success message shuld be diplayed

  Scenario: Delete the salary type
    Given Navigate to salary type page
    When Delete the salary type "User_11"
    Then Success message shuld be diplayed