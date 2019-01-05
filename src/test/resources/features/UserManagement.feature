# Author : Okta Liem

@regression
Feature: User Management
  In Order To Manage OHRM Portal
  User Admin should be able to add, view and delete users credential

  Background: User is in the Login Page
    Given User is in the Login Page
    Given User has login to Portal with valid credential
    |username|password|
    |admin   |admin   |
    Given User is in the Admin Portal - User Management - System Users

  @priority_1
  Scenario:  Able to Add User Admin Role with Status Enable Successfully
    When User specifies User credential information
    And User click on Add
    Then New User has been Added
    And User is able to See New User in the Table List