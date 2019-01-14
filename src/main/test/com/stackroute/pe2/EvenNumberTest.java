package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class EvenNumberTest
{
    @Before
    public void setUp()
    {
        evenNumber= new EvenNumber();
    }
    EvenNumber evenNumber;

    @After
    public void tearDown()
    {
        evenNumber=null;
    }
    //pass case for sample input
    @Test
    public void testIsEvenSuccess()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(24);
        assertEquals(expectedValue,actualValue);
    }
    //pass case for sample input
    @Test
    public void testIsEvenSuccessone()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(0);
        assertEquals(expectedValue,actualValue);
    }
    //pass case for sample input
    @Test
    public void testIsEvenSuccesstwo()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(-2);
        assertEquals(expectedValue,actualValue);
    }
    //failure case for sample input
    @Test
    public void testIsEvenFailure()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(21);
        assertNotEquals(expectedValue,actualValue);
    }
    //failure case for sample input
    @Test
    public void testIsEvenFailureone()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(-9);
        assertNotEquals(expectedValue,actualValue);
    }


}