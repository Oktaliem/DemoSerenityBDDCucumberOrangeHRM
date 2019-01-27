package com.ohrm.automation.serenitySteps;

import com.ohrm.automation.pages.pim.AddEmployeePage;
import com.ohrm.automation.utils.CreateRandomName;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class AddEmployeeSteps {
    @Managed
    WebDriver driver = null;

    AddEmployeePage addEmployeePage;
    CreateRandomName randomName;

    @Step
    public void inputNameInformation(String firstName, String middleName, String lastName) {
        String randomName = new CreateRandomName().randomIdentifier();
        addEmployeePage.inputFirstName(firstName+randomName);
        addEmployeePage.inputMiddleName(middleName);
        addEmployeePage.inputLastName(lastName);
    }
    @Step
    public void inputPhotoGraph() {
        addEmployeePage.uploadPhoto();
    }
    @Step
    public void createLoginDetails() {
        addEmployeePage.clickOnRadioButton();
    }
    @Step
    public void submitInformation() {
        addEmployeePage.clickOnSaveButtonEmployeePage();
    }
    @Step
    public void inputLoginInformation(String userName, String pass, String rePass) {
        addEmployeePage.clickOnRadioButton();
        addEmployeePage.inputUsernameAndPassword(userName,pass,rePass);

    }
}
