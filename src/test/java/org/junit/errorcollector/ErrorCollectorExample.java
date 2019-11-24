package org.junit.errorcollector;

import org.junit.AfterClass;
import org.junit.App;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorExample {

	// @Rule
	// public ErrorCollector collector;

	@ClassRule
	public static ErrorCollector collector;

	public static App app;

	@BeforeClass
	public static void init() {
		app = new App();
		collector = new ErrorCollector();
	}

	@Test
	public void m1() throws Throwable {
		String expected = "Hello World !";
		String actual = app.m1();
		try {
			Assert.assertEquals(expected, actual);
		} catch (Throwable t) {
			// t.printStackTrace();
			collector.addError(t);
			throw new Throwable(t);
		}
	}

	@Test
	public void m2() {
		int a = 10, b = 20;
		int expected = 30;
		int actual = app.m2(a, b);
		try {
			Assert.assertEquals(expected, actual);
		} catch (Throwable t) {
			collector.addError(t);
		}
	}

	@AfterClass
	public static void destroy() {
		app = null;
		collector = null;
	}
}
