package com.ohrm.automation.cucumberSteps;


import com.ohrm.automation.serenitySteps.HomePageSteps;
import com.ohrm.automation.serenitySteps.UserManagementSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import static URLs.OHRM_URL.viewSystemUsers;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserManagementStepDefinition {
    /** https://johnfergusonsmart.com/sharing-state-steps-serenity-bdd/
     *  We can use 2 different step from serenity step class by initiate @step
     *  for each serenity step class
     */
    @Managed
    WebDriver driver;

    @Steps
    HomePageSteps homePageSteps;
    @Steps
    UserManagementSteps userManagementSteps;


    @Given("^User is in the Admin Portal - User Management - System Users$")
    public void userIsInTheAdminPortalUserManagementSystemUsers() throws Throwable {
        homePageSteps.goToSystemUsersForm();
        assertThat(driver.getCurrentUrl(), containsString(viewSystemUsers));
    }

    @When("^User specifies User credential information$")
    public void userSpecifiesUserCredentialInformation() throws Throwable {
        userManagementSteps.inputSystemUserInformationForAdminRoleAndStatusEnable();
    }

    //@When("^User input <user_role> and <employee_name> and <user_name> and <status> and <password> and <confirm_password>$")
    @When("^User input (.*) and (.*) and (.*) and (.*) and (.*) and (.*)$")
    public void InputUserInformation(String userRole, String eName, String Uname,String addStatus,
                                     String addPass,String addConfirmPass) throws Throwable {
        userManagementSteps.inputUserInformation(userRole,eName,Uname,addStatus,addPass,addConfirmPass);
    }


    @Then("^User should see the user <user_name> under the System Users Table$")
    public void userShouldSeeTheUserUser_nameUnderTheSystemUsersTable() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User filter user credential by <user_name>$")
    public void userFilterUserCredentialByUser_name() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User is able to <user_name> only in the system users table$")
    public void userIsAbleToUser_nameOnlyInTheSystemUsersTable() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User is able to se <user_role> in the system users table$")
    public void userIsAbleToSeUser_roleInTheSystemUsersTable() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User filter user credential by <user_role>$")
    public void userFilterUserCredentialByUser_role() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^User click on Save Button$")
    public void userClickOnSaveButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
