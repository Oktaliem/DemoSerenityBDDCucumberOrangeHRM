# Author : Okta Liem
@Regression
Feature: Logout from Orange HRM
  User has to logout from Portal if no longer used

  Background: User is in the Login Page
    Given User is in the Login Page

  @regression
  Scenario:  Logout from the Portal successfully
    When User provides valid Username admin and Password admin
    Then User should landing to Dashboard Page
    And User is log out from portal
    Then User landing back to Login Page