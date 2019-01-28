package com.ohrm.automation.serenitySteps;

import com.ohrm.automation.model.TestDataModelAdmin;
import com.ohrm.automation.model.TestDataModelLogin;
import com.ohrm.automation.model.TestDataModelPIM;
import com.ohrm.automation.pages.pim.AddEmployeePage;
import com.ohrm.automation.utils.CreateRandomName;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

public class AddEmployeeSteps {
    @Managed
    WebDriver driver = null;

    AddEmployeePage addEmployeePage;
    CreateRandomName randomName;

    @Rule
    public TestName testName = new TestName();

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
    public void inputLoginInformation(TestDataModelPIM testData) {
        addEmployeePage.clickOnRadioButton();
        addEmployeePage.inputUsernameAndPassword(testData);

    }
}
