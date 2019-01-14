package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PowerOfFourTest
{
        @Before
        public void setUp()
        {
            powerOfFour=new PowerOfFour();
        }

        PowerOfFour powerOfFour;
        //pass case for sample input
        @Test
        public void testPowerOfFourSuccess()
        {
            boolean expectedValue=true,actualValue;
            actualValue=(powerOfFour. isPowerOf4(256));
            assertEquals(expectedValue,actualValue);
        }
        //success case for sample input
        @Test
        public void testPowerOfFourSuccessOne()
        {
            boolean expectedValue=true,actualValue;
            actualValue=(powerOfFour. isPowerOf4(256));
            assertEquals(expectedValue,actualValue);
        }
        //failure case for sample input
        @Test
        public  void testPowerOfFourFailure()
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