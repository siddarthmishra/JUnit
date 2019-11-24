package org.junit.parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.App;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	private int a;
	private int b;
	private int expected;
	private App app;

	public ParameterizedTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Before
	public void init() {
		app = new App();
	}

	@Parameterized.Parameters
	public static Collection input() {
		Object[][] values = { { 1, 2, 3 }, { 10, 9, 19 }, { 20, -5, 16 }, { 0, 0, 0 }, { 111, 222, 333 } };
		return Arrays.asList(values);
	}

	@Test
	public void m1() {
		Assert.assertTrue(expected == app.m2(a, b));
	}
}
