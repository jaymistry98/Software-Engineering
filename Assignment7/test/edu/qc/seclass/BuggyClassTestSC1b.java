package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestSC1b {
	
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
		assertEquals(0, buggyClass.buggyMethod1(100, 0));
		assertEquals(4, buggyClass.buggyMethod1(9, 36));
	}

}
