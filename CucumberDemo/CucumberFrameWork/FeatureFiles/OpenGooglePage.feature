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
Feature: OpenGoogleSearchPage
  The user should able to launch the google application and type in search keyword and get the results based the search keyword

  @tag1
  Scenario: Lanch google Application and Search Keyword
    Given Open the chrome browser and lanch goole application
    When User Should locate the search text field and click
    And User should type search keyword
    And User should click the search button
    Then User should get the search results

 