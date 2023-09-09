#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Open SwagLabLogin Page
	The user should able to launch the SwagLabLogin and user should enter the login credentials
	Background: User should login in and click the Banking Menu

    Given User Should  navigate to the login page

    When User should submit username and password and login to the application

    And User should click the Banking Menu and Payment to user

    And Click the contact and select a contact
  @tag1
  Scenario: Launch SwagLab and Login to the page using valid details
    Given Open chromebrowser and launch SwaglabLogin
    And User Should locate the username text field and click
    And User should type username keyword
    And User Should locate the password text field and click
    And User should type password keyword
    Then user should click the login button
 @tag2
Scenario: Launch SwagLab and Login to the page using invalid details
    Given Open chromebrowser and launch SwaglabLogin
    And User Should locate the username text field and click
    And User should type username keyword
    And User Should locate the password text field and click
    And User should type password keyword
    Then user should click the login button

 