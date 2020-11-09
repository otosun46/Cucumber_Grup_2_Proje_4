Feature: Human Resources Salary Constants

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
  @Regression
  Scenario: Create a Salary Constants
    Given Navigate to Salary Costants page
    When Add new Salary Costant and fill out the form
      | saCoName  | Tazminat |
      | saCoKey   | TZM      |
      | saCoValue | 300      |
#      | saCoValidFrom | 10/12/2020       |
    When Click "saCoValidFrom" and send Date "10/12/2020"
  @Regression
  Scenario: Edit the Salary Constants
    Given Navigate to Salary Costants page
    And Edit the Salary Constants "Tazminat"
    When Edit the Salary Costant and fill out the form
      | saCoName  | Tazminat1 |
      | saCoKey   | TZN       |
      | saCoValue | 350       |
#      | saCoValidFrom | 10/12/2020       |
    Then Click "saCoValidFrom" and send Date "10/12/2020"
  @Regression
  Scenario: Delete the Salary Constants
    Given Navigate to Salary Costants page
    When Delete the Salary Constants "Tazminat1"
    Then Success message shuld be diplayed
