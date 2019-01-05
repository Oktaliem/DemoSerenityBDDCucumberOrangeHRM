package com.ohrm.automation.cucumberSteps;

import com.ohrm.automation.serenitySteps.LogoutSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static URLs.OHRM_URL.loginPageURL;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LogoutStepDefinition {

    @Managed
    WebDriver driver = null;

    @Steps
    LogoutSteps user;


    @And("^User is log out from portal$")
    public void userIsLogOutFromPortal() throws Throwable {
       user.logoutfromPortal();
    }

    @Then("^User is in the Login Page after Logout$")
    public void userIsInTheLoginPageAfterLogout() throws Throwable {
        assertThat(driver.getCurrentUrl(), containsString(loginPageURL));
    }
}
