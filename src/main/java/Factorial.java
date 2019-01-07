package com.company;

public class Factorial {

    public long factorial(int input){

        if(input>=21)
            return -1;
        long i,fact=1;
        if(input<20) {
            for (i = 1; i <= input; i++) {
                fact = fact * i;
            }
        }
        else
        {
            return -1;
        }

        return fact;

    }
}
