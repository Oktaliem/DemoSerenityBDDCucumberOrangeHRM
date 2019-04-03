$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/UserManagement.feature");
formatter.feature({
  "name": "User Management",
  "description": "  In Order To Manage OHRM Portal\n  User Admin should be able to add, view and delete users credential",
  "keyword": "Feature"
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User is in the Admin Portal - User Management - System Users",
  "keyword": "Given "
});
formatter.match({
  "location": "UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Able to Filter User Credential Successfully",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User filter user credential by \u003cuser_name\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagementStepDefinition.userFilterUserCredentialByUser_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is able to \u003cuser_name\u003e only in the system users table",
  "keyword": "Then "
});
formatter.match({
  "location": "UserManagementStepDefinition.userIsAbleToUser_nameOnlyInTheSystemUsersTable()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User filter user credential by \u003cuser_role\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagementStepDefinition.userFilterUserCredentialByUser_role()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is able to se \u003cuser_role\u003e in the system users table",
  "keyword": "Then "
});
formatter.match({
  "location": "UserManagementStepDefinition.userIsAbleToSeUser_roleInTheSystemUsersTable()"
});
formatter.result({
  "status": "skipped"
});
});