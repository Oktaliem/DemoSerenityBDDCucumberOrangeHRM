@Regression
Feature: Login to Orange HRM
  In Order To Access Orange HRM Portal
  User has to login to Web Portal

  Background: User is in the Login Page
    Given User is in the Login Page

  @TC_L0GIN.001 @SmokeTest
  Scenario:  Login to the Application Successfully
    When User provides valid Username admin and Password admin
    Then User should landing to Dashboard Page

  @TC_L0GIN.002
  Scenario:  Login to the Application with Invalid UserName
    When User provides invalid Username john and Password admin
    Then Error message should appear with text "Invalid credentials"

  @TC_L0GIN.003
  Scenario:  Login to the Application with Invalid Password
    When User provides invalid Username admin and Password john
    Then Error message should appear with text "Invalid credentials"

  @TC_L0GIN4004
  Scenario:  Login to the Application with Empty UserName And Empty Password
    When User provides empty the Username and empty Password
    Then Error message should appear with text "Username cannot be empty"