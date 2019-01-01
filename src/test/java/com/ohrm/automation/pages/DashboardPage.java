package com.ohrm.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageObject {
    @Managed
    WebDriver driver = null;

    @FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
    WebElement assignLeave;

    @FindBy(xpath = "//span[contains(text(),'Leave List')]")
    WebElement leaveList;

    @FindBy(xpath = "//span[contains(text(),'Timesheets')]")
    WebElement timeSheets;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDashboardPageURL() {
        return driver.getCurrentUrl().toString();
    }

    public void clickOnAssignLeave() {
        assignLeave.click();
    }

    public void clickonLeaveList() {
        leaveList.click();
    }

    public void clickOnTimeSheets() {
        timeSheets.click();
    }

}
