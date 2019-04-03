package com.ohrm.automation.cucumberSteps;

import com.ohrm.automation.model.TestDataModelPIM;
import com.ohrm.automation.serenitySteps.AddEmployeeSteps;
import com.ohrm.automation.serenitySteps.HomePageSteps;
import com.ohrm.automation.utils.CreateRandomName;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddEmployeeStepDefinition {
    @Managed
    WebDriver driver;

    @Steps
    AddEmployeeSteps addEmployeeSteps;

    @Steps
    HomePageSteps homePageSteps;

    CreateRandomName name = new CreateRandomName();
    String randomName = name.randomIdentifier();
    private TestDataModelPIM testData = new TestDataModelPIM();

    //https://stackoverflow.com/questions/36918616/how-to-pass-variable-values-between-cucumber-jvm-scenarios
    private static String firstName;
    private static String password;
    private static String confirmPass;
    private static String middleName;
    private static String lastName;

    public static String getLoginFirstName() {
        return firstName;
    }

    public static String getLoginPassword() {
        return password;
    }

    public static String getLoginConfirmationPassword() {
        return confirmPass;
    }


    @And("^User uploads photograph$")
    public void userIsUploadPhotograph() throws Throwable {
        addEmployeeSteps.inputPhotoGraph();
    }

    @And("^User is create login details$")
    public void userIsCreateLoginDetails() throws Throwable {
        addEmployeeSteps.createLoginDetails();
    }

    @And("^User is click on Save Button from Add Employee Page$")
    public void userIsClickOnSaveButtonFromAddEmployeePage() throws Throwable {
        addEmployeeSteps.submitInformation();
    }

    @When("^User input (.*) and (.*) and (.*)$")
    public void userInputFirst_nameAndMiddle_nameAndLast_name(String first_name, String middleName, String lastName) throws Throwable {
        this.firstName = first_name + randomName;
        this.middleName = middleName;
        this.lastName = lastName;
        addEmployeeSteps.inputNameInformation(firstName, middleName, lastName);
    }

    @And("^User is create login details with valid :$")
    public void userIsCreateLoginDetailsWithValid(DataTable table) throws Throwable {
        System.out.println(table.raw());
        List<List<String>> data = table.raw();
        firstName = data.get(1).get(0) + randomName;
        password = data.get(1).get(1);
        confirmPass = data.get(1).get(2);
        testData.setUserName(firstName).setPassword(password).setConfPassword(confirmPass);
        addEmployeeSteps.inputLoginInformation(testData);
    }


    @Then("^User landing to Add Employee Page$")
    public void userIsInTheAdminPortalPIMAddEmployee() throws Throwable {
        homePageSteps.goToAddEmployeePage();
    }

    @When("^User inputs (.*) and (.*) only$")
    public void userInputsMiddle_nameAndLast_nameOnly(String middleName, String lastName) throws Throwable {
        addEmployeeSteps.inputNamesWithoutFirstName( middleName, lastName);
    }

    @Then("^User should see employee personal details correctly$")
    public void userShouldSeeEmployeePersonalDetails() throws Throwable {
        addEmployeeSteps.checkEmployeePersonalDetails(firstName,middleName,lastName);
    }

    @And("^User should see login credential in the System Users page table$")
    public void userShouldSeeLoginDetailsCorrectly() throws Throwable {
        addEmployeeSteps.findUserNameByEmployeeName(firstName,middleName,lastName);
    }
}
