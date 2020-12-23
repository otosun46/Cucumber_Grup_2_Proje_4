Feature: Create MySubjectCat

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression1
  Scenario: Create MySubjectCat subject category
    When Navigate to Subject Categories
    When Create a subject categories name as "MySubjectCat1" and code as "MSC"
    Then Success message should be displayed

  @Regression1
  Scenario: Delete MySubjectCat subject category
    When Navigate to Subject Categories
    When Delete subject name as "MySubjectCat1"
    Then Error message should be displayed