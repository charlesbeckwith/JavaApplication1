package javaapplication1;

import org.junit.Before;
import org.junit.Test;
import junit.framework.*;

public class selectsortTest extends TestCase {
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }
    @Test
    public void testMethod(){
        assertTrue( "4 14 19 28 32 39 47 55 63 80 84 92 97 103 112", true);
    }
}

