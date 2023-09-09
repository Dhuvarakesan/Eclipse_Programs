
@tag
Feature: Automating Cyclos demo App


  @tag1
  Scenario: Login and Payment using cyclos app
    Given I want to open the cyclos app and open using demo URL
    And I should give the username  and password  login
    When I want to cancel the scan fingerprint option and proceed
    And I wanto choose not now for pin and email option
    And I want to click the payment menu and select to system account 
    Then I want to enter the amount and make a payment
    And check more outcomes

