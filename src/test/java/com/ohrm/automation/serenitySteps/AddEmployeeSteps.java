package com.ohrm.automation.serenitySteps;

import com.ohrm.automation.model.TestDataModelPIM;
import com.ohrm.automation.pages.admin.UserMgn_UserPage;
import com.ohrm.automation.pages.pim.AddEmployeePage;
import com.ohrm.automation.pages.pim.EmployeeListPage;
import com.ohrm.automation.utils.CreateRandomName;
import com.ohrm.automation.utils.Log;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import static com.ohrm.automation.urls.OHRM_URL.viewSystemUsers;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddEmployeeSteps {
    @Managed
    WebDriver driver;

    AddEmployeePage addEmployeePage;
    EmployeeListPage employeeListPage;
    CreateRandomName randomName;
    UserMgn_UserPage userPage;

    private Log log = new Log();

    @Rule
    public TestName testName = new TestName();

    @Step
    public void inputNameInformation(String firstName, String middleName, String lastName) {
        addEmployeePage.inputFirstName(firstName);
        addEmployeePage.inputMiddleName(middleName);
        addEmployeePage.inputLastName(lastName);
        log.info("Test data = " + "first name: " + firstName + " " + "middle name: " + middleName + " " + "last name: " + lastName);
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

    @Step
    public void inputNamesWithoutFirstName(String firstField, String secondField) {
        addEmployeePage.inputMiddleName(firstField);
        addEmployeePage.inputLastName(secondField);
    }

    @Step
    public void checkEmployeePersonalDetails(String firstName, String middleName, String lastName) {
        log.info("fist name from get element: " + employeeListPage.getFirstNameInformation());
        log.info("middle name from get element: " + employeeListPage.getMiddleNameInformation());
        log.info("last name from get element: " + employeeListPage.getLastNameInformation());
        assertThat(firstName, equalTo(employeeListPage.getFirstNameInformation()));
        assertThat(middleName, equalTo(employeeListPage.getMiddleNameInformation()));
        assertThat(lastName, equalTo(employeeListPage.getLastNameInformation()));
    }

    @Step
    public void findUserNameByEmployeeName(String firstName, String middleName, String lastName) {
        addEmployeePage.goToSystemUserPage(viewSystemUsers);
        String fullName = firstName+" "+middleName+" "+lastName;
        userPage.searchUserNameByEmployeeName(fullName);
        log.info(userPage.getFirstUserNameInTheTable());
        assertThat(userPage.getFirstUserNameInTheTable(), equalTo(firstName));
    }

    @Step
    public void fieldValidationInfoIsDisplayed(String field, String errorMessage) {
        String response = addEmployeePage.getFieldValidationErrorMessage(field);
        assertThat(errorMessage, equalTo(response));
        //form#frmAddEmp li:nth-child(3) > span
    }

    @Step
    public void inputNamesWithoutLastName(String firstField, String secondField) {
        addEmployeePage.inputFirstName(firstField);
        addEmployeePage.inputMiddleName(secondField);
    }
}
