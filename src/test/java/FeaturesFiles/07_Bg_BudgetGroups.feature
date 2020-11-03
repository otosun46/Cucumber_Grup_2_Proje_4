Feature: Budget Budget Groups

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create a Budget Groups
    Given Navigate to Budget Groups page
    When Create a Budget Groups
#    Then Success message shuld be diplayed
