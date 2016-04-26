package javaaplication1;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ApplicationTest {
    public static Test suite(){
        TestSuite suite = new TestSuite("Generic test");
        suite.addTestSuite(selectsortTest.class);
        return suite;
    }
}
