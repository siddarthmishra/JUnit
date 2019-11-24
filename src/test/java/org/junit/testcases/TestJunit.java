package org.junit.testcases;

import junit.framework.TestCase;

public class TestJunit extends TestCase {

	protected void setUp() {
		System.out.println("setUp");
	}

	protected void tearDown() {
		System.out.println("tearDown");
	}

	public void testMethod1() {
		String str = "I am done with Junit setup";
		assertEquals("I am done with Junit setup", str);
	}

}
