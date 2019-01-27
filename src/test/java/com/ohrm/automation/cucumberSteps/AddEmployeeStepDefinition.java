package com.ohrm.automation.cucumberSteps;

import com.ohrm.automation.serenitySteps.AddEmployeeSteps;
import com.ohrm.automation.serenitySteps.HomePageSteps;
import com.ohrm.automation.utils.CreateRandomName;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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

    @And("^User is upload photograph$")
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

    @Then("^I'm still figure out$")
    public void iMStillFigureOut() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User input (.*) and (.*) and (.*)$")
    public void userInputFirst_nameAndMiddle_nameAndLast_name(String firstName, String middleName, String lastName) throws Throwable {
        addEmployeeSteps.inputNameInformation(firstName+randomName, middleName, lastName);
    }

    @And("^User is create login details with valid$")
    public void userIsCreateLoginDetailsWithValid(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        String firstName = data.get(1).get(0)+randomName;
        String password = data.get(1).get(1);
        String confirmPass = data.get(1).get(2);
        addEmployeeSteps.inputLoginInformation(firstName,password,confirmPass);
    }

    @Given("^User is in the Admin Portal - PIM - Add Employee$")
    public void userIsInTheAdminPortalPIMAddEmployee() throws Throwable {
        homePageSteps.goToAddEmployeePage();
    }
}
