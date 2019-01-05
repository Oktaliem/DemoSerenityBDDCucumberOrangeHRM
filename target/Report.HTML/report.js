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
formatter.scenarioOutline({
  "name": "Able to Add User Admin Role with Status Enable Successfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User input \u003cuser_role\u003e and \u003cemployee_name\u003e and \u003cuser_name\u003e and \u003cstatus\u003e and \u003cpassword\u003e and \u003cconfirm_password\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User click on Save Button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see the user \u003cuser_name\u003e under the System Users Table",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user_role",
        "employee_name",
        "user_name",
        "status",
        "password",
        "confirm_password"
      ]
    },
    {
      "cells": [
        "Admin",
        "John Lennon",
        "john_lennon",
        "Enabled",
        "admin",
        "admin"
      ]
    },
    {
      "cells": [
        "ESS",
        "Frank Sinarta",
        "frank_sinarta",
        "Disabled",
        "admin",
        "admin"
      ]
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User input Admin and John Lennon and john_lennon and Enabled and admin and admin",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagementStepDefinition.userClickOnSaveButton()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)\r\n\tat ✽.User click on Save Button(src/test/resources/features/UserManagement.feature:27)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "User should see the user john_lennon under the System Users Table",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User input ESS and Frank Sinarta and frank_sinarta and Disabled and admin and admin",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Save Button",
  "keyword": "And "
});
formatter.match({
  "location": "UserManagementStepDefinition.userClickOnSaveButton()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)\r\n\tat ✽.User click on Save Button(src/test/resources/features/UserManagement.feature:27)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "User should see the user frank_sinarta under the System Users Table",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "Able to Filter User Credential Successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User filter user credential by \u003cuser_name\u003e",
  "keyword": "When "
});
formatter.match({
  "location": "UserManagementStepDefinition.userFilterUserCredentialByUser_name()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userFilterUserCredentialByUser_name(UserManagementStepDefinition.java:60)\r\n\tat ✽.User filter user credential by \u003cuser_name\u003e(src/test/resources/features/UserManagement.feature:35)\r\n",
  "status": "pending"
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