package com.ohrm.automation.pages.pim;

import com.ohrm.automation.model.TestDataModelPIM;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage extends PageObject {
    @Managed
    WebDriver driver;

    @FindBy(id = "firstName") public WebElement fistNameField;
    @FindBy(id = "middleName") public WebElement middleNameField;
    @FindBy(id = "lastName") public WebElement lastNameField;
    @FindBy(id = "photofile") public WebElement photoField;
    @FindBy(id = "chkLogin") public WebElement CLDRadioButton;
    @FindBy(id = "btnSave") public WebElement buttonSave;
    @FindBy(id = "user_name") public WebElement userNameField;
    @FindBy(id = "user_password") public WebElement userPassField;
    @FindBy(id = "re_password") public WebElement userRePassField;

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String firstName){fistNameField.sendKeys(firstName);}
    public void inputMiddleName(String middleName){middleNameField.sendKeys(middleName);}
    public void inputLastName(String lastName){lastNameField.sendKeys(lastName);}

    public void uploadPhoto() {
        photoField.sendKeys("C:\\Users\\User\\Documents\\photo_2018-08-29_13-14-52.jpg");
    }

    public void clickOnRadioButton() {
        clickOn(CLDRadioButton);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnSaveButtonEmployeePage() {
        clickOn(buttonSave);
    }

    public void inputUsernameAndPassword(TestDataModelPIM testData) {
        userNameField.sendKeys(testData.getUserName());
        userPassField.sendKeys(testData.getPassword());
        userRePassField.sendKeys(testData.getConfPassword());
    }

    public void goToSystemUserPage(String viewSystemUsers) {
        driver.navigate().to(viewSystemUsers);
    }
}
