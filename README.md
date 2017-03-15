# Quality-Assurance-D3

To run the test suites please go into the folder "RunTestsHere" and use the command "java -cp .:./junit-4.12.jar:./hamcrest-core-1.3.jar:./selenium-java-2.52.0.jar:./selenium-server-standalone-2.52.0.jar TestRunner"

If you feel the need to recompile you can run "javac -cp .:./junit-4.12.jar:./hamcrest-core-1.3.jar:./selenium-java-2.52.0.jar:./selenium-server-standalone-2.52.0.jar TestRunner.java"

5 tests run with errors when using the junit tests but do not when using the Selenium IDE. Don't currently have time to fix that and it doesn't really affect my defect report.