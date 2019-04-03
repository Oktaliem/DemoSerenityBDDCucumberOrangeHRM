package com.ohrm.automation.serenitySteps;


import com.ohrm.automation.pages.dashboard.DashboardPage;
import com.ohrm.automation.pages.login.LoginPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.ohrm.automation.urls.OHRM_URL.dashBoardPage;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps{
    @Managed
    WebDriver driver;

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
    public void isDirectingToDashBoardPage() {
        assertThat(dashboard.getDashboardPageURL(), containsString(dashBoardPage));
        assertThat(dashboard.getDashboardTitle(), equalTo("Dashboard"));
    }

    @Step
    public void errorMessageWillBeDisplayed(String errorMessage) {
        String element = loginPage.getLoginErrorMessage();
        switch (errorMessage) {
            case "Invalid credentials":
                assertThat(element, equalTo("Invalid credentials"));
                break;
            case "Username cannot be empty":
                assertThat(element, equalTo("Username cannot be empty"));
                break;
        }
    }

    @Step
    public void LoginToPortal(String userName, String password){
        loginPage.getUserName(userName);
        loginPage.getPassword(password);
        loginPage.submitLogin();
    }
}
