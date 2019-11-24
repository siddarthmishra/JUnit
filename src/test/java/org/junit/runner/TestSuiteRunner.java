package org.junit.runner;

import org.junit.runner.notification.Failure;
import org.junit.testsuite.TestSuiteExample;

public class TestSuiteRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuiteExample.class);
		for (Failure failure : result.getFailures()) {
			System.out.println("Result : " + failure.toString());
		}
		System.out.println("Is Test Run Success : " + result.wasSuccessful());
	}

}