Feature: open orangehrm.com feature with datatable with header
@Positive2
  Scenario: open OrangeHrm website and login with datatables with header
    Given user enter "https://opensource-demo.orangehrmlive.com/index.php/validatecredentials"
    When user enters the  values below
      | Username | Password |
      | Admin    | admin123 |
    When the user clicks  And gets login in to website
    Then exit the browser window