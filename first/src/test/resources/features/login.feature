@suite @login
Feature: User can set first name and surname

  Background: User is in page, makes click in first name input and sets its first name

    Given The user is in website

    @InvalidCredentials
    Scenario: 2 unsuccessful login
      When user enters wrong user and password
      Then message is displayed
