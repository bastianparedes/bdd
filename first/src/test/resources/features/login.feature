Feature: User can set first name and surname

  Background: User is in page, makes click in first name input and sets its first name

    Given The user is in website

    Scenario: 1 successful login
      When user enters correct user and password
      Then page changes

    Scenario: 2 unsuccessful login
      When user enters wrong user and password
      Then message is displayed
