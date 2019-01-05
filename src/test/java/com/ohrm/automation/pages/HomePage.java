package com.ohrm.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends PageObject {
    @Managed
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b[1]")
    WebElement adminTab;

    @FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b[1]")
    WebElement adminTabs;

    @FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul[1]/li[3]/a[1]")
    WebElement logoutOption;

    @FindBy(id = "welcome")
    WebElement welcomeButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnWelcomeButton() {
        welcomeButton.click();
    }

    public void clickOnLogoutOption() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"welcome-menu\"]/ul[1]/li[3]/a[1]")));
        logoutOption.click();
    }


}
