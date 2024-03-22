@parallel
Feature: User login HRM with dataTable

  @validCredentials
  Scenario:login with valid credentials
    Given kullanici anasayfaya gider
    When kullanici credentiallari girer
      | username | password  |
      | Admin    | admin123 |


  @invalidCredentials
  Scenario: login with invalid credentials
    Given kullanici anasayfaya gider
    When kullanici invalid credentiallari girer
      | username | password  | error_message       |
      | Admin1   | admin123! | Invalid credentials |
      | Admina   | adminaa   | Invalid credentials |
      | Adminbb  | adminaabb | Invalid credentials |
    Then sayfayi kapatir