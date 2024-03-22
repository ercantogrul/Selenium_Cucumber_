@firstFeature
Feature: Template Feature

  @samsung
  Scenario: TC01_samsungSearch
    Given kullanici google sayfasina gider
    When kullanici samsung icin arama yapar
    Then sayfa basliginin samsung kelimesi icerdigini test eder
    And sayfayi kapatir

  @cucumber
  Scenario: TC02_cucumberSearch
    Given kullanici google sayfasina gider
    When kullanici cucumber icin arama yapar
    Then sayfa basliginin cucumber kelimesi icerdigini test eder
    And sayfayi kapatir

  @java
  Scenario: TC03_javaSearch
    Given kullanici google sayfasina gider
    When kullanici java icin arama yapar
    Then sayfa basliginin java kelimesi icerdigini test eder
    And sayfayi kapatir

