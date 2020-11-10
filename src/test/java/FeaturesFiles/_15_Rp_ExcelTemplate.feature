Feature: Report Excel Template

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression
  Scenario: Create a Excel Template
    Given Navigate to Excel Template page
    When Add new Excel Template and fill out the form
      | ExcTmpName        | Report2 |
      | ExcTmpPeriodCount | 3       |
    Given Save the Excel Template
    Then Success message shuld be diplayed
    Given Close the dialog

  @Regression
  Scenario: Edit the Excel Template
    Given Navigate to Excel Template page
    When Edit the "Report2" and change out the form
      | ExcTmpName        | Report3 |
      | ExcTmpPeriodCount | 4       |
    Given Save the Excel Template
    Then Success message shuld be diplayed
    Given Close the dialog

  @Regression
  Scenario: Delete the Excel Template
    Given Navigate to Excel Template page
    When Delete the Excel Template "Report3"
    Then Success message shuld be diplayed