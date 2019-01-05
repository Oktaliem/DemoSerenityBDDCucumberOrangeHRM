# DemoSerenityBDDCucumberOrangeHRM
Serenity BDD + Cucumber + Java + Selenium + Page Object Model/Page Factory + orangeHRM-4.0

Folders :
1. Features : Test suit in gerkhin language. Each feature consists of test cases.
2. CucumberSteps : Step Definition in cucumber, ie. Given When And Then
3. SerenitySteps : To Create steps for Serenity BDD report with annotation @step
4. TestRunner : To Run Your Features File, glue between your feature and cucumbersteps

# Run the Test Via Command Line
Check your TestRunner folder for cucumber options

i.e.
- mvn clean verify
- mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_3"
- mvn clean verify -Dcucumber.options="src/test/resources/features/"
- mvn clean verify -Dcucumber.options="src/test/resources/features/User_Management.feature"
- mvn clean verify -Dcucumber.options="src/test/resources/features" -Dwebdriver.driver=chrome
- mvn clean verify -Dwebdriver.driver=firefox

# SerenityBDD HTML Report Path
{your_project_path}/target/site/serenity/index.html

# Cucumber HTML Report Path
{your_project_path}target/Report.HTML/index.html

# Demo in Youtube
 https://youtu.be/A3jRCfnxY5s


# Download OrangeHRM
https://github.com/orangehrm/orangehrm

# Serenity BDD
http://thucydides.info/docs/serenity-staging/
