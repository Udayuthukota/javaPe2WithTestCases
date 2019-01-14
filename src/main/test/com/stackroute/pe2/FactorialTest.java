package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class FactorialTest
{

    Factorial factorial;

    @Before
    public void setUp ()
    {
        factorial = new Factorial();
    }

    @After
    public void tearDown()
    {
        factorial = null;
    }
    //corner case for factorial
    @Test
    public void testCornerCaseFor21()
    {
        long    expectedValue = -1;
        long    actualValue = factorial.factorial(21);

        assertEquals(expectedValue, actualValue);
    }
    //pas case for sample input
    @Test
    public void testFactorialsuccsess()
    {

        long    expectedValue = 120;
        long    actualValue = factorial.factorial(5);

        assertEquals(expectedValue, actualValue);
    }
    //failure case for sample input
    @Test
    public void testFactorialFailure()
    {
        long    expectedValue = 110;
        long    actualValue = factorial.factorial(5);
        assertNotEquals(expectedValue, actualValue);
    }



}