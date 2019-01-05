package com.ohrm.automation.serenitySteps;

import com.ohrm.automation.pages.admin.UserMgn_UserPage;
import com.ohrm.automation.pages.dashboard.DashboardPage;
import com.ohrm.automation.pages.login.LoginPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class UserManagementSteps {

    @Managed
    WebDriver driver = null;

    UserMgn_UserPage userPage;

    @Step
    public void verifyUserIsInTheUserManagementSystemUsersPage() {

    }
}
