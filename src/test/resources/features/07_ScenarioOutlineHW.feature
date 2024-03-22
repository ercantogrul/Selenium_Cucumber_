@homework
Feature: Homework
  Scenario Outline:  dinamik urller
    Given kullanici "<page_url>" sayfasina gider
    Then kullanici 5 sn bekler
    And sayfa basliginin "<kelime>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      |page_url|  kelime|
      |googleUrl | Google |
      |amazonUrl | Amazon |
      |trendyolUrl | Trendyol |