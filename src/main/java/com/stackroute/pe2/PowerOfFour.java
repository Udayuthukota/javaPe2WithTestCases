/*Write a Java method to check if a given number is power of 4
*/
package com.stackroute.pe2;
public class PowerOfFour
{
    public  boolean isPowerOf4(int inputInt)
    {

        while(inputInt>0 && inputInt%4==0) // Method to check whether number is power of four or not
        {
            inputInt=inputInt/4;

        }
        if(inputInt==1)
        {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }

    }
}
