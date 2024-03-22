@ParameterMentoring
Feature: Parameterized Feature


  Scenario Outline: Login Scenario Outline Negative
    Given goto home page
    When user enter valid userName "<username>"
    And user enter valid password "<password>"
    And enter invalid password
    And click submit button
    Then verfy incorrectmessage
    And  close browser

    Examples:
      | username        | password   |
      | asya@clarus.com | asya123    |
      | test2@fake.com  | myPassword |
      |rasit@gmail.com  |rasit123    |