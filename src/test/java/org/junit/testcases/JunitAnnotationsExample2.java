package org.junit.testcases;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotationsExample2 {

	private ArrayList<String> list;

	@BeforeClass
	public static void m1() {
		System.out.println("Using @BeforeClass , executed before all test cases ");
	}

	@Before
	public void m2() {
		list = new ArrayList<String>();
		System.out.println("Using @Before annotations ,executed before each test cases ");
	}

	@AfterClass
	public static void m3() {
		System.out.println("Using @AfterClass ,executed after all test cases");
	}

	@After
	public void m4() {
		list.clear();
		System.out.println("Using @After ,executed after each test cases");
	}

	@Test
	public void m5() {
		list.add("test");
		Assert.assertFalse(list.isEmpty());
		Assert.assertEquals(1, list.size());
	}

	@Ignore
	public void m6() {
		System.out.println("Using @Ignore , this execution is ignored");
	}

	@Test(timeout = 10)
	public void m7() {
		System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
	}

	@Test(expected = NoSuchMethodException.class)
	public void m8() {
		System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");

	}

	@Test(timeout = 10)
	public void m9() throws InterruptedException {
		Thread.sleep(11);
		System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");
	}

	@Test(expected = ArithmeticException.class)
	public void m10() {
		System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");
		int i = 0;
		i = 10 / 0;
		System.out.println(i);

	}

}