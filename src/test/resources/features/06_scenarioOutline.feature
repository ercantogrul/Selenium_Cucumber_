#Scenario outline DDT(Data Driven Test) yapma yetenegi saglar
#Testimiz tabloda bulunan satir sayisi(ilk satir haric) kadar sirasiyla her bir satirdaki verilerle calistirilir
#Scenario outline da parametrreli stepler kullanilir
#Parametre kisimlari hardCode olmadan examples tablosunda belirtilen basliklara gonderilir

# <> işaretleri arasında yer alan character bloğu parametre olarak algılanması için step definitions tanımlaması
# yapıldıktan sonra step definition classı içerisinde gerekli düzeltmelerin yapılması gerekir.
# Örneğin <sayi1> step definitionda <sayi{int}> olarak yer alır, onu biz {int} olarak değiştirmemiz gerekir.
# Ayrıca parametre kontrolü de yapılması gerekir.

@dortIslem
Feature: Dort islem
  Scenario Outline: cucumber step definition with Scenario outline
    Given ilk sayi <first>
    And ikinci sayi <second>
    When bu sayilar <word> operatorune girdiginde operatorune girdiginde
    Then sonuc <result> olmalidir

    Examples:
      |first|second|word|result|
      | 10  |   5 |   +  |  15   |
      | 5   |  12 |   *  |  60   |
      | 10  |   5 |   -  |  5    |
      | 10  |   2 |   /  |  5    |


    # https://github.com/cucumber/cucumber-expressions#readme