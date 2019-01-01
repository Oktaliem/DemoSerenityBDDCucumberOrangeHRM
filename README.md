# DemoSerenityBDDCucumberOrangeHRM
Serenity BDD + Cucumber + Java + Page Object Model

Folders :
1. Features : Test suit in gerkhin language. Each feature consists of test cases.
2. CucumberSteps : Step Definition in cucumber, ie. Given When And Then 
3. SerenitySteps : To Create steps in Serenity Reporting with annotation @step
4. TestRunner : To Run Your Features File, glue between your feature and cucumbersteps

# Run the Test Via Command Line
Check your TestRunner folder

mvn clean verify -Dcucumber.options=" --plugin {plugin} --tags {tag}"

i.e 
mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_1"

# SerenityBDD HTML Report Path
{your_project_path}/target/site/serenity/index.html

# Youtube Tutorial
 https://youtu.be/A3jRCfnxY5s
