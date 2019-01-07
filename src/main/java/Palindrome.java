package com.company;
import java.util.Scanner;
public class Palindrome {


    public String reverse(String inputString) {
        StringBuilder reversedString = new StringBuilder();
        int length = inputString.length();
        for(int i=0;i<inputString.length();i++)
        {
            reversedString.append(inputString.charAt(length - i -1));
        }        return reversedString.toString();
    }


    public  boolean isPalindrome(String inputString, String reversedString)
    {
        if(inputString == null)
            return false;
        if(inputString.equals(reversedString))
            return true;
        else
            return false;
    }
}