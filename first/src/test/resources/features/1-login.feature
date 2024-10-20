@suite @login
Feature: CP01 - Validar inicio sesión

  Background: Validar inicio sesión

    Given el usuario navega al sitio web

    @ValidCredentials
    Scenario: 1 - validar credenciales correctas
      When ingresa credenciales correctas
      Then la aplicación muestra la plp

    @InvalidCredentials
    Scenario: 2 - validar credenciales incorrectas
      When ingresa credenciales incorrectas
      Then la aplicación muestra mensage de error
