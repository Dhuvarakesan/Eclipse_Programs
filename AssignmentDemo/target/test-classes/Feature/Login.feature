Feature: open SauceDemo feature with data table without header
@positive
Scenario: open SauceDemo website and login with data tables without header
Given user is entering "https://www.saucedemo.com/"
 When User enters the given credentials below
 |standard_user|
 |secret_sauce|
  When the user clicks  And gets login
  Then close the browser window
