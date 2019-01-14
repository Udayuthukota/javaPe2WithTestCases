/*
 Write a Java method to Reverse the given input & Check if it is a Palindrome
 */
package com.stackroute.pe2;
public class Palindrome
{
    public String reverse(String inputString)   //reversing a string
    {
        StringBuilder reversedString = new StringBuilder();
        int length = inputString.length();
        for(int i=0;i<inputString.length();i++)
        {
            reversedString.append(inputString.charAt(length - i -1));
        }        return reversedString.toString();
    }
    public  boolean isPalindrome(String inputString, String reversedString) //checking for palindrome
    {
        if(inputString == null)
            return false;
        if(inputString.equals(reversedString))
            return true;
        else
            return false;
    }
}