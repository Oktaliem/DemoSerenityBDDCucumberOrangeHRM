package com.ohrm.automation.cucumberSteps;

import com.ohrm.automation.serenitySteps.LoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LoginStepDefinition {

    @Steps
    LoginSteps user;

    @Given("^User is in the Login Page$")
    public void user_is_in_the_Login_Page() throws Throwable {
        user.open_OHRM_URL();
    }

    @When("^User provides the Username (.*) and Password (.*)$")
    public void user_provides_Username_admin_and_password(String username, String password) throws Throwable {
        user.LoginToPortal(username,password);
    }

    @Then("^User is able to login$")
    public void User_is_able_to_login() throws Throwable {
        user.isDirectingToDashBoardPage();
    }

    @Then("^User is unable to login$")
    public void userIsUnableToLogin() throws Throwable {
    }

    @When("^User provides invalid the Username (.*) and Password (.*)$")
    public void userProvidesInvalidTheUserNameAndPassword(String username, String password) throws Throwable {
        user.LoginToPortal(username,password);
    }

    @Then("^User is unable to login with Invalid UserName$")
    public void userIsUnableToLoginWithInvalidUserName() throws Throwable {
        String assertion  = "invalid_credentials";
        user.errorMessageWillBeDisplayed(assertion);
    }

    @Then("^User is unable to login with Invalid Password$")
    public void userIsUnableToLoginWithInvalidPassword() throws Throwable {
        String assertion  = "invalid_credentials";
        user.errorMessageWillBeDisplayed(assertion);

    }

    @When("^User provides invalid the Username and Password$")
    public void userProvidesInvalidTheUsernameAndPassword(String username, String password) throws Throwable {
        user.inputUserName(username );
        user.inputPassword(password);
        user.clickSubmitButton();
    }

    @Then("^User is unable to login with empty username and password$")
    public void userIsUnableToLoginWithEmptyUsernameAndPassword() throws Throwable {
        String assertion  = "empty_credential";
        user.errorMessageWillBeDisplayed(assertion);
    }


    @When("^User provides empty the Username and empty Password$")
    public void userProvidesEmptyTheUsernameAndEmptyPassword() throws Throwable {
        user.inputUserName("");
        user.inputPassword("");
        user.clickSubmitButton();
    }
}
