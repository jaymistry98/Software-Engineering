package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC1a {
	
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
    	assertEquals(8, buggyClass.buggyMethod1(48, 6));
		assertEquals(9, buggyClass.buggyMethod1(4, 36));
		assertEquals(2, buggyClass.buggyMethod1(22, 22));
	}
}
