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
'''
- mvn clean verify
- mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_3"
- mvn clean verify -Dcucumber.options="src/test/resources/features/"
- mvn clean verify -Dcucumber.options="src/test/resources/features/User_Management.feature"
- mvn clean verify -Dcucumber.options="src/test/resources/features" -Dwebdriver.driver=chrome
- mvn clean verify -Dwebdriver.driver=firefox
'''

# SerenityBDD HTML Report Path
{your_project_path}/target/site/serenity/index.html

Sample 1 :
![serenity bdd cucumber html report sample 1](https://user-images.githubusercontent.com/26521948/50727585-f3b40900-1157-11e9-8c11-50e61a20855c.png)

Sample 2 :
![serenity bdd cucumber html report sample 2](https://user-images.githubusercontent.com/26521948/50727587-f6aef980-1157-11e9-980c-b6a29c640886.png)

Sample 3 :
![serenity bdd cucumber html report sample 3](https://user-images.githubusercontent.com/26521948/50727623-602f0800-1158-11e9-83a0-4c4b27427cd5.png)

## Cucumber HTML Report Path
{your_project_path}target/Report.HTML/index.html

Sample :
![cucumber html report sample](https://user-images.githubusercontent.com/26521948/50727509-b9963780-1156-11e9-9b42-ae3d2b45e909.png)


# Demo in Youtube
 https://youtu.be/A3jRCfnxY5s


# Download OrangeHRM
https://github.com/orangehrm/orangehrm

# Serenity BDD
http://thucydides.info/docs/serenity-staging/
