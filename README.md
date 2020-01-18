<h1 align="center"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" alt="Apache JMeter logo" /></h1>
<h4 align="center">SOFTWARE TESTING ENTHUSIAST</h4>
<br>

# DemoSerenityBDDCucumberOrangeHRM
Serenity BDD + Cucumber + Java + Selenium + Page Object Model/Page Factory + orangeHRM-4.0

Folders :
1. Features : Test suit in gerkhin language. Each feature consists of test cases.
2. CucumberSteps : Step Definition in cucumber, ie. Given When And Then
3. SerenitySteps : Create steps for Serenity BDD report with annotation @step
4. TestRunner : Run Your Features File, glue between your feature and cucumbersteps

## Run the Test Via Command Line
Check your TestRunner folder for cucumber options

i.e. 
```
- mvn clean verify
- mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_3"
- mvn clean verify -Dcucumber.options="src/test/resources/features/"
- mvn clean verify -Dcucumber.options="src/test/resources/features/User_Management.feature"
- mvn clean verify -Dcucumber.options="src/test/resources/features" -Dwebdriver.driver=chrome
- mvn clean verify -Dwebdriver.driver=firefox
- mvn verify -Dcucumber.options=" --plugin pretty --tags @Regression" -Dwebdriver.driver=firefox -Dcontext=firefox
```

## SerenityBDD HTML Report Path
```
{your_project_path}/target/site/serenity/index.html
```

Sample 1 :
![serenity bdd cucumber html report sample 1](https://user-images.githubusercontent.com/26521948/50727585-f3b40900-1157-11e9-8c11-50e61a20855c.png)

Sample 2 :
![serenity bdd cucumber html report sample 2](https://user-images.githubusercontent.com/26521948/50727587-f6aef980-1157-11e9-980c-b6a29c640886.png)

Sample 3 :
![serenity bdd cucumber html report sample 3](https://user-images.githubusercontent.com/26521948/50727623-602f0800-1158-11e9-83a0-4c4b27427cd5.png)

## Cucumber HTML Report Path
```
{your_project_path}target/Report.HTML/index.html
```

Sample :
![cucumber html report sample](https://user-images.githubusercontent.com/26521948/50727509-b9963780-1156-11e9-9b42-ae3d2b45e909.png)


## Demo in Youtube
   <a href="https://youtu.be/A3jRCfnxY5s" target="_blank"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" 
   alt="CLICK HERE" width="100" height="80" border="10" /></a>
      <a href="https://youtu.be/dYQzXqRXczw" target="_blank"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" 
   alt="CLICK HERE" width="140" height="80" border="10" /></a>


## Download OrangeHRM
```
https://github.com/orangehrm/orangehrm
```

## Serenity BDD
```
http://thucydides.info/docs/serenity-staging/
```

## Serenity BDD Testing Log

<details>
<summary>
CLICK ME
</summary>
<p>
 
```maven
 C:\Users\User\Documents\GitHub\DemoSerenityBDDCucumberOrangeHRM>mvn clean verify -Dcucumber.options="src/test/resources/features/"
[INFO] Scanning for projects...
[INFO]
[INFO] --< DemoSerenityBDDCucumberOrangeHRM:DemoSerenityBDDCucumberOrangeHRM >--
[INFO] Building Sample Serenity BDD project using Cucumber 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] Deleting C:\Users\User\Documents\GitHub\DemoSerenityBDDCucumberOrangeHRM\target
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.5.1:compile (default-compile) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to C:\Users\User\Documents\GitHub\DemoSerenityBDDCucumberOrangeHRM\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 3 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.5.1:testCompile (default-testCompile) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 51 source files to C:\Users\User\Documents\GitHub\DemoSerenityBDDCucumberOrangeHRM\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.19.1:test (default-test) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] Tests are skipped.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] Building jar: C:\Users\User\Documents\GitHub\DemoSerenityBDDCucumberOrangeHRM\target\DemoSerenityBDDCucumberOrangeHRM-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-failsafe-plugin:2.19.1:integration-test (default) @ DemoSerenityBDDCucumberOrangeHRM ---

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.ohrm.automation.TestRunner.LoginTestRunner
[main] INFO net.serenitybdd.core.Serenity -

-------------------------------------------------------------------------------------
     _______. _______ .______       _______ .__   __.  __  .___________.____    ____
    /       ||   ____||   _  \     |   ____||  \ |  | |  | |           |\   \  /   /
   |   (----`|  |__   |  |_)  |    |  |__   |   \|  | |  | `---|  |----` \   \/   /
    \   \    |   __|  |      /     |   __|  |  . `  | |  |     |  |       \_    _/
.----)   |   |  |____ |  |\  \----.|  |____ |  |\   | |  |     |  |         |  |
|_______/    |_______|| _| `._____||_______||__| \__| |__|     |__|         |__|

 News and tutorials at http://www.serenity-bdd.info
 Documentation at https://wakaleo.gitbooks.io/the-serenity-book/content/
 Join the Serenity Community on Rocket Chat at https://serenity-bdd.rocket.chat
 Serenity BDD Support and Training at http://serenity-bdd.info/#/trainingandsupport
 Learn Serenity BDD online at http://serenity-dojo.com
-------------------------------------------------------------------------------------

[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Login to Orange HRM
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Logout from Orange HRM
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: User Management
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application Successfully
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-successfully)
@regression
Feature: Login to Orange HRM
  In Order To Access OHRM Portal
  User has to login to Portal

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:44:15 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Starting ChromeDriver 2.38.551601 (edb21f07fc70e9027c746edd3201443e011a61ed) on port 20428
Only local connections are allowed.
Jan 06, 2019 10:44:19 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_1
  Scenario: Login to the Application Successfully            # src/test/resources/features/Login.feature:11
    When User provides the Username admin and Password admin # LoginStepDefinition.user_provides_Username_admin_and_password(String,String)
    Then User is able to login                               # LoginStepDefinition.User_is_able_to_login()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application Successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application Successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Invalid UserName
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-invalid-username)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:44:39 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:44:41 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_2
  Scenario: Login to the Application with Invalid UserName             # src/test/resources/features/Login.feature:16
    When User provides invalid the Username tukiyem and Password admin # LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)
    Then User is unable to login with Invalid UserName                 # LoginStepDefinition.userIsUnableToLoginWithInvalidUserName()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid UserName
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid UserName
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Invalid Password
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-invalid-password)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:44:48 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:44:49 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_2
  Scenario: Login to the Application with Invalid Password             # src/test/resources/features/Login.feature:21
    When User provides invalid the Username admin and Password tukiyem # LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)
    Then User is unable to login with Invalid Password                 # LoginStepDefinition.userIsUnableToLoginWithInvalidPassword()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Empty UserName And Empty Password
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-empty-username-and-empty-password)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:44:57 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:44:58 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_3
  Scenario: Login to the Application with Empty UserName And Empty Password # src/test/resources/features/Login.feature:26
    When User provides empty the Username and empty Password                # LoginStepDefinition.userProvidesEmptyTheUsernameAndEmptyPassword()
    Then User is unable to login with empty username and password           # LoginStepDefinition.userIsUnableToLoginWithEmptyUsernameAndPassword()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Empty UserName And Empty Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Empty UserName And Empty Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Logout from the Portal successfully
-------------------------------------------------------------------(logout-from-orange-hrm;logout-from-the-portal-successfully)

@regression
Feature: Logout from Orange HRM
  User has to logout from Portal if no longer used

  Background: User is in the Login Page # src/test/resources/features/Logout.feature:5
Jan 06, 2019 10:45:06 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:45:08 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_1
  Scenario: Logout from the Portal successfully              # src/test/resources/features/Logout.feature:9
    When User provides the Username admin and Password admin # LoginStepDefinition.user_provides_Username_admin_and_password(String,String)
    Then User is able to login                               # LoginStepDefinition.User_is_able_to_login()
    And User is log out from portal                          # LogoutStepDefinition.userIsLogOutFromPortal()
    Then User is in the Login Page after Logout              # LogoutStepDefinition.userIsInTheLoginPageAfterLogout()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Logout from the Portal successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Logout from the Portal successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Able to Add User Admin Role with Status Enable Successfully
-------------------------------------------------------------------(user-management;able-to-add-user-admin-role-with-status-enable-successfully)

@regression
Feature: User Management
  In Order To Manage OHRM Portal
  User Admin should be able to add, view and delete users credential

  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully # src/test/resources/features/UserManagement.feature:21
    When User input <user_role> and <employee_name> and <user_name> and <status> and <password> and <confirm_password>
    And User click on Save Button
    Then User should see the user <user_name> under the System Users Table

    Examples:

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:45:18 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:45:20 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully           # src/test/resources/features/UserManagement.feature:31
    When User input Admin and John Lennon and john_lennon and Enabled and admin and admin # UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    And User click on Save Button                                                         # UserManagementStepDefinition.userClickOnSaveButton()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    Then User should see the user john_lennon under the System Users Table                # null
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:45:35 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:45:37 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully              # src/test/resources/features/UserManagement.feature:32
    When User input ESS and Frank Sinarta and frank_sinarta and Disabled and admin and admin # UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    And User click on Save Button                                                            # UserManagementStepDefinition.userClickOnSaveButton()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    Then User should see the user frank_sinarta under the System Users Table                 # null
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Able to Filter User Credential Successfully
-------------------------------------------------------------------(user-management;able-to-filter-user-credential-successfully)

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:45:56 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:45:58 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario: Able to Filter User Credential Successfully             # src/test/resources/features/UserManagement.feature:34
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    When User filter user credential by <user_name>                 # UserManagementStepDefinition.userFilterUserCredentialByUser_name()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userFilterUserCredentialByUser_name(UserManagementStepDefinition.java:60)
        at ?.User filter user credential by <user_name>(src/test/resources/features/UserManagement.feature:35)

    Then User is able to <user_name> only in the system users table # UserManagementStepDefinition.userIsAbleToUser_nameOnlyInTheSystemUsersTable()
    When User filter user credential by <user_role>                 # UserManagementStepDefinition.userFilterUserCredentialByUser_role()
    Then User is able to se <user_role> in the system users table   # UserManagementStepDefinition.userIsAbleToSeUser_roleInTheSystemUsersTable()
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Filter User Credential Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Filter User Credential Successfully
---------------------------------------------------------------------------------

8 Scenarios (1 pending, 2 undefined, 5 passed)
36 Steps (3 skipped, 3 pending, 2 undefined, 28 passed)
1m54.290s

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userFilterUserCredentialByUser_name(UserManagementStepDefinition.java:60)
        at ?.User filter user credential by <user_name>(src/test/resources/features/UserManagement.feature:35)


You can implement missing steps with the snippets below:

@Then("^User should see the user john_lennon under the System Users Table$")
public void user_should_see_the_user_john_lennon_under_the_System_Users_Table() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


@Then("^User should see the user frank_sinarta under the System Users Table$")
public void user_should_see_the_user_frank_sinarta_under_the_System_Users_Table() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

Tests run: 10, Failures: 0, Errors: 0, Skipped: 5, Time elapsed: 116.785 sec - in com.ohrm.automation.TestRunner.LoginTestRunner
Running com.ohrm.automation.TestRunner.LogoutTestRunner
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Login to Orange HRM
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Logout from Orange HRM
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: User Management
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application Successfully
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-successfully)
@regression
Feature: Login to Orange HRM
  In Order To Access OHRM Portal
  User has to login to Portal

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:46:09 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:46:11 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_1
  Scenario: Login to the Application Successfully            # src/test/resources/features/Login.feature:11
    When User provides the Username admin and Password admin # LoginStepDefinition.user_provides_Username_admin_and_password(String,String)
    Then User is able to login                               # LoginStepDefinition.User_is_able_to_login()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application Successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application Successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Invalid UserName
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-invalid-username)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:46:19 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:46:21 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_2
  Scenario: Login to the Application with Invalid UserName             # src/test/resources/features/Login.feature:16
    When User provides invalid the Username tukiyem and Password admin # LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)
    Then User is unable to login with Invalid UserName                 # LoginStepDefinition.userIsUnableToLoginWithInvalidUserName()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid UserName
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid UserName
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Invalid Password
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-invalid-password)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:46:29 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:46:31 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_2
  Scenario: Login to the Application with Invalid Password             # src/test/resources/features/Login.feature:21
    When User provides invalid the Username admin and Password tukiyem # LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)
    Then User is unable to login with Invalid Password                 # LoginStepDefinition.userIsUnableToLoginWithInvalidPassword()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Empty UserName And Empty Password
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-empty-username-and-empty-password)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:46:42 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:46:44 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_3
  Scenario: Login to the Application with Empty UserName And Empty Password # src/test/resources/features/Login.feature:26
    When User provides empty the Username and empty Password                # LoginStepDefinition.userProvidesEmptyTheUsernameAndEmptyPassword()
    Then User is unable to login with empty username and password           # LoginStepDefinition.userIsUnableToLoginWithEmptyUsernameAndPassword()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Empty UserName And Empty Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Empty UserName And Empty Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Logout from the Portal successfully
-------------------------------------------------------------------(logout-from-orange-hrm;logout-from-the-portal-successfully)

@regression
Feature: Logout from Orange HRM
  User has to logout from Portal if no longer used

  Background: User is in the Login Page # src/test/resources/features/Logout.feature:5
Jan 06, 2019 10:46:52 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:46:53 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_1
  Scenario: Logout from the Portal successfully              # src/test/resources/features/Logout.feature:9
    When User provides the Username admin and Password admin # LoginStepDefinition.user_provides_Username_admin_and_password(String,String)
    Then User is able to login                               # LoginStepDefinition.User_is_able_to_login()
    And User is log out from portal                          # LogoutStepDefinition.userIsLogOutFromPortal()
    Then User is in the Login Page after Logout              # LogoutStepDefinition.userIsInTheLoginPageAfterLogout()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Logout from the Portal successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Logout from the Portal successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Able to Add User Admin Role with Status Enable Successfully
-------------------------------------------------------------------(user-management;able-to-add-user-admin-role-with-status-enable-successfully)

@regression
Feature: User Management
  In Order To Manage OHRM Portal
  User Admin should be able to add, view and delete users credential

  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully # src/test/resources/features/UserManagement.feature:21
    When User input <user_role> and <employee_name> and <user_name> and <status> and <password> and <confirm_password>
    And User click on Save Button
    Then User should see the user <user_name> under the System Users Table

    Examples:

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:47:05 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:47:07 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully           # src/test/resources/features/UserManagement.feature:31
    When User input Admin and John Lennon and john_lennon and Enabled and admin and admin # UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    And User click on Save Button                                                         # UserManagementStepDefinition.userClickOnSaveButton()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    Then User should see the user john_lennon under the System Users Table                # null
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:47:19 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:47:21 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully              # src/test/resources/features/UserManagement.feature:32
    When User input ESS and Frank Sinarta and frank_sinarta and Disabled and admin and admin # UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    And User click on Save Button                                                            # UserManagementStepDefinition.userClickOnSaveButton()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    Then User should see the user frank_sinarta under the System Users Table                 # null
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Able to Filter User Credential Successfully
-------------------------------------------------------------------(user-management;able-to-filter-user-credential-successfully)

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:47:34 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:47:36 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario: Able to Filter User Credential Successfully             # src/test/resources/features/UserManagement.feature:34
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    When User filter user credential by <user_name>                 # UserManagementStepDefinition.userFilterUserCredentialByUser_name()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userFilterUserCredentialByUser_name(UserManagementStepDefinition.java:60)
        at ?.User filter user credential by <user_name>(src/test/resources/features/UserManagement.feature:35)

    Then User is able to <user_name> only in the system users table # UserManagementStepDefinition.userIsAbleToUser_nameOnlyInTheSystemUsersTable()
    When User filter user credential by <user_role>                 # UserManagementStepDefinition.userFilterUserCredentialByUser_role()
    Then User is able to se <user_role> in the system users table   # UserManagementStepDefinition.userIsAbleToSeUser_roleInTheSystemUsersTable()
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Filter User Credential Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Filter User Credential Successfully
---------------------------------------------------------------------------------

8 Scenarios (1 pending, 2 undefined, 5 passed)
36 Steps (3 skipped, 3 pending, 2 undefined, 28 passed)
1m37.107s

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userFilterUserCredentialByUser_name(UserManagementStepDefinition.java:60)
        at ?.User filter user credential by <user_name>(src/test/resources/features/UserManagement.feature:35)


You can implement missing steps with the snippets below:


@Then("^User should see the user john_lennon under the System Users Table$")
public void user_should_see_the_user_john_lennon_under_the_System_Users_Table() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^User should see the user frank_sinarta under the System Users Table$")
public void user_should_see_the_user_frank_sinarta_under_the_System_Users_Table() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

Tests run: 10, Failures: 0, Errors: 0, Skipped: 5, Time elapsed: 97.96 sec - in com.ohrm.automation.TestRunner.LogoutTestRunner
Running com.ohrm.automation.TestRunner.UserManagementTestRunner
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Login to Orange HRM
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Logout from Orange HRM
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: User Management
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application Successfully
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-successfully)
@regression
Feature: Login to Orange HRM
  In Order To Access OHRM Portal
  User has to login to Portal

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:47:47 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:47:49 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_1
  Scenario: Login to the Application Successfully            # src/test/resources/features/Login.feature:11
    When User provides the Username admin and Password admin # LoginStepDefinition.user_provides_Username_admin_and_password(String,String)
    Then User is able to login                               # LoginStepDefinition.User_is_able_to_login()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application Successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application Successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Invalid UserName
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-invalid-username)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:47:57 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:47:59 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_2
  Scenario: Login to the Application with Invalid UserName             # src/test/resources/features/Login.feature:16
    When User provides invalid the Username tukiyem and Password admin # LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)
    Then User is unable to login with Invalid UserName                 # LoginStepDefinition.userIsUnableToLoginWithInvalidUserName()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid UserName
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid UserName
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Invalid Password
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-invalid-password)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:48:05 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:48:07 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_2
  Scenario: Login to the Application with Invalid Password             # src/test/resources/features/Login.feature:21
    When User provides invalid the Username admin and Password tukiyem # LoginStepDefinition.userProvidesInvalidTheUserNameAndPassword(String,String)
    Then User is unable to login with Invalid Password                 # LoginStepDefinition.userIsUnableToLoginWithInvalidPassword()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Invalid Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Login to the Application with Empty UserName And Empty Password
-------------------------------------------------------------------(login-to-orange-hrm;login-to-the-application-with-empty-username-and-empty-password)

  Background: User is in the Login Page # src/test/resources/features/Login.feature:7
Jan 06, 2019 10:48:13 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:48:15 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_3
  Scenario: Login to the Application with Empty UserName And Empty Password # src/test/resources/features/Login.feature:26
    When User provides empty the Username and empty Password                # LoginStepDefinition.userProvidesEmptyTheUsernameAndEmptyPassword()
    Then User is unable to login with empty username and password           # LoginStepDefinition.userIsUnableToLoginWithEmptyUsernameAndPassword()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Empty UserName And Empty Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Login to the Application with Empty UserName And Empty Password
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Logout from the Portal successfully
-------------------------------------------------------------------(logout-from-orange-hrm;logout-from-the-portal-successfully)

@regression
Feature: Logout from Orange HRM
  User has to logout from Portal if no longer used

  Background: User is in the Login Page # src/test/resources/features/Logout.feature:5
Jan 06, 2019 10:48:22 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:48:24 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page     # LoginStepDefinition.user_is_in_the_Login_Page()

  @regression @priority_1
  Scenario: Logout from the Portal successfully              # src/test/resources/features/Logout.feature:9
    When User provides the Username admin and Password admin # LoginStepDefinition.user_provides_Username_admin_and_password(String,String)
    Then User is able to login                               # LoginStepDefinition.User_is_able_to_login()
    And User is log out from portal                          # LogoutStepDefinition.userIsLogOutFromPortal()
    Then User is in the Login Page after Logout              # LogoutStepDefinition.userIsInTheLoginPageAfterLogout()
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Logout from the Portal successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/
        /_/

TEST PASSED: Logout from the Portal successfully
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Able to Add User Admin Role with Status Enable Successfully
-------------------------------------------------------------------(user-management;able-to-add-user-admin-role-with-status-enable-successfully)

@regression
Feature: User Management
  In Order To Manage OHRM Portal
  User Admin should be able to add, view and delete users credential

  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully # src/test/resources/features/UserManagement.feature:21
    When User input <user_role> and <employee_name> and <user_name> and <status> and <password> and <confirm_password>
    And User click on Save Button
    Then User should see the user <user_name> under the System Users Table

    Examples:

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:48:35 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:48:37 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully           # src/test/resources/features/UserManagement.feature:31
    When User input Admin and John Lennon and john_lennon and Enabled and admin and admin # UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    And User click on Save Button                                                         # UserManagementStepDefinition.userClickOnSaveButton()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    Then User should see the user john_lennon under the System Users Table                # null
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:48:49 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:48:51 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario Outline: Able to Add User Admin Role with Status Enable Successfully              # src/test/resources/features/UserManagement.feature:32
    When User input ESS and Frank Sinarta and frank_sinarta and Disabled and admin and admin # UserManagementStepDefinition.InputUserInformation(String,String,String,String,String,String)
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    And User click on Save Button                                                            # UserManagementStepDefinition.userClickOnSaveButton()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    Then User should see the user frank_sinarta under the System Users Table                 # null
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Add User Admin Role with Status Enable Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/


TEST STARTED: Able to Filter User Credential Successfully
-------------------------------------------------------------------(user-management;able-to-filter-user-credential-successfully)

  Background: User is in the Login Page                                # src/test/resources/features/UserManagement.feature:8
Jan 06, 2019 10:49:03 AM org.openqa.selenium.remote.DesiredCapabilities chrome
INFO: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Jan 06, 2019 10:49:05 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
    Given User is in the Login Page                                    # LoginStepDefinition.user_is_in_the_Login_Page()
    Given User has login to Portal with valid credential               # LoginStepDefinition.userHasLoginToPortalWithValidCredential(DataTable)
    Given User is in the Admin Portal - User Management - System Users # UserManagementStepDefinition.userIsInTheAdminPortalUserManagementSystemUsers()

  @regression
  Scenario: Able to Filter User Credential Successfully             # src/test/resources/features/UserManagement.feature:34
[main] INFO net.serenitybdd.core.Serenity - TEST PENDING
    When User filter user credential by <user_name>                 # UserManagementStepDefinition.userFilterUserCredentialByUser_name()
      cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userFilterUserCredentialByUser_name(UserManagementStepDefinition.java:60)
        at ?.User filter user credential by <user_name>(src/test/resources/features/UserManagement.feature:35)

    Then User is able to <user_name> only in the system users table # UserManagementStepDefinition.userIsAbleToUser_nameOnlyInTheSystemUsersTable()
    When User filter user credential by <user_role>                 # UserManagementStepDefinition.userFilterUserCredentialByUser_role()
    Then User is able to se <user_role> in the system users table   # UserManagementStepDefinition.userIsAbleToSeUser_roleInTheSystemUsersTable()
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Filter User Credential Successfully
---------------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity -
          __  _____ _____ ____ _____   ____  _____ _   _ ____ ___ _   _  ____
 _       / / |_   _| ____/ ___|_   _| |  _ \| ____| \ | |  _ \_ _| \ | |/ ___|
(_)____ / /    | | |  _| \___ \ | |   | |_) |  _| |  \| | | | | ||  \| | |  _
 |_____/ /     | | | |___ ___) || |   |  __/| |___| |\  | |_| | || |\  | |_| |
(_)   /_/      |_| |_____|____/ |_|   |_|   |_____|_| \_|____/___|_| \_|\____|


TEST PENDING: Able to Filter User Credential Successfully
---------------------------------------------------------------------------------

8 Scenarios (1 pending, 2 undefined, 5 passed)
36 Steps (3 skipped, 3 pending, 2 undefined, 28 passed)
1m27.558s

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userClickOnSaveButton(UserManagementStepDefinition.java:84)
        at ?.User click on Save Button(src/test/resources/features/UserManagement.feature:27)

cucumber.api.PendingException: TODO: implement me
        at com.ohrm.automation.cucumberSteps.UserManagementStepDefinition.userFilterUserCredentialByUser_name(UserManagementStepDefinition.java:60)
        at ?.User filter user credential by <user_name>(src/test/resources/features/UserManagement.feature:35)


You can implement missing steps with the snippets below:

@Then("^User should see the user john_lennon under the System Users Table$")
public void user_should_see_the_user_john_lennon_under_the_System_Users_Table() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}


@Then("^User should see the user frank_sinarta under the System Users Table$")
public void user_should_see_the_user_frank_sinarta_under_the_System_Users_Table() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

Tests run: 10, Failures: 0, Errors: 0, Skipped: 5, Time elapsed: 87.937 sec - in com.ohrm.automation.TestRunner.UserManagementTestRunner

Results :

Tests run: 17, Failures: 0, Errors: 0, Skipped: 2

[INFO]
[INFO] --- serenity-maven-plugin:1.9.0:aggregate (serenity-reports) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] current_project.base.dir: C:\Users\User\Documents\GitHub\DemoSerenityBDDCucumberOrangeHRM
[INFO] Generating test results for 8 tests
[INFO] 3 requirements loaded after 188 ms
[INFO] 3 related requirements found after 191 ms
[INFO] Generating test outcome reports: false
[INFO] Starting generating reports: 258 ms
[INFO] Configured report threads: 40
[INFO] Test results for 8 tests generated in 2993 ms
[INFO]
[INFO] --- maven-failsafe-plugin:2.19.1:verify (default) @ DemoSerenityBDDCucumberOrangeHRM ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 05:55 min
[INFO] Finished at: 2019-01-06T10:49:23+08:00
[INFO] ------------------------------------------------------------------------
 
```
