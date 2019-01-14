/*
Write a boolean method called isEven() in a class called EvenNumTest,
which takes an int as input and returns true if the input is even.
The signature of the method is as follows: public static boolean isEven(int number)
*/
package com.stackroute.pe2;
public class EvenNumber
{
    public  boolean isEven( int input)
    {

        if(input%2==0)   // check whether number is even or not
            {
            System.out.print("true");
            return true;
            }
              else {
                    System.out.print("false");
                    return false;
                  }
    }
}
