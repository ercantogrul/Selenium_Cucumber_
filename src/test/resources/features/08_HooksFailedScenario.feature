@hooks
Feature: negative login

  Scenario Outline: negative login with invalid credentials
    Given kullanici anasayfaya gider
    And kullanici username "<username>" girer
    And kullanici password "<password>" girer
    And kullanici login butonuna tiklar
    And scenario fail olur

    Examples: customer credentials
      | username | password |
      | adminn   | admin123 |
      | Admin    | admin    |


    #Orange sayfasina