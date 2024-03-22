Feature: Template Feature

  Scenario: TC01_samsungSearch
    Given kullanici google sayfasina gider
    When kullanici samsung icin arama yapar
    Then sayfa basliginin samsung kelimesi icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02_cucumberSearch
    Given kullanici google sayfasina gider
    When kullanici cucumber icin arama yapar
    Then sayfa basliginin cucumber kelimesi icerdigini test eder
    And sayfayi kapatir

  # Given
  # verilen
  # given ile yazilan steplerde biz testimizle alakali olan ama test olarak yazmadigimiz bir takim kabullerden bahsederiz
  #
  # Given kullanici linkedin sayfasindadir
  # Given sistemde kayitli "ahmet" isminde bir kullanici vardir
  # Given kullanici google sayfasina gider

  #When
  #o an -test
  #when ile yazilan stepleri test adimi olarak dusunebilriz
  #
  # When kullanici login butonuna tiklar
  # When kullanici sepete urun ekler
  # When kullanici username ve password girer

  #Then
  #sonra - validation
  #then ile yazilan steplere bir validation yani assertion yapildigini anlayabiliriz
  #
  #Then kullanici login hata mesajini gormelidir