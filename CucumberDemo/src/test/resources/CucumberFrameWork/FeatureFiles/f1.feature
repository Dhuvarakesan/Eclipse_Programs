Feature: Open SwagLabLogin Page
	The user should able to launch the SwagLabLogin and user should enter the login credentials
	Background: User should login in and click the Banking Menu
    Given User Should  navigate to the login page
    When User should submit username and password and login to the application
    And User should click the Banking Menu and Payment to user
    And Click the contact and select a contact
  Scenario: Launch SwagLab and Login to the page using valid details
    Given Open chromebrowser and launch SwaglabLogin
    And User Should locate the username text field and click
    And User should type username keyword
    And User Should locate the password text field and click
    And User should type password keyword
    Then user should click the login button