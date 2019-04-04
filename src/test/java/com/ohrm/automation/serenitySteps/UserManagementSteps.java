package com.ohrm.automation.serenitySteps;

import com.ohrm.automation.pages.admin.UserMgn_UserPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserManagementSteps {

    @Managed
    WebDriver driver = null;

    UserMgn_UserPage userMgn_userPage;
    private static String userName;

    /*
    @Step
    public void verifyUserIsInTheUserManagementSystemUsersPage() {
        assertThat(driver.getCurrentUrl(), containsString(viewSystemUsers));
    }
    */
    @Step
    public void inputSystemUserInformationForAdminRoleAndStatusEnable() {
        userMgn_userPage.inputUserName("Okta");
        userMgn_userPage.selectUserRole("Admin");
        userMgn_userPage.inputEmployeeName("Oktavianer Surya Diharja");
        userMgn_userPage.selectStatus("Enabled");
    }
    @Step
    public void inputUserInformation(String userRole, String eName,
                                     String Uname,String addStatus,
                                     String addPass,String addConfirmPass) {
        userMgn_userPage.clickOnAddButtonTable();
        userMgn_userPage.selectAddUserRole(userRole);
        userMgn_userPage.inputAddEmployeeName(eName);
        userMgn_userPage.inputAddUserName(Uname);
        userMgn_userPage.selectAddStatus(addStatus);
        userMgn_userPage.inputAddPassword(addPass);
        userMgn_userPage.inputAddConfirmPassword(addConfirmPass);
    }

    @Step
    public void getUserNameFromTable(int i) {
        this.userName = userMgn_userPage.getUserNameFromList(i);
        userMgn_userPage.searchUserByUserName(userName);
    }

    @Step
    public void getExpectedUserName() {
        assertThat(userName,equalTo(userMgn_userPage.getUserNameFromList(1)));
    }
}
