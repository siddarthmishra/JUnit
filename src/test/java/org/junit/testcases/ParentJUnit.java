package org.junit.testcases;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

// ignore at class level
//@Ignore
public class ParentJUnit {

	@BeforeClass
	public static void parentBeforeClass() {
		System.out.println("parentBeforeClass");
	}

	@Before
	public void parentBeforeOperations() {
		System.out.println("ParentJUnit - beforeOperations() Starts");
	}

	@Test
	@Ignore(value = "ignore reason")
	public void testAddParent() {
		int a = 10;
		int b = 20;
		assertEquals(a + b, 30);
	}

	@After
	public void parentAfterOperations() {
		System.out.println("ParentJUnit - afterOperations() Starts");
	}

	@AfterClass
	public static void parentAfterClass() {
		System.out.println("parentAfterClass");
	}

}
