Feature: Human Resources

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create a position salary
    Given Navigate to Position Salary page
    When Create a position salary as "E-2 position"
    Then Success message shuld be diplayed

  Scenario: Edit the position salary
    Given Navigate to Position Salary page
    When Edit the "E-2 position" to "E-3 position"
    Then Success message shuld be diplayed

  Scenario: Delete the position salary
    Given Navigate to Position Salary page
    When Delete the "E-3 position"
    Then Success message shuld be diplayed

  Scenario: Create a positions
    Given Navigate to Positions page
    When Create a positions as "E-2 position" short name "E-2"
    Then Success message shuld be diplayed

  Scenario: Edit the positions
    Given Navigate to Positions page
    When Edit the "E-2 position" "E-2" to "E-3 position" "E-3"
    Then Success message shuld be diplayed

  Scenario: Delete the positions
    Given Navigate to Positions page
    When Delete the "E-3 position"
    Then Success message shuld be diplayed

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

  Scenario: Create a New Salary Modifiers
    Given Navigate to salary modifiers page
    When Add new salary modifier and fill out the form
      | saModDescription     | Katsayi |
      | saModVariable        | 2       |
      | saModIntegrationCode | 2.3     |
      | saModPriority        | 5       |
      | saModAmount          | 250     |

    And Click and Select options
      | saModifierType | Subtraction |
      | saModValueType | 0           |
    When Add new modifier variable and fill out the form
      | saModVaName          | Yeni Degisken |
      | saModFormulaVariable | 3             |
    And Click and Select options
      | saModVaType | Decimal |
    And Apply changes and save
    Then Success message shuld be diplayed

  Scenario: Edit the Salary Modifiers
    Given Navigate to salary modifiers page
    When Edit the Salary Modifier "Katsayi"
    When Change the salary modifier information on the form
      | saModDescription     | Katsayi1 |
      | saModVariable        | 3        |
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

  Scenario: Delete the Salary Modifiers
    Given Navigate to salary modifiers page
    When Delete the Salary Modifiers "Katsayi1"
    Then Success message shuld be diplayed