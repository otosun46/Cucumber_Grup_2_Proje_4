Feature: Budget Budget Accounts

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @Regression
  Scenario: Create a Budget Account
    Given Navigate to Budget Accounts page
    When Add new Budget Account and fill out the form
      | codeInput | MA   |
      | nameInput | Maas |
    And Click and Select options
      | accountCategory    | 1 |
      | accountYype        | 0 |
      | accountBalanceType | 1 |
      | accountCurrency    | 1 |
    And  Save form
    Then Success message shuld be diplayed

  @Regression
  Scenario: Edit The Budget Account
    Given Navigate to Budget Accounts page
    When Edit the Budget Account "Maas"
    When Edit Budget Account and fill out the form
#      | codeInput | MA    |
      | nameInput | Maas1 |
    And Click and Select options
#      | accountCategory    | 1 |
#      | accountYype        | 0      |
#      | accountBalanceType | 1      |
      | accountCurrency | 2 |
    And  Save form
    Then Success message shuld be diplayed

  @Regression
  Scenario: Delete The Budget Account
    Given Navigate to Budget Accounts page
    When Delete the Budget Accounts "Maas1"
    Then Success message shuld be diplayed