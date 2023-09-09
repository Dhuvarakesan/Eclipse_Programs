Feature: open SauceDemo feature with datatable with Example
 Scenario Outline: open SauceDemo website and login with datatables with Examples
    Given user launches "https://www.saucedemo.com/"
    When user enters the  credential values "<Username>" and "<Password>"
     When the user clicks  And gets admitted in to website
    Then close the browser window and quit
    @Positive1
    Examples:
    | Username | Password |
    | standard_user    | secret_sauce |
    @Negative1
    Examples:
    | Username | Password |       
    |standard_user1		 |secret_sauce1	|  