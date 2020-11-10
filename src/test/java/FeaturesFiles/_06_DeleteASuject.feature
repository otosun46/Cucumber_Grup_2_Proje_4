Feature: Delete Subject

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression
  Scenario: Create a subject
    When Navigate to Subject
    When Create subject name as "Physiology" code name as "PHY" and Create new subject category name as "Science1" code name as "SCI"
    And Success message should be displayed

  @Regression
  Scenario: Delete a subject
    When Navigate to Subject
    When Delete subject name as "Physiology" and subject category name as "Science1"
    And Success message should be displayed