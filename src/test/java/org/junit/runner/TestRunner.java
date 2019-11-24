package org.junit.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.testcases.Junit4AssertionTest;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(
				//JunitAnnotationsExample.class
				Junit4AssertionTest.class
				//,TestJunit.class
				//,ParentJUnit.class
				//,TestJunitAnnotation.class
				);
		for (Failure failure : result.getFailures()) {
			System.out.println("Result : " + failure.toString());
		}
		System.out.println("Result : " + result.wasSuccessful());
	}

}
