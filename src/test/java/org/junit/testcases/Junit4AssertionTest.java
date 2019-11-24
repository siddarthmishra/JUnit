package org.junit.testcases;

import org.junit.Assert;
import org.junit.Test;

public class Junit4AssertionTest {

    @Test
    public void testAssert(){

        //Variable declaration
        String string1="Junit";
        String string2="Junit";
        String string3="test";
        String string4="test";
        String string5=null;
        int variable1=1;
        int	variable2=2;
        int[] airethematicArrary1 = { 1, 2, 3 };
        int[] airethematicArrary2 = { 1, 2, 3 };

        //Assert statements
        Assert.assertEquals(string1,string2);
        Assert.assertSame(string3, string4);
        Assert.assertNotSame(string1, string3);
        Assert.assertNotNull(string1);
        Assert.assertNull(string5);
        Assert.assertTrue(variable1<variable2);
        Assert.assertArrayEquals(airethematicArrary1, airethematicArrary2);
    }
}