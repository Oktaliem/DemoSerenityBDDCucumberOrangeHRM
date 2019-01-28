package com.ohrm.automation.serenitySteps;


import com.ohrm.automation.pages.dashboard.DashboardPage;
import com.ohrm.automation.pages.login.LoginPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static com.ohrm.automation.urls.OHRM_URL.dashBoardPage;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps{
    //@Managed(driver = "chrome")
    @Managed
    WebDriver driver = null;

    LoginPage loginPage;
    DashboardPage dashboard;

    @Step
    public void open_OHRM_URL() {
        loginPage.open();
    }

    @Step
    public void inputUserName(String userName) {
        loginPage.getUserName(userName);
    }

    @Step
    public void inputPassword(String password) {
        loginPage.getPassword(password);
    }

    @Step
    public void clickSubmitButton() {
        loginPage.submitLogin();
    }

    @Step
    public void isDirectingToDashBoardPage() throws InterruptedException {
        assertThat(dashboard.getDashboardPageURL(), containsString(dashBoardPage));
    }

    @Step
    public void errorMessageWillBeDisplayed(String assertion) {
        loginPage.checkErrorMessageLoginPage(assertion);
    }

    @Step
    public void LoginToPortal(String userName, String password){
        loginPage.getUserName(userName);
        loginPage.getPassword(password);
        loginPage.submitLogin();
    }
}
