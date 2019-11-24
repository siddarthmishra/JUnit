package org.junit.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.testcases.Junit4AssertionTest;
import org.junit.testcases.JunitAnnotationsExample2;
import org.junit.testcases.ParentJUnit;
import org.junit.testcases.TestJunit;
import org.junit.testcases.JunitAnnotationsExample1;

@RunWith(Suite.class)
@Suite.SuiteClasses({ JunitAnnotationsExample2.class, Junit4AssertionTest.class, TestJunit.class, ParentJUnit.class,
		JunitAnnotationsExample1.class })
public class TestSuiteExample {

}
