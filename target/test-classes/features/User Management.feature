@regression
Feature: User Management
In Order To Manage OHRM Portal
User Admin should be able to add, view and delete users credential
# mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_3"

Background: User is in the Login Page
Given User has login to Portal
Given User is in the Admin Portal - User Management - System Users

@priority_1
Scenario:  Able to Add User Admin Role with Status Enable Succesfully
When User specifies User credential information
And User click on Add
Then New User has been Add
And User able to See New User in the Table List