import junit.framework.Test;
import junit.framework.TestSuite;

public class suite {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(fact0Test.class);
    // suite.addTestSuite(fact101Test.class);
    // suite.addTestSuite(factDecimalTest.class);
    // suite.addTestSuite(factNegTest.class);
    // suite.addTestSuite(factStringTest.class);
    // suite.addTestSuite(fib0Test.class);
    // suite.addTestSuite(fib101Test.class);
    // suite.addTestSuite(fibDecimalTest.class);
    // suite.addTestSuite(fibNeg1Test.class);
    // suite.addTestSuite(fibStringTest.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
