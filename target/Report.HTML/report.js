$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login to Orange HRM",
  "description": "  In Order To Access OHRM Portal\n  User has to login to Portal",
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
formatter.scenario({
  "name": "Login to the Application Successfully",
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
  "name": "User provides the Username admin and Password admin",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_provides_Username_admin_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_is_able_to_login()"
});
formatter.result({
  "status": "passed"
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
formatter.scenario({
  "name": "Login to the Application with Invalid UserName",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@priority_2"
    }
  ]
});
formatter.step({
  "name": "User provides invalid the Username tukiyem and Password admin",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is unable to login with Invalid UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.userIsUnableToLoginWithInvalidUserName()"
});
formatter.result({
  "status": "passed"
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
formatter.scenario({
  "name": "Login to the Application with Invalid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@priority_2"
    }
  ]
});
formatter.step({
  "name": "User provides invalid the Username admin and Password tukiyem",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is unable to login with Invalid Password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.userIsUnableToLoginWithInvalidPassword()"
});
formatter.result({
  "status": "passed"
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
formatter.scenario({
  "name": "Login to the Application with Empty UserName And Empty Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@priority_3"
    }
  ]
});
formatter.step({
  "name": "User provides empty the Username and empty Password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.userProvidesEmptyTheUsernameAndEmptyPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is unable to login with empty username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.userIsUnableToLoginWithEmptyUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/features/User Management.feature");
formatter.feature({
  "name": "User Management",
  "description": "In Order To Manage OHRM Portal\nUser Admin should be able to add, view and delete users credential",
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
  "name": "User has login to Portal",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Able to Add User Admin Role with Status Enable Succesfully",
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User click on Add",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "New User has been Add",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User able to See New User in the Table List",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});