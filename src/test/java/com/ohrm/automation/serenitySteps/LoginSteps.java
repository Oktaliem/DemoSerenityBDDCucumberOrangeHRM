package com.ohrm.automation.serenitySteps;


import com.ohrm.automation.pages.DashboardPage;
import com.ohrm.automation.pages.LoginPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps{
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
        assertThat(dashboard.getDashboardPageURL(), containsString("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/dashboard"));
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
