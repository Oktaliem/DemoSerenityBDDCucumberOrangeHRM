package com.ohrm.automation.pages.admin;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserMgn_UserPage extends PageObject {
    @Managed
    WebDriver driver = null;

    /**
     * General Element collection
     */
    @FindBy(xpath = "//*[@id=\"systemUser-information\"]/a[1]")
    WebElement systemUsersToggle;
    @FindBy(id = "searchBtn")
    WebElement searchButtonSU;
    @FindBy(id = "searchSystemUser_userName")
    WebElement searchSystemUsers_userName;
    @FindBy(id = "searchSystemUser_userType")
    WebElement searchSystemUsers_userType;
    @FindBy(id = "searchSystemUser_employeeName_empName")
    WebElement searchSystemUsers_eName;
    @FindBy(id = "searchSystemUser_status")
    WebElement searchSystemUser_status;
    @FindBy(id = "btnAdd")
    WebElement addUserBtn;
    /**
     * This collection is for Add New User
     */
    @FindBy(id = "systemUser_userType")
    WebElement addSystemUsers_userName;
    @FindBy(id = "systemUser_employeeName_empName")
    WebElement addEmpName;
    @FindBy(id = "systemUser_userName")
    WebElement addUserName;
    @FindBy(id = "systemUser_status")
    WebElement add_status;
    @FindBy(id = "systemUser_password")
    WebElement addPassword;
    @FindBy(id = "systemUser_confirmPassword")
    WebElement addConfirmPassword;

    public UserMgn_UserPage(WebDriver driver) {
        this.driver = driver;
    }

    public String checkSystemUserFormTitle() {
        return systemUsersToggle.getText();
    }

    public void clickOnSearchButtonSU() {
        searchButtonSU.click();
    }

    public void inputUserName(String userName) {
        searchSystemUsers_userName.sendKeys(userName);
    }

    public void selectUserRole(String userRole) {
        new Select(searchSystemUsers_userType).selectByVisibleText(userRole);
        //or
        //new Select(driver.findElement(By.id("searchSystemUser_userType"))).selectByVisibleText(userRole);
    }

    public void inputEmployeeName(String eName) {
        searchSystemUsers_eName.sendKeys(eName);
    }

    public void selectStatus(String userStatus) {
        new Select(searchSystemUser_status).selectByVisibleText(userStatus);
    }

    public void clickOnAddButtonTable() {
        addUserBtn.click();
    }

    public void selectAddUserRole(String userRole) {
        new Select(addSystemUsers_userName).selectByVisibleText(userRole);
    }

    public void inputAddEmployeeName(String eName) {
        addEmpName.sendKeys(eName);
    }

    public void inputAddUserName(String Uname) {
        addUserName.sendKeys(Uname);
    }

    public void selectAddStatus(String addStatus) {
        new Select(add_status).selectByVisibleText(addStatus);
    }

    public void inputAddPassword(String addPass) {
        addPassword.sendKeys(addPass);
    }

    public void inputAddConfirmPassword(String addConfirmPass) {
        addConfirmPassword.sendKeys(addConfirmPass);
    }
    // WebDriverWait wait = new WebDriverWait(driver, 10)
}
