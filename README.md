# Integration of Cucumber-JVM and TestNG

Cucumber-JVM has native integration with Junit and it uses Junit as a test runner. But if you want to integrate TestNG with Cucumber-JVM
then there is no proper documentation available to do this. So I decided to create a sample project where I can demonstrate this integration along with some better reporting.

## Basic Integration

To have a simple integration you just need to create a runner class and just extend it from AbstractTestNGCucumberTests.
Here is the basic code:

{% gist c637ff4ec195d74395cf %}


### To run the test:
mvn clean test
