package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class PowerOfFourTest {
    @Before
    public void setUp()
    {
        powerOfFour=new com.company.PowerOfFour();
    }

    com.company.PowerOfFour powerOfFour;

    @Test
    public void testPowerOfFour()
    {
        boolean expectedValue=true,actualValue;
        actualValue=(powerOfFour. isPowerOf4(256));
        assertEquals(expectedValue,actualValue);
    }


    @Test
    public  void testPowerOfFour1()
    {
        boolean expectedValue=false,actualValue;
        actualValue=(powerOfFour.isPowerOf4(121));
        assertEquals(expectedValue,actualValue);

    }


    @After
    public void tearDown()
    {
        powerOfFour=null;
    }

}