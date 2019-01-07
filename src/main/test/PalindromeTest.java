package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp()
    {
        palindrome=new com.company.Palindrome();
    }

    com.company.Palindrome palindrome;

    @Test
    public void  testReverseSuccess()
    {
        String expectedValue1="abcddcba",actualValue1;
        actualValue1=palindrome.reverse("abcddcba");
        assertEquals(expectedValue1,actualValue1);
        String actualValue2,expectedValue2="123321";
        actualValue2=palindrome.reverse("123321");
        assertEquals(expectedValue2,actualValue2);

    }

    @Test
    public void  testReverseFailure()
    {
        String expectedValue1="efgh",actualValue;
        actualValue=palindrome.reverse("efgh");
        assertNotEquals(expectedValue1,actualValue);
    }

    @Test
    public  void testPalindromeSuccsess()
    {
        boolean expectedValue=true,actualValue;
        actualValue=palindrome.isPalindrome("abcddcba","abcddcba");
        assertEquals(expectedValue,actualValue);

    }

    @Test
    public void testPalindromeFailure()
    {
        boolean expectedValue1=false,actualValue;
        actualValue=palindrome.isPalindrome("12345","12345");
        assertNotEquals(expectedValue1,actualValue);

    }

    @After
    public void tearDown()
    {
        palindrome=null;
    }




}