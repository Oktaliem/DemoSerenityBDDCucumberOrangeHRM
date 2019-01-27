@regression

Feature: Login to Orange HRM
  In Order To Access OHRM Portal
  User has to login to Portal
# mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_3"

  Background: User is in the Login Page
    Given User is in the Login Page

  @priority_1
  Scenario:  Login to the Application Successfully
    When User provides the Username admin and Password admin
    Then User is able to login

  @priority_2
  Scenario:  Login to the Application with Invalid UserName
    When User provides invalid the Username tukiyem and Password admin
    Then User is unable to login with Invalid UserName

  @priority_2
  Scenario:  Login to the Application with Invalid Password
    When User provides invalid the Username admin and Password tukiyem
    Then User is unable to login with Invalid Password

  @priority_3
  Scenario:  Login to the Application with Empty UserName And Empty Password
    When User provides empty the Username and empty Password
    Then User is unable to login with empty username and password