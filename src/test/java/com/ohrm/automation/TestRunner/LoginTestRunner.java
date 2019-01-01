package com.ohrm.automation.TestRunner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/Report.HTML", "json:target/Report.Json"},
        features = "src/test/resources/features",
        glue ="com/ohrm/automation/cucumberSteps"
)
public class LoginTestRunner {
    // mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_1"

}
