package com.ohrm.automation.cucumberSteps;

import com.ohrm.automation.serenitySteps.UserManagementSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserManagementStepDefinition {

    @Steps
    UserManagementSteps user;

    @Given("^User is in the Admin Portal - User Management - System Users$")
    public void userIsInTheAdminPortalUserManagementSystemUsers() throws Throwable {
        //user.
        //user.verifyUserIsInTheUserManagementSystemUsersPage();
    }

    @When("^User specifies User credential information$")
    public void userSpecifiesUserCredentialInformation() throws Throwable {

    }

    @And("^User click on Add$")
    public void userClickOnAdd() throws Throwable {

    }

    @Then("^New User has been Added$")
    public void newUserHasBeenAdded() throws Throwable {

    }

    @And("^User is able to See New User in the Table List$")
    public void userIsAbleToSeeNewUserInTheTableList() throws Throwable {

    }
}
