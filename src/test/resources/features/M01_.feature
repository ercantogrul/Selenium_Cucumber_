@LoginNegativUndPositif
Feature: ContactList Login

  Background: common steps
    Given goto home page

  @negativeLoginTest1
  Scenario: InvalidCredentialsTest
    When enter invelid email
    And enter invalid password
    And click submit button
    Then verfy incorrectmessage
    And  close browser

  @negativeLoginTest2
  Scenario: SpaceCredentialsTest
    When  click submit button
    Then verfy incorrectmessage
    And  close browser

  @negativeLoginTest3
  Scenario: Invalid UseName Empty Password CredentialsTest
    When enter invelid email
    And click submit button
    Then verfy incorrectmessage
    And  close browser

  @negativeLoginTest4
  Scenario: Invalid Password Empty userName CredentialsTest
    When enter invalid password
    And click submit button
    Then verfy incorrectmessage
    And  close browser

  @positifTest1
  Scenario: Invalid usename invalid password CredentialsTest
    When enter email
    And enter password
    And click submit button
    Then verfy correct addButton
    And  close browser
    #==============================

  @loginUndAddTest
  Scenario: Login und add CredentialsTest
    When contact page  click sign button
    And define new user
    And Add contact list
    Then verify user add table
    And  close browser

  @loginUndAddTestVerify
  Scenario: Login und add controlTest
    When enter emaila
    And enter passworda
    And click submit button
    Then verify user add table
    And  close browser





