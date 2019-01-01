# DemoSerenityBDDCucumberOrangeHRM

#Folders
1. Features : Test suit in gerkhin language.Each feature consists of test cases.
2. CucumberSteps : Step Definition in cucumber, ie.Give When And Then 
3. SerenitySteps : To Create steps in Serenity Reporting
4. Test Runner : To Run Your Features File, glue between your feature and cucumbersteps

#Run the Test
i.e mvn clean verify -Dcucumber.options=" --plugin pretty --tags @priority_1"
