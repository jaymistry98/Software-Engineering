package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC2 {

	BuggyClass buggyClass;

    @Before
    public void setUp() {
        buggyClass= new BuggyClass();
    }

    @After            //after each test
    public void tearDown() {
        buggyClass = null;
    }
    
	@Test
	public void test() {
		assertEquals(26, buggyClass.buggyMethod2(13, 2));
		assertEquals(56, buggyClass.buggyMethod2(7, 49));
		assertEquals(1, buggyClass.buggyMethod2(11, 11));
	}
}
