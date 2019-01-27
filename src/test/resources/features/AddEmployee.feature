# Author : Okta Liem

@regression
@AddEmployee
Feature: Personal Information Module
  In Order To Manage Employee Personal Information
  User Admin should be able manage employee personal information in the Portal

  Background: User is in the Login Page
    Given User is in the Login Page
    Given User has login to Portal with valid credential
      | username | password |
      | admin    | admin    |
    Given User is in the Admin Portal - PIM - Add Employee


   @Test_1
  Scenario Outline: Able to Add Employee Successfully
    When User input <first_name> and <middle_name> and <last_name>
    And User is upload photograph
    And User is create login details with valid
      | username | password | confirm_password |
      | User     | user     | user             |
    And User is click on Save Button from Add Employee Page
    #Then I'm still figure out
    Examples:
      | first_name | middle_name | last_name |
      | User       | Number      | ID        |