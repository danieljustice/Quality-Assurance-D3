import junit.framework.Test;
import junit.framework.TestSuite;

public class TestRunner {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(calculationTextTest.class);
    suite.addTestSuite(cathyURLTest.class);
    suite.addTestSuite(decimalURLTest.class);
    suite.addTestSuite(fact0Test.class);
    suite.addTestSuite(fact1Test.class);
    suite.addTestSuite(fact2Test.class);
    suite.addTestSuite(fact50Test.class);
    suite.addTestSuite(fact99Test.class);
    suite.addTestSuite(fact100Test.class);
    suite.addTestSuite(fact101Test.class);
    suite.addTestSuite(factDecimalTest.class);
    suite.addTestSuite(factNegTest.class);
    suite.addTestSuite(factorialURLTest.class);
    suite.addTestSuite(factStringTest.class);
    suite.addTestSuite(fib0Test.class);
    suite.addTestSuite(fib1Test.class);
    suite.addTestSuite(fib2Test.class);
    suite.addTestSuite(fib50Test.class);
    suite.addTestSuite(fib99Test.class);
    suite.addTestSuite(fib100Test.class);
    suite.addTestSuite(fib101Test.class);
    suite.addTestSuite(fibDecimalTest.class);
    suite.addTestSuite(fibNeg1Test.class);
    suite.addTestSuite(fibonacciURLTest.class);
    suite.addTestSuite(fibStringTest.class);
    suite.addTestSuite(fiveLinksTest.class);
    suite.addTestSuite(fourthImageNotPresentTest.class);
    suite.addTestSuite(helloLaboonTest.class);
    suite.addTestSuite(helloURLTest.class);
    suite.addTestSuite(homeURLTest.class);
    suite.addTestSuite(imagesAreAboutCathyTest.class);
    suite.addTestSuite(stringURLTest.class);
    suite.addTestSuite(thirdImageVisibleTest.class);
    suite.addTestSuite(usedForQATextTest.class);
    suite.addTestSuite(welcomeTextTest.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
