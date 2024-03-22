@background @parallel
Feature: Template Feature

  Background: Template Background
    Given kullanici google sayfasina gider

  @samsung
  Scenario: TC01_samsungSearch
    When kullanici samsung icin arama yapar
    Then sayfa basliginin samsung kelimesi icerdigini test eder
    And sayfayi kapatir

  @cucumber
  Scenario: TC02_cucumberSearch
    When kullanici cucumber icin arama yapar
    Then sayfa basliginin cucumber kelimesi icerdigini test eder
    And sayfayi kapatir

  @java
  Scenario: TC03_javaSearch
    When kullanici java icin arama yapar
    Then sayfa basliginin java kelimesi icerdigini test eder
    And sayfayi kapatir

