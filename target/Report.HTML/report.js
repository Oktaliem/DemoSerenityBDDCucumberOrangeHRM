$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/UserManagement.feature");
formatter.feature({
  "name": "User Management",
  "description": "  In Order To Manage OHRM Portal\n  User Admin should be able to add, view and delete users credential",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "User is in the Login Page",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User is in the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_in_the_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has login to Portal with valid credential",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "admin"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is in the Admin Portal - User Management - System Users",
  "keyword": "Given "
});
formatter.match({
  "location": "UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Able to Add User Admin Role with Status Enable Successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@priority_1"
    }
  ]
});
formatter.step({
  "name": "User specifies User credential information",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagementStepDefinition.userSpecifiesUserCredentialInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Add",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagementStepDefinition.userClickOnAdd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "New User has been Added",
  "keyword": "Then "
});
formatter.match({
  "location": "UserManagementStepDefinition.newUserHasBeenAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to See New User in the Table List",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagementStepDefinition.userIsAbleToSeeNewUserInTheTableList()"
});
formatter.result({
  "status": "passed"
});
});