package org.junit.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotationsExample1 extends ParentJUnit {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Runs only once for entire class and before @Before methods");
	}

	@Before
	public void beforeOperations() {
		System.out.println("beforeOperations() Starts");
	}

	@Test
	public void setup() {
		System.out.println("setup()");
		String str = "I am done with Junit setup";
		assertEquals("I am done with Junit setup", str);
	}

	@Test
	public void add() {
		System.out.println("add()");
		int a = 10;
		int b = 20;
		int expected = 30;
		Assert.assertTrue(a + b == expected);
	}

	@Test
	public void failAlways() {
		System.out.println("Fails Always");
		Assert.fail("Fails Always");
	}

	@After
	public void afterOperations() {
		System.out.println("afterOperations() Starts");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println(
				"Runs only once for entire class and It runs after all test case methods and @After annotations have been executed");
	}

}
