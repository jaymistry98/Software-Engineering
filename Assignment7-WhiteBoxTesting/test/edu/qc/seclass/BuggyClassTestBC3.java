package edu.qc.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuggyClassTestBC3 {

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
		assertEquals(5, buggyClass.buggyMethod3(25));
        assertEquals(18, buggyClass.buggyMethod3(9));
        assertEquals(-8, buggyClass.buggyMethod3(-14));
        assertEquals(4, buggyClass.buggyMethod3(4));
	}
}
