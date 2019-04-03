package com.ohrm.automation.pages.dashboard;

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

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/h1[1]")
    WebElement headerForm;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDashboardPageURL() {
        return driver.getCurrentUrl();
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

    public String getDashboardTitle(){
        return headerForm.getText();
    }

}
