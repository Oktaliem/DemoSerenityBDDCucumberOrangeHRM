package com.ohrm.automation.serenitySteps;

import com.ohrm.automation.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {

    HomePage homePage;

    @Step
    public void goToSystemUsersForm() {
        homePage.goToAdminModule();
        homePage.clickOnUserManagementList();
        homePage.clickOnUserTab();
    }

    public void goToAddEmployeePage() {
        homePage.clickOnPIMTab();
        homePage.clickOnAddEmployeeTab();

    }
}
