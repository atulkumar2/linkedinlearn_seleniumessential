# linkedinlearn_seleniumessential
https://www.linkedin.com/learning/selenium-essential-training/

Exercise file shared is for the Idea JetBrains. It was created long back in 2019. IntelliJ is no longer free while VSCode is full free. Also, Maven has changed and most configuration needs to be done in pom.xml. The project will have modified files that works well on VScode by opening individual projects and running the below command

`mvn clean && mvn compile && mvn test-compile && mvn test`

This has been tested with Java 21 JDK targeting Java 11 against Selenium 4.25.0

Changes being done are as follows

- pom.xml is copied from https://github.com/SeleniumHQ/seleniumhq.github.io/blob/trunk/examples/java/pom.xml . Entire content is updated except the project name.
- Code structure copied from https://github.com/SeleniumHQ/seleniumhq.github.io/tree/trunk/examples/java/src/test/java/dev/selenium . Code file moved from folder ./test to ./src/test/java/code/example .
- Signature of main methid changed to `public void mainTest`. `Test` appended to the class name also.
