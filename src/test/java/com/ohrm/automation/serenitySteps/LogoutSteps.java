package com.ohrm.automation.serenitySteps;

import com.ohrm.automation.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class LogoutSteps {

    HomePage homePage;

    @Step
    public void logoutfromPortal() {
        homePage.clickOnWelcomeButton();
        homePage.clickOnLogoutOption();
    }


}
