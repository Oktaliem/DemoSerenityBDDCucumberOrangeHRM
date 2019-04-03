package com.ohrm.automation.pages.login;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login")
public class LoginPage extends PageObject {
/** https://www.mindmeister.com/334652100/selenium-2-commands?fullscreen=1 */
    @Managed
    WebDriver driver;

    @FindBy(id = "txtUsername")
    WebElement userNameLoginInput;

    @FindBy(id = "txtPassword")
    WebElement userPasswordLoginInput;

    @FindBy(id = "btnLogin")
    WebElement loginSubmitBtn;

    @FindBy(css = "#spanMessage")
    WebElement loginErrorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getUserName(String userName) {
        userNameLoginInput.sendKeys(userName);
    }

    public void getPassword(String pswd) {
        userPasswordLoginInput.sendKeys(pswd);
    }

    public void submitLogin() {
        loginSubmitBtn.click();

    }

    public String getLoginErrorMessage(){
        return loginErrorMessage.getText();
        //String element = driver.findElement(By.cssSelector("#spanMessage")).getText();
    }

/*
    public void checkErrorMessageLoginPage(String assertion) {
        String element = driver.findElement(By.cssSelector("#spanMessage")).getText();
        switch (assertion) {
            case "Invalid credentials":
                assertThat(element, equalTo("Invalid credentials"));
                break;
            case "Username cannot be empty":
                assertThat(element, equalTo("Username cannot be empty"));
                break;
        }

    }
    */
}

