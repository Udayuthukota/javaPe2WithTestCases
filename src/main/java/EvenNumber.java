package com.company;

public class EvenNumber {

    public  static  void  main(String arg[]){

    }

    public  boolean isEven( int input) { //method to check whether number is even or not

        if(input%2==0) {
            System.out.print("true");
            return true;
        }
        else {
            System.out.print("false");
            return false;
        }
    }
}
