package com.ohrm.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends PageObject {
    @Managed
    WebDriver driver = null;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminTab;

    @FindBy(xpath = "//*[@id=\"systemUser-information\"]/a[1]")
    WebElement systemUsersToggle;

    @FindBy(id = "searchBtn")
    WebElement serachButtonSU;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTOSystemUsersForm(){
        adminTab.click();
    }

    public String checkSystemUserFormTitle(){
        return systemUsersToggle.getText();
    }

    public void clickOnSearchButtonSU(){
        serachButtonSU.click();
    }



}
