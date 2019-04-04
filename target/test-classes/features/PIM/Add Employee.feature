# Author : Okta Liem
# mvn clean verify -Dcucumber.options=" --plugin pretty --tags @TC_ADD_EMP_001"
@Regression
Feature: Personal Information Module
  In Order To Manage Employee Personal Information
  User Admin should be able manage employee personal information in the Portal

  Background: User has landed on Add Employee Form
    Given User is in the Login Page
    Given User has logged in to Portal with valid credential
      | username | password |
      | admin    | admin    |
    Given User landing to Add Employee Page


  @TC_ADD_EMP_001
  Scenario Outline: Add Employee Without Create Login Details
    When User input <first_name> and <middle_name> and <last_name>
    And User uploads photograph
    And User is click on Save Button from Add Employee Page
    Then User should see employee personal details correctly
    Examples:
      | first_name | middle_name | last_name |
      | User       | Random      | Name      |


  @TC_ADD_EMP_002
  Scenario Outline: Add Employee With Create Login Details
    When User input <first_name> and <middle_name> and <last_name>
    And User is create login details with valid :
      | username | password | confirm_password |
      | User     | user     | user             |
    And User is click on Save Button from Add Employee Page
    Then User should see employee personal details correctly
    And User should see login credential in the System Users page table
    Examples:
      | first_name | middle_name | last_name |
      | User       | Random      | Name      |


  @TC_ADD_EMP_003
  Scenario Outline: [Neg] Unable to Add Employee If First Name is Missing
    When User input <middle_name> and <last_name> only
    And User is click on Save Button from Add Employee Page
    Then System should display "First Name" fields validation "Required"
    Examples:
      | middle_name | last_name |
      | Middle      | Last      |

  @TC_ADD_EMP_004
  Scenario Outline: [Neg] Unable to Add Employee If First Name is Missing
    When User input <first_name> and <middle_name> only
    And User is click on Save Button from Add Employee Page
    Then System should display "Last Name" fields validation "Required"
    Examples:
      | first_name | middle_name |
      | First      | Middle      |