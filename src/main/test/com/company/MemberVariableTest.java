package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    com.company.MemberVariable memberVariable;
    @Before
    public void setUp (){
        memberVariable = new com.company.MemberVariable("srinivas", 55, 75000 );
    }

    @After
    public void tearDown(){
        memberVariable = null;
    }

    @Test
    public  void testNameAgeSalary(){
        String expectedName =  "srinivas";
        String actualName = memberVariable.getName();

        assertEquals(expectedName, actualName);
        int     expectedAge  =  55;
        int     actualAge    =  memberVariable.getAge();

        assertEquals(expectedAge,actualAge);


        int     expectedSalary  =  75000;
        int     actualSalary   =  memberVariable.getSalary();

        assertEquals(expectedSalary,actualSalary);

    }


}