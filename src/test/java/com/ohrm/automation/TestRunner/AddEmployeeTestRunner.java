package com.ohrm.automation.TestRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/Report.HTML", "json:target/Report.Json"},
        features = "src/test/resources/features/PIM/Add Employee.feature",
        glue ="com/ohrm/automation/cucumberSteps"
)
public class AddEmployeeTestRunner {
}
