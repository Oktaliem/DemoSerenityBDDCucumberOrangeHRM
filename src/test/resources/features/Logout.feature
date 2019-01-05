@regression
Feature: Logout from Orange HRM
  User has to logout from Portal if no longer used

  Background: User is in the Login Page
    Given User is in the Login Page

  @priority_1
  Scenario:  Logout from the Portal successfully
    When User provides the Username admin and Password admin
    Then User is able to login
    And User is log out from portal
    Then User is in the Login Page after Logout