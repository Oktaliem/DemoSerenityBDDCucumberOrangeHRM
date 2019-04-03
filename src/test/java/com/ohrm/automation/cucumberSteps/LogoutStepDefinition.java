package com.ohrm.automation.cucumberSteps;

import com.ohrm.automation.serenitySteps.LogoutSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import static com.ohrm.automation.urls.OHRM_URL.loginPageURL;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LogoutStepDefinition {

    @Managed
    WebDriver driver = null;

    @Steps
    LogoutSteps user;


    @And("^User is log out from portal$")
    public void userIsLogOutFromPortal() throws Throwable {
       user.logoutFromPortal();
    }

    @Then("^User landing back to Login Page$")
    public void userIsInTheLoginPageAfterLogout() throws Throwable {
        assertThat(driver.getCurrentUrl(), containsString(loginPageURL));
    }
}
