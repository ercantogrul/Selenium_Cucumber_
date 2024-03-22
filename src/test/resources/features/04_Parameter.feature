@amazonSearch
Feature: Parameterized Feature

  Background: ortak stepler
    Given kullanici amazon sayfasina gider

  Scenario:  Amazon search
    When kullanici "java" icin arama yapar
    Then kullanici title da "java" gormelidir
    And sayfayi kapatir

  Scenario:  Amazon search
    When kullanici "selenium" icin arama yapar
    Then kullanici title da "selenium" gormelidir
    And sayfayi kapatir

  Scenario:  Amazon search
    When kullanici "phyton" icin arama yapar
    Then kullanici title da "phyton" gormelidir
    And sayfayi kapatir

  Scenario:  Amazon search
    When kullanici "ruby" icin arama yapar
    Then kullanici title da "ruby" gormelidir
    And sayfayi kapatir




