package com.ohrm.automation.pages.admin;

import com.ohrm.automation.pages.HomePage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMgn_UserPage extends HomePage {
    @Managed
    WebDriver driver = null;

    @FindBy(xpath = "//b[contains(text(),'admin')]")
    WebElement adminTab;

    @FindBy(xpath = "//*[@id=\"systemUser-information\"]/a[1]")
    WebElement systemUsersToggle;

    @FindBy(id = "searchBtn")
    WebElement searchButtonSU;

    public UserMgn_UserPage(WebDriver driver) {
        super(driver);
    }

    public void goTOSystemUsersForm() {
        adminTab.click();
    }

    public String checkSystemUserFormTitle() {
        return systemUsersToggle.getText();
    }

    public void clickOnSearchButtonSU() {
        searchButtonSU.click();
    }


}
