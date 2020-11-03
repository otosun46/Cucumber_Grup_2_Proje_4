Feature: Budget Cost Centers

  Background: Login
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: Create a Cost Centers
    Given Navigate to Cost Centers page
    When Add new Cost Centers and fill out the form
      | nameInput   | Garanti |
      | codeInput   | A2512   |
      | coCeOrderNo | 5       |
    And Click and Select options form class
      | coCeType           | 2 |
      | coCeExAcCoPrefixes | 1 |
    Then Success message shuld be diplayed

  Scenario: Edit the Cost Centers
    Given Navigate to Cost Centers page
    And Edit the Cost Centers "Garanti"
    When Edit the Cost Centers and fill out the form
      | nameInput   | Garanti1 |
      | codeInput   | 2512   |
      | coCeOrderNo | 6       |
    And Click and Select options form class
      | coCeType           | 2 |
      | coCeExAcCoPrefixes | 2 |
    Then Success message shuld be diplayed

  Scenario: Delete the Cost Centers
    Given Navigate to Cost Centers page
    When Delete the Cost Centers "Garanti1"
    Then Success message shuld be diplayed