package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberTest {

    @Before
    public void setUp()
    {
        evenNumber= new com.company.EvenNumber();
    }
    com.company.EvenNumber evenNumber;

    @After
    public void tearDown()
    {
        evenNumber=null;
    }


    @Test
    public void testIsEvenSuccess()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(24);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIsEvenSuccessone()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(0);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testIsEvenSuccesstwo()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(-2);
        assertEquals(expectedValue,actualValue);
    }




    @Test
    public void testIsEvenFailure()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(21);
        assertNotEquals(expectedValue,actualValue);
    }

    @Test
    public void testIsEvenFailureone()
    {
        boolean expectedValue=true,actualValue;
        actualValue=evenNumber.isEven(-9);
        assertNotEquals(expectedValue,actualValue);
    }


}