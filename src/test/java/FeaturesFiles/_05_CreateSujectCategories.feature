Feature: Create Subject Categories and Delete

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression1
  Scenario: Create a Subject Categories
    When Navigate to Subject Categories
    When Create a subject categories name as "Physiology1" and code as "PHY1011"
    Then Success message should be displayed

  @Regression1
  Scenario: Delete a Subject Categories
    When Navigate to Subject Categories
    When Delete subject categories name as "Physiology1"
    Then Success message should be displayed
