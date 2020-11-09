Feature: Human Resources Salary Modifiers

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
  @Regression
  Scenario: Create a New Salary Modifiers
    Given Navigate to salary modifiers page
    When Add new salary modifier and fill out the form
      | saModDescription     | Katsayi |
      | saModVariable        | 6       |
      | saModIntegrationCode | 2.3     |
      | saModPriority        | 5       |
      | saModAmount          | 250     |

    And Click and Select options
      | saModifierType | Subtraction |
      | saModValueType |0|
    When Add new modifier variable and fill out the form
      | saModVaName          | Yeni Degisken |
      | saModFormulaVariable | 3             |
    And Click and Select options
      | saModVaType | Decimal |
    And Apply changes and save
    Then Success message shuld be diplayed
  @Regression
  Scenario: Edit the Salary Modifiers
    Given Navigate to salary modifiers page
    When Edit the Salary Modifier "Katsayi"
    When Change the salary modifier information on the form
      | saModDescription     | Katsayi1 |
      | saModVariable        | 6        |
      | saModIntegrationCode | 2.3      |
      | saModPriority        | 5        |
      | saModAmount          | 500      |

    And Click and Select options
      | saModifierType | Subtraction |
      | saModValueType | 0           |
    When Add new modifier variable and fill out the form
      | saModVaName          | Yeni Degisken1 |
      | saModFormulaVariable | 4              |
    And Click and Select options
      | saModVaType | Decimal |
    And Apply changes and save
    Then Success message shuld be diplayed
  @Regression
  Scenario: Delete the Salary Modifiers
    Given Navigate to salary modifiers page
    When Delete the Salary Modifiers "Katsayi1"
    Then Success message shuld be diplayed