# Author : Okta Liem
Feature: User Management
  In Order To Manage OHRM Portal
  User Admin should be able to add, view and delete users credential


  Background: User is in the Login Page
    Given User is in the Login Page
    #https://github.com/cucumber/cucumber/tree/master/datatable
    #https://docs.cucumber.io/gherkin/reference/
    #https://www.toolsqa.com/cucumber/data-tables-in-cucumber/
    #http://www.automationtestinghub.com/cucumber-data-table/
    #https://www.programcreek.com/java-api-examples/?api=cucumber.api.DataTable
    #https://static.javadoc.io/info.cukes/cucumber-core/1.2.5/cucumber/api/DataTable.html
    Given User has login to Portal with valid credential
      | username | password |
      | admin    | admin    |
    Given User is in the Admin Portal - User Management - System Users

  @regression
  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully
    # https://www.baeldung.com/cucumber-scenario-outline
    #https://www.jetbrains.com/help/idea/creating-examples-table-in-scenario-outline.html
    #https://www.tutorialspoint.com/cucumber/cucumber_scenario_outline.htm
    #https://docs.cucumber.io/guides/10-minute-tutorial/
    When User input <user_role> and <employee_name> and <user_name> and <status> and <password> and <confirm_password>
    #And User click on Save Button
    #Then User should see the user <user_name> under the System Users Table
    #Examples:
    #  | user_role | employee_name | user_name     | status   | password | confirm_password |
    #  | Admin     | John Lennon   | john_lennon   | Enabled  | admin    | admin            |
    #  | ESS       | Frank Sinarta | frank_sinarta | Disabled | admin    | admin            |

  Scenario:  Able to Filter User Credential Successfully
    When User filter user credential by <user_name>
    Then User is able to <user_name> only in the system users table
    When User filter user credential by <user_role>
    Then User is able to se <user_role> in the system users table